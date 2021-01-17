package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1)AirBus\n2)ATR\n3)Boeing\n4)McDonnellDouglas");
        AirPlane airPlane;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1 : airPlane = AirFactory.getairplan(1);
            airPlane.fly();
            break;
            case 2 : airPlane = AirFactory.getairplan(2);
                airPlane.fly();
                break;
            case 3 : airPlane = AirFactory.getairplan(3);
                airPlane.fly();
                break;
            case 4 : airPlane = AirFactory.getairplan(4);
                airPlane.fly();
                break;

        }

    }
}
