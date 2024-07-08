/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.koneksi;
import entity.MhsEntity;
import eror.MhsException;
import event.MhsListener;
import java.sql.SQLException;
import services.MhsServices;

/**
 *
 * @author User
 */
public class MhsModel {
    
    
    private Integer kode;
    
    private String nim;
    
    private String nama;
    
    private String fakultas;
    
    private String prodi;
    
    private String nohp;
    
    private String email;
    
    private MhsListener mhsListener;

    public MhsListener getMhsListener() {
        return mhsListener;
    }

    public void setMhsListener(MhsListener mhsListener) {
        this.mhsListener = mhsListener;
    }

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
        fireOnChange();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
        fireOnChange();
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
        fireOnChange();
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }
    
    public void fireOnChange()
    {
        if(mhsListener!=null)
        {
            mhsListener.onChange(this);
            
        
        }
    
    }
    
    public void fireOnInsert(MhsEntity  mhsEntity)
    {
    if(mhsListener!=null)
        {
            mhsListener.onInsert(mhsEntity);
            
        
        }
    }
    
    public void fireOnUpdate(MhsEntity mhsEntity)
    {
    if(mhsListener!=null)
        {
            mhsListener.onUpdate(mhsEntity);
            
        
        }
    }
    
    public void fireOnDelete()
    {
        if(mhsListener!=null)
        {
            mhsListener.onDelete();
            
        
        }
    
    }
    
    public void resetMhs()
    {
        setKode(0);
        setNim("");
        setNama("");
        setFakultas("");
        setProdi("");
        setNohp("");
        setEmail("");
    
    }
    
    public void insertMhs() throws SQLException, MhsException
    {
        MhsServices trigger= koneksi.getMhsEntity();
        
        MhsEntity tambah= new MhsEntity();
        
        tambah.setNim(nim);
        tambah.setNama(nama);
        tambah.setFakultas(fakultas);
        tambah.setProdi(prodi);
        tambah.setNohp(nohp);
        tambah.setEmail(email);
        
        trigger.insertMhs(tambah);
        fireOnInsert(tambah);
        
                
        
    
    }
     public void updateMhs() throws SQLException, MhsException
    {
        MhsServices trigger= koneksi.getMhsEntity();
        
        MhsEntity rubah= new MhsEntity();
        
        rubah.setNim(nim);
        rubah.setNama(nama);
        rubah.setFakultas(fakultas);
        rubah.setProdi(prodi);
        rubah.setNohp(nohp);
        rubah.setEmail(email);
        
        trigger.updateMhs(rubah);
        fireOnUpdate(rubah);
    
    }
     
      public void DeleteMhs() throws SQLException, MhsException
    {
     MhsServices trigger= koneksi.getMhsEntity();
     trigger.deleteMhs(kode);
     fireOnDelete();
        
    }
    
    
    
    
    
}
