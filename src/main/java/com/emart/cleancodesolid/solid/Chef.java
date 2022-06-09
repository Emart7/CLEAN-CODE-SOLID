package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.Hired;

public class Chef extends Employee implements Hired {

    public void cook() {
        System.out.println(super.name + " is cooking");
    }

    @Override
    public void setProfit() {

    }

    @Override
    public void getProfit() {

    }
}
