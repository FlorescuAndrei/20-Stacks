package com.andrei;

import java.util.LinkedList;
import java.util.ListIterator;

// This class tack a JDK LinkedList and keeps only the methods that are specific for the stack push, pop, peek.
// So the class will behave like a stack.

public class LinkedStack {

    private LinkedList<Customer> stack;

    public LinkedStack(){
        stack = new LinkedList<>();
    }

    public void push(Customer customer){
        stack.push(customer);
    }

    public Customer pop(){
        return stack.pop();
    }

    public Customer peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        ListIterator<Customer> iterator = stack.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
