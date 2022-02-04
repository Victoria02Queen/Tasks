package com.company.vyrazhenie;

public class task5 {
    public static void main(String[] args) {
        /*автобусный билет считают счастливым,
        если сумма трех первых цифр билета равна сумметрех последних цифр.
        Определить, является ли данный билет счастливым
         */
        int a = 1;
        int b = 2;
        int c = 0;
        int d = 1;
        int e = 1;
        int f = 5;
        if (a + b + c == d + e + f) {
            System.out.println("Билет счастливый");
        } else {
            System.out.println("Билет не счастливый");
        }

    }
    }
