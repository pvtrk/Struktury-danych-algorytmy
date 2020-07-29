package datastructures.lists;

import datastructures.model.Employee;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNextEmployee() {
        return next;
    }

    public void setNextEmployee(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode() {
    }

    @Override
    public String toString() {
        return
                "employee=" + employee +
                '}';
    }
}
