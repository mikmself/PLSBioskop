package controller;

import javax.swing.JOptionPane;
import model.FilmModel;
import view.FilmView;

public class FilmController {
    private FilmModel filmModel;

    public void setFilmModel(FilmModel filmModel) {
        this.filmModel = filmModel;
    }
    
    public void resetFilm(FilmView filmView){
        filmModel.resetFilm();
    }
    
    public void onInsert(FilmView filmView){
        String NamaFilm = filmView.getT_NamaFilm().getText();
        String Cover = filmView.getT_Cover().getText();
        String Genre = filmView.getT_Genre().getText();
        String namaSutradara = filmView.getT_NamaSutradara().getText();
        String namaPemain = filmView.getT_NamaPemain().getText();
        String tahun = filmView.getT_Tahun().getText();
        if (NamaFilm.equals("")) {
            JOptionPane.showMessageDialog(filmView, "Nama Film tidak boleh lebih dari 12 digit");
        } else if (Cover.equals("")) {
            JOptionPane.showMessageDialog(filmView, "NAMA tidak boleh kosong");
        } else if (Genre.equals("")) {
            JOptionPane.showMessageDialog(filmView, "Genre tidak boleh lebih dari 255 KARAKTER");
        } else if (namaSutradara.equals("")) {
            JOptionPane.showMessageDialog(filmView, "Nama Sutradara tidak boleh kosong");
        } else if (namaPemain.equals("")) {
            JOptionPane.showMessageDialog(filmView, "Nama Pemain tidak boleh kosong");
        } else if (tahun.equals("")) {
            JOptionPane.showMessageDialog(filmView, "tahun tidak boleh kosong");
        } else {
            filmModel.setNama_film(NamaFilm);
            filmModel.setCover(Cover);
            filmModel.setGenre(Genre);
            filmModel.setNama_sutrada(namaSutradara);
            filmModel.setNama_pemain(namaPemain);
            filmModel.setTahun(tahun);
            
            
            try {
                filmModel.insertFilm();
                JOptionPane.showMessageDialog(filmView, "Data Film berhasil dimasukan");
                filmModel.resetFilm();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(filmView, "Eror ke database: e" + e);
            }

        }
    }
}
