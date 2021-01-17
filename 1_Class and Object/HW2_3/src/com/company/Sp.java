package com.company;

public class Sp{
    public int t ;
    public int a ;

    public void mohit(String l , String b){
        this.t = Integer.parseInt(l);
        this.a = Integer.parseInt(b);
        int c = (t+ a )*2 ;
        System.out.println("masahat:" + c);
    }
    public void masahat(String l, String b){
        this.t =Integer.parseInt(l);
        this.a =Integer.parseInt(b);
        int c = t*a;
        System.out.println("masahat:" + c);

    }
}
