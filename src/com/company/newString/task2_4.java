package com.company.newString;

public class task2_4 {
        public static void main(String[] args) {
            /*
            Задана строка. Определить, есть ли в ней заглавные латинские символы
             */
            String hello = "Hel2lo";

            System.out.println( containsDigit(hello));
        }
        public static boolean containsDigit(String line) {

            for (int i = 0; i < line.length(); i++) {

                char l = line.charAt(i);

                if ('A' <= l && l <= 'Z') {
                    return true;
                }
            }
            return false;
        }
    }
