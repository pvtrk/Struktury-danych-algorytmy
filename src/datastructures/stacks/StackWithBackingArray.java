package datastructures.stacks;

import datastructures.model.Employee;

import java.util.EmptyStackException;

public class StackWithBackingArray {
    private Employee[] employeeStack;
    private int top;

    public Employee[] getEmployeeStack() {
        return employeeStack;
    }

    public void setEmployeeStack(Employee[] employees) {
        this.employeeStack = employees;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public StackWithBackingArray(int capacity) {
        this.employeeStack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (this.top < this.employeeStack.length) {
            this.employeeStack[top++] = employee;
        }
        else {
            Employee[] employees = new Employee[this.employeeStack.length * 2];
            System.arraycopy(this.employeeStack, 0, employees, 0, this.employeeStack.length);
            this.employeeStack = employees;
            push(employee);
        }
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return this.employeeStack[top - 1];
    }
    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = this.employeeStack[--top];
        this.employeeStack[top] = null;
        return employee;
    }

    public boolean isEmpty() {
        return this.top == 0;
    }

    public int getSize() {
        return this.top;
    }

    public void printStack() {
        for (int i = top -1; i >=0; i--) {
            System.out.println(this.employeeStack[i]);
        }
    }

}
