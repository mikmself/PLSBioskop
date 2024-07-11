package implement;

import entity.UserEntity;
import eror.UserException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.UserService;
import database.koneksi;

public class UserActionImpl implements UserService {

    @Override
    public List<UserEntity> SelectAllUser() throws UserException {
        List<UserEntity> users = new ArrayList<>();

        try (Connection conn = koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement("SELECT * FROM user"); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                UserEntity user = new UserEntity();
                user.setId(rs.getInt("id"));
                user.setNama(rs.getString("nama"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new UserException("Error fetching users: " + e.getMessage(), e);
        }
        return users;
    }

    @Override
    public void UpdateUser(UserEntity user) throws UserException {
        String sql = "UPDATE user SET nama = ?, email = ?, password = ? WHERE id = ?";

        try (Connection conn = koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setInt(4, user.getId());
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new UserException("Error updating user: " + e.getMessage(), e);
        }
    }

    @Override
    public void DeleteUser(Integer id) throws UserException {
        String sql = "DELETE FROM user WHERE id = ?";

        try (Connection conn = koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new UserException("Error deleting user: " + e.getMessage(), e);
        }
    }

    @Override
    public void InsertUser(UserEntity user) throws UserException {
        String sql = "INSERT INTO user (nama, email, password) VALUES (?, ?, ?)";

        try (Connection conn = koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new UserException("Error inserting user: " + e.getMessage(), e);
        }
    }

    @Override
    public void findUser(UserEntity user) throws UserException {
        String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try (Connection conn = koneksi.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getEmail());
            stmt.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new UserException("Error inserting user: " + e.getMessage(), e);
        }
    }
}
