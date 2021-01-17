package com.company;

/**
 * Created by Asus on 10/2/2019.
 */
public class Lozenge extends  Rectangular {
    public int d1;
    public int d2;
    public int a;

    public Lozenge(int d1 , int d2 , int a){
        super(d1,d2,a);
        this.d1 = d1;
        this.d2 = d2;
        this.a = a;
    }
    @Override
    public void perimeter(){
        int p = a*4 ;
        System.out.println("perimeter: "+  p  );
    }

    @Override
    public  void surface(){
        int s = ((d1*d2)/2) ;
        System.out.println("surface : " + s  );

    }

}
