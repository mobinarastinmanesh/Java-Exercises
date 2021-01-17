package com.company.session3;

/**
 * Created by site102 on 10/5/2019.
 */
public abstract class Account  {

    public Double Mojodi;


    public Account(Double balance)
    {
        this.Mojodi = balance;
    }

    abstract void Bardasht(int x) throws BardashtExp;

    abstract void Variz(int x)throws VarizExp;

    abstract void Soud()throws SoudExp;


}
