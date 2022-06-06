package com.company.Less26;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(4);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(7);
        stack.push(6);
        stack.push(9);

        stack.pop();


        System.out.println(stack);
    }
}
