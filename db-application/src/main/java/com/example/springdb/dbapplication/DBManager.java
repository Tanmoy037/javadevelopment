package com.example.springdb.dbapplication;

import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component

public class DBManager {


    DBManager() throws SQLException{
        connection = getConnection();
        createTable();
    }

    public static Connection connection;

    public static Connection getConnection() throws SQLException {

        if(connection==null){
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Tanmoy@2000");
        }
        return connection;
    }
    public void createTable() throws SQLException {
        String sql = "create table if not exists student_info(id INT primary key auto_increment,age INT,name VARCHAR(30))";

        Statement st = connection.createStatement();

        st.execute(sql);
    }
    public void insertInfo(Student student) throws SQLException{
        String sql = "insert into student_info(name,age) values('"+student.getName()+"',"+student.getAge()+")";

        Statement st = connection.createStatement();
        int rows = st.executeUpdate(sql);
        System.out.println("The no of rows effected"+rows);
    }

    public List<String> getInfo() throws SQLException {

        String sql = "select * form student_info";

        Statement st = connection.createStatement();

        ResultSet resultSet = st.executeQuery(sql);

        System.out.println(resultSet);

        List<String> studentList = new ArrayList<>();

        while (resultSet.next()){
            String string = resultSet.getString(1);
            studentList.add(string);
        }
        return studentList;
    }
}
