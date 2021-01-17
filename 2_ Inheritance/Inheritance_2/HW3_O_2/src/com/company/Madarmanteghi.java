package com.company;

public class Madarmanteghi implements Pishniaz,Hamniaz,Vahed {

    @Override
    public  void  pish() {
        System.out.println("pishniaz : gosaste");
    }

    @Override
    public  void  ham(){
        System.out.println("hamniaz :gosaste");
    }

    @Override
    public  void  v(){
        System.out.println("vahed : 4 ");
    }

}
