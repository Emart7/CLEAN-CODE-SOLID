package com.emart.cleancodesolid.solid;

import com.emart.cleancodesolid.solid.Interface.DBConnector;

public class EmployeeDAO {

    public void save(DBConnector dbConnector){
        System.out.println("Employee saved to database");
    }
}
