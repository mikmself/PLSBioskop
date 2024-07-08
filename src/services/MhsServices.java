/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.MhsEntity;
import eror.MhsException;
import java.util.List;

/**
 *
 * @author User
 */
public interface MhsServices {
    
    public void insertMhs(MhsEntity mhs) throws MhsException;
    
    public void updateMhs(MhsEntity mhs) throws MhsException;
     
    public void deleteMhs(Integer kode) throws MhsException;
      
    public MhsEntity getByKode(Integer kode) throws MhsException;
       
    public MhsEntity getByNim(String nim) throws MhsException;
        
    public List<MhsEntity> SelectAllMhs() throws MhsException;
    
}
