import model.entity.MihanEnti;
import model.repository.MihanRepo;
import model.service.MihanServ;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arge) {
       /* try {
            new MihanRepo().createtable();
        } catch (Exception e) {
            e.printStackTrace();
        }
       */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :\t1)insert\t2)update(\t3)delete\t4)show");
        int n = input.nextInt();
        switch (n) {
            case 1:

                System.out.println("Enter product's name:");
                String name = input.next();

                System.out.println("Enter  tarikh:");
                String tarikh = input.next();

                System.out.println("Enter product id:");
                Long id = input.nextLong();

                System.out.println("Inter product's price:");
                Long price = input.nextLong();

                try {
                    MihanServ.getInstance().save(new MihanEnti().setName(name).setTaikh(tarikh).setId(id).setPrice(price));
                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            /////////////////////////////////
            case 2:
                System.out.println("Enter name:");
                String name1 = input.next();

                System.out.println("Enter product's name:");
                String tarikh1 = input.next();

                System.out.println("Enter product id:");
                Long id1 = input.nextLong();

                System.out.println("Inter product's price:");
                Long price1 = input.nextLong();

                try {
                    MihanServ.getInstance().edit(new MihanEnti().setName(name1).setPrice(price1).setId(id1).setTaikh(tarikh1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            ////////////////////////////////
            case 3:
                System.out.println("Enter product id:");
                Long id2 = input.nextLong();
                try {
                    MihanServ.getInstance().remove(id2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //////////////////////////////////
            case 4:
                try {
                    List<MihanEnti> mihanlist = MihanServ.getInstance().report();
                    for (MihanEnti p : mihanlist) {
                        System.out.println("ID:" + p.getId());
                        System.out.println("NAME:" + p.getName());
                        System.out.println("TARIKH:" + p.getTarikh());
                        System.out.println("PRICE:" + p.getPrice());
                        System.out.println("****************************************");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}