package datastructures.lists;

import datastructures.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ArrayListsFun {
    public static void main(String[] args) {
        //List<Employee> employeeList = new ArrayList<>();
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Pat", "johnson", 1));
        employeeList.add(new Employee("John", "Dope", 12));
        employeeList.add(new Employee("Damian", "Wajda", 123));
        employeeList.add(new Employee("Mike", "Wilson", 1234));

        employeeList.forEach(System.out::println);

        System.out.println(employeeList.get(2));

        employeeList.set(1, new Employee("John" , "Adams", 2222));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        System.out.println(Arrays.toString(employeeArray));
    }
}
