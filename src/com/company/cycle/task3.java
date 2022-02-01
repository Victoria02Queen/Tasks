package com.company.cycle;

public class task3 {
    public static void main(String[] args) {
        final int number = 3;
        int i = 2;
        boolean isPrime = true;

        while ( i < number ) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
           i++;
        }
        if (isPrime) {
            System.out.println("число простое");
        }
        else {
            System.out.println("число составное");
        }
    }
}
