package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JFrame fmain = new JFrame("استخدام و نمایش");
        JButton b1 = new JButton("فرم استخدام");
        JButton b2 = new JButton("نمایش کارمندان");
        b1.setBackground(Color.pink);
        b2.setBackground(Color.cyan);
        b1.setBounds(20,50,500,30 );
        b2.setBounds(20,100,500,30 );

        fmain.setSize(700,500);
        fmain.setVisible(true);
        fmain.add(b1);
        fmain.add(b2);
        fmain.setLayout(null);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame1 = new JFrame();
                jFrame1.setLocation(700, 0);
                jFrame1.setSize(600, 800);

                ////////////////////////////////////////////////////////////
                JLabel j1 = new JLabel("نام و نام خانوادگی");
                j1.setBounds(5, 50, 300, 30);
                JTextField t1 = new JTextField();
                t1.setBounds(100, 50, 300, 30);

                JLabel j2 = new JLabel("شناسه کارمندی");
                j2.setBounds(5, 100, 300, 30);
                JTextField t2 = new JTextField();
                t2.setBounds(100, 100, 300, 30);

                JLabel j3 = new JLabel("کدملی");
                j3.setBounds(5, 150, 300, 30);
                JTextField t3 = new JTextField();
                t3.setBounds(100, 150, 300, 30);

                JLabel j4 = new JLabel("شماره تماس");
                j4.setBounds(5, 200, 300, 30);
                JTextField t4 = new JTextField();
                t4.setBounds(100, 200, 300, 30);


                ////////////////////////////////////////////////////
                JButton js = new JButton("ثبت");
                js.setBounds(50, 500, 60, 60);
                js.setBackground(Color.orange);

                ////////////////////////////////////////////////////////////
                JLabel label = new JLabel();
                label.setBounds(50, 600, 200, 50);
                label.setForeground(Color.green);

                ///////////////////////////////////////////////////////
                jFrame1.add(j1);
                jFrame1.add(j2);
                jFrame1.add(j3);
                jFrame1.add(j4);

                jFrame1.add(t1);
                jFrame1.add(t2);
                jFrame1.add(t3);
                jFrame1.add(t4);

                jFrame1.add(js);

                jFrame1.add(label);

                jFrame1.setLayout(null);
                jFrame1.setVisible(true);

                //////////////////////////////////////وقتی ثبت رو زد///////////////////
                js.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Entity entity = new Entity();
                        entity.setId(t2.getText());
                        entity.setName(t1.getText());
                        entity.setCode(t3.getText());
                        entity.setShomare(t4.getText());
                        try {
                            Database database = new Database();
                            //database.createtable();
                            database.insert(entity);
                            label.setText("با موفقیت ثبت شد...");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                });

            }
        });
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Entity> list = null;
                try {
                    Database database1 = new Database();
                    list=database1.select();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
                JFrame fshow = new JFrame();
                fshow.setSize(1000,500);

                String soton[] = {"Id","Name" ,"Code" , "Phonenumber"};
                String data[][] = new String[500][4];
                int j=0;
                for(Entity ee : list){
                    data[j][0]=ee.getId();
                    data[j][1]=ee.getName();
                    data[j][2]=ee.getCode();
                    data[j][3]=ee.getShomare();
                    j++;
                }

                JTable table = new JTable(data,soton);
                JScrollPane sp = new JScrollPane(table);
                fshow.add(sp);

                fshow.setVisible(true);
                fshow.setLayout(null);
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
