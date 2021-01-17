package model.repository;

import model.entity.PersonEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class PersonRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;

    public PersonRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "rastin" , "java");
        connection.setAutoCommit(false);
    }
    public void insert(PersonEnti personEnti) throws Exception{
        preparedStatement=connection.prepareStatement("INSERT into person(id,name,car,price) values(?,?,?,?)");
        preparedStatement.setLong(1,personEnti.getId());
        preparedStatement.setString(2,personEnti.getName());
        preparedStatement.setString(3,personEnti.getCar());
        preparedStatement.setLong(4,personEnti.getPrice());
        preparedStatement.executeUpdate();
    }
    public void update(PersonEnti personEnti) throws Exception{
        preparedStatement = connection.prepareStatement("update person set name=?,car=?,price=? where id=?");
        preparedStatement.setString(1,personEnti.getName());
        preparedStatement.setString(2,personEnti.getCar());
        preparedStatement.setLong(3,personEnti.getPrice());
        preparedStatement.setLong(4,personEnti.getId());
        preparedStatement.executeUpdate();
    }
    public void delete(Long id) throws  Exception{
        preparedStatement = connection.prepareStatement("delete from person where id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
    }
    public ArrayList<PersonEnti> select()throws Exception{
       preparedStatement=connection.prepareStatement("select * from person ");
        ResultSet resultSet =preparedStatement.executeQuery();
        ArrayList<PersonEnti> personEntis = new ArrayList<>();
        while (resultSet.next()){
            PersonEnti personEnti = new PersonEnti();
            personEnti.setId(resultSet.getLong("id"));
            personEnti.setName(resultSet.getString("name"));
            personEnti.setCar(resultSet.getString("car"));
            personEnti.setPrice(resultSet.getLong("price"));
            personEntis.add(personEnti);
        }
        return personEntis;
    }
    public void commit()throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
