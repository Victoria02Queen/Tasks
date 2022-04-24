package com.company.newString;

public class task2_1 {
    public static void main(String[] args) {
            /*
           Задан массив. Определить, есть ли в нем четные числа
             */
        int[] v = {-3, 9, 1, 1, 3, 1, 11, 5, 2};//сам массив

        System.out.println(containsEvenDigit(v));
    }

    public static boolean containsEvenDigit(int[] array) {

        for (int i : array) {
            if (i % 2 == 0) { //проверяем делится число на 2
                return true;
            }
        }
        return false;
    }
}



