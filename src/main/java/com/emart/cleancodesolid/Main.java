package com.emart.cleancodesolid;

import com.emart.cleancodesolid.solid.Driver;
import com.emart.cleancodesolid.solid.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Driver();

        printEmployee(new Driver());

    }

    private static void printEmployee(Employee employee) {
        if (employee instanceof Driver) {

            Driver driver = (Driver) employee;
            driver.driver();
        }

    }
}
