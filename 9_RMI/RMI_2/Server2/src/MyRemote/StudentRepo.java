package MyRemote;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentRepo {
    Connection connection;
    PreparedStatement preparedStatement;
    public StudentRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rastin","java");
    }
    public void createtable()throws Exception{
        preparedStatement=connection.prepareStatement("create table student1(sid varchar2(20) , mande number , pardakht number)");
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public void update_shahriye(DataStudent stu) throws Exception{
        preparedStatement =connection.prepareStatement("select mande from student1 where sid=?");
        preparedStatement.setString(1,stu.getSid());
        ResultSet resultSet = preparedStatement.executeQuery();
        Long mande = null;
        while(resultSet.next()) {
            mande = resultSet.getLong("mande");
        }


        preparedStatement =connection.prepareStatement("select pardakht from student1 where sid=?");
        preparedStatement.setString(1,stu.getSid());
        ResultSet resultSet1 = preparedStatement.executeQuery();
        Long pardakhti=null;
        while (resultSet.next()){
            pardakhti=resultSet1.getLong("pardakht");
        }

        preparedStatement = connection.prepareStatement("update student1 set pardakht=? , mande=? where sid=?");
        preparedStatement.setLong(1,pardakhti + stu.getPardakhti());
        preparedStatement.setLong(2,mande - stu.getPardakhti());
        preparedStatement.setString(3,stu.getSid());

        preparedStatement.executeUpdate();
        connection.commit();
        preparedStatement.close();
        System.out.println("Successfully updated");
    }
}
