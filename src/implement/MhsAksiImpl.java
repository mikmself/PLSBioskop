/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.MhsEntity;
import eror.MhsException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.MhsServices;

/**
 *
 * @author User
 */
public class MhsAksiImpl implements MhsServices{
    
    private Connection connection;
    
    
    private final String insertMhs="insert into mhs(nim,nama,fakultas,prodi,nohp,email) values (?,?,?,?,?,?)";
    private final String updateMhs="update mhs set nim=?,nama=?,fakultas=?,prodi=?,nohp=? ,email=? where kode=?";
    private final String deleteMhs="delete from mhs where kode=?";
    private final String getByKode="select * from mhs where kode=?";
    private final String getByNim="select * from mhs where nim=?";
    private final String selectAll=" select * from mhs";

    public MhsAksiImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertMhs(MhsEntity mhs) throws MhsException {
   
        PreparedStatement statement=null;
        try {
            connection.setAutoCommit(false);
        statement=connection.prepareStatement(insertMhs);
        statement.setString(1, mhs.getNim());
        statement.setString(2, mhs.getNama());
        statement.setString(3, mhs.getFakultas());
        statement.setString(4, mhs.getProdi());
        statement.setString(5, mhs.getNohp());
        statement.setString(6, mhs.getEmail());
        statement.executeUpdate();
         connection.commit();
        } catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
        throw  new MhsException(e1.getMessage());
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
    public void updateMhs(MhsEntity mhs) throws MhsException {
    PreparedStatement statement=null;
        try {
            connection.setAutoCommit(false);
        statement=connection.prepareStatement(updateMhs);
        statement.setString(1, mhs.getNim());
        statement.setString(2, mhs.getNama());
        statement.setString(3, mhs.getFakultas());
        statement.setString(4, mhs.getProdi());
        statement.setString(5, mhs.getNohp());
        statement.setString(6, mhs.getEmail());
        statement.setInt(7, mhs.getKode());
        statement.executeUpdate();
         connection.commit();
        } catch (SQLException e1) {
        try {
            connection.rollback();
        } catch (SQLException ex) {
         }
        throw  new MhsException(e1.getMessage());
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
    public void deleteMhs(Integer kode) throws MhsException {
   PreparedStatement statement=null;
        try {
            connection.setAutoCommit(false);
        statement=connection.prepareStatement(deleteMhs);
    
        statement.setInt(1, kode);
        
        statement.executeUpdate();
         connection.commit();
        } catch (SQLException e1) {
       try {
           connection.rollback();
       } catch (SQLException ex) {
           }
        throw  new MhsException(e1.getMessage());
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
    public MhsEntity getByKode(Integer kode) throws MhsException {
   PreparedStatement statement=null;
   
        try {
            connection.setAutoCommit(false);
            statement=connection.prepareStatement(getByKode);
            statement.setInt(1, kode);
            ResultSet  resultSet= statement.executeQuery();
            MhsEntity mhs= null;
            if(resultSet.next())
            {
                mhs= new MhsEntity();
                mhs.setNim(resultSet.getString("nim"));
                mhs.setNama(resultSet.getString("nama"));
                mhs.setFakultas(resultSet.getString("fakultas"));
                mhs.setProdi(resultSet.getString("prodi"));
                mhs.setNohp(resultSet.getString("nohp"));
                mhs.setEmail(resultSet.getString("email"));
                mhs.setKode(resultSet.getInt("kode"));
            
            }else
            {
                
                throw  new MhsException("Mahasiswa dengan Kode = "+kode +"tidak ada geis");
            
            
            }
            connection.commit();
            return mhs;
        } 
        
        catch (SQLException e1) {
            
            try {
                connection.rollback();
                
            } catch (SQLException e2) {
            
            }
            throw  new MhsException(e1.getMessage());
        }
        
        finally
        {
            try {
                connection.setAutoCommit(true);
            } 
            catch (SQLException e3) {
            
            }
            if(statement!=null)
            {
                try {
                    statement.close();
                    
                } 
                
                catch (SQLException e4) {
                }
            
            }
        
        
        }
    
    
    }
    

    @Override
    public MhsEntity getByNim(String nim) throws MhsException {
    PreparedStatement statement=null;
   
        try {
            connection.setAutoCommit(false);
            statement=connection.prepareStatement(getByNim);
            statement.setString(1, nim);
            ResultSet  resultSet= statement.executeQuery();
            MhsEntity mhs= null;
            if(resultSet.next())
            {
                mhs= new MhsEntity();
                mhs.setNim(resultSet.getString("nim"));
                mhs.setNama(resultSet.getString("nama"));
                mhs.setFakultas(resultSet.getString("fakultas"));
                mhs.setProdi(resultSet.getString("prodi"));
                mhs.setNohp(resultSet.getString("nohp"));
                mhs.setEmail(resultSet.getString("email"));
            
            }else
            {
                
                throw  new MhsException("Mahasiswa dengan Kode = "+nim +"tidak ada geis");
            
            
            }
            connection.commit();
            return mhs;
        } 
        
        catch (SQLException e1) {
            
            try {
                connection.rollback();
                
            } catch (SQLException e2) {
            
            }
            throw  new MhsException(e1.getMessage());
        }
        
        finally
        {
            try {
                connection.setAutoCommit(true);
            } 
            catch (SQLException e3) {
            
            }
            if(statement!=null)
            {
                try {
                    statement.close();
                    
                } 
                
                catch (SQLException e4) {
                }
            
            }
        
        
        }
      }

    @Override
    public List<MhsEntity> SelectAllMhs() throws MhsException {
  
        Statement statement=null;
        
        List<MhsEntity> list= new ArrayList<>();
        
        try {
        connection.setAutoCommit(false);
        statement= connection.createStatement();
        ResultSet resultSet=statement.executeQuery(selectAll);
        
            while (resultSet.next()) {

            MhsEntity mhs= new MhsEntity();
            mhs.setNim(resultSet.getString("nim"));
            mhs.setNama(resultSet.getString("nama"));
            mhs.setFakultas(resultSet.getString("fakultas"));
            mhs.setProdi(resultSet.getString("prodi"));
            mhs.setNohp(resultSet.getString("nohp"));
            mhs.setEmail(resultSet.getString("email"));
            
            list.add(mhs);
                
            }
           connection.commit();
           return list;
        } 
        catch (SQLException e1) {
            try {
                connection.rollback();
            } catch (SQLException e2) {
            }
            throw  new MhsException(e1.getMessage());
        }finally
        {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException e3) {
            }
        
        if(statement!=null)
        {
            try {
                statement.close();
            } catch (SQLException e4) {
            }
        }
        }
    
    
    }

    
    
}
