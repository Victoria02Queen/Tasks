package com.company.string;

public class task11 {
    public static void main(String[] args) {
        String hello = "Hel2lo";

        System.out.println( containsDigit(hello));
    }

    public static boolean containsDigit(String line) {

//        boolean containsDigit = false;

        for (int i = 0; i < line.length(); i++) {

            char l = line.charAt(i);

            if ('0' <= l && l <= '9') {
                return true;
//                containsDigit = true;
//                break;
            }
        }
        return false;
//        return containsDigit;
//        System.out.println(containsDigit);
    }
}
