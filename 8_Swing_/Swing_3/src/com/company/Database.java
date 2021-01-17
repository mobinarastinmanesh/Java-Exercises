package com.company;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {

    private PreparedStatement preparedStatement ;
    private Connection connection;

    public Database() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" ,
                "rastin" , "java");
        connection.setAutoCommit(true);
    }

    public  void create_insert_account_database ()throws Exception{
        preparedStatement=connection.prepareStatement("CREATE TABLE data(account_number number , dabt number )");
        preparedStatement.executeUpdate();
        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,111111);
        preparedStatement.setLong(2,133900);
        preparedStatement.executeUpdate();

        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,222222);
        preparedStatement.setLong(2,11221900);
        preparedStatement.executeUpdate();

        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,333333);
        preparedStatement.setLong(2,135400);
        preparedStatement.executeUpdate();


        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,444444);
        preparedStatement.setLong(2,1330);
        preparedStatement.executeUpdate();

        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,555555);
        preparedStatement.setLong(2,135000);
        preparedStatement.executeUpdate();

        preparedStatement=connection.prepareStatement("insert into data(account_number,dabt)values(?,?)");
        preparedStatement.setLong(1,666666);
        preparedStatement.setLong(2,1900);
        preparedStatement.executeUpdate();

    }
    public Long select_debt( Long number)throws Exception{

        Long debt=null;
        preparedStatement=connection.prepareStatement("select * from data WHERE account_number=?");
        preparedStatement.setLong(1,number);
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            debt = resultSet.getLong("dabt");
        }
        return debt;
    }
    public void update_debt(Long number , Long new_debt)throws Exception{
        preparedStatement=connection.prepareStatement("update data set dabt=? where account_number=?");
        preparedStatement.setLong(1,new_debt);
        preparedStatement.setLong(2,number);
        preparedStatement.executeUpdate();
    }


}
