package com.company;

/**
 * Created by Asus on 10/2/2019.
 */
public class Triangular extends  Shape {

   public int h;
   public int r;

    public Triangular(int h , int r){
        this.h=h;
        this.r=r;
    }

    @Override
    public void perimeter(){
        //int p = (h + r)*2 ;
        //System.out.println("perimeter: "+  p  );
    }
    @Override
    public  void surface(){
        int s = (h*r) /2 ;
        System.out.println("surface : " + s  );

    }


}
