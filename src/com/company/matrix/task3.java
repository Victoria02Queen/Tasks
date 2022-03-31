package com.company.matrix;

public class task3 {
    public static void main(String[] args) {
/* Вывести номера строк двумерного массива, которые являются возрастающей последовательностью */

        int matrix[][] = {{1, 2, 3, 4}, // ввод в матрицу
                {4, 7, 6, 5},
                {1, 2, 3, 8},
                {9, 9, 7, 7}};

        for (int i = 0; i < matrix.length; i++){
            if (isAsc(matrix[i])){
                System.out.println(i);
            }
//            System.out.println(isAsc(matrix[i]));
        }
    }
    public static boolean isAsc(int array[]) {
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] >= array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
