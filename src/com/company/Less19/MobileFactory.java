package com.company.Less19;

import java.util.Random;

public class MobileFactory {
    private static final int[] battery = {100, 200, 300};

    public Mobile createMobilePhone(){
        Mobile mobile = new Mobile();
        int batterys = new Random().nextInt(battery.length);
        mobile.setBattery(battery[batterys]);
        return mobile;
    }


}
