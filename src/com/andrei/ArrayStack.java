package com.andrei;

import java.util.EmptyStackException;

public class ArrayStack {

    //backing array
    private Customer[] stack;

    //index where we will push the next element
    private int top;


    //set the capacity of the stack
    public ArrayStack(int capacity){
        stack = new Customer[capacity];

        // top field will be initialize to 0 by default
    }

    public void push(Customer customer){
        //verify if the stack is full
        if(top == stack.length){
            //need to resize the backing array
            Customer[] newArray = new Customer[2*stack.length];
            System.arraycopy(stack, 0 ,newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = customer;
    }

    public Customer pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        Customer customer = stack[--top];

        stack[top] = null;

        return customer;
    }

    public Customer peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        for(int i = top-1; i >= 0 ; i--){
            System.out.println(stack[i]);
        }
    }

}
