package com.company.cycle;

public class task2_3 {
    public static void main(String[] args) {
         /*
        Мой богатый дядюшка подарил мне один доллар в мой первый день рождения.
        В каждый день рождения он удваивал свой подарок и прибавлял к нему столько долларов, сколько лет мне исполнилось.
        Написать программу, указывающую, к  какому дню рождения подарок превысит 100$.
         */
        int age = 1;
        int money = 1;

        while ( money < 100){
            money = money * 2 + age;
            age++;
        }
        System.out.println(age);
    }
}
