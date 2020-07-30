package datastructures.queues;

import datastructures.model.Employee;

import java.util.NoSuchElementException;

public class CircularQueueChar {
    private Character[] queue;
    private int front;
    private int back;

    public Character[] getQueue() {
        return queue;
    }

    public CircularQueueChar(int capacity) {
        this.queue = new Character[capacity];
    }

    public void add(Character character) {
        if (this.queue.length - 1 == size()) {
            int numItems = size();
            Character[] temp = new Character[queue.length * 2];

            System.arraycopy(this.queue, front, temp, 0, queue.length - front);
            System.arraycopy(this.queue, 0, temp, queue.length - front, back);
            this.queue = temp;

            front = 0;
            back = numItems;
        }
        this.queue[back] = character;
        if(back < queue.length - 1) {
            back++;
        }
        else {
            back = 0;
        }
    }

    public Character remove() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        Character character = this.queue[front];

        queue[front] = null;

        if(size() == 0) {
            this.back = 0;
            this.front = 0;
        } else if(front == queue.length) {
            front = 0;
        }
        return character;
    }

    public Character peek() {
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
                System.out.print(this.queue[i] + " ");
            }
        }
        for(int i = front; i < queue.length; i++) {
            System.out.print(queue[i] + " ");
        }
        for(int j = 0; j < back; j++) {
            System.out.print(queue[j] + " ");
        }
    }
}
