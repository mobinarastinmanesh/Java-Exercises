package model.repository;

import model.entity.FarshEnti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FarshRepo implements AutoCloseable{
    PreparedStatement preparedStatement;
    Connection connection;
    public FarshRepo() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rastin", "java");
        connection.setAutoCommit(false);
    }
    public void createtable ()throws Exception{
        preparedStatement=connection.prepareStatement("CREATE TABLE farsh(id NUMBER PRIMARY KEY ,name VARCHAR2(20),tedad NUMBER  ,gheymat_koll NUMBER ,keshvar VARCHAR2(20) )");
        preparedStatement.executeUpdate();
    }
    public void insert(FarshEnti farshEnti)throws Exception{
        preparedStatement=connection.prepareStatement("INSERT INTO farsh(id,name,tedad,gheymat_koll,keshvar) values(?,?,?,?,?)");
        preparedStatement.setLong(1,farshEnti.getId());
        preparedStatement.setString(2,farshEnti.getName());
        preparedStatement.setLong(3,farshEnti.getTedad());
        preparedStatement.setLong(4,farshEnti.getGheymat_koll());
        preparedStatement.setString(5,farshEnti.getKeshvar());
        preparedStatement.executeUpdate();
    }
    public void delete(int id)throws Exception{
        preparedStatement=connection.prepareStatement("DELETE FROM farsh WHERE id=?");
        preparedStatement.setLong(1,id);
        preparedStatement.executeUpdate();
    }
    public void update(FarshEnti farshEnti)throws Exception{
        preparedStatement=connection.prepareStatement("UPDATE farsh SET name=?,tedad=?,gheymat_koll=?,keshvar=? WHERE id=?");
        preparedStatement.setLong(5,farshEnti.getId());
        preparedStatement.setString(4,farshEnti.getKeshvar());
        preparedStatement.setLong(3,farshEnti.getGheymat_koll());
        preparedStatement.setLong(2,farshEnti.getTedad());
        preparedStatement.setString(1,farshEnti.getName());
        preparedStatement.executeUpdate();
    }
    public List<FarshEnti> select ()throws Exception{
        List<FarshEnti> farshEntis = new LinkedList<>();
        preparedStatement=connection.prepareStatement("select * FROM farsh");
        ResultSet resultSet =preparedStatement.executeQuery();
        while (resultSet.next()){
            FarshEnti f = new FarshEnti();
            f.setId(resultSet.getLong("id"));
            f.setName(resultSet.getString("name"));
            f.setTedad(resultSet.getLong("tedad"));
            f.setGheymat_koll(resultSet.getLong("gheymat_koll"));
            f.setKeshvar(resultSet.getString("keshvar"));
            farshEntis.add(f);
        }
        return farshEntis;
    }
    public void commit()throws Exception{
        connection.commit();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
