package com.company.vyrazhenie;

public class task4 {
    public static void main(String[] args) {
        /*
        Найти корни квадратного уравнения, у которого заданы переменные a, b, c.
        Для вычисления корня использовать Math.sqrt(5) - это означает вычислить корень от 5.
        */
        int a = 3;
        int b = 2;
        int c = 16;
        double d = Math.sqrt(c);

        double x1 = ( ( (-b) + d) / (2 * a) ) ;
        System.out.println(x1);

    }
    }
