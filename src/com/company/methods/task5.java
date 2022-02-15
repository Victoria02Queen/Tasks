package com.company.methods;

public class task5 {
    public static void main(String[] args) {
        wrapResult(Multiplication(6,2));

    }
    static int Multiplication (int x,int y){
        return x * y;
    }

    static int Division  (int x,int y){
        return x / y;
    }

    static void wrapResult(int x){

        int res = Division(21,3);
        System.out.println("Result = " + x + "; " + res);
    }
}
