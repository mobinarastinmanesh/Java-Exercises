package com.company;

public class Hoghogh {

    public String h;
    public String g;

    public Hoghogh(String h , String g){
    this.h=h;
    this.g=g;
    }
    public  void Print(){
        int a = Integer.parseInt(h);
        int b = Integer.parseInt(g);
        int c = a-b ;
        System.out.println("HOGHOGH KHALES : " + c );
    }
}
