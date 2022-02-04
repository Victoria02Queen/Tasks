package com.company.massiv;

public class task1 {
    public static void main(String[] args) {
        /*
        Задан целочисленный массив.
        Найти минимальный элемент массива
         */
        int a[] = {-3, -9, 0, 1, 2, 3, 4, 5};//сам массив
        int min = a[0]; // пременная минимума
         for (int j : a) {
            if (j < min) {
                min = j;
            }
            /*
            for (int j = 0; j < a.length; j++)
             */
        }
        System.out.println(min);
    }
}
