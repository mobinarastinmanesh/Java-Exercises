package model.service;

import model.entity.StudentEnti;
import model.repository.StudentRepo;

import java.util.ArrayList;

public class StudentServ {
    private static StudentServ ourInstance = new StudentServ();
    public static StudentServ getInstance() {
        return ourInstance;
    }
    private StudentServ() {}

    public void Save(StudentEnti studentEnti)throws Exception{
    try (StudentRepo studentRepo = new StudentRepo()){
        studentRepo.insert(studentEnti);
        studentRepo.commit();
        studentRepo.close();
    }
}
    public void Edit(StudentEnti studentEnti)throws Exception{
        try (StudentRepo studentRepo = new StudentRepo()){
            studentRepo.update(studentEnti);
            studentRepo.commit();
            studentRepo.close();
        }
    }

    public void Remove(String sid)throws Exception{
        try (StudentRepo studentRepo = new StudentRepo()){
            studentRepo.delete(sid);
            studentRepo.commit();
            studentRepo.close();
        }
    }
    public ArrayList<StudentEnti> Show()throws Exception{
        ArrayList<StudentEnti> list = new ArrayList<>();
        try (StudentRepo studentRepo = new StudentRepo()){
            list=studentRepo.select();
            studentRepo.close();
        }
        return list ;
    }

}
