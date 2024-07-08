
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import entity.MhsEntity;
import implement.FilmActionImpl;
import implement.MhsAksiImpl;
import java.sql.Connection;
import java.sql.SQLException;
import services.FilmService;
import services.MhsServices;

/**
 *
 * @author User
 */
public class koneksi {
    
    private static  Connection connection;
    //pertemuan 2
    private static MhsServices mhs;
    private static FilmService film;
            
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
    
}
