package com.company;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /////////////////////////////////////////////BANK 1
        System.out.println("MELLY BANK1 :");
        System.out.println("ENTER Boss name:");
        String name = scanner.next();
        System.out.println("ENTER Branch name:");
        String branch = scanner.next();
        System.out.println("ENTER Branch code:");
        String code = scanner.next();
        System.out.println("ENTER Address:");
        String address = scanner.next();
        System.out.println("ENTER phone number:");
        String phone = scanner.next();
        System.out.println("ENTER Budget Amount:");
        int bujet=0;
        try{
            bujet = scanner.nextInt();
        }catch(Exception e){
            System.err.println(Excp.parse(e));
        }
        Melly1<String,String,String,String,String,Integer> melly1 = new Melly1<>(name,branch,code,address,phone,bujet);
        System.out.println("**********************************************");
        /////////////////////////////////////////////////BANK 2
        System.out.println("MELLY BANK2 :");
        System.out.println("ENTER Boss name:");

        String name2 = scanner.next();

        System.out.println("ENTER Branch name:");

        String branch2 = scanner.next();
        System.out.println("ENTER Branch code:");
        String code2 = scanner.next();
        System.out.println("ENTER Address:");
        String address2 = scanner.next();
        System.out.println("ENTER phone number:");
        String phone2 = scanner.next();
        System.out.println("ENTER Budget Amount:");
        int bujet2=0;
        try{
            bujet2 = scanner.nextInt();
        }catch(Exception e){
            System.err.println(Excp.parse(e));
        }
        Melly2<String,String,String,String,String,Integer> melly2 = new Melly2<>(name2,branch2,code2,address2,phone2,bujet2);
        System.out.println("**********************************************");
        //////////////////////////////////////////////////// BANK 3
        System.out.println("MELLY BANK3 :");
        System.out.println("ENTER Boss name:");
        String name3 = scanner.next();
        System.out.println("ENTER Branch name:");
        String branch3 = scanner.next();
        System.out.println("ENTER Branch code:");
        String code3 = scanner.next();
        System.out.println("ENTER Address:");
        String address3 = scanner.next();
        System.out.println("ENTER phone number:");
        String phone3= scanner.next();
        System.out.println("ENTER Budget Amount:");
        int bujet3=0;
        try{
            bujet3 = scanner.nextInt();
        }catch(Exception e){
            System.err.println(Excp.parse(e));
        }
        Melly3<String,String,String,String,String,Integer> melly3 = new Melly3<>(name3,branch3,code3,address3,phone3,bujet3);
        System.out.println("**********************************************");
        //////////////////////////////////////////////////// BANK 4
        System.out.println("MELLY BANK4 :");
        System.out.println("ENTER Boss name:");
        String name4 = scanner.next();
        System.out.println("ENTER Branch name:");
        String branch4 = scanner.next();
        System.out.println("ENTER Branch code:");
        String code4 = scanner.next();
        System.out.println("ENTER Address:");
        String address4 = scanner.next();
        System.out.println("ENTER phone number:");
        String phone4 = scanner.next();
        System.out.println("ENTER Budget Amount:");
        int bujet4=0;
        try{
            bujet4 = scanner.nextInt();
        }catch(Exception e){
            System.err.println(Excp.parse(e));
        }

        Melly4<String,String,String,String,String,Integer> melly4 = new Melly4<>(name4,branch4,code4,address4,phone4,bujet4);
        System.out.println("**********************************************");
        ////////////////////////////////////////////////////BANK 5
        System.out.println("MELLY BANK5 :");
        System.out.println("ENTER Boss name:");
        String name5= scanner.next();
        System.out.println("ENTER Branch name:");
        String branch5 = scanner.next();
        System.out.println("ENTER Branch code:");
        String code5 = scanner.next();
        System.out.println("ENTER Address:");
        String address5 = scanner.next();
        System.out.println("ENTER phone number:");
        String phone5 = scanner.next();
        System.out.println("ENTER Budget Amount:");
        int bujet5=0;
        try{
            bujet5 = scanner.nextInt();
        }catch(Exception e){
            System.err.println(Excp.parse(e));
        }

        Melly5<String,String,String,String,String,Integer> melly5 = new Melly5<>(name5,branch5 ,phone5,address5 ,code5 ,bujet5);
        ///////////////////////////////////////////////////
        //با توجه به اینکه نوع داده ورودی های من متفاوت است من از "مجموعه" استفاده کردم
        //LinkedHashSet به ترتیب ورود
        System.out.println("**********************************************");
        Set set1 = new LinkedHashSet();
        set1.add("Melly Bank 1 :");
        set1.add(melly2.nameB);
        set1.add(melly2.nameSh);
        set1.add(melly2.code);
        set1.add(melly2.adress);
        set1.add(melly2.numberphone);
        set1.add(melly2.boje);
        for (Object o2 : set1 ){
            System.out.println(o2);
        }
        System.out.println("KHADAMAT :");
        melly1.EftetehHesab();
        melly1.Chek();
        melly1.Ghabz();
        melly1.Arz();
        melly1.Kart();
        System.out.println("rules:");
        melly1.Rules1();
        melly1.Rules2();
        melly1.Rules3();
        System.out.println("**********************************************");
        //////////////////
        Set set2 = new LinkedHashSet();
        set2.add("Melly Bank 2 :");
        set2.add(melly2.nameB);
        set2.add(melly2.nameSh);
        set2.add(melly2.code);
        set2.add(melly2.adress);
        set2.add(melly2.numberphone);
        set2.add(melly2.boje);
        for (Object o2 : set2 ){
            System.out.println(o2);
        }
        System.out.println("KHADAMAT :");
        melly2.EftetehHesab();
        melly2.Chek();
        melly2.Ghabz();
        melly2.Arz();
        melly2.Kart();
        System.out.println("rules:");;
        melly2.Rules1();
        melly2.Rules2();
        melly2.Rules3();
        System.out.println("**********************************************");
        ////////////////////
        Set set3 = new LinkedHashSet();
        set3.add("Melly Bank 3 :");
        set3.add(melly3.nameB);
        set3.add(melly3.nameSh);
        set3.add(melly3.code);
        set3.add(melly3.adress);
        set3.add(melly3.numberphone);
        set3.add(melly3.boje);
        for (Object o3 : set3){
            System.out.println(o3);
        }
        System.out.println("KHADAMAT :");
        melly3.EftetehHesab();
        melly3.Chek();
        melly3.Ghabz();
        melly3.Arz();
        melly3.Kart();
        System.out.println("rules:");
        melly3.Rules1();
        melly3.Rules2();
        melly3.Rules3();
        System.out.println("**********************************************");
        ////////////////
        Set set4 = new LinkedHashSet();
        set4.add("Melly Bank 1 :");
        set4.add(melly4.nameB);
        set4.add(melly4.nameSh);
        set4.add(melly4.code);
        set4.add(melly4.adress);
        set4.add(melly4.numberphone);
        set4.add(melly4.boje);
        for (Object o4 : set4){
            System.out.println(o4);
        }
        System.out.println("KHADAMAT :");
        melly4.EftetehHesab();
        melly4.Chek();
        melly4.Ghabz();
        melly4.Arz();
        melly4.Kart();
        System.out.println("rules:");
        melly4.Rules1();
        melly4.Rules2();
        melly4.Rules3();
        System.out.println("**********************************************");
        /////////////////
        Set set5 = new LinkedHashSet();
        set5.add("Melly Bank 5 :");
        set5.add(melly5.nameB);
        set5.add(melly5.nameSh);
        set5.add(melly5.code);
        set5.add(melly5.adress);
        set5.add(melly5.numberphone);
        set5.add(melly5.boje);
        for (Object o5 : set5){
            System.out.println(o5);
        }
        System.out.println("KHADAMAT :");
        melly5.EftetehHesab();
        melly5.Chek();
        melly5.Ghabz();
        melly5.Arz();
        melly5.Kart();
        System.out.println("rules:");
        melly5.Rules1();
        melly5.Rules2();
        melly5.Rules3();
        System.out.println("**********************************************");

    }
}
