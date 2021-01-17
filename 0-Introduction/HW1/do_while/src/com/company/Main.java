package com.company;

public class Main {

    public static void main(String[] args) {
        int f = 1, i=1;
        do {
            f *= i;
            i++;
        } while (i <= 5);

        System.out.println("5! = " + f);
    }
}