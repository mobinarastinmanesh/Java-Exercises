package com.company;

import org.omg.PortableInterceptor.LOCATION_FORWARD;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("پردخت قبوض");
        frame.setSize(500,500);

        JTextField t1 = new JTextField();
        t1.setBounds(100,10,100,20);
        frame.add(t1);

        JLabel j1 =new JLabel("شماره حساب");
        j1.setBounds(1,10,90,20);
        j1.setForeground(Color.blue);
        frame.add(j1);

        JLabel j2 =new JLabel("میزان بدهی شما");
        j2.setBounds(1,30,100,20);
        j2.setForeground(Color.red);
        frame.add(j2);

        JTextField t2 = new JTextField();
        t2.setEditable(false);
        t2.setBounds(100,30,100,20);
        frame.add(t2);

        JLabel j3 = new JLabel("مبلغ پرداختی");
        j3.setForeground(Color.green);
        j3.setBounds(1,50,100,20);
        frame.add(j3);

        JTextField t3 = new JTextField();
        t3.setBounds(100,50,100,20);
        frame.add(t3);

        JButton a = new JButton("استعلام بدهی");
        a.setBackground(Color.cyan);
        a.setBounds(200,10 , 90 , 20);
        frame.add(a);

        JButton b = new JButton("پرداخت");
        b.setBackground(Color.pink);
        b.setBounds(50,130 , 70 , 30);
        frame.add(b);

        JLabel label = new JLabel();
        label.setBounds(100,200,70,30);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
        /*
        try {
            new Database().create_insert_account_database();

        } catch (Exception e) {
            e.printStackTrace();
        }
        */
/////////////////////////////////////////////////////////////
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Long number = Long.valueOf(t1.getText());
                Long debt= null;

                try {
                    debt=new Database().select_debt(number);


                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                t2.setText(String.valueOf(debt));
            }
        });
/////////////////////////////////////////////////////////////
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Long number = Long.valueOf(t1.getText());
                Long debt= null;
                Long pardakht= null;
                try {
                    debt=new Database().select_debt(number);


                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                t2.setText(String.valueOf(debt));

                pardakht= Long.valueOf(t3.getText());
                try {
                    new Database().update_debt(number , debt-pardakht);

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                label.setText("با موفقیت پرداخت شد...");
            }

        });



    }
}
