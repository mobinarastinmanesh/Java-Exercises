package com.company;

/**
 * Created by Asus on 10/2/2019.
 */
public class Rectangular extends  Shape {
   public int toul;
   public int arz;
   public int a;

    public Rectangular(int toul , int arz){//constructor1
        this.toul=toul;
        this.arz=arz;
    }

    public Rectangular(int toul , int arz , int a){//constructor2---->overload
        this.toul=toul;
        this.arz=arz;
        this.a=a;
    }

    @Override
    public void perimeter(){
        int p = (toul + arz)*2 ;
        System.out.println("perimeter: "+  p  );
    }

    @Override
    public  void surface(){
        int s = toul * arz ;
        System.out.println("surface : " + s  );

    }



}



