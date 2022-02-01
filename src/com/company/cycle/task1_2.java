package com.company.cycle;

public class task1_2 {
    public static void main(String[] args) {
        /*
        Дано целое число N (> 1).
        Найти наименьшее целое число K, при котором выполняется неравенство 5^K > N
         */
        int k = 1;
        int n = 24;

        while ( Math.pow(5, k) <= n ){
            k++;
        }
        System.out.println(k);
    }
}
