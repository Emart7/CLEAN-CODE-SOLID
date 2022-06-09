package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.Hired;

public class Gardner extends Employee implements Hired {
    public void prune() {
        System.out.println(super.name + " is pruning");
    }

    @Override
    public void setProfit() {

    }

    @Override
    public void getProfit() {

    }
}
