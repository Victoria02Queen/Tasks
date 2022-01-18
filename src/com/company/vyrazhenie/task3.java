package com.company.vyrazhenie;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
   /*
   Определить четверть координатной плоскости, которой принадлежит точка.
    */
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x число: ");
        int x = in.nextInt();
        System.out.print("Введите y число: ");
        int y = in.nextInt();

        if (x >= 0 && y >= 0) {
            System.out.println("1 ");
        }
        else if (x <= 0 && y >= 0) {
            System.out.println(" 2 ");
        }
        else if (x <= 0 && y <= 0) {
            System.out.println(" 3 ");
        }
        else if (x >= 0 && y <= 0) {
            System.out.println(" 4 ");
        }
    }
}
