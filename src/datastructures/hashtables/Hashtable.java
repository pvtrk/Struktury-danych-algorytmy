package datastructures.hashtables;

import datastructures.model.Employee;

import java.util.NoSuchElementException;

public class Hashtable {
    private StoredEmployee[] hashtable;

    public Hashtable() {
        this.hashtable = new StoredEmployee[10];
    }

    private int hashKey(String key) {
        return key.length() % this.hashtable.length;
    }

    public void put(String key, Employee employee) {
        StoredEmployee se = new StoredEmployee(key, employee);
        int hashedKey = hashKey(key);
        int stopIndex = hashedKey;
        if(isOccupied(hashedKey)) {
            if(hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            }
            else {
                hashedKey++;
            }

            while(isOccupied(hashedKey) && hashedKey!= stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(isOccupied(hashedKey)) {
            System.out.println("Sorry somebody is already there with this index");
        }
        else {
            this.hashtable[hashedKey] = se;
        }

    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;

    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if(hashedKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;

        StoredEmployee[] hs = this.hashtable;
        hashtable = new StoredEmployee[hashtable.length];
        for(int i = 0; i < hashtable.length; i++) {
            if(hs[i] != null) {
                put(hs[i].key, hs[i].employee);
            }
        }
        return employee;
    }

    private int findKey(String key) {
        int hashedKey = hashKey(key);

        if(this.hashtable[hashedKey] != null
                && this.hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        }
        else {
            hashedKey++;
        }
        while(hashedKey != stopIndex &&
            hashtable[hashedKey] != null &&
            !hashtable[hashedKey].key.equals(key)) {

            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if(hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }
        return -1;
    }



    private boolean isOccupied(int index) {
        return hashtable[index] != null;
    }
    public void printHashtable() {
        for(int i = 0; i < this.hashtable.length; i++) {
            if(hashtable[i] == null) {
                System.out.println("Empty");
            } else {
                System.out.println("Position " + i + " : " + hashtable[i].employee);

            }
        }
    }

}

