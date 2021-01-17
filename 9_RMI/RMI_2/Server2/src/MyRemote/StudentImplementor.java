package MyRemote;


import java.rmi.server.UnicastRemoteObject;

public class StudentImplementor  extends UnicastRemoteObject implements Student{

    public StudentImplementor() throws Exception {}

    @Override
    public void pardakht(DataStudent D) throws Exception {
        StudentRepo studentRepo = new StudentRepo();
        studentRepo.update_shahriye(D);
    }
}
