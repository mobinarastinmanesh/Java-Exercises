package view;

import model.entity.StudentEnti;
import model.repository.StudentRepo;
import model.service.StudentServ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by mobina on 12/13/2019.
 */
public class UI {
    public static void main(String[] args) {
        /*
        try {
            StudentRepo studentRepo =new StudentRepo();
            studentRepo.create();
        } catch (Exception e) {
            e.printStackTrace();
        }
        */

                JFrame fmain = new JFrame("S&C");

                JButton b1 = new JButton("SAVE");
                JButton b2 = new JButton("SHOW");
                JButton b3 = new JButton("EDIT");
                JButton b4 = new JButton("REMOVE");

                b1.setBackground(Color.pink);
                b2.setBackground(Color.cyan);
                b3.setBackground(Color.YELLOW);
                b4.setBackground(Color.ORANGE);

                b1.setBounds(20,50,500,30 );
                b2.setBounds(20,100,500,30 );
                b3.setBounds(20,150,500,30 );
                b4.setBounds(20,200,500,30 );

                fmain.setSize(700,500);
                fmain.setVisible(true);
                fmain.add(b1);
                fmain.add(b2);
                fmain.add(b3);
                fmain.add(b4);
                fmain.setLayout(null);

                b1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFrame jFrame1 = new JFrame();
                        jFrame1.setLocation(700, 0);
                        jFrame1.setSize(600, 800);

                ////////////////////////////////////////////////////////////
                        JLabel j1 = new JLabel("NAME");
                        j1.setBounds(5, 50, 300, 30);
                        JTextField t1 = new JTextField();
                        t1.setBounds(100, 50, 300, 30);

                        JLabel j2 = new JLabel("SID");
                        j2.setBounds(5, 100, 300, 30);
                        JTextField t2 = new JTextField();
                        t2.setBounds(100, 100, 300, 30);

                        JLabel j3 = new JLabel("CODEMELLI");
                        j3.setBounds(5, 150, 300, 30);
                        JTextField t3 = new JTextField();
                        t3.setBounds(100, 150, 300, 30);

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

                        jFrame1.add(t1);
                        jFrame1.add(t2);
                        jFrame1.add(t3);

                        jFrame1.add(js);

                        jFrame1.add(label);

                        jFrame1.setLayout(null);
                        jFrame1.setVisible(true);

                        //////////////////////////////////////وقتی ثبت رو زد///////////////////
                        js.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                StudentEnti studentEnti = new StudentEnti();
                                studentEnti.setName(t1.getText());
                                studentEnti.setSid (t2.getText());
                                studentEnti.setCode(t3.getText());
                                try {
                                    StudentServ.getInstance().Save(studentEnti);
                                    label.setText("با موفقیت ثبت شد...");
                                } catch (Exception e1) {
                                    e1.printStackTrace();
                                }

                            }
                        });

                    }
                });
//////////////////////////////////////////////////نمایش/////////////////////////////////////////////////////////////
                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ArrayList<StudentEnti> list = null;
                        try {
                            list=StudentServ.getInstance().Show();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                        JFrame fshow = new JFrame();
                        fshow.setSize(1000,500);

                        String soton[] = {"Sid","Name" ,"Code"};
                        String data[][] = new String[500][4];
                        int j=0;
                        for(StudentEnti ee : list){
                            data[j][0]=ee.getSid();
                            data[j][1]=ee.getName();
                            data[j][2]=ee.getCode();
                            j++;
                        }

                        JTable table = new JTable(data,soton);
                        JScrollPane sp = new JScrollPane(table);
                        fshow.add(sp);

                        fshow.setVisible(true);
                        fshow.setLayout(null);
                    }
                });

/////////////////////////////////////////ویرایش/////////////////////////////////////////////
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JFrame jFrame1 = new JFrame();
                    jFrame1.setLocation(700, 0);
                    jFrame1.setSize(600, 800);

                JLabel j1 = new JLabel("NEW NAME");
                j1.setBounds(5, 50, 300, 30);
                JTextField t1 = new JTextField();
                t1.setBounds(100, 50, 300, 30);

                JLabel j2 = new JLabel("NEW SID");
                j2.setBounds(5, 100, 300, 30);
                JTextField t2 = new JTextField();
                t2.setBounds(100, 100, 300, 30);

                JLabel j3 = new JLabel("NEW CODEMELLI");
                j3.setBounds(5, 150, 300, 30);
                JTextField t3 = new JTextField();
                t3.setBounds(100, 150, 300, 30);

                ////////////////////////////////////////////////////
                JButton js = new JButton("ثبت و ویرایش");
                js.setBounds(50, 500, 100, 60);
                js.setBackground(Color.orange);

                ////////////////////////////////////////////////////////////
                JLabel label = new JLabel();
                label.setBounds(50, 600, 200, 50);
                label.setForeground(Color.green);

                ///////////////////////////////////////////////////////
                jFrame1.add(j1);
                jFrame1.add(j2);
                jFrame1.add(j3);

                jFrame1.add(t1);
                jFrame1.add(t2);
                jFrame1.add(t3);

                jFrame1.add(js);

                jFrame1.add(label);

                jFrame1.setLayout(null);
                jFrame1.setVisible(true);

                //////////////////////////////////////وقتی ثبت رو زد///////////////////
                js.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        StudentEnti studentEnti = new StudentEnti();
                        studentEnti.setSid(t2.getText());
                        studentEnti.setName(t1.getText());
                        studentEnti.setCode(t3.getText());
                        try {
                            StudentServ.getInstance().Edit(studentEnti);
                            label.setText("با موفقیت ویرایش شد ...");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                });

            }
        });
/////////////////////////////////////////حذف///////////////////////////////////
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jFrame = new JFrame("delete");
                jFrame.setSize(500,500);
                JLabel jLabel = new JLabel("sid : ");
                jLabel.setBounds(50,50,70,30);
                JTextField jTextField = new JTextField();
                jTextField.setBounds(150,50,100,30);
                JButton button = new JButton("delete");
                button.setBounds(50,100,70,30);
                button.setBackground(Color.pink);
                JTextField jTextField1 = new JTextField();
                jTextField1.setBounds(50,150,100,30);

                jFrame.add(jLabel);
                jFrame.add(jTextField);
                jFrame.add(button);
                jFrame.add(jTextField1);

                jFrame.setLayout(null);
                jFrame.setVisible(true);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String sid =jTextField.getText();
                        StudentRepo studentRepo=null;
                        try {
                            StudentServ.getInstance().Remove(sid);
                            jTextField1.setText("با موفقیت حذف شد...");
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}



