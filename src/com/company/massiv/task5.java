package com.company.massiv;

public class task5 {
    public static void main(String[] args) {
        /*
        Найти количество отрицательных элементов
         */
        int[] v = {-3, -9, 1, 2, 3, 4, 12, 5, 10};//сам массив
        int count = 0;
        for (int i : v) {
            if (i < 0) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
