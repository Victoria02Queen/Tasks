package com.company.tech;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        /*
        2 дан массив цел числа необходимо удалить все входящие этого числа из массива
         */
        int[] arr = {2,22,56,78,14};
        int n = 2;

//        int firstItem = arr[0];

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (n == arr[i]){
                count++;
            }
        }
//        System.out.println(count);

        int[] newArr = new int[arr.length - count];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != n) {
                newArr[j++] = arr[i];
            }

        }

        System.out.println(Arrays.toString(newArr));

    }
}
