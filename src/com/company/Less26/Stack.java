package com.company.Less26;

import java.util.Arrays;

public class Stack {
    private int[] array = new int[10];
    private int index = 0;

    public void push(int number) {
        if (index >= array.length) {
            int[] arr = new int[array.length + array.length / 2];

            for(int i = 0; i < array.length; i++){
                arr[i] = array[i];
            }
            array = arr;
        }
        array[index] = number;
        index++;
    }
    public void pop() {
        index--;
    }

    @Override
    public String toString() {
        String stack = "";

        for (int i = 0; i < index; i++){
            stack += array[i] + " ";
        }
        return stack;
    }

    String n = "a";
    String b = "c";
    String c = n + b;
}
