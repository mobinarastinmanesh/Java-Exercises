package com.company;

import javafx.scene.input.DataFormat;

public class Elliptical implements Shape {


    protected final double p = 3.14 ;
    public int a ;
    public int b ;


    public  Elliptical(int a , int b){
    this.a= a;
    this.b=b;
    }

    @Override
    public void surface() {
    double s = (((double)a*(double)b)*p);
    System.out.println("surface :" + s );

    }

    @Override
    public void perimeter() {
    double p1 = ((2 * p) * Math.sqrt( ((double)a*(double)a + (double)b*(double)b ) / 2) ) ;
    System.out.println("perimeter:" + p1);
    }

}
