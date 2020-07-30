package datastructures.stacks;

import datastructures.model.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackForChallenge {

    private LinkedList<Character> stack;

    public StackForChallenge() {
        this.stack = new LinkedList<Character>();
    }

    public void push(Character character) {
        this.stack.push(character);
    }

    public Character peek() {
        return this.stack.peek();
    }

    public Character pop() {
        char result = this.stack.pop();
        return result;
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
