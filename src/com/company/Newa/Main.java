package com.company.Newa;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setWeight(76);

        System.out.println(ConverWeight.getWeightIndex(person));
    }
}
