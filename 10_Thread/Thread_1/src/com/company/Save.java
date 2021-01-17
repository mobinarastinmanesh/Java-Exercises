package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Save implements Runnable {

    @Override
    public void run() {

        JFrame jFrame = new JFrame("SAVE");
        jFrame.setSize(500,700);

        JTextField j1 = new JTextField();
        JTextField j2 = new JTextField();
        JTextField j3 = new JTextField();

        JLabel l1 =new JLabel("ID");
        JLabel l2 =new JLabel("NAME");
        JLabel l3 =new JLabel("FATHERNAME");

        JButton b = new JButton("Save");

        j1.setBounds(150,50 ,200,30);
        j2.setBounds(150,100,200,30);
        j3.setBounds(150,150,200,30);

        l1.setBounds(10,50 ,200,30);
        l2.setBounds(10,100,200,30);
        l3.setBounds(10,150,200,30);

        b.setBounds(20,200,90,30);
        b.setForeground(Color.blue);
        b.setBackground(Color.pink);


        jFrame.add(j1);
        jFrame.add(j2);
        jFrame.add(j3);
        jFrame.add(l1);
        jFrame.add(l2);
        jFrame.add(l3);
        jFrame.add(b);

        jFrame.setLayout(null);
        jFrame.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormEntity formEntity = new FormEntity();
                formEntity.setId(j1.getText());
                formEntity.setName(j2.getText());
                formEntity.setFathername(j3.getText());
                try {
                    FormRepo formRepo = new FormRepo();
                    formRepo.insert(formEntity);
                    formRepo.commite();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
    }
}