package MyRemote;

import java.rmi.Remote;


public interface Account extends Remote {
    public void save (User user) throws Exception;
    public void updata (User user) throws Exception;
}
