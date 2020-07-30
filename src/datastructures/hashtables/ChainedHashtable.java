package datastructures.hashtables;

import datastructures.model.Employee;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ChainedHashtable {
    private LinkedList<ChainStoredEmployee>[] hashtable;

    public ChainedHashtable() {
        this.hashtable = new LinkedList[10];
        for(int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<ChainStoredEmployee>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new ChainStoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<ChainStoredEmployee> iterator
                = hashtable[hashedKey].listIterator();
        ChainStoredEmployee employee = null;
        while(iterator.hasNext()) {
            employee = iterator.next();
            if(employee.key.equals(key)) {
                return employee.employee;
            }
        }

        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        ListIterator<ChainStoredEmployee> iterator
                = hashtable[hashedKey].listIterator();

        ChainStoredEmployee employee = null;
        int index = -1; //powinien odpowiadac aktualnemu polozeniu (0 dla pierwszego obrotu petli etc)
        while(iterator.hasNext()) {
            index++;
            if(iterator.next().key.equals(key)) {
                employee = iterator.next();
                break;
            }
        }
        if(employee == null) {
            return null;
        }
        else  {
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }

    }

    private int hashKey(String key) {
        return key.length() % this.hashtable.length;
    }

    public void printHashtable() {
        for (int i =0; i < hashtable.length; i++) {
            if(hashtable[i].isEmpty()) {
                System.out.println("Position " + i + " : empty");
            } else {
                ListIterator<ChainStoredEmployee> iterator = hashtable[i].listIterator();
                System.out.print("Position " + i + " : ");
                while(iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.println("->");
                }
                System.out.println("null");
            }
        }
    }
}
