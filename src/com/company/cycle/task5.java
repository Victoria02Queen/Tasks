package com.company.cycle;

public class task5 {
    public static void main(String[] args) {
        /*
        Вычислить сумму цифр числа
         */
        int number = 745;
        int sum = 0;

        while (number > 0) {
           int x = number % 10; // получится от остатка от деления 5

            number = number / 10; // останется 74
            sum = sum + x; //получаем 5 + 0

            /* x = number % 10; // 74%10 останется 4
            sum = sum + x; //получаем 5 + 4 двух //последних чисел сумма

            number = number / 10; // останется 7 */
        }
        System.out.println(sum);
    }
}
