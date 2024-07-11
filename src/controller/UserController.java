package controller;

import entity.UserEntity;
import implement.UserActionImpl;
import view.SiginView;
import view.LoginView;

import javax.swing.JOptionPane;
import java.util.List;

public class UserController {
    private UserActionImpl userAction;
    private SiginView siginView;
    private LoginView loginView;

    public UserController() {
        userAction = new UserActionImpl();
    }

    public void setSiginView(SiginView siginView) {
        this.siginView = siginView;
    }

    public void userInsert() {
        String nama = siginView.getTxtNama().getText();
        String email = siginView.getTxtEmail().getText();
        String password = siginView.getTxtPassword().getText();

        if (nama.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(siginView, "Semua bidang harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            UserEntity user = new UserEntity();
            user.setNama(nama);
            user.setEmail(email);
            user.setPassword(password);

            try {
                userAction.InsertUser(user);
                JOptionPane.showMessageDialog(siginView, "Pengguna berhasil didaftarkan!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(siginView, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public UserController(LoginView loginView) {
        this.loginView = loginView;
        userAction = new UserActionImpl();
    }

    public void login() {
        String email = loginView.getTxtemail().getText();
        String password = loginView.getTxtPassword().getText();
        try {
            List<UserEntity> users = userAction.SelectAllUser();
            UserEntity user = users.stream()
                                   .filter(u -> u.getEmail().equals(email) && u.getPassword().equals(password))
                                   .findFirst()
                                   .orElse(null);
            if (user != null) {
                JOptionPane.showMessageDialog(loginView, "Login berhasil!");
                // Lanjutkan ke bagian aplikasi berikutnya
            } else {
                JOptionPane.showMessageDialog(loginView, "Email atau password salah!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(loginView, "Error: " + e.getMessage());
        }
    }
}
