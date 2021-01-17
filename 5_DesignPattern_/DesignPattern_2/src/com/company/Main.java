package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("JUB:");
        Form.getInstance().setJub(scanner.next());
        System.out.println("NAME:");
        Form.getInstance().setName(scanner.next());
        System.out.println("AGE:");
        Form.getInstance().setAge(scanner.next());
        System.out.println("EDUCATION:");
        Form.getInstance().setEducation(scanner.next());


        System.out.println("EDUCATION : " + Form.getInstance().getEducation());
        System.out.println("AGE : " + Form.getInstance().getAge());
        System.out.println("NAME : " + Form.getInstance().getName());
        System.out.println("JUB : " + Form.getInstance().getJub());

    }
}