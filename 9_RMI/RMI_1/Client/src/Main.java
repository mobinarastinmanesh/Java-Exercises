import MyRemote.Account;
import MyRemote.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Account account= (Account) Naming.lookup("//localhost/DBService");
            System.out.println("1)save\n2)update");
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    User user = new User();
                    System.out.println("inter username:");
                    user.setUsername(scanner.next());
                    System.out.println("inter userpassword:");
                    user.setUserpassword(scanner.next());
                    account.save(user);
                    break;
                case 2:
                    User user1 = new User();
                    System.out.println("inter username:");
                    user1.setUsername(scanner.next());
                    System.out.println("inter userpassword:");
                    user1.setUserpassword(scanner.next());
                    account.updata(user1);
            }
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
