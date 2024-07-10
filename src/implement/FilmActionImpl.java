package implement;

import entity.FilmEntity;
import eror.FilmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.FilmService;

public class FilmActionImpl implements FilmService {

    private Connection connection;
    private final String InsertFilm = "insert into film(nama_film,genre, cover,nama_sutradara,nama_pemain, tahun) values (?,?,?,?,?,?)";
    private final String UpdateFilm = "update film set nama_film=?,genre=?,cover=?,nama_sutradara=?,nama_pemain=? ,tahun=? where id_film=?";
    private final String DeleteFilm = "delete from film where id_film=?";
    private final String getByKode = "select * from film where id=?";
    private final String getByNama = "select * from film where nama=?";
    private final String selectAll = " select * from film";

    public FilmActionImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertFilm(FilmEntity film) throws FilmException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(InsertFilm);
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
            throw new FilmException(e1.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e2) {

                }

            }

        }
    }

    @Override
    public void updateFilm(FilmEntity film) throws FilmException {
        PreparedStatement statement = null;

        try {
            connection.setAutoCommit(false);

            statement = connection.prepareStatement(UpdateFilm);
            statement.setString(1, film.getNama_film());
            statement.setString(2, film.getGenre());
            statement.setString(3, film.getCover());
            statement.setString(4, film.getNama_sutrada());
            statement.setString(5, film.getNama_pemain());
            statement.setString(6, film.getTahun());
            statement.setInt(7, film.getId_film());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e1) {
            System.out.println(e1);
            try {
                connection.rollback();
            } catch (SQLException ex) {
                System.out.println("ex");
            }
            throw new FilmException(e1.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                // log error
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e2) {
                    // log error
                }
            }
        }
    }

    @Override
    public void deleteFilm(Integer id) throws FilmException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(DeleteFilm);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new FilmException(e1.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e2) {

                }

            }
        }
    }

    @Override
    public FilmEntity getByNama(String nama) throws FilmException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<FilmEntity> SelectAllFilm() throws FilmException {
        List<FilmEntity> Film = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.prepareStatement(selectAll);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id_film");
                String namaFilm = resultSet.getString("nama_film");
                String cover = resultSet.getString("cover");
                String genre = resultSet.getString("genre");
                String nama_sutradara = resultSet.getString("nama_sutradara");
                String nama_pemain = resultSet.getString("nama_pemain");
                String tahun = resultSet.getString("tahun");

                FilmEntity film = new FilmEntity(id, namaFilm, cover, genre, nama_sutradara, nama_pemain, tahun);
                Film.add(film);
            }
        } catch (SQLException e) {
            throw new FilmException(e.getMessage());
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    // log error
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // log error
                }
            }
        }
        return Film;
    }

}
