package com.company;

/**
 * Created by Asus on 9/25/2019.
 */
public class Student {
    public float sum = 0 ;

    public static float mshrt = 10 ;

    public void ssum(float m ){
        this.sum += m ;
    }

    public void avg(int n){
        float av = this.sum / n;
        System.out.println("avrage:" + av);
        mashroty(av);
    }
    public void mashroty(float av){
        if(av<mshrt){
            System.out.println("mashrooot !!!!!!! ");
        }
    }



}
