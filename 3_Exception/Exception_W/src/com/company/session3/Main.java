package com.company.session3;
import com.sun.org.apache.bcel.internal.generic.NEW;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);


        System.out.println("Creating ACC .. ");
        System.out.println("Please enter balance : ");


        Double balance1 = Input.nextDouble();
        
        System.out.println("1)GharzolHasane \n2)LongTerm \n3)ShortTime \n ");
        Account A = new Gharzolhasane(balance1);//پیش فرض یه چیزی بهش دادم که ارور نده
        int n = Input.nextInt();
        switch (n){
            case 1 :A =  new Gharzolhasane(balance1);break;//دست به دست میره تو کلاس اکانت تو متغییر موجودی
            case 2 :A =  new BolandModat(balance1);break;
            case 3 :A =  new Kotahmodat(balance1);
        }

        while (true){

            System.out.println("1)withdraw\n2)deposit\n3)soud\n");

            int menu = Input.nextInt();

            switch (menu) {
                case 1://برداشت
                    System.out.println("Enter cash you want");

                    int Cash1 = Input.nextInt();

                    try {//ممکنه دچار خطا بشه (مبلغ منفی / مبلغ بیشتر از حد مجاز / +3 ملیون تومان)
                        A.Bardasht(Cash1);
                    }catch(BardashtExp bardashtExp) {
                        System.err.println(bardashtExp.getMessage());
                        //bardashtExp.printStackTrace();
                    }
                    break;


                case 2://واریز
                    System.out.println("Enter cash you want");

                    int Cash2 = Input.nextInt();

                    try {
                        A.Variz(Cash2);//ممکنه دچار خطا بشه (30+ ملیون تومان و عدد منفی )
                    }catch (VarizExp varizExp) {
                        System.err.println(varizExp.getMessage());
                        //varizExp.printStackTrace();
                    }
                    break;

                case 3:try{
                    A.Soud();
                }catch (SoudExp soudExp) {
                    System.err.println(soudExp.getMessage());
                }
                break;
                default:
                    System.out.println("Invalid number");
                    break;


            }

        }
    }
}
