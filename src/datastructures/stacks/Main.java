package datastructures.stacks;

import datastructures.model.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StackWithBackingArray stack = new StackWithBackingArray(new Employee[5]);
        Employee employee = new Employee("Pat", "johnson", 1);
        Employee employee1 = new Employee("John", "Dope", 12);
        Employee employee2 = new Employee("Damian", "Wajda", 123);
        Employee employee3 = new Employee("Mike", "Wilson", 1234);
        Employee employee4 = new Employee("Alojzy", "Cicirici", 12346);
        Employee employee6 = new Employee("Mati", "Traba", 123467);
        stack.push(employee);
        stack.push(employee1);
        stack.push(employee2);
        stack.push(employee3);
        stack.push(employee4);
        System.out.println(Arrays.toString(stack.getEmployeeStack()) + " SIZE : " + stack.getEmployeeStack().length);
        stack.push(employee6);
        System.out.println(Arrays.toString(stack.getEmployeeStack()) + " SIZE : " + stack.getEmployeeStack().length);


    }
}
