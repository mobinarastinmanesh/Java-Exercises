package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class FormRepo implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    public FormRepo()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                "rastin" , "java");
        connection.setAutoCommit(false);
    }

    public void creatTable()throws Exception{
        preparedStatement=connection.prepareStatement("create table form(id varchar2(20) PRIMARY key , name varchar2(30) , fathername varchar2(20))");
        preparedStatement.executeUpdate();
    }
    /////////////////////////////////////////////////////////////
    public void insert(FormEntity f)throws Exception{
        preparedStatement=connection.prepareStatement("insert into form(id,name,fathername)values(?,?,?)");
        preparedStatement.setString(1,f.getId());
        preparedStatement.setString(2,f.getName());
        preparedStatement.setString(3,f.getFathername());
        preparedStatement.executeUpdate();
    }
    /////////////////////////////////////////////////////////////
    public ArrayList<FormEntity> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from form");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<FormEntity> list=new ArrayList<>();
        while (resultSet.next()){
            FormEntity formEntity = new FormEntity();

            formEntity.setId(resultSet.getString("id"));


            formEntity.setName(resultSet.getString("name"));


            formEntity.setFathername(resultSet.getString("fathername"));


            list.add(formEntity);
        }
        return list;
    }
    ///////////////////////////////////////////////////////////////////////
    public void update(FormEntity formEntity)throws Exception{
        preparedStatement=connection.prepareStatement("update form set name=? , fathername=? where id=?");
        preparedStatement.setString(1,formEntity.getName());
        preparedStatement.setString(2,formEntity.getFathername());
        preparedStatement.setString(3,formEntity.getId());
        preparedStatement.executeUpdate();
    }
    //////////////////////////////////////////////////////////////////////
    @Override
    public void close() throws Exception {
    }
    ///////////////////////////////////////////////////////////////////////
    public void commite()throws Exception{
        connection.commit();
    }
}
