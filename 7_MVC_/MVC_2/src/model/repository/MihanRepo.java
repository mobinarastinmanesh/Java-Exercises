package model.repository;

import model.entity.MihanEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MihanRepo implements AutoCloseable{

    private Connection connection;
    private PreparedStatement preparedStatement;
    public void createtable() throws  Exception {
        preparedStatement = connection.prepareStatement("create table mihan(id number PRIMARY key , name varchar2(20),tarikh VARCHAR2(20),price VARCHAR2(20))");
        preparedStatement.executeUpdate();
    }


    public MihanRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "rastin" , "java");
        connection.setAutoCommit(false);
    }
    public void insert(MihanEnti mihanEnti) throws Exception{
        preparedStatement=connection.prepareStatement("INSERT into mihan(id,name,tarikh,price) values(?,?,?,?)");
        preparedStatement.setLong(1,mihanEnti.getId());
        preparedStatement.setString(2,mihanEnti.getName());
        preparedStatement.setString(3,mihanEnti.getTarikh());
        preparedStatement.setLong(4,mihanEnti.getPrice());
        preparedStatement.executeUpdate();
    }
    public void update(MihanEnti mihanEnti) throws Exception{
        preparedStatement = connection.prepareStatement("update mihan set name=?,tarikh=?,price=? where id=?");
        preparedStatement.setString(1,mihanEnti.getName());
        preparedStatement.setString(2,mihanEnti.getTarikh());
        preparedStatement.setLong(3,mihanEnti.getPrice());
        preparedStatement.setLong(4,mihanEnti.getId());
        preparedStatement.executeUpdate();
    }
    public void delete(Long id) throws  Exception{
        preparedStatement = connection.prepareStatement("delete from mihan where id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
    }
    public ArrayList<MihanEnti> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from mihan ");
        ResultSet resultSet =preparedStatement.executeQuery();
        ArrayList<MihanEnti> mihanEntis = new ArrayList<>();
        while (resultSet.next()){
            MihanEnti mihanEnti = new MihanEnti();
            mihanEnti.setId(resultSet.getLong("id"));
            mihanEnti.setName(resultSet.getString("name"));
            mihanEnti.setTaikh(resultSet.getString("tarikh"));
            mihanEnti.setPrice(resultSet.getLong("price"));
            mihanEntis.add(mihanEnti);
        }
        return mihanEntis;
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
