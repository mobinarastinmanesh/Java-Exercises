package com.company;

import com.sun.javaws.exceptions.ExitException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("1)rectangular" + "\n" + "2)lozenge" + "\n" + "3)square" + "\n" + "4)triangular" + "\n" );
            Scanner n = new Scanner(System.in);
            switch (n.nextInt()) {
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
                    System.out.println("diameter1:");
                    Scanner d1 = new Scanner(System.in);
                    int f = d1.nextInt();
                    System.out.println("diameter2:");
                    Scanner d2 = new Scanner(System.in);
                    int g = d2.nextInt();
                    System.out.println("1 side :");
                    Scanner d = new Scanner(System.in);
                    int c = d.nextInt();
                    Lozenge object2 = new Lozenge(f, g, c);
                    object2.perimeter();
                    object2.surface();
                    break;
                case 3:
                    System.out.println("length side :");
                    Scanner m = new Scanner(System.in);
                    Square object3 = new Square(m.nextInt());
                    object3.perimeter();
                    object3.surface();
                    break;
                case 4:
                    System.out.println("heigh:");
                    Scanner h = new Scanner(System.in);
                    int o = h.nextInt();
                    System.out.println("rule:");
                    Scanner r = new Scanner(System.in);
                    int p = r.nextInt();
                    Triangular object4 = new Triangular(o, p);
                    object4.surface();
                    break;

            }
        }
    }
}
