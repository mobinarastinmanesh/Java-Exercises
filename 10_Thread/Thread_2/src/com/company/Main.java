package com.company;

public class Main {

    public static void main(String[] args) {

        T2_File file = new T2_File();
        Thread t1 = new Thread(file,"File");
        t1.start();
        //////////////////////////
        T1_Database database =new T1_Database();
        Thread t2 =new Thread(database,"database");
        t2.start();
    }
}
