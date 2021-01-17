package com.company;

public class Rectangular implements Shape {
    public int toul;
    public int arz;
    public int a;

    public Rectangular(int toul , int arz){//constructor1
        this.toul=toul;
        this.arz=arz;
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
