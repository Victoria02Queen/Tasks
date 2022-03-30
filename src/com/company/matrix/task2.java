package com.company.matrix;

public class task2 {
    public static void main(String[] args) {
        //Дан целочисленный двумерный массив, размерности n х m. Поменять местами первый и последний элементы каждой строки

        int m[][] = {{4, 9, 7, 2}, // ввод в матрицу
                {4, 7, 6, 5},
                {3, 2, 1, 8},
                {9, 9, 7, 7}};

        // обмен элемента между первым и последним столбцом

        for (int i = 0; i < m.length; i++) {  // проход тока по столбцам
            int t = m[i][0];  //Fist element
            m[i][0] = m[i][m.length - 1]; //Last element
            m[i][m.length - 1] = t;
        }

        // вывод замененной матрицы
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }
}
