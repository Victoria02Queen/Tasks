package com.company.clas;

public class w {
    private int id;
    private static int idInc;

    public w() {
        this.id = idInc++;
    }

    public int getId() {
        return this.id;
    }
}
