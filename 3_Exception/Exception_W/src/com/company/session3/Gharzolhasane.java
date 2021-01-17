package com.company.session3;

public class Gharzolhasane extends Account {


    public Gharzolhasane(Double balance) {
        super(balance);
    }

    @Override
    void Bardasht(int x) throws BardashtExp {

        System.out.println("Start Process ... ");//برداشت

        if (x > super.Mojodi)
        {
          throw new BardashtExp( "Not enough money ! ");
        }
        else if(x > 3000000){
          throw new BardashtExp( " +3000000 !!!!!!");
        }
        else if(x<0){
            throw new BardashtExp( "meghdar manfi !!!! ");
        }
        else {
            super.Mojodi -= x;
            System.out.println("transfered Successfully");//انتقال با موفقیت انجام شد
            System.out.println("your balance is :" + super.Mojodi);//مانده رو نشون میده
        }

        System.out.println("End Process");//پایان عملیات

    }

    @Override
    void Variz(int x) throws VarizExp {

        System.out.println("Start Process ... ");

        if (x <= 0 )
        {
                throw new VarizExp("Invalid Amount Of money ! ");
        }
        else if(x > 30000000){
            throw new VarizExp("+30000000!!!!! ");
        }
        else
        {
            super.Mojodi += x;
            System.out.println("transferred Successfully");
            System.err.println("your balance is :" + super.Mojodi);
        }

        System.out.println("End Process");
    }

    @Override
    void Soud() throws SoudExp {
        throw new SoudExp("soud nadare!!!");
    }
}
