package datastructures.hashtables;

import datastructures.model.Employee;

public class ChainStoredEmployee {
    public String key;
    public Employee employee;

    public ChainStoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
