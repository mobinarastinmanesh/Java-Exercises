import MyRemote.DataStudent;
import MyRemote.Student;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            Student student = (Student) Naming.lookup("//localhost/DBService");

            DataStudent D = new DataStudent();

            System.out.println("SID:");
            D.setSid(scanner.nextLong());
            System.out.println("pardakhti:");
            D.setPardakhti(scanner.nextLong());

            student.pardakht(D);

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
