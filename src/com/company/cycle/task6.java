package com.company.cycle;

public class task6 {
    public static void main(String[] args) {
        int number = 943;
        int index = 2;
        int newDigit = 9;
        int res = 0;
        int kolvo = 0;

        int newNumber = 943;

        while (newNumber  > 0) {
            newNumber /=10;
            kolvo++;
        }
        if (index > kolvo) {
            System.exit(6);
        }

        if (!(0 <= newDigit && newDigit <= 9)) {
            System.exit(-5);
        }

        int i = 0;

        while (i < index) {
            res += (number % 10) * Math.pow(10,i);
            number /= 10;
            i++;
        }
        res += newDigit * Math.pow(10,i);
        number /= 10;
        i++;

        while (number > 0) {
            res += (number % 10) * Math.pow(10,i);
            number /= 10;
            i++;
        }

        System.out.println(res);
//        System.out.println(kolvo);
//        System.out.println(number);
    }
}
