package model.repository;

import model.entity.StudentEnti;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Asus on 12/13/2019.
 */
public class StudentRepo implements AutoCloseable{
    private PreparedStatement preparedStatement ;
    private Connection connection;
    public  StudentRepo () throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                "rastin" , "java");
        connection.setAutoCommit(false);
    }
    public void create()throws Exception{
        preparedStatement=connection.prepareStatement("create table stu(name varchar2(20) , sid varchar2(20) , code varchar2(20))");
        preparedStatement.executeUpdate();
    }
    public  void insert(StudentEnti studentEnti)throws Exception{
        preparedStatement=connection.prepareStatement("insert into stu(name,sid,code)values(?,?,?)");
        preparedStatement.setString(1,studentEnti.getName());
        preparedStatement.setString(2,studentEnti.getSid());
        preparedStatement.setString(3,studentEnti.getCode());
        preparedStatement.executeUpdate();
    }
    public void update(StudentEnti studentEnti)throws Exception{
        preparedStatement=connection.prepareStatement("update stu set name=?,code=? where sid=? ");
        preparedStatement.setString(1,studentEnti.getName());
        preparedStatement.setString(2,studentEnti.getCode());
        preparedStatement.setString(3,studentEnti.getSid());
        preparedStatement.executeUpdate();
    }
    public ArrayList<StudentEnti> select()throws Exception{
        preparedStatement=connection.prepareStatement("select * from stu ");
        ResultSet resultSet = preparedStatement.executeQuery();
        ArrayList<StudentEnti> list = new ArrayList<>();
        while(resultSet.next()){
        StudentEnti s = new StudentEnti();
        s.setName(resultSet.getString("name"));
        s.setSid(resultSet.getString("sid"));
        s.setCode(resultSet.getString("code"));
        list.add(s);
        }
    return list ;
    }
    public void delete(String sid)throws Exception{
        preparedStatement=connection.prepareStatement("delete stu where sid=?");
        preparedStatement.setString(1,sid);
        preparedStatement.executeUpdate();

    }
    public void commit() throws Exception{
        connection.commit();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
