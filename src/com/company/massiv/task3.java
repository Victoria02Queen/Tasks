package com.company.massiv;

public class task3 {
    public static void main(String[] args) {
            /*
            Вывести только четные элементы массива.
             */
        int[] v = {-3, -9, 1, 2, 3, 4, 12, 5, 10};//сам массив
        for (int i : v) {
            if (i % 2 == 0) { //проверяем делится число на 2
                System.out.println(i);
            }
        }
    }
}
