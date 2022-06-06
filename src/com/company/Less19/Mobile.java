package com.company.Less19;

public class Mobile {
    private int phone;
    private int battery;
    private final int imei;


    private static int imeiGenerator = 2;

    public Mobile(){
        this.imei = imeiGenerator;
        imeiGenerator += 10;
    }

    public int getImei() {
        return imei;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
