package com.company;


public class  Melli <NameB,NameSh,Numberphone,Adress,Code,Boje> extends  Markazi {
    public NameB nameB;
    public NameSh nameSh;
    public Numberphone numberphone;
    public Adress adress;
    public Code code;
    public Boje boje;



    //قوانین بانک مرکزی

    @Override
    public void Rules1() {
        super.Rules1();
    }

    @Override
    public void Rules2() {
        super.Rules2();
    }

    @Override
    public void Rules3() {
        super.Rules3();
    }
    /////////////////////////////////////////////////
    //خدمات بانک ملی
    public void EftetehHesab() {
        System.out.println("1)Eftetah hesab");
    }


    public void Kart() {
        System.out.println("2)sodour kart");
    }


    public void Chek() {
        System.out.println("3)sodour daste chaek");
    }


    public void Ghabz() {
        System.out.println("4)pardakht ghoboz");
    }


    public void Arz() {
        System.out.println("5)khadamat arzi");
    }
}
