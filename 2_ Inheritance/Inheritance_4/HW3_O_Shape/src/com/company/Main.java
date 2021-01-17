package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("1)Rectangular\n2)Elliptical\n3)Circle\n4)Square\n");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()){

            case 1:
                System.out.println("length:");
                Scanner t = new Scanner(System.in);
                int x = t.nextInt();
                System.out.println("width:");
                Scanner a = new Scanner(System.in);
                int y = a.nextInt();
                Rectangular object1 = new Rectangular(x, y);
                object1.perimeter();
                object1.surface();
                break;

            case 2:
                System.out.println("a:");
                Scanner g = new Scanner(System.in);
                int o = g.nextInt();
                System.out.println("b:");
                Scanner h = new Scanner(System.in);
                int p = h.nextInt();
                Elliptical object2 = new Elliptical(o,p);
                object2.perimeter();
                object2.surface();
                break;

            case 3:
                System.out.println("r :");
                Scanner e = new Scanner(System.in);
                Circle object3 = new Circle(e.nextInt());
                object3.perimeter();
                object3.surface();
                break;

            case 4:
                System.out.println("length side :");
                Scanner m = new Scanner(System.in);
                Square object4 = new Square(m.nextInt());
                object4.perimeter();
                object4.surface();
                break;
        }

    }
}
