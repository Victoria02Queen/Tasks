package com.company.massiv;

public class task4 {
    public static void main(String[] args) {
        /*
        Найти сумму элементов массива
         */
        int[] v = {1, 1, 1, 2, 2, 2};//сам массив
        int sum = 0; //переменная суммы
        for (int i : v) {
            sum += i;
        }
        System.out.println(sum);
    }
}
