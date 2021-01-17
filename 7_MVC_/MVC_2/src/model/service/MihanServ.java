package model.service;


import model.entity.MihanEnti;
import model.repository.MihanRepo;

import java.util.List;

public class MihanServ {
    private  static MihanServ personServ =new MihanServ();
    private  MihanServ(){}
    public static MihanServ getInstance(){return personServ ;}

    public void save(MihanEnti mihanEnti) throws Exception{
        try(MihanRepo mihanRepo = new MihanRepo()){
            mihanRepo.insert(mihanEnti);
            mihanRepo.commit();
        }
    }
    public void edit (MihanEnti mihanEnti) throws Exception{
        try(MihanRepo mihanRepo = new MihanRepo()){
            mihanRepo.update(mihanEnti);
            mihanRepo.commit();
        }
    }
    public void remove(Long id) throws Exception{
        try(MihanRepo mihanRepo = new MihanRepo()){
            mihanRepo.delete(id);
            mihanRepo.commit();
        }
    }
    public List<MihanEnti> report() throws Exception{
        List<MihanEnti> mihanEntis;
        try(MihanRepo mihanRepo = new MihanRepo()){
            mihanEntis=mihanRepo.select();
        }
        return mihanEntis;
    }
}
