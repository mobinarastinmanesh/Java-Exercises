package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name=scanner.next();
        String username=scanner.next();
        String userpassword=scanner.next();
        String address=scanner.next();
        String numberphone=scanner.next();
        String education=scanner.next();
        String age=scanner.next();

                Information informationBuilder = new InformationBuilder().
                setName(name).setUsername(username).
                setUserpassword(userpassword).setAddress(address).
                setNumberphone(numberphone).setAge(age).
                setEducation(education).builder();

        System.out.println("name : " + informationBuilder.getName());
        System.out.println("username : " + informationBuilder.getUsername());
        System.out.println("userpassword : " + informationBuilder.getUserpassword());
        System.out.println("address : " + informationBuilder.getAddress());
        System.out.println("education : " + informationBuilder.getEducation());
        System.out.println("numberphone : " + informationBuilder.getNumberphone());
        System.out.println("age : " + informationBuilder.getAge());

    }
}
