package com.company;


public class  Melly4 <NameB,NameSh,Numberphone,Adress,Code,Boje> extends  Melli {
    public NameB nameB;
    public NameSh nameSh;
    public Numberphone numberphone;
    public Adress adress;
    public Code code;
    public Boje boje;

    public Melly4(NameB nameB,NameSh nameSh ,Numberphone numberphone,Adress adress ,Code code ,Boje boje){
        this.nameB=nameB;
        this.nameSh=nameSh;
        this.numberphone=numberphone;
        this.adress=adress;
        this.code=code;
        this.boje=boje;
    }

    //خدمات بانک ملی
    @Override
    public void EftetehHesab() {
        super.EftetehHesab();
    }

    @Override
    public void Kart() {
        super.Kart();
    }

    @Override
    public void Chek() {
        super.Chek();
    }

    @Override
    public void Ghabz() {
        super.Ghabz();
    }

    @Override
    public void Arz() {
        super.Arz();
    }
}
