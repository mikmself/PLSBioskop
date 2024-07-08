/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.FilmModel;
import view.FilmView;

/**
 *
 * @author ACER
 */
public class FilmController {
    private FilmModel filmModel;

    public void setFilmModel(FilmModel filmModel) {
        this.filmModel = filmModel;
    }
    
    public void resetFilm(FilmView filmView){
        filmModel.resetFilm();
    }
    
    public void onInsert(FilmView filmView){
        String id = filmView.getT_ID().getText();
        String NamaFilm = filmView.getT_NamaFilm().getText();
        String Cover = filmView.getT_Cover().getText();
        String Genre = filmView.getT_Genre().getText();
        String namaSutradara = filmView.getT_NamaSutradara().getText();
        String namaPemain = filmView.getT_NamaPemain().getText();
        String tahun = filmView.getT_Tahun().getText();
        if (id.trim().equals("")) {
            JOptionPane.showMessageDialog(filmView, "ID tidak boleh kosong");
        } else if (NamaFilm.length() >= 12) {
            JOptionPane.showMessageDialog(filmView, "NIM tidak boleh lebih dari 12 digit");
        } else if (Cover.trim().equals("")) {
            JOptionPane.showMessageDialog(filmView, "NAMA tidak boleh kosong");
        } else if (Genre.length() >= 255) {
            JOptionPane.showMessageDialog(filmView, "NAMA tidak boleh lebih dari 255 KARAKTER");
        } else if (namaSutradara.trim().equals("")) {
            JOptionPane.showMessageDialog(filmView, "fakultas tidak boleh kosong");
        } else if (namaPemain.trim().equals("")) {
            JOptionPane.showMessageDialog(filmView, "fakultas tidak boleh kosong");
        } else if (tahun.trim().equals("")) {
            JOptionPane.showMessageDialog(filmView, "fakultas tidak boleh kosong");
        } else {
            filmModel.setNama_film(NamaFilm);
            filmModel.setCover(Cover);
            filmModel.setGenre(Genre);
            filmModel.setNama_sutrada(namaSutradara);
            filmModel.setNama_pemain(namaPemain);
            filmModel.setTahun(tahun);
            
            
            try {
                filmModel.insertFilm();
                JOptionPane.showMessageDialog(filmView, "data mhs berhasil dimasukan");
                filmModel.resetFilm();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(filmView, "eror ke database");
            }

        }
    }
}
