package com.company.lesson3;

public class cycle1 {
    public static void main(String[] args) {
        int number = 0;

        while ( number <= 100) {

            if (number == 82) {
                number++;
                continue;
            }

            if ( number % 10 == 2 ) {
                System.out.println(number);
            }
           /* if (number == 82) {
                break;
            }*/
            number++;
        }
    }
}
