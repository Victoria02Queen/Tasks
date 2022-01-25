package com.company.cycle;

public class task2 {
    public static void main(String[] args) {
        int number = 0;
        int summa = 0;
        while ( number <= 100) {

            /*if (number == 82) {
                number++;
                continue;
            }*/
/* if (number == 82) {
                break;
            }*/
            if ( number % 2 == 0) {
                summa  += number;
            }
            number++;
        }
        System.out.println( summa);
    }
}
