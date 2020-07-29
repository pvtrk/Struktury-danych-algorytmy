package datastructures.lists;

import datastructures.model.Employee;

public class EmployeeDoubleLinkedList {
    private EmployeeNode2 head;
    private EmployeeNode2 tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode2 node = new EmployeeNode2(employee);
        node.setNext(head);
        if(head == null) {
            this.tail = node;

        }
        else {
            head.setPrevious(node);
        }
        this.head = node;
        this.size++;

    }

    public EmployeeNode2 removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode2 removedNote = this.head;
        if(head.getNext() == null) {
            this.head = null;
            this.tail = null;
            size--;
            return removedNote;
        }

        head.getNext().setPrevious(null);
        this.head = head.getNext();
        size--;
        removedNote.setNext(null);
        return removedNote;
    }

    public void addToTail(Employee employee) {
        EmployeeNode2 node = new EmployeeNode2(employee);
        node.setPrevious(this.tail);
        if(this.tail == null) {
            this.head = node;
        }
        this.tail.setNext(node);
        this.tail = node;
        size++;
    }
    public EmployeeNode2 removeFromTail() {
        if(size == 0) {
            return null;
        }
        EmployeeNode2 removedNote = this.tail;
        if(tail.getPrevious() == null) {
            this.tail = null;
            this.head= null;
            size--;
            return removedNote;
        }
        this.tail.getPrevious().setNext(null);
        this.tail = this.tail.getPrevious();
        removedNote.setPrevious(null);
        size--;
        return removedNote;

    }

    public void addBeforeSpecificEmployee(Employee newEmployee, Employee existingEmployee) {
        EmployeeNode2 node = new EmployeeNode2(newEmployee);
        EmployeeNode2 current = this.head;

        while(current != null) {
            if(current.getEmployee().equals(existingEmployee)) {

                if(head.getEmployee().equals(existingEmployee)) {
                    addToFront(newEmployee);
                }
                else {
                    node.setNext(current);
                    node.setPrevious(current.getPrevious());
                    current.getPrevious().setNext(node);
                    current.setPrevious(node);
                    size++;
                }
            }
            current = current.getNext();
        }
    }
    public void printList() {
        EmployeeNode2 current = this.head;
        System.out.print("HEAD -> ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }

        System.out.print(" null");
    }

    public int getSize() {
        return this.size;
    }

    public EmployeeNode2 getHead() {
        return head;
    }

    public void setHead(EmployeeNode2 head) {
        this.head = head;
    }

    public EmployeeNode2 getTail() {
        return tail;
    }

    public void setTail(EmployeeNode2 tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }


}
