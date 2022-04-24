package com.company.newString;

public class task2_3 {
    public static void main(String[] args) {
        /*
        3.	Задан массив. Определить, есть ли в нем отрицательные числа
         */
        int[] v = {3, 9, 1, 2, 3, 4, 12, 5, -10};//сам массив

        System.out.println( containsDigit(v));
    }

    public static boolean containsDigit(int []array) {

        for (int i : array) {
            if (i < 0) {
                return true;
            }
        }
        return false;
    }
}

