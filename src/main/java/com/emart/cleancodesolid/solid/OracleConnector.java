package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.DBConnector;

public class OracleConnector implements DBConnector {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database");
    }
}
