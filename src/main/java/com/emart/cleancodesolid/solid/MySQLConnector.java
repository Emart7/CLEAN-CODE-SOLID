package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.DBConnector;

public class MySQLConnector implements DBConnector {

    @Override
    public void connect(){
        System.out.println("Connected to MySQL database");
    }
}
