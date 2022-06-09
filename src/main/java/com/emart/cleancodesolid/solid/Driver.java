package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.Hired;
import com.emart.cleancodesolid.solid.Interface.Traceble;

public class Driver extends Employee implements Hired, Traceble {
    public void driver() {
        System.out.println(super.name + " is driving");
    }

    public void driver(String vehicle) {
        System.out.println(super.name + " is driving a " + vehicle);
    }

    @Override
    public void setProfit() {

    }

    @Override
    public void getProfit() {

    }
    @Override
    public void getCurrentLocation() {

    }

    @Override
    public void setCurrentLocation() {

    }

}
