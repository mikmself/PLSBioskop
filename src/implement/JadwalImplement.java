/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import entity.JadwalEntity;
import eror.JadwalException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import services.JadwalService;

/**
 *
 * @author ACER
 */
public class JadwalImplement implements JadwalService {

    private Connection connection;
    private final String InsertJadwal = "INSERT INTO jadwal (id_film, id_studio, tanggal, jam) VALUES (?, ?, ?, ?)";
    private final String UpdateJadwal = "UPDATE jadwal SET id_film=?, id_studio=?, tanggal=?, jam=? WHERE id_jadwal=?";
    private final String DeleteJadwal = "DELETE FROM jadwal WHERE id_jadwal=?";
    private final String getNamaFilm = "SELECT * FROM film WHERE id_film=?";
    private final String getNomorStudio = "SELECT * FROM studio WHERE id_studio=?";
    private final String selectAll = "SELECT jadwal.id_jadwal, film.nama_film, studio.nomor_studio, jadwal.tanggal, jadwal.jam FROM jadwal JOIN film ON jadwal.id_film = film.id_film JOIN studio ON jadwal.id_studio = studio.id_studio;";

    public JadwalImplement(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void InsertJadwal(JadwalEntity Jadwal) throws JadwalException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(InsertJadwal);
            statement.setString(1, Jadwal.getIdFilm());
            statement.setInt(2, Jadwal.getIdStudio());
            statement.setString(3, Jadwal.getTanggal());
            statement.setString(4, Jadwal.getJam());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new JadwalException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                // log error
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // log error
                }
            }
        }
    }

    @Override
    public void UpdateJadwal(JadwalEntity Jadwal) throws JadwalException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(UpdateJadwal);
            statement.setString(1, Jadwal.getIdFilm());
            statement.setInt(2, Jadwal.getIdJadwal());
            statement.setString(3, Jadwal.getTanggal());
            statement.setString(4, Jadwal.getJam());
            statement.setInt(5, Jadwal.getIdJadwal());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new JadwalException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                // log error
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // log error
                }
            }
        }
    }

    @Override
    public void DeleteJadwal(Integer id) throws JadwalException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(DeleteJadwal);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new JadwalException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                // log error
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    // log error
                }
            }
        }
    }

    @Override
    public JadwalEntity getByKode(Integer id) throws JadwalException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JadwalEntity getByNama(String nama) throws JadwalException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<JadwalEntity> SelectAllJadwal() throws JadwalException {
        List<JadwalEntity> list = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(selectAll);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                JadwalEntity jadwal = new JadwalEntity();
                jadwal.setIdJadwal(resultSet.getInt("id_jadwal"));
                jadwal.setIdFilm(resultSet.getString("nama_film"));
                jadwal.setIdStudio(resultSet.getInt("nomor_studio"));
                jadwal.setTanggal(resultSet.getString("tanggal"));
                jadwal.setJam(resultSet.getString("jam"));
                list.add(jadwal);
            }
        } catch (SQLException e) {
            throw new JadwalException(e.getMessage());
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
        return list;
    }
}
