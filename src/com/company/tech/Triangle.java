package com.company.tech;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите сторону a=");
        int a = sc.nextInt();
        System.out.println("Введите сторону b=");
        int b = sc.nextInt();
        System.out.println("Введите сторону c=");
        int c = sc.nextInt();

        /**
         * равносторонний это, где а=б=с
         * равносторонний это, где а != б != с != a
         */

        if ((a >= b + c) || (b >= a + c) || (c > a + b)) {
            System.out.println("Увы,такого треугольника быть не может :(");
        } else if (a == b & b == c) {
            System.out.println("- Равносторонний треугольник -");
        } else if (a != b & b != c & a != c) {
            System.out.println("- Разносторонний треугольник -");
        } else
            System.out.println("- Равнобедренный треугольник -");

        int p = ( a + b + c ) / 2;

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.print("Площадь треугольника = ");
        System.out.printf("%.2f",s);
    }
}
