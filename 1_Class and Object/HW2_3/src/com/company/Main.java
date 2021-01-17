package com.company;

import java.util.Scanner;

import static com.company.Sp.*;

public class Main {

    public static void main(String[] args) {
    Sp m =new Sp();

    System.out.println("tooll:");
    Scanner s=new Scanner(System.in);
    String q = s.next();

    System.out.println("arzz:");
    Scanner sc=new Scanner(System.in);
    String k =sc.next();

    m.masahat(k,q);
    m.mohit(k,q);

    }
}
