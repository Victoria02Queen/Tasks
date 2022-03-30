package com.company.matrix;

public class task1 {
    public static void main(String[] args) {
        //Дан целочисленный двумерный массив, размерности n х m. Заменить все элементы на их квадраты.

        int[][] array = {{1,2}, {3,4}};

        int n = 2;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= n;
                System.out.print(array[i][j] + "\t"); //"\t" - табуляция
            }
            System.out.println(); // на другую строку
        }
    }
}
