package com.company.me;

public class number {
    public static void main(String[] args) {
        int number = 1243421;
        int count = 0;

        while (number > 0) {
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}
