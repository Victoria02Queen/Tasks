package com.company.Numb1;

public class Car {
    /**
     * Метод предназначен для получения текущей скорости автомобиля
     * @param distance - расстояние, которое проехал автомобиль
     * @param time - время за которое он проехал это расстояние
     */

    public static int findSpeed(int distance ,int time ){
        return distance / time ;
    }

    /**
     * Метод предназначен для нахождения пути, который может преодолеть автомобиль с заданной скоростью
     * @param speed - скорость автомобиля
     * @param time - сколько автомобиль был в пути
     */
    public static int findDistance(int speed ,int time ){
        return speed * time ;
    }


}
