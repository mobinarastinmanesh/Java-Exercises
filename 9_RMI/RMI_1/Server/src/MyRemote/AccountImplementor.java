package MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;


public class AccountImplementor extends UnicastRemoteObject implements Account  {


    public AccountImplementor() throws Exception {}


    @Override
    public void save(User user) throws Exception {
        AccountRepo accountRepo = new AccountRepo();
        accountRepo.save(user);
    }

    @Override
    public void updata(User user) throws Exception {
        AccountRepo accountRepo = new AccountRepo();
        accountRepo.update(user);
    }
}
