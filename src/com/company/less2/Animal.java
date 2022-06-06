package com.company.less2;

public class Animal {
    int eyes;
    String color;
    int speed;

    public int getEyes() {
        return eyes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public Animal(int speed){
        this.speed = speed;
    }

}
