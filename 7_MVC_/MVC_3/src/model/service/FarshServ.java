package model.service;

import model.entity.FarshEnti;
import model.repository.FarshRepo;

import java.sql.PreparedStatement;
import java.util.List;

public class FarshServ {

    private static FarshServ farshServ =new FarshServ();
    private FarshServ(){}
    public static FarshServ getInstance(){
        return farshServ;
    }
    public void save(FarshEnti farshEnti)throws Exception{
        try(FarshRepo farshRepo = new FarshRepo()){
            farshRepo.insert(farshEnti);
            farshRepo.commit();
        }
    }
    public void edit(FarshEnti farshEnti)throws Exception{
        try(FarshRepo farshRepo = new FarshRepo()){
            farshRepo.update(farshEnti);
            farshRepo.commit();
        }
    }
    public void remove(int id)throws Exception{
        try(FarshRepo farshRepo =new FarshRepo()){
            farshRepo.delete(id);
            farshRepo.commit();
        }
    }
    public List<FarshEnti> report() throws Exception{
        List<FarshEnti> list ;
        try(FarshRepo farshRepo = new FarshRepo()){
            list=farshRepo.select();
        }
        return  list;
    }



}
