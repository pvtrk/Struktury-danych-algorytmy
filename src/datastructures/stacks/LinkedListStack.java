package datastructures.stacks;

import datastructures.model.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {
    private LinkedList<Employee> stack;

    public LinkedListStack() {
        this.stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        this.stack.push(employee);
    }

    public Employee peek() {
        return this.stack.peek();
    }

    public Employee pop() {
        return this.stack.pop();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void printStack() {
        ListIterator iter = this.stack.listIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
