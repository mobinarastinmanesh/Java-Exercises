package com.company;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        /*
        try {
            new Database().createtable();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        JFrame jFrame= new JFrame ("دانشگاه علم و فرهنگ");

        jFrame.setLocation (0,0);
        jFrame.setSize (500,600);
        JLabel j = new JLabel("شماره دانشجویی");
        j.setBounds(10,20,100,20);
        j.setForeground(Color.blue);
        jFrame.add(j);

        JTextField t = new JTextField();
        t.setBounds(150,20,100,20);
        jFrame.add(t);

        JButton a = new JButton("ورود");
        a.setBounds(150,50,60,30);
        a.setBackground(Color.pink);
        jFrame.add(a);

        jFrame.setLayout(null);
        jFrame.setVisible (true);
        jFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        //////////////////////////////////////////////////////////////
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sid = t.getText();

                JFrame frame = new JFrame("انتخاب واحد");
                frame.setSize(1000,700);

                JButton sabt = new JButton("ثبت");
                sabt.setBounds(600,400,50,50);
                frame.add(sabt);

                JLabel sc =new JLabel();
                sc.setBounds(600,450,70,20);
                sc.setForeground(Color.blue);
                frame.add(sc);


                String soton[]={"نام درس" , "کد درس","تعداد واحد"};

                String data[][] ={{"ریاضی 2","223312","3",},{"برنامه نویسی","122321","4"},
                                  {"فیزیک 2","302112","3",},{"تاریخ تحلیلی","112122","2"}
                                  ,{"زبان تخصصی","232232","2"},{"معماری کامپیوتر","123121","4"}};

                JTable table =new JTable(data,soton);
                //table.setEnabled(false);
                table.setCellSelectionEnabled(true);
                ListSelectionModel select = table.getSelectionModel();
                select.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

                JScrollPane sp = new JScrollPane(table);
                frame.add(sp);
                frame.setVisible(true);
                Set<Object>  set = new HashSet<Object>();
                /////////////////////////////////////////////////////
                select.addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        Object Data = null;
                        int[] row = table.getSelectedRows();
                        int[] columns = table.getSelectedColumns();
                        for (int i = 0; i < row.length; i++) {
                            for (int j = 0; j < columns.length; j++) {
                                 Data = table.getValueAt(row[i], columns[j]);
                                //System.out.println(table.getValueAt(row[i], columns[j]));
                            }
                        }
                        set.add(Data);
                    }
                });

                sabt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int i=0;
                        for(Object s : set){
                            i++;
                            try {
                                new Database().insert(s,i , sid);
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            }

                        }
                        sc.setText("با موفقیت ثبت شد....");
                    }
                });

            }
        });
    }
}
