package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class T1_Database extends Thread{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public void run (){

        JFrame jFrame =new JFrame("SAVE");
        jFrame.setSize(500,500);

        JLabel jLabelname = new JLabel("name : ");
        JLabel jLabelpass = new JLabel("password : ");

        jLabelname.setBounds(10,10,100,30);
        jLabelpass.setBounds(10,30,100,30);

        JTextField jTextField =new JTextField();
        JPasswordField jPasswordField =new JPasswordField();

        jTextField.setBounds(110,10,100,20);
        jPasswordField.setBounds(110,35,100,20);

        JButton b =new JButton("save");
        b.setBounds(100,75,70,30);
        b.setBackground(Color.cyan);

        jFrame.add(jLabelname);
        jFrame.add(jLabelpass);
        jFrame.add(jTextField);
        jFrame.add(jPasswordField);
        jFrame.add(b);

        jFrame.setLayout(null);
        jFrame.setVisible(true);

        //////////////////////////////////
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
                            "rastin" , "java");

                    preparedStatement=connection.prepareStatement("insert into register(name,password)values(?,?)");
                    preparedStatement.setString(1,jTextField.getText());
                    preparedStatement.setString(2,jPasswordField.getText());
                    preparedStatement.executeUpdate();
                    System.out.println("succesfully :) ");

                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        });

    }
}
