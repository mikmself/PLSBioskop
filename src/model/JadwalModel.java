/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.koneksi;
import entity.JadwalEntity;
import eror.JadwalException;
import event.JadwalListener;
import java.sql.SQLException;
import services.JadwalService;

/**
 *
 * @author ACER
 */
public class JadwalModel {
    Integer idJadwal;
    Integer IdFilm;
    Integer IdStudio;
    String tanggal;
    String jam;
    private JadwalListener jadwalListener;

    public JadwalModel(){
        
    }
    public Integer getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Integer getIdFilm() {
        return IdFilm;
    }

    public void setIdFilm(Integer IdFilm) {
        this.IdFilm = IdFilm;
    }

    public Integer getIdStudio() {
        return IdStudio;
    }

    public void setIdStudio(Integer IdStudio) {
        this.IdStudio = IdStudio;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public JadwalModel(Integer idJadwal, Integer IdFilm, Integer IdStudio, String tanggal, String jam) {
        this.idJadwal = idJadwal;
        this.IdFilm = IdFilm;
        this.IdStudio = IdStudio;
        this.tanggal = tanggal;
        this.jam = jam;
    }
    public JadwalListener getJadwalListener() {
        return jadwalListener;
    }

    public void setJadwalListener(JadwalListener jadwalListener) {
        this.jadwalListener = jadwalListener;
    }

    public void fireOnInsert(JadwalEntity jadwalEntity) {
        if (jadwalListener != null) {
            jadwalListener.OnInsert(jadwalEntity);
        }
    }

    public void fireOnUpdate(JadwalEntity jadwalEntity) {
        if (jadwalListener != null) {
            jadwalListener.onUpdate(jadwalEntity);
        }
    }

    public void fireOnDelete() {
        if (jadwalListener != null) {
            jadwalListener.onDelete();
        }
    }
    
    public void resetJadwal() {
        setIdJadwal(0);
        setIdFilm(0);
        setIdStudio(0);
        setTanggal("");
        setJam("");
    }

    public void insertJadwal() throws SQLException, JadwalException, ClassNotFoundException {
        JadwalService service = koneksi.getJadwalEntitiy();
        JadwalEntity jadwal = new JadwalEntity();
        
        jadwal.setIdFilm(IdFilm);
        jadwal.setIdStudio(IdStudio);
        jadwal.setTanggal(tanggal);
        jadwal.setJam(jam);

        service.InsertJadwal(jadwal);
        fireOnInsert(jadwal);
    }

    public void deleteJadwal() throws SQLException, JadwalException, ClassNotFoundException {
        JadwalService service = koneksi.getJadwalEntitiy();

        service.DeleteJadwal(idJadwal);
        fireOnDelete();
    }

    public void updateJadwal() throws SQLException, JadwalException, ClassNotFoundException {
        JadwalService service = koneksi.getJadwalEntitiy();
        JadwalEntity jadwal = new JadwalEntity();
        
        jadwal.setIdJadwal(idJadwal);
        jadwal.setIdFilm(IdFilm);
        jadwal.setIdStudio(IdStudio);
        jadwal.setTanggal(tanggal);
        jadwal.setJam(jam);

        service.UpdateJadwal(jadwal);
        fireOnUpdate(jadwal);
    }
}
