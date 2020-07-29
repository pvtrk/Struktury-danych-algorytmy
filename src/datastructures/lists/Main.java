package datastructures.lists;

import datastructures.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Pat", "johnson", 1);
        Employee employee1 = new Employee("John", "Dope", 12);
        Employee employee2 = new Employee("Damian", "Wajda", 123);
        Employee employee3 = new Employee("Mike", "Wilson", 1234);

       // EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
       // employeeLinkedList.addToFront(employee);
        //employeeLinkedList.addToFront(employee1);
        //employeeLinkedList.addToFront(employee2);
        //employeeLinkedList.addToFront(employee3);
        //employeeLinkedList.printList();

        //System.out.println(employeeLinkedList.getSize());

        //employeeLinkedList.removeFromFront();

        //System.out.println(employeeLinkedList.getSize());
        //employeeLinkedList.printList();

        EmployeeDoubleLinkedList doubleLinkedList = new EmployeeDoubleLinkedList();

        doubleLinkedList.addToFront(employee);
        doubleLinkedList.addToFront(employee1);
        doubleLinkedList.addToTail(employee2);
        doubleLinkedList.addBeforeSpecificEmployee(new Employee("Patryk", "Lacki", 1), employee2);
        doubleLinkedList.printList();
    }
}
