package services;

import entity.FilmEntity;
import eror.FilmException;
import java.util.List;

public interface FilmService {
    public void insertFilm(FilmEntity film) throws FilmException;
    
    public void updateFilm(FilmEntity film) throws FilmException;
     
    public void deleteFilm(Integer id) throws FilmException;
       
    public FilmEntity getByNama(String nama) throws FilmException;
        
    public List<FilmEntity> SelectAllFilm() throws FilmException;
}
