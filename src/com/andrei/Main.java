package com.andrei;

public class Main {

    public static void main(String[] args) {

        Customer jj = new Customer("Jane", "Jones");
        Customer jd = new Customer("John", "Doe");
        Customer ms = new Customer("Mary", "Smith");
        Customer mw = new Customer("Mike", "Wilson");
        Customer be = new Customer("Bill", "End");


//        ArrayStack stack = new ArrayStack(10);

        LinkedStack stack = new LinkedStack();

        stack.push(jj);
        stack.push(jd);
        stack.push(ms);
        stack.push(mw);
        stack.push(be);

        stack.printStack();
        System.out.println("*********");

        System.out.println("Peek " + stack.peek());
        System.out.println("*********");

        System.out.println("Popped " + stack.pop());
        System.out.println("*********");

        stack.printStack();



    }
}
