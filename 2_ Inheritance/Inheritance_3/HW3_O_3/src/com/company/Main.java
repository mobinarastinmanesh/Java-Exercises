package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("name:");
        Scanner a = new Scanner(System.in);
        switch (a.next()){
            case "student1":
                Student1 object1 =new Student1();
                object1.avg();
                object1.vahed();
                object1.sanavat();
                break;
            case "student2":
                Student2 object2 =new Student2();
                object2.avg();
                object2.vahed();
                object2.sanavat();
                break;
            case "student3":
                Student3 object3 =new Student3();
                object3.avg();
                object3.vahed();
                object3.sanavat();
        }
    }
}
