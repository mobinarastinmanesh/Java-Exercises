package com.company;

public class Main {

    public static void main(String[] args) {



        Save save = new Save();
        Thread t1 = new Thread(save,"Save");
        t1.start();
        //////////////////////////////
        Report report = new Report();
        Thread t2 = new Thread(report,"Report");
        t2.start();
        //////////////////////////////
        Update update = new Update();
        Thread t3 = new Thread(update,"Update");
        t3.start();
    }
}
