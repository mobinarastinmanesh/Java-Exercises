package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  Exception {

        Scanner scanner = new Scanner(System.in);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rastin", "java");
        ///////////////////////////////////////////////create table///////////////////////////////////////////////////////////////////////////////
        //فقط یکبار باید ران شه تا برای اولین بار table بسازه ودفعات بعدی ارور میده که این table وجود داره و پس دفعات بعدی باید این سه خط کامنت بشه
        //PreparedStatement preparedStatement = connection.prepareStatement("create table staff (code varchar2(20) primary key,fathername varchar2(20) ,codemelli varchar2(20) ,semat varchar2(20) ,sen number , hoghogh number , sabeghe number )");
        //preparedStatement.executeUpdate();
        //preparedStatement.close();
        boolean t = true;
        while(t) {
            System.out.println("1)enter\n2)show");
            int n = scanner.nextInt();
            switch (n) {
                //////////////////////////////////////////////////insert//////////////////////////////////////////////////////////////////////////////////
                case 1:
                    System.out.println("code :");
                    String CODE = scanner.next();
                    System.out.println("fathername :");
                    String FATHERNAME = scanner.next();
                    System.out.println("codemelli :");
                    String CODEMELLI = scanner.next();
                    System.out.println("semat :");
                    String SEMET = scanner.next();
                    System.out.println("sen :");
                    int SEN = scanner.nextInt();
                    System.out.println("hoghogh :");
                    int HOGHOGH = scanner.nextInt();
                    System.out.println("sabeghe :");
                    int SABEGHE = scanner.nextInt();

                    PreparedStatement preparedStatement1 = connection.prepareStatement("insert into staff(code,fathername,codemelli,semat,sen,hoghogh,sabeghe)VALUES(?,?,?,?,?,?,?)");
                    preparedStatement1.setString(1, CODE);
                    preparedStatement1.setString(2, FATHERNAME);
                    preparedStatement1.setString(3, CODEMELLI);
                    preparedStatement1.setString(4, SEMET);
                    preparedStatement1.setLong(5, SEN);
                    preparedStatement1.setLong(6, HOGHOGH);
                    preparedStatement1.setLong(7, SABEGHE);
                    preparedStatement1.executeQuery();
                    preparedStatement1.close();
                    break;
                /////////////////////////////////////select/////////////////////////////////////////////
                case 2:
                    PreparedStatement preparedStatement2 = connection.prepareStatement("select * from staff where code=?");
                    System.out.println("enter code :");
                    String code = scanner.next();
                    preparedStatement2.setString(1, code);
                    ResultSet resultSet = preparedStatement2.executeQuery();
                    while (resultSet.next()) {
                        System.out.println("code :" + resultSet.getString("code"));
                        System.out.println("fathername :" + resultSet.getString("fathername"));
                        System.out.println("codemelli : " + resultSet.getString("codemelli"));
                        System.out.println("semat : " + resultSet.getString("semat"));
                        System.out.println("sen : " + resultSet.getLong("sen"));
                        System.out.println("hoghogh : " + resultSet.getLong("hoghogh"));
                        System.out.println("sabeghe : " + resultSet.getLong("sabeghe"));
                    }
                    preparedStatement2.executeUpdate();
                    preparedStatement2.close();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////
                case  3:
                    //System.exit(0);
                    t = false;
            }

        }
        connection.close();
    }
}
