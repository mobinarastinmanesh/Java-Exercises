import model.entity.PersonEnti;
import model.service.PersonServ;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N :\t1)insert\t2)update(name,car,price)\t3)delete\t4)show");
        int n = input.nextInt();
        switch (n) {
            case 1:

                System.out.println("Enter name:");
                String name = input.next();
                System.out.println("Enter car's name:");
                String car = input.next();
                System.out.println("Enter user id:");
                Long id = input.nextLong();
                System.out.println("Inter car's price:");
                Long price = input.nextLong();
                try {
                    PersonServ.getInstance().save(new PersonEnti().setName(name).setCar(car).setId(id).setPrice(price));
                }catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            /////////////////////////////////
            case 2:
                System.out.println("Enter name:");
                String name1 = input.next();
                System.out.println("Enter car's name:");
                String car1 = input.next();
                System.out.println("Enter user id:");
                Long id1 = input.nextLong();
                System.out.println("Inter car's price:");
                Long price1 = input.nextLong();
                try {
                    PersonServ.getInstance().edit(new PersonEnti().setName(name1).setPrice(price1).setId(id1).setCar(car1));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
                ////////////////////////////////
            case 3:
                System.out.println("Enter user id:");
                Long id2 = input.nextLong();
                try {
                    PersonServ.getInstance().remove(id2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
                //////////////////////////////////
            case 4:
                try {
                    List<PersonEnti> personlist = PersonServ.getInstance().report();
                    for (PersonEnti p : personlist) {
                        System.out.println("ID:" + p.getId());
                        System.out.println("NAME:" + p.getName());
                        System.out.println("CAR:" + p.getCar());
                        System.out.println("PRICE:" + p.getPrice());
                        System.out.println("****************************************");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}