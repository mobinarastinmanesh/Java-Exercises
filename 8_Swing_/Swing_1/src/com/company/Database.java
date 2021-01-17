package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;

public class Database {
    PreparedStatement preparedStatement;
    Connection connection;
    public Database()throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "rastin" , "java");
        connection.setAutoCommit(true);
    }
    public  void createtable() throws Exception {
        preparedStatement=connection.prepareStatement("CREATE table vahed(sid varchar2(20) , id number , code varchar2(20))");
        preparedStatement.executeUpdate();
    }
    public void insert(Object s , int i ,String sid )throws Exception{
        preparedStatement=connection.prepareStatement("insert into vahed(sid , id,code)values(?,?,?) ");
        preparedStatement.setString(1, sid);
        preparedStatement.setLong(2,i);
        preparedStatement.setString(3, String.valueOf(s));
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

}
