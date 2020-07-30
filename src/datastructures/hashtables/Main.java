package datastructures.hashtables;

import datastructures.model.Employee;

public class Main {
    public static void main(String[] args) {
        //Hashtable hs = new Hashtable();
        ChainedHashtable hs = new ChainedHashtable();
        Employee employee = new Employee("Pat", "johnson", 1);
        Employee employee1 = new Employee("John", "Dope", 12);
        Employee employee2 = new Employee("Damian", "Wajda", 123);
        Employee employee3 = new Employee("Mike", "Wilson", 1234);
        Employee employee4 = new Employee("Alojzy", "Cicirici", 12346);
        Employee employee6 = new Employee("Mati", "Traba", 123467);
        hs.put("Johnson", employee);
        hs.put("Dope", employee1);
        hs.put("Wajda", employee2);
        hs.put("Wilson", employee3);
        hs.put("Cicirici", employee4);
        hs.put("Traba", employee6);
        hs.printHashtable();

        System.out.println("Wyszukiwanie: " + hs.get("Traba").toString());

        hs.printHashtable();
        hs.remove("Wajda");
        hs.printHashtable();


    }
}
