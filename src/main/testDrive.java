/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import database.koneksi;
import entity.MhsEntity;
import eror.MhsException;
import java.sql.SQLException;
import java.util.List;
import services.MhsServices;

/**
 *
 * @author User
 */
public class testDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, MhsException {
        // TODO code application logic here
        
      //  koneksi.getConnection();
      //tes insert database
//        MhsServices trigger= koneksi.getMhsEntity();
//        
//        MhsEntity insert= new MhsEntity();
//        insert.setNim("21SA545154");
//        insert.setNama("ASTO");
//        insert.setFakultas("BISNIS DIGITAL");
//        insert.setProdi("ILMU KOMPUTER");
//        insert.setNohp("515484113");
//        insert.setEmail("asto@gmail.com");
//        
//        trigger.insertMhs(insert);
//
//        //tes update data
//        
//        MhsServices trigger= koneksi.getMhsEntity();
//        
//        MhsEntity update= trigger.getByKode(3);
//        update.setNama("DODI");
//        update.setProdi("ILMU KOMUNIKASI");
//        
//        trigger.updateMhs(update);
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//  //tes hapus data      
//        MhsServices trigger= koneksi.getMhsEntity();
//        trigger.deleteMhs(2);
//
//    
//    //tes cari data berdasarkan nim atau kode
//    
//    MhsServices trigger= koneksi.getMhsEntity();
//    //MhsEntity cari=trigger.getByKode(1);
//    MhsEntity cari= trigger.getByNim("21SA545154");
//    
//        System.out.println(cari.getNim()+"|"+ cari.getNama());
//
//    
//    //TES TAMPIL SEMYUA DATA
//    
//    MhsServices trigger= koneksi.getMhsEntity();
//    
//        List<MhsEntity> list=trigger.SelectAllMhs();
//        
//        for(MhsEntity entity: list)
//        {
//            System.out.println(entity.getNim()+"|"+ entity.getNama());
//        }
    }
    
}
