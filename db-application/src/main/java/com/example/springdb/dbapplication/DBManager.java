package com.example.springdb.dbapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    public static Connection connection;

    public static Connection getConnection() throws SQLException {

        if(connection==null){
            connection = DriverManager.getConnection("jdbc:mysql//localhost:3306","root","Tanmoy@2000");
        }
        return connection;
    }
}
