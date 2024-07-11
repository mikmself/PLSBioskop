/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.JadwalModel;
import view.JadwalView;

/**
 *
 * @author ACER
 */
public class JadwalController {
    private JadwalModel jadwalModel;

    public void setJadwalModel(JadwalModel jadwalModel) {
        this.jadwalModel = jadwalModel;
    }
    
    public void resetJadwal(JadwalView jadwalView){
        jadwalModel.resetJadwal();
    }
    
    public void onInsert(JadwalView jadwalView) {
        String idJadwal = jadwalView.getTxt_id_jadwal().getText();
        String idFilm = jadwalView.getTxt_id_film().getText();
        String idStudio = jadwalView.getTxt_id_studio().getText();
        String tanggal = jadwalView.getTxt_tanggal().getText();
        String jam = jadwalView.getTxt_jam().getText();

        if (idJadwal.trim().equals("")) {
            JOptionPane.showMessageDialog(jadwalView, "ID Jadwal tidak boleh kosong");
        } else if (idFilm.trim().equals("")) {
            JOptionPane.showMessageDialog(jadwalView, "ID Film tidak boleh kosong");
        } else if (idStudio.trim().equals("")) {
            JOptionPane.showMessageDialog(jadwalView, "ID Studio tidak boleh kosong");
        } else if (tanggal.trim().equals("")) {
            JOptionPane.showMessageDialog(jadwalView, "Tanggal tidak boleh kosong");
        } else if (jam.trim().equals("")) {
            JOptionPane.showMessageDialog(jadwalView, "Jam tidak boleh kosong");
        } else {
            try {
                int idJadwalInt = Integer.parseInt(idJadwal);
                int idFilmInt = Integer.parseInt(idFilm);
                int idStudioInt = Integer.parseInt(idStudio);

                JadwalModel jadwalModel = new JadwalModel();
                jadwalModel.setIdJadwal(idJadwalInt);
                jadwalModel.setIdFilm(idFilmInt);
                jadwalModel.setIdStudio(idStudioInt);
                jadwalModel.setTanggal(tanggal);
                jadwalModel.setJam(jam);

                jadwalModel.insertJadwal();
                JOptionPane.showMessageDialog(jadwalView, "Data jadwal berhasil dimasukkan");
                jadwalModel.resetJadwal();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(jadwalView, "ID Jadwal, ID Film, dan ID Studio harus berupa angka");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(jadwalView, "Error ke database: " + e.getMessage());
            }
        }
    }
}
