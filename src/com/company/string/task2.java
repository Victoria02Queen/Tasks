package com.company.string;

public class task2 {
    public static void main(String[] args) {
        /*
        Вывести только те буквы из строки, которые располагаются на четных номерах
         */

        String str = new String("Victoria");

        for (int i = 0; i < str.length(); i++){

            if (i % 2 == 0){

                System.out.print(str.charAt(i) +", ");
            }
        }
    }
}
