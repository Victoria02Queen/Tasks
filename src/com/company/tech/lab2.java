package com.company.tech;

public class lab2 {
    public static void main(String[] args) {
        int [][] a =
                {{5,7,3},
                {7,0,1},
                {8,1,2}};
        int maxIdx = a.length - 1;

        for (int i = maxIdx; i >= 0; i--) {
            a[i][i]*=a[i][i];
            System.out.print(a[i][i] + " ");
        }
        System.out.println();
}
}