package com.company.vyrazhenie;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
/*
Вводятся координаты (x;y) точки и радиус круга (r).
Определить принадлежит ли данная точка кругу, если его центр находится в начале координат.
 */
        int h;
        int rad;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x число: ");
        int x = in.nextInt();
        System.out.print("Введите y число: ");
        int y = in.nextInt();
        System.out.print("Введите r круга: ");
        int r = in.nextInt();

        h = ( (x * x) + (y * y) );
        rad = (r * r);
        double d = Math.sqrt(h);

        if (d <= rad) {
            System.out.println("net");
        }
        else {
            System.out.println("da");
        }
    }
}
