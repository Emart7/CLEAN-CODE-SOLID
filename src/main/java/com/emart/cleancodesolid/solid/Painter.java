package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.Hired;

public class Painter extends Employee implements Hired {
    public void paint() {
        System.out.println(super.name + " is painting");
    }

    @Override
    public void setProfit() {

    }

    @Override
    public void getProfit() {

    }
}
