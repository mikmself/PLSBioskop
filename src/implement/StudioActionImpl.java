/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implement;

import entity.StudioEntity;
import eror.StudioException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.StudioService;
public class StudioActionImpl implements StudioService {

    private Connection connection;
    private final String InsertStudio = "insert into studio(nomor_studio) values (?)";
    private final String UpdateStudio = "update studio set nomor_studio=? where id_studio=?";
    private final String DeleteStudio = "delete from studio where id_studio=?";
    private final String getByKode = "select * from studio where id_studio=?";
    private final String getByNomor = "select * from studio where nomor_studio=?";
    private final String selectAll = "select * from studio";

    public StudioActionImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public StudioEntity getByKode(Integer id) throws StudioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void InserStudio(StudioEntity studio) throws StudioException {
       PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(InsertStudio);
            statement.setInt(1, studio.getNomor_studio());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new StudioException(e1.getMessage());
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
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void UpdateStudio(StudioEntity studio) throws StudioException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(UpdateStudio);
            statement.setInt(1, studio.getNomor_studio());
            statement.setInt(2, studio.getId_studio());
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new StudioException(e1.getMessage());
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
    public void DeleteStudio(Integer id) throws StudioException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(DeleteStudio);
            statement.setInt(1, id);
            statement.executeUpdate();
            connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                // log error
            }
            throw new StudioException(e1.getMessage());
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
    public StudioEntity getByNama(String nama) throws StudioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<StudioEntity> SelectAllStudio() throws StudioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
