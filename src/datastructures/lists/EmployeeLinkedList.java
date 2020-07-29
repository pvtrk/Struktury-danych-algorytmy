package datastructures.lists;

import datastructures.model.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNextEmployee(head);
        this.head = node;
        this.size++;
    }
    public void printList() {
        EmployeeNode current = this.head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextEmployee();
        }

        System.out.print(" null");
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNote = this.head;
        head = head.getNextEmployee();
        size--;
        removedNote.setNextEmployee(null);
        return removedNote;
    }
}
