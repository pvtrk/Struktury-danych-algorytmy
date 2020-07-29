package datastructures.stacks;

import datastructures.model.Employee;

public class StackWithBackingArray {
    private Employee[] employeeStack;
    private int lastItemIndex;

    public Employee[] getEmployeeStack() {
        return employeeStack;
    }

    public void setEmployeeStack(Employee[] employeeStack) {
        this.employeeStack = employeeStack;
    }

    public int getLastItemIndex() {
        return lastItemIndex;
    }

    public void setLastItemIndex(int lastItemIndex) {
        this.lastItemIndex = lastItemIndex;
    }

    public StackWithBackingArray(Employee[] employeeStack) {
        this.employeeStack = employeeStack;
        this.lastItemIndex = 0;
    }

    public void push(Employee employee) {
        if (this.lastItemIndex < this.employeeStack.length) {
            this.employeeStack[lastItemIndex] = employee;
            this.lastItemIndex++;
        }
        else {
            Employee[] employees = new Employee[this.employeeStack.length * 2];
            System.arraycopy(this.employeeStack, 0, employees, 0, this.employeeStack.length);
            this.employeeStack = employees;
            push(employee);
            this.lastItemIndex++;
        }
    }

    public Employee peek() {
        return this.employeeStack[lastItemIndex];
    }
    public void pop() {
        this.employeeStack[lastItemIndex] = null;
        lastItemIndex--;
    }


}
