package MyRemote;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AccountRepo {
    Connection connection;
    PreparedStatement preparedStatement;
    public AccountRepo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","rastin","java");
    }
    public void createtable()throws Exception{
        preparedStatement=connection.prepareStatement("create table account1(username varchar2(20) , userpassword varchar2(20))");
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public void save(User user)throws Exception{
        preparedStatement =connection.prepareStatement("insert into account1(username , userpassword) values(?,?)");
        preparedStatement.setString(1,user.getUsername());
        preparedStatement.setString(2,user.getUserpassword());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        System.out.println("Successfully saved");
    }

    public void update(User user) throws Exception{
        preparedStatement = connection.prepareStatement("update account1 set userpassword=? where username=?");
        preparedStatement.setString(1,user.getUserpassword());
        preparedStatement.setString(2,user.getUsername());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        System.out.println("Successfully updated");
    }
}
