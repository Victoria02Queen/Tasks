package com.company.clas;

public class Car {
    private String model;
    private String color;
    private int price;
    private int power;
    private int countOfOwners = 0;


    public void setModel (String model){
        this.model = model;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setPrice (int price){
        this.price = price;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public int getCountOfOwners() {
        return countOfOwners;
    }

    public void increaseOfCountOfOwners(){
        countOfOwners++;
    }
}
