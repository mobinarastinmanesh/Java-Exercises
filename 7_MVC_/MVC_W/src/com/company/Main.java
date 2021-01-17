package com.company;


import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
//پایگاه داده ای با قابلیت ذخیره اجناس و به روزرسانی و حذف و نمایش کالا ها
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        int id;
        String name;
        int price;
        String  time;
        WereHouse wereHouse;
        Set <WereHouse>set = new LinkedHashSet();
        DataBase dataBase =new DataBase();
        while (true) {
            System.out.println("1)enteranc\n2)update\n3)delete\n4)show");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    wereHouse = new WereHouse();
                    System.out.println("ID:");
                    wereHouse.Id = scanner.nextInt();
                    System.out.println("PRODUCT NAME :");
                    wereHouse.Product_Name = scanner.next();
                    System.out.println("PRODUCT PRICE:");
                    wereHouse.product_Price = scanner.nextInt();
                    System.out.println("PRODUCT ENTERANCE TIME:");
                    wereHouse.Prodact_Enterance_Time = scanner.next();
                    set.add(wereHouse);

                    dataBase.Connection();//Connection OK

                    for (WereHouse s : set) {

                        dataBase.enterance(s);
                    }//Enterance OK
                    break;
                case 2:
                    wereHouse = new WereHouse();
                    System.out.println("enter new information:");
                    System.out.println("ID:");
                    wereHouse.Id = scanner.nextInt();
                    System.out.println("PRODUCT NAME :");
                    wereHouse.Product_Name = scanner.next();
                    System.out.println("PRODUCT PRICE:");
                    wereHouse.product_Price = scanner.nextInt();
                    System.out.println("PRODUCT ENTERANCE TIME:");
                    wereHouse.Prodact_Enterance_Time = scanner.next();
                    set.add(wereHouse);
                    dataBase.Connection();//Connection OK
                    dataBase.update(wereHouse);
                    break;
                case 3:
                    System.out.println("enter id :");
                    id = scanner.nextInt();
                    dataBase.Connection();//Connection OK
                    dataBase.delete(id);
                    break;
                case 4:
                    dataBase.Connection();//Connection OK
                    dataBase.select();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
