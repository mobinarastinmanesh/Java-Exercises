package com.company;


import javax.swing.*;
import java.util.ArrayList;

public class Report implements Runnable{

    @Override
    public void run() {
            JFrame jFrame = new JFrame("REPORT");
            jFrame.setBounds(500, 0, 500, 700);

            ArrayList<FormEntity> list = new ArrayList<>();

            String data[][] = new String[100][3];
            String title[] = {"ID", "NAME", "FATHERNAME"};

            try {
                FormRepo formRepo = new FormRepo();
                list = formRepo.select();
                formRepo.commite();
            } catch (Exception e) {
                e.printStackTrace();
            }

            int i = 0;

            for (FormEntity f : list) {

                data[i][0] = f.getId();
                data[i][1] = f.getName();
                data[i][2] = f.getFathername();
                i++;
            }

            JTable table = new JTable(data, title);
            table.setEnabled(false);

            JScrollPane scrollPane = new JScrollPane(table);
            jFrame.add(scrollPane);

            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
