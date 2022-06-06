package com.company.less2;

public class Bird extends Animal {
    int wingSize;

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public Bird(int speed){
        super(speed);
    }
}
