package com.company.newString;

public class task2_2 {
    public static void main(String[] args) {
        /*
        Задан массив. Определить, является ли сумма чисел этого массива четным числом
         */
        int[] v = {1, 1, 2, 2, 2, 1};//сам массив
        System.out.println(EvenNum(v));

    }
    public static boolean EvenNum (int []array){

        int sum = 0; //переменная суммы
        for (int i : array) {
            sum += i;
        }

        return sum % 2 == 0;

//        if (sum % 2 == 0){
//            return true;
////            System.out.println("sum even number");
//        }
//        return false;
////        else {
//////            System.out.println("sum odd number");
////        }
    }
}