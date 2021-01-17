package com.company;

public class Circle extends Elliptical{
    public int r1;

    public Circle(int r )
    {
        super(r,r);
        this.r1=r;

    }

    @Override
    public void surface() {
        double s = ((r1*r1)*p);
        System.out.println("surface :" + s );

    }

    @Override
    public void perimeter() {
        double p1 = ((2 * p) * r1 ) ;
        System.out.println("perimeter:" + p1);
    }
}
