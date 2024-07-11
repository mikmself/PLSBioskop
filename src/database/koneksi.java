
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import entity.MhsEntity;
import implement.FilmActionImpl;
import implement.JadwalImplement;
import implement.MhsAksiImpl;
import implement.StudioActionImpl;
import java.sql.Connection;
import java.sql.SQLException;
import services.FilmService;
import services.JadwalService;
import services.MhsServices;
import services.StudioService;

/**
 *
 * @author User
 */
public class koneksi {
    
    private static  Connection connection;
    //pertemuan 2
    private static MhsServices mhs;
    private static FilmService film;    
    private static StudioService studio;   
    private static JadwalService jadwal;


            
    public static void main(String[] args) {
        try {
            // Establishing connection
            Connection conn = getConnection();
            if (conn != null) {
                System.out.println("Connection established successfully!");

                // Get MhsServices instance
                MhsServices mhsService = getMhsEntity();

                
                // Close the connection after use
                conn.close();
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static  Connection getConnection() throws SQLException, ClassNotFoundException
    {
        if(connection==null)
        {
            
            String db = "bioskop";
            String url = "jdbc:mysql://localhost:3306/" + db;  // Correct JDBC URL format
            String user = "root";
            String password = "";
            String driver = "com.mysql.cj.jdbc.Driver";  // Updated driver class

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        
        }
        
        return connection;
    
    }
    
    public static MhsServices getMhsEntity() throws SQLException, ClassNotFoundException
    {
        if(mhs==null)
        {
            mhs= new MhsAksiImpl(getConnection());
       
        }
     return mhs;
    
    }
    
    public static FilmService getFilmEntity() throws SQLException, ClassNotFoundException
    {
        if(film==null)
        {
            film= new FilmActionImpl(getConnection());
       
        }
     return film;
    
    }
    public static StudioService getStudioEntity() throws SQLException, ClassNotFoundException
    {
        if(studio==null)
        {
            studio= new StudioActionImpl(getConnection());
       
        }
        return studio;
    }
    public static JadwalService getJadwalEntitiy() throws SQLException, ClassNotFoundException
    {
        if(jadwal==null)
        {
            jadwal= new JadwalImplement(getConnection());
       
        }
        return jadwal;
    }
}
