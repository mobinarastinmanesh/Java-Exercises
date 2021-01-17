package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("year : ");
        String sal = scaner.next();
        Sen s = new Sen(1398);
        s.old(Integer.parseInt(sal));

    }
}
