package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	String n ;
	Scanner scanner = new Scanner((System.in));

	System.out.println("tedad dars ha :");

	n = scanner.next();

	Student s =new Student();//objuct

	System.out.println("nomarat:");

	for ( int i=1 ; i<=Integer.parseInt(n) ;i++){
        System.out.println(i + ":");
	    float m =Float.parseFloat(scanner.next());
	    s.ssum(m);
    }

    s.avg(Integer.parseInt(n));


    }
}
