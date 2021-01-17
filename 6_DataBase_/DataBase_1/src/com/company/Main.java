package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "rastin", "java");

            Scanner scanner = new Scanner(System.in);

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            while (true) {
                System.out.println("1)enter \n2)delete\n3)update\n4)show\n5)exit ");
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("sid:");
                        String sid = scanner.next();
                        System.out.println("name:");
                        String name = scanner.next();
                        System.out.println("year:");
                        String year = scanner.next();
                        System.out.println("avrage:");
                        String avg = scanner.next();
                        ///////////////////////////////////////////////////insert/////////////////////////////////////////////////////////
                        PreparedStatement preparedStatement = connection.prepareStatement("insert into student(sid,name,year,avg) values (?,?,?,?)");
                        preparedStatement.setString(1, sid);
                        preparedStatement.setString(2, name);
                        preparedStatement.setString(3, year);
                        preparedStatement.setString(4, avg);
                        preparedStatement.executeUpdate();
                        preparedStatement.close();
                        break;
                    /////////////////////////////////////////////////////delete//////////////////////////////////////////////////////////////////////////////////////
                    case 2:
                        System.out.println("sid:");
                        String sid1 = scanner.next();
                        PreparedStatement preparedStatement2 = connection.prepareStatement("delete from student WHERE sid=?");
                        preparedStatement2.setString(1, sid1);
                        preparedStatement2.executeUpdate();
                        preparedStatement2.close();
                        break;
                    //////////////////////////////////////////////////////update////////////////////////////////////////////////////////////////////////////////////
                    case 3:
                        System.out.println("enter sid:");
                        String sida = scanner.next();
                        System.out.println("which field do you want to change:");
                        System.out.println("1)sid\n2)name\n3)year\n4)avrage\n");
                        int m = scanner.nextInt();
                        switch (m) {
                            case 1:
                                PreparedStatement preparedStatement3 = connection.prepareStatement("update student set  sid=? where sid=?");
                                System.out.println("new SID :");
                                String sidn = scanner.next();
                                preparedStatement3.setString(1, sidn);
                                preparedStatement3.setString(2, sida);
                                preparedStatement3.executeUpdate();
                                preparedStatement3.close();
                                break;
                            case 2:
                                PreparedStatement preparedStatement4 = connection.prepareStatement("update student set  name=? where sid=?");
                                System.out.println("new NAME :");
                                String namen = scanner.next();
                                preparedStatement4.setString(1, namen);
                                preparedStatement4.setString(2, sida);
                                preparedStatement4.executeUpdate();
                                preparedStatement4.close();
                                break;
                            case 3:
                                PreparedStatement preparedStatement5 = connection.prepareStatement("update student set  year=? where sid=?");
                                System.out.println("new YEAR :");
                                String yearn = scanner.next();
                                preparedStatement5.setString(1, yearn);
                                preparedStatement5.setString(2, sida);
                                preparedStatement5.executeUpdate();
                                preparedStatement5.close();
                                break;
                            case 4:
                                PreparedStatement preparedStatement6 = connection.prepareStatement("update student set  avg=? where sid=?");
                                System.out.println("new AVRAGE :");
                                String avgn = scanner.next();
                                preparedStatement6.setString(1, avgn);
                                preparedStatement6.setString(2, sida);
                                preparedStatement6.executeUpdate();
                                preparedStatement6.close();


                        }
                        break;
                    ////////////////////////////////////////////////select///////////////////////////////////////////////////////////////////////////////////////////
                    case 4:
                                System.out.println("ENTER SID :");
                                String sid2 = scanner.next();
                                PreparedStatement preparedStatement7 = connection.prepareStatement("SELECT * from student WHERE sid=?");
                                preparedStatement7.setString(1,sid2);
                                ResultSet resultSet = preparedStatement7.executeQuery();
                                while(resultSet.next()) {
                                    System.out.println("SID:" + resultSet.getString("sid"));
                                    System.out.println("NAME:" + resultSet.getString("name"));
                                    System.out.println("YERA:" + resultSet.getString("year"));
                                    System.out.println("AVRAGE:" + resultSet.getString("avg"));
                                }
                                preparedStatement7.executeUpdate();
                                preparedStatement7.close();
                                break;
                    case 5:
                        connection.close();
                        System.exit(0);
                }
            }


        } catch (ClassNotFoundException e) {

            System.err.println(e.getMessage());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
