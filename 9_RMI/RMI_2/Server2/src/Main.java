import MyRemote.Student;
import MyRemote.StudentImplementor;
import MyRemote.StudentRepo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;

public class Main {

    public static void main(String[] args){
        try {
            //new StudentRepo() .createtable();
            LocateRegistry.createRegistry(1099);

            StudentImplementor studentImplementor = new StudentImplementor();
            Naming.rebind("DBService", studentImplementor);

            System.out.println("server running...");

        }catch (RemoteException e) {
            e.printStackTrace ();
        } catch (ServerNotActiveException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
