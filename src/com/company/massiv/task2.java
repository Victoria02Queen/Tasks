package com.company.massiv;

public class task2 {
    public static void main(String[] args) {
         /*
        Задан целочисленный массив.
        Найти максимальный элемент массива
         */
        int v[] = {-3, -9, 0, 1, 2, 3, 4, 5, 10};//сам массив
        int max = v[0]; // пременная минимума
        for (int j : v) {
            if (j > max) {
                max = j;
            }
            /*
            for (int j = 0; j < v.length; j++)
             */
        }
        System.out.println(max);
    }
}
