/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import entity.FilmEntity;
import eror.FilmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.FilmService;

/**
 *
 * @author ACER
 */
public class FilmActionImpl implements FilmService{
    private Connection connection;
    private final String InsertFilm="insert into film(nama_film,genre, cover,nama_sutradara,nama_pemain, tahun) values (?,?,?,?,?,?)";
    private final String UpdateFilm="update film set nama_film=?,genre=?,cover=?,nama_sutradara=?,nama_pemain=? ,tahun=? where id=?";
    private final String DeleteFilm="delete from film where id=?";
    private final String getByKode="select * from film where id=?";
    private final String getByNama="select * from film where nama=?";
    private final String selectAll=" select * from film";
    
    public FilmActionImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertFilm(FilmEntity film) throws FilmException {
        PreparedStatement statement=null;
        try {
            connection.setAutoCommit(false);
        statement=connection.prepareStatement(InsertFilm);
        statement.setString(1, film.getNama_film());
        statement.setString(2, film.getGenre());
        statement.setString(3, film.getCover());
        statement.setString(4, film.getNama_sutrada());
        statement.setString(5, film.getNama_pemain());
        statement.setString(6, film.getTahun());

        statement.executeUpdate();
         connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
        throw  new FilmException(e1.getMessage());
        }
        finally
        {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if(statement!=null)
            {
                try {
                    statement.close();
                } catch (SQLException e2) {
                
                }
            
            }
        
        }
    }

    @Override
    public void updateFilm(FilmEntity film) throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteFilm(Integer id) throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FilmEntity getByKode(Integer id) throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public FilmEntity getByNama(String nama) throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<FilmEntity> SelectAllFilm() throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
