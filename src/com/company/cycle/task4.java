package com.company.cycle;

public class task4 {
    public static void main(String[] args) {
        /*
        Возвести n в степень k
         */
        int n = 5;
        int res = 1;
        int k = 4;

        int i = 0;
        while (i < k){
            res *= n;
            i++;
        }
        System.out.println(res);
    }
}
