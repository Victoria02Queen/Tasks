package com.company.newString;

public class task2_5 {
    public static void main(String[] args) {
        /*
        Задана строка. Определить, есть в ней символы пунктуации
         */
        String c = "Hel2lo, ? - ! .";// Создаю массив знаков препинания

        System.out.println( containsPunctuation(c));

        System.out.println(containsPunctuationUsingArray(c));

    }

    public static boolean containsPunctuation(String line) {

        line = "hello";

        for (int i = 0; i < line.length(); i++) {

            char l = line.charAt(i);

            if (32 <= l && l <= 33 || 44 <= l && l <= 46 ) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsPunctuationUsingArray(String line) {

        char[] punctuation = {'?', '.', ',', '!'} ;

        for (int i = 0; i < line.length(); i++){
            if (contains(punctuation, line.charAt(i))){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char [] array, char symbol){

        array[0] = '/';

        for (char i : array){
            if (i == symbol){
                return true;
            }
        }
        return false;
    }
}

