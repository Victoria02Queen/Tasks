package com.company.less2;

public class Sheep extends Animal {
    int rogSize;

    public int getRogSize() {
        return rogSize;
    }

    public void setRogSize(int rogSize) {
        this.rogSize = rogSize;
    }

    public Sheep(int speed){
        super(speed);
    }
}
