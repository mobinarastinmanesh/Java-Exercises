import model.entity.FarshEnti;
import model.repository.FarshRepo;
import model.service.FarshServ;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arge) {
        try {
            new FarshRepo().createtable();
        } catch (Exception e) {

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :\t1)insert\t2)update\t3)delete\t4)show");
        int n = input.nextInt();
        switch (n) {
            case 1:

                System.out.println("Enter id:");
                Long id = input.nextLong();
                System.out.println("Enter name:");
                String name = input.next();
                System.out.println("Enter tedad:");
                Long tedad = input.nextLong();
                System.out.println("Inter  price:");
                Long price = input.nextLong();
                System.out.println("Enter keshvar:");
                String keshvar = input.next();
                try {
                    FarshServ.getInstance().save(new FarshEnti().setName(name).setTedad(tedad).setId(id).setGheymat_koll(price).setKeshvar(keshvar));
                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            /////////////////////////////////
            case 2:
                System.out.println("Enter id:");
                Long id1 = input.nextLong();
                System.out.println("Enter name:");
                String name1 = input.next();
                System.out.println("Enter tedad:");
                Long tedad1 = input.nextLong();
                System.out.println("Inter  price:");
                Long price1 = input.nextLong();
                System.out.println("Enter keshvar:");
                String keshvar1 = input.next();
                try {
                    FarshServ.getInstance().edit(new FarshEnti().setName(name1).setGheymat_koll(price1).setId(id1).setTedad(tedad1).setKeshvar(keshvar1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            ////////////////////////////////
            case 3:
                System.out.println("Enter user id:");
                int id3 = input.nextInt();
                try {
                    FarshServ.getInstance().remove(id3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //////////////////////////////////
            case 4:
                try {
                    List<FarshEnti> personlist = FarshServ.getInstance().report();
                    for (FarshEnti p : personlist) {
                        System.out.println("ID:" + p.getId());
                        System.out.println("NAME:" + p.getName());
                        System.out.println("Tedad:" + p.getTedad());
                        System.out.println("PRICE:" + p.getGheymat_koll());
                        System.out.println("Keshvar:" + p.getKeshvar());
                        System.out.println("****************************************");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}
