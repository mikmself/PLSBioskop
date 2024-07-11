package view;

import database.koneksi;
import entity.JadwalEntity;
import entity.StudioEntity;
import eror.JadwalException;
import eror.StudioException;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.JadwalModel;
import model.StudioModel;
import widget.Table;
import widget.TextBox;

public class JadwalView extends javax.swing.JPanel {

    public JadwalView() throws SQLException, ClassNotFoundException {
        initComponents();
        refreshTable();
    }

    public TextBox getTxt_id_film() {
        return txt_id_film;
    }

    public void setTxt_id_film(TextBox txt_id_film) {
        this.txt_id_film = txt_id_film;
    }

    public TextBox getTxt_id_jadwal() {
        return txt_id_jadwal;
    }

    public void setTxt_id_jadwal(TextBox txt_id_jadwal) {
        this.txt_id_jadwal = txt_id_jadwal;
    }

    public TextBox getTxt_id_studio() {
        return txt_id_studio;
    }

    public void setTxt_id_studio(TextBox txt_id_studio) {
        this.txt_id_studio = txt_id_studio;
    }

    public TextBox getTxt_jam() {
        return txt_jam;
    }

    public void setTxt_jam(TextBox txt_jam) {
        this.txt_jam = txt_jam;
    }

    public TextBox getTxt_tanggal() {
        return txt_tanggal;
    }

    public void setTxt_tanggal(TextBox txt_tanggal) {
        this.txt_tanggal = txt_tanggal;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new widget.TextBox();
        panel1 = new widget.Panel();
        label1 = new widget.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_jadwal = new widget.Table();
        b_reset = new widget.Button();
        b_hapus = new widget.Button();
        b_rubah = new widget.Button();
        b_simpan = new widget.Button();
        label8 = new widget.Label();
        label9 = new widget.Label();
        label10 = new widget.Label();
        label11 = new widget.Label();
        txt_id_jadwal = new widget.TextBox();
        txt_id_film = new widget.TextBox();
        txt_jam = new widget.TextBox();
        txt_id_studio = new widget.TextBox();
        txt_tanggal = new widget.TextBox();

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        setLayout(new java.awt.BorderLayout());

        label1.setText("ID ");

        tb_jadwal.setForeground(new java.awt.Color(0, 0, 0));
        tb_jadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_jadwal);

        b_reset.setText("REFRESH DATA");
        b_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_resetActionPerformed(evt);
            }
        });

        b_hapus.setText("HAPUS");
        b_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hapusActionPerformed(evt);
            }
        });

        b_rubah.setText("RUBAH");
        b_rubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rubahActionPerformed(evt);
            }
        });

        b_simpan.setText("SIMPAN");
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });

        label8.setText("ID Film");

        label9.setText("Id Studio");

        label10.setText("Tanggal");

        label11.setText("Jam");

        txt_id_jadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_jadwalActionPerformed(evt);
            }
        });

        txt_id_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_filmActionPerformed(evt);
            }
        });

        txt_jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jamActionPerformed(evt);
            }
        });

        txt_id_studio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_studioActionPerformed(evt);
            }
        });

        txt_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tanggalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_film, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_jam, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id_studio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(407, 407, 407)
                                .addComponent(b_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_rubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_jadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_studio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_hapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rubah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        add(panel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
        Integer id_jadwal, id_studio;
        String tanggal, jam, id_film;
        try {
            id_jadwal = Integer.parseInt(txt_id_jadwal.getText());
            id_film = txt_id_film.getText();
            id_studio = Integer.parseInt(txt_id_studio.getText());
            tanggal = txt_tanggal.getText();
            jam = txt_jam.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Jadwal, ID Film, dan ID Studio harus berupa angka");
            return;
        }

        JadwalModel jadwalModel = new JadwalModel();
        jadwalModel.setIdJadwal(id_jadwal);
        jadwalModel.setIdFilm(id_film);
        jadwalModel.setIdStudio(id_studio);
        jadwalModel.setTanggal(tanggal);
        jadwalModel.setJam(jam);

        try {
            try {
                jadwalModel.insertJadwal();
            } catch (JadwalException ex) {
                Logger.getLogger(JadwalView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Data jadwal berhasil disimpan");
            jadwalModel.resetJadwal();
            refreshTable();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data jadwal: " + ex.getMessage());
        }
    }//GEN-LAST:event_b_simpanActionPerformed
    public void refreshTable() throws SQLException, ClassNotFoundException {
        try {
            List<JadwalEntity> listJadwal = koneksi.getJadwalEntitiy().SelectAllJadwal();

            DefaultTableModel model = (DefaultTableModel) tb_jadwal.getModel();
            model.setColumnIdentifiers(new Object[]{"ID Jadwal", "ID Film", "ID Studio", "Tanggal", "Jam"});
            model.setRowCount(0);

            for (JadwalEntity jadwal : listJadwal) {
                Object[] row = {jadwal.getIdJadwal(), jadwal.getIdFilm(), jadwal.getIdStudio(), jadwal.getTanggal(), jadwal.getJam()};
                model.addRow(row);
            }
        } catch (JadwalException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data jadwal: " + ex.getMessage());
        }
    }
    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed
        try {
            refreshTable();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(JadwalView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_b_resetActionPerformed
    public void actionPerformed(ActionEvent evt) {
        // Ambil nilai dari field teks di JadwalView
        Integer id_jadwal, id_studio;
        String tanggal, jam, id_film;
        try {
            id_jadwal = Integer.parseInt(txt_id_jadwal.getText());
            id_film = txt_id_film.getText();
            id_studio = Integer.parseInt(txt_id_studio.getText());
            tanggal = txt_tanggal.getText();
            jam = txt_jam.getText();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Jadwal, ID Film, dan ID Studio harus berupa angka");
            return;
        }
        // Buat objek JadwalModel
        JadwalModel jadwalModel = new JadwalModel();
        jadwalModel.setIdJadwal(id_jadwal);
        jadwalModel.setIdFilm(id_film);
        jadwalModel.setIdStudio(id_studio);
        jadwalModel.setTanggal(tanggal);
        jadwalModel.setJam(jam);
        try {
            // Panggil method untuk update ke database
            jadwalModel.updateJadwal();

            // Jika berhasil, reset field teks di JadwalView
            JOptionPane.showMessageDialog(JadwalView.this, "Data jadwal berhasil diubah");
            jadwalModel.resetJadwal();

            // Refresh tampilan atau operasi lain setelah update berhasil
            // Misalnya, refresh tabel data jadwal di JadwalView
            refreshTable();

        } catch (SQLException | JadwalException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(JadwalView.this, "Gagal mengubah data jadwal: " + ex.getMessage());
        }
    }

    public void actionPerformedDelete(ActionEvent evt) {
        // Ambil nilai ID jadwal dari field teks di JadwalView
        Integer id_jadwal;
        try {
            id_jadwal = Integer.parseInt(txt_id_jadwal.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Jadwal harus berupa angka");
            return;
        }
        // Buat objek JadwalModel
        JadwalModel jadwalModel = new JadwalModel();
        jadwalModel.setIdJadwal(id_jadwal);
        try {
            // Panggil method untuk hapus dari database
            jadwalModel.deleteJadwal();

            // Jika berhasil, reset field teks di JadwalView
            JOptionPane.showMessageDialog(JadwalView.this, "Data jadwal berhasil dihapus");
            jadwalModel.resetJadwal();

            // Refresh tampilan atau operasi lain setelah hapus berhasil
            // Misalnya, refresh tabel data jadwal di JadwalView
            refreshTable();

        } catch (SQLException | JadwalException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(JadwalView.this, "Gagal menghapus data jadwal: " + ex.getMessage());
        }
    }

    private void b_rubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rubahActionPerformed
        actionPerformed(evt);
    }//GEN-LAST:event_b_rubahActionPerformed

    private void b_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hapusActionPerformed
        actionPerformedDelete(evt);
    }//GEN-LAST:event_b_hapusActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txt_id_filmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_filmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_filmActionPerformed

    private void txt_jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jamActionPerformed

    private void txt_id_studioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_studioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_studioActionPerformed

    private void txt_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tanggalActionPerformed

    private void txt_id_jadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_jadwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_jadwalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button b_hapus;
    private widget.Button b_reset;
    private widget.Button b_rubah;
    private widget.Button b_simpan;
    private javax.swing.JScrollPane jScrollPane1;
    private widget.Label label1;
    private widget.Label label10;
    private widget.Label label11;
    private widget.Label label8;
    private widget.Label label9;
    private widget.Panel panel1;
    private widget.Table tb_jadwal;
    private widget.TextBox txtID;
    private widget.TextBox txt_id_film;
    private widget.TextBox txt_id_jadwal;
    private widget.TextBox txt_id_studio;
    private widget.TextBox txt_jam;
    private widget.TextBox txt_tanggal;
    // End of variables declaration//GEN-END:variables
}
