package com.company.newString;

public class task2_6 {
    public static void main(String[] args) {
        /*
        Задана строка. Определить, начинается ли она с заглавной буквы
         */
        String hello = "hel2lo";

        System.out.println(containsLetter(hello));

    }

    public static boolean containsLetter(String line) {

            char l = line.charAt(0);

            return 'A' <= l && l <= 'Z';

//            if ('A' <= l && l <= 'Z') {
//                return true;
//            }
//            else {
//                return false;
//            }
    }
}
