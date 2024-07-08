/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.koneksi;
import entity.FilmEntity;
import eror.FilmException;
import event.FilmListener;
import java.sql.SQLException;
import services.FilmService;

/**
 *
 * @author ACER
 */
public class FilmModel {
    private Integer id_film;
    private String nama_film;
    private String cover;
    private String genre;
    private String nama_sutrada;
    private String nama_pemain;
    private String tahun;
    private FilmListener filmListener;

    public Integer getId_film() {
        return id_film;
    }

    public void setId_film(Integer id_film) {
        this.id_film = id_film;
    }

    public String getNama_film() {
        return nama_film;
    }

    public void setNama_film(String nama_film) {
        this.nama_film = nama_film;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNama_sutrada() {
        return nama_sutrada;
    }

    public void setNama_sutrada(String nama_sutrada) {
        this.nama_sutrada = nama_sutrada;
    }

    public String getNama_pemain() {
        return nama_pemain;
    }

    public void setNama_pemain(String nama_pemain) {
        this.nama_pemain = nama_pemain;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }
    
    public void resetFilm()
    {        
        setId_film(0);
        setNama_film("");
        setCover("");
        setGenre("");
        setNama_sutrada("");
        setNama_pemain("");
        setTahun("");

    }
    
    public void fireOnInsert(FilmEntity  filmEntity)
    {
    if(filmListener!=null)
        {
            filmListener.OnInsert(filmEntity);
            
        
        }
    }
    public void insertFilm() throws SQLException, FilmException, ClassNotFoundException
    {
        FilmService trigger= koneksi.getFilmEntity();
        
        FilmEntity tambah= new FilmEntity();
        
        tambah.setNama_film(nama_film);
        tambah.setCover(cover);
        tambah.setGenre(genre);
        tambah.setNama_sutrada(nama_sutrada);
        tambah.setNama_pemain(nama_pemain);
        tambah.setTahun(tahun);
        
        trigger.insertFilm(tambah);
        fireOnInsert(tambah);

                
        
    
    }
    
}
