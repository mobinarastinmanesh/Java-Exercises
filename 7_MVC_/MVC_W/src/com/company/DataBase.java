package com.company;
import java.sql.*;


public class DataBase {
    Connection connection;
    PreparedStatement preparedStatement;
    public void Connection() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "rastin" , "java");
    }
    public void enterance(WereHouse set) throws  Exception{
        preparedStatement =connection.prepareStatement("insert into product(id,product_name,product_enterance,product_price) values(?,?,?,?)");
        preparedStatement.setLong(1,set.Id);
        preparedStatement.setString(2,set.Product_Name);
        preparedStatement.setString(3,set.Prodact_Enterance_Time);
        preparedStatement.setLong(4,set.product_Price);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
    public void update(WereHouse set) throws Exception {
        preparedStatement =connection.prepareStatement("update product set product_name=? , product_enterance=? ,product_price=? where id=?");
        preparedStatement.setString(1,set.Product_Name);
        preparedStatement.setString(2,set.Prodact_Enterance_Time);
        preparedStatement.setLong(3,set.product_Price);
        preparedStatement.setLong(4,set.Id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
    public void delete(int id)throws Exception{
        preparedStatement = connection.prepareStatement("delete product where id=? ");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
    }
    public void select() throws Exception{

        preparedStatement =connection.prepareStatement("select * from product");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("*************************");
            System.out.println("id:"+resultSet.getLong("id"));
            System.out.println("name:"+resultSet.getString("product_name"));
            System.out.println("enterance_time:"+resultSet.getString("product_enterance"));
            System.out.println("price:"+resultSet.getLong("product_price"));
        }
        preparedStatement.close();
        connection.close();
    }
}

