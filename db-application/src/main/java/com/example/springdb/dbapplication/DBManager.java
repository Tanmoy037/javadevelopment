package com.example.springdb.dbapplication;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

    public static Connection connection;

    public static Connection getConnection(){

        if(connection==null){
            connection = DriverManager.getConnection("jdbc:mysql//localhost:3306");
        }
    }
}
