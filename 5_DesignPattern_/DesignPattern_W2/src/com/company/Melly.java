package com.company;

/**
 * Created by Asus on 10/26/2019.
 */
public abstract class Melly<NameB,NameSh,NumberP,Code,Address,Bujet> extends Markazi{
    NameB nameb;
    NameSh namesh;
    NumberP numberP;
    Code code;
    Address address;
    Bujet bujet;

    public Melly(NameB nameb, NameSh namesh, NumberP numberP, Code code, Address address, Bujet bujet) {
        this.nameb = nameb;
        this.namesh = namesh;
        this.numberP = numberP;
        this.code = code;
        this.address = address;
        this.bujet = bujet;
    }
    public abstract void efteteh();
    public abstract void kart();
    public abstract void chak();
    public abstract void ghabz();
    public abstract void arz();

}
