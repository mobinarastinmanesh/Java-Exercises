package com.company;

import com.sun.org.apache.xerces.internal.xs.StringList;
import java.lang.Cloneable;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class KArt_melly extends  SabteAhval implements Cloneable{
   public String name;
   public String lastname;
   public int saltavalod;
   public String fathername;
   public String melliyat;
   public String codemelly;
   public int engheza;

    /////////////////////////////////ثبت////////////////////
    public KArt_melly sabtkart(String name, String lastname,
                               int saltavalod, String fathername,
                               String melliyat, String codemelly, int engheza){
        if(saltavalod > year-18){
            super.ghanon_sen();
        }

        else {
            this.name = name;
            this.lastname = lastname;
            this.codemelly = codemelly;
            this.fathername = fathername;
            this.saltavalod = saltavalod;
            this.melliyat = melliyat;
            this.engheza = super.ghanon_engheza();
        }
        return this;
    }
    ////////////////////////////////////ویرایش//////////////////
    public void edit(String name , String lastname ,
                               int saltavalod ,String fathername ,
                               String melliyat , String codemelly ){
        this.name = name;
        this.lastname = lastname;
        this.codemelly = codemelly;
        this.fathername = fathername;
        this.saltavalod = saltavalod;
        this.melliyat = melliyat;

        System.out.println("kodam ghesmat virayesh shavad ? ? ");
        System.out.println("1)name\n2)lastname\n3)codemelly\n4)fathername\n5)saletavalod\n6)melliyat\n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("enter new :");
        switch (n){
            case 1 :this.name=scanner.next() ;break;
            case 2 :this.lastname=scanner.next() ;break;
            case 3 :this.codemelly=scanner.next() ;break;
            case 4 :this.fathername=scanner.next() ;break;
            case 5 :this.saltavalod=scanner.nextInt() ;break;
            case 6 :this.melliyat=scanner.next() ;
        }

    }
    //////////////////////////////تمدید//////////////////////
    public void tamdid(String name , String lastname ,
                             int saltavalod ,String fathername ,
                             String melliyat , String codemelly ,int engheza){
        this.name = name;
        this.lastname = lastname;
        this.codemelly = codemelly;
        this.fathername = fathername;
        this.saltavalod = saltavalod;
        this.melliyat = melliyat;

        this.engheza=engheza+7;

    }
    //////////////////////مفقودی//////////////////////////////
    public void mafghodi(String name , String lastname ,
                             int saltavalod ,String fathername ,
                             String melliyat , String codemelly ,int engheza){
        System.out.println("mafghodi sabt shod !");
        System.out.println("kart jadid baraye shoma sader shod!");
        sabtkart(name,lastname,saltavalod,fathername,melliyat,codemelly,engheza);

    }
    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
