package com.company.Less19;

import com.company.Less19.Mobile;
import com.company.Less19.MobileFactory;
import com.company.Less19.Person;

public class Maim {
    public static void main(String[] args) {
        Person person = new Person("Petrov", "Petr","Petrovich");


        Mobile mob = new Mobile();
        Mobile mob2 = new Mobile();
        Mobile mob3 = new Mobile();

        MobileFactory mobileFabric = new MobileFactory();
        mobileFabric.createMobilePhone();
        Mobile mobile = mobileFabric.createMobilePhone(); ;
        System.out.println(mobile.getBattery());

        System.out.println(mob.getImei());
        System.out.println(mob2.getImei());
        System.out.println(mob3.getImei());
    }

}
