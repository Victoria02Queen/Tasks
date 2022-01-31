package com.company.cycle;

public class task1 {
    public static void main(String[] args) {
        double vklad = 350000;//сумму вклада
        double percent = 7; //ставка по вкладу
        int month = 2;
        int i = 0;

        percent /= 12;

        while (i < month){
            vklad += vklad * ( percent / 100);
            i++;
        }
        System.out.printf("Ваш вклад через %d месяцев будет %.2fр", month, vklad);
//        System.out.println(vklad);
    }
}
