/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import event.FilmListener;

/**
 *
 * @author ACER
 */
public class FilmEntity {
    private Integer id_film;
    private String nama_film;
    private String cover;
    private String genre;
    private String nama_sutrada;
    private String nama_pemain;
    private String tahun;
    private FilmListener filmListener;
    
    public FilmListener getFilmListener(){
        return filmListener;
    }
    
    public void setFilmListener(FilmListener filmListener){
        this.filmListener = filmListener;
    }
    
    public FilmEntity(){
        
    }

    public FilmEntity(Integer id_film, String nama_film, String cover, String genre, String nama_sutrada, String nama_pemain, String tahun) {
        this.id_film = id_film;
        this.nama_film = nama_film;
        this.cover = cover;
        this.genre = genre;
        this.nama_sutrada = nama_sutrada;
        this.nama_pemain = nama_pemain;
        this.tahun = tahun;
    }

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
    
    
}
