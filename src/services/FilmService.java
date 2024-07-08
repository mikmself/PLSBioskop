/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import entity.FilmEntity;
import eror.FilmException;
import java.util.List;
/**
 *
 * @author ACER
 */
public interface FilmService {
    public void insertFilm(FilmEntity film) throws FilmException;
    
    public void updateFilm(FilmEntity film) throws FilmException;
     
    public void deleteFilm(Integer id) throws FilmException;
      
    public FilmEntity getByKode(Integer id) throws FilmException;
       
    public FilmEntity getByNama(String nama) throws FilmException;
        
    public List<FilmEntity> SelectAllFilm() throws FilmException;
}
