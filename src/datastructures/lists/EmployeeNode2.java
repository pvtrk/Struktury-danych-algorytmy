package datastructures.lists;

import datastructures.model.Employee;

public class EmployeeNode2 {
    private Employee employee;
    private EmployeeNode2 next;
    private EmployeeNode2 previous;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode2 getNext() {
        return next;
    }

    public void setNext(EmployeeNode2 next) {
        this.next = next;
    }

    public EmployeeNode2 getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode2 previous) {
        this.previous = previous;
    }

    public EmployeeNode2(Employee employee) {
        this.employee = employee;
    }

    public boolean hasNext(EmployeeNode2 node) {
        if (node.getNext() != null) {
            return true;
        } return false;
    }

    public boolean hasPrevious(EmployeeNode2 node) {
        if (node.getPrevious() != null) {
            return true;
        } return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("employee=" + employee).toString();


    }
}
