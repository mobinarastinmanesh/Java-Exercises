package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rastin" , "java");
            //این کامنت شده ها فط باید یکبار اجرا شوند
            ////////////////////////////////////////////create table/////////////////////////////////////////////////////
            /**PreparedStatement preparedStatement1 = connection.prepareStatement("create table education(education_id number PRIMARY  KEY , education_name varchar2(20)  )");
            preparedStatement1.executeUpdate();
            preparedStatement1.close();
            /////////////////////////////////////////////insert /////////////////////////////////////////////////////////
             PreparedStatement preparedStatement10 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
             preparedStatement10.setLong(1,1);
             preparedStatement10.setString(2, "sikl");
             preparedStatement10.executeUpdate();
             preparedStatement10.close();

            PreparedStatement preparedStatement4 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement4.setLong(1,2);
            preparedStatement4.setString(2, "diplom");
            preparedStatement4.executeUpdate();
            preparedStatement4.close();

            PreparedStatement preparedStatement5 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement5.setLong(1,3);
            preparedStatement5.setString(2, "updiplom");
            preparedStatement5.executeUpdate();
            preparedStatement5.close();

            PreparedStatement preparedStatement6 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement6.setLong(1,4);
            preparedStatement6.setString(2, "lisans");
            preparedStatement6.executeUpdate();
            preparedStatement6.close();

            PreparedStatement preparedStatement7 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement7.setLong(1,5);
            preparedStatement7.setString(2, "uplisans");
            preparedStatement7.executeUpdate();
            preparedStatement7.close();

            PreparedStatement preparedStatement8 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement8.setLong(1,6);
            preparedStatement8.setString(2, "doctora");
            preparedStatement8.executeUpdate();
            preparedStatement8.close();

            PreparedStatement preparedStatement9 =connection.prepareStatement("insert into education(education_id , education_name) values(?,?)");
            preparedStatement9.setLong(1,7);
            preparedStatement9.setString(2, "updoktora");
            preparedStatement9.executeUpdate();
            preparedStatement9.close();

            ////////////////////////////////////////////create table/////////////////////////////////////////////////////
            //PreparedStatement preparedStatement2 = connection.prepareStatement("create table acount(usercode varchar2(20) primary key ,username varchar2(20), email varchar2(20) ,userpass varchar2(20),userage number,education_id references education)");
            //preparedStatement2.executeUpdate();
            //preparedStatement2.close();**/
            ///////////////////////////////////////////////////insert////////////////////////////////////////////////////
            PreparedStatement preparedStatement3 = connection.prepareStatement("insert into acount(usercode,username,email,userpass,userage,education_id)values (?,?,?,?,?,?)");
            System.out.println("ENTER USER NAME :");
            String username =input.next();
            System.out.println("ENTER USER PASSWORD :");
            String userpass =input.next();
            System.out.println("ENTER USER CODE :");
            String usercode =input.next();
            System.out.println("ENTER USER EMAIL :");
            String email =input.next();
            System.out.println("ENTER USER AGE :");
            int userage =input.nextInt();
            System.out.println("ENTER USER EDUCATIN : 1)SIKL\t2)DIPLOM\t3)UPDIPLOM\t4)LISANS\t5)UPPLISANS\t6)DOCTORA\t7)UPDOCTORA");
            int education1 =input.nextInt();

            preparedStatement3.setString(1,usercode);
            preparedStatement3.setString(2,username);
            preparedStatement3.setString(3,email);
            preparedStatement3.setString(4,userpass);
            preparedStatement3.setLong  (5,userage);
            preparedStatement3.setLong  (6,education1);

            preparedStatement3.executeUpdate();
            preparedStatement3.close();
            connection.close();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
