package com.company.tech;


public class lab1 {
    public static void main(String[] args) {

        int[] array2 = new int[15];
        for (int i = 0; i < 15; i++) {
            array2[i] = (int) (0 + Math.random() * 9);
            System.out.print(array2[i] + "    ");
        }

        // Вывод элементов массива на экран.
        System.out.print("\nВывод элементов массива: ");
        for (int i = 0;i < array2. length; i++){
            if(array2[i]%2 == 0){
                System.out.print(array2[i] + ", ");
            }
        }
    }
}