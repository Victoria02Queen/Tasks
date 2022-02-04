package com.company.vyrazhenie;

public class task6 {
    public static void main(String[] args) {
        /*
        Есть два конверта со сторонами (а,б) и (с,д) определить, можно ли один конверт вложить в другой
         */
        int a = 4;
        int b = 2;
        int c = 16;
        int d = 3;
        if (a >= c && b >= d) {
            System.out.println("нельзя вложить");
        }
        else {
            System.out.println("можно вложить");
        }

    }
    }
