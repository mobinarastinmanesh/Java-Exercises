package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Database {
    PreparedStatement preparedStatement;
    Connection connection;
    public Database()throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "rastin" , "java");
    }
    public  void createtable() throws Exception {
        preparedStatement=connection.prepareStatement("CREATE  table staff (id varchar2(20) PRIMARY KEY ,name varchar2(20) , codemelli varchar2(20) , shomare varchar2(20) )");
        preparedStatement.executeUpdate();
    }

    public void insert(Entity e)throws Exception{
        preparedStatement= connection.prepareStatement("insert into staff(id,name,codemelli,shomare)values(?,?,?,?)");
        preparedStatement.setString(1,e.getId());
        preparedStatement.setString(2,e.getName());
        preparedStatement.setString(3,e.getCode());
        preparedStatement.setString(4,e.getShomare());
        preparedStatement.executeUpdate();
        System.out.println("با موفقیت وارد شد...");
    }
    public ArrayList<Entity>  select () throws Exception{
        preparedStatement =connection.prepareStatement("select * from staff");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<Entity> list = new ArrayList<>();
        while(resultSet.next()){
            Entity e = new Entity();
            e.setId(resultSet.getString("id"));
            e.setName(resultSet.getString("name"));
            e.setCode(resultSet.getString("codemelli"));
            e.setShomare(resultSet.getString("shomare"));
            list.add(e);
        }
        return list;
    }
}
