package datastructures.queues;

import datastructures.model.Employee;

import java.util.NoSuchElementException;

public class CircularQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public Employee[] getQueue() {
        return queue;
    }

    public CircularQueue(int capacity) {
        this.queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (this.queue.length - 1 == size()) {
            int numItems = size();
            Employee[] temp = new Employee[queue.length * 2];

            System.arraycopy(this.queue, front, temp, 0, queue.length - front);
            System.arraycopy(this.queue, 0, temp, queue.length - front, back);
            this.queue = temp;

            front = 0;
            back = numItems;
        }
        this.queue[back] = employee;
        if(back < queue.length - 1) {
            back++;
        }
        else {
            back = 0;
        }
    }

    public Employee remove() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        Employee employee = this.queue[front];

        queue[front] = null;

        if(size() == 0) {
            this.back = 0;
            this.front = 0;
        } else if(front == queue.length) {
            front = 0;
        }
        return employee;
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.queue[front];
    }

    public boolean isEmpty() {
        if(size() == 0) {
            return true;
        } return false;
    }

    public int size() {
        if(front <= back) {
            return back - front;
        } return back - front + queue.length;

    }

    public void printQueue() {
        if (front <= back) {
            for(int i = front; i < back; i++) {
                System.out.println(this.queue[i]);
            }
        }
        for(int i = front; i < queue.length; i++) {
            System.out.println(queue[i]);
        }
        for(int j = 0; j < back; j++) {
            System.out.println(queue[j]);
        }
    }
}
