package datastructures.queues;


import datastructures.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Pat", "johnson", 1);
        Employee employee1 = new Employee("John", "Dope", 12);
        Employee employee2 = new Employee("Damian", "Wajda", 123);
        Employee employee3 = new Employee("Mike", "Wilson", 1234);
        Employee employee4 = new Employee("Alojzy", "Cicirici", 12346);
        Employee employee6 = new Employee("Mati", "Traba", 123467);

        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.add(employee);
        arrayQueue.add(employee1);
        arrayQueue.add(employee2);
        arrayQueue.add(employee3);
        arrayQueue.add(employee4);
        arrayQueue.add(employee6);

        //arrayQueue.printQueue();

        arrayQueue.remove();
        //arrayQueue.printQueue();
        //System.out.println(arrayQueue.peek());
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        //arrayQueue.remove();
        arrayQueue.add(employee);
        arrayQueue.printQueue();



    }


}
