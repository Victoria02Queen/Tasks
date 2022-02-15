package com.company.methods;

public class task5 {
    public static void main(String[] args) {
        int mRes = Multiplication(1, 2);
        int dRes = Division(6, 7);

        System.out.printf("Result = %d; %d\n", mRes, dRes);

    }

    static int Multiplication(int x, int y){
        return x * y;
    }

    static int Division(int x, int y){
        return x / y;
    }

    static double calculate(int a, int b, ?){
        ....
    }
}
