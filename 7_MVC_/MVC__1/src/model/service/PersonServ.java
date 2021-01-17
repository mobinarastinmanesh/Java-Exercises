package model.service;


import model.entity.PersonEnti;
import model.repository.PersonRepo;
import java.util.List;

public class PersonServ {
    private  static PersonServ personServ =new PersonServ();
    private  PersonServ(){}
    public static PersonServ getInstance(){return personServ ;}

    public void save(PersonEnti personEnti) throws Exception{
        try(PersonRepo personRepo = new PersonRepo()){
            personRepo.insert(personEnti);
            personRepo.commit();
        }
    }
    public void edit (PersonEnti personEnti) throws Exception{
        try(PersonRepo personRepo = new PersonRepo()){
            personRepo.update(personEnti);
            personRepo.commit();
            personRepo.close();
        }
    }
    public void remove(Long id) throws Exception{
        try(PersonRepo personRepo = new PersonRepo()){
            personRepo.delete(id);
            personRepo.commit();
        }
    }
     public List<PersonEnti> report() throws Exception{
         List<PersonEnti> personEntis;
        try(PersonRepo personRepo = new PersonRepo()){
            personEntis=personRepo.select();
        }
        return personEntis;
     }
}
