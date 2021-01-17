package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("1)riazi\n2)programming2\n3)madarmanteghi\n");
	Scanner s = new Scanner(System.in);
	switch(s.nextInt()){
        case 1 :
            Riazi2 a = new Riazi2();
            a.pish();
            a.ham();
            a.v();
            break;

        case 2 :Programming2 b = new Programming2();
            b.pish();
            b.ham();
            b.v();
            break;

        case 3 :
            Madarmanteghi c = new Madarmanteghi();
            c.pish();
            c.ham();
            c.v();
            break;

    }
    }
}
