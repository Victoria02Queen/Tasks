package com.company.me;

public class task1 {
    public static void main(String[] args) {
        int number = 5678;
        int result = 0;
        int place = 1;
        while (number > 9) {
            result += place * 10 * (number % 10);
            number /= 10;
            result += place * (number % 10);
            number /= 10;
            place *= 100;
        }
        System.out.println(result);
    }
}
