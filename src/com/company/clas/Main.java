package com.company.clas;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();
        Car car3 = car;

        car.increaseOfCountOfOwners();
        System.out.println(car.getCountOfOwners());
        System.out.println(car1.getCountOfOwners());
    }
}
