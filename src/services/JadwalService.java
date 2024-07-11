/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import entity.JadwalEntity;
import eror.JadwalException;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface JadwalService {
    public void InsertJadwal(JadwalEntity Jadwal) throws JadwalException;
    
    public void UpdateJadwal(JadwalEntity Jadwal) throws JadwalException;
     
    public void DeleteJadwal(Integer id) throws JadwalException;
      
    public JadwalEntity getByKode(Integer id) throws JadwalException;
       
    public JadwalEntity getByNama(String nama) throws JadwalException;
        
    public List<JadwalEntity> SelectAllJadwal() throws JadwalException;
}
