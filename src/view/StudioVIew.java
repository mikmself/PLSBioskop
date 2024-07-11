package view;

import database.koneksi;
import entity.StudioEntity;
import eror.StudioException;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.StudioModel;
import widget.Table;
import widget.TextBox;

public class StudioVIew extends javax.swing.JPanel {

    public StudioVIew() throws SQLException, ClassNotFoundException {
        initComponents();
        refreshTable();
    }

    public TextBox getTxtID() {
        return txtID;
    }

    public void setTxtID(TextBox txtID) {
        this.txtID = txtID;
    }

    public TextBox getTxtNomor() {
        return txtNomor;
    }

    public void setTxtNomor(TextBox txtNomor) {
        this.txtNomor = txtNomor;
    }

    
    public Table getTb_mhs() {
        return tb_mhs;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new widget.Panel();
        label1 = new widget.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mhs = new widget.Table();
        txtID = new widget.TextBox();
        b_reset = new widget.Button();
        b_hapus = new widget.Button();
        b_rubah = new widget.Button();
        b_simpan = new widget.Button();
        txtNomor = new widget.TextBox();
        label8 = new widget.Label();
        jPanel1 = new javax.swing.JPanel();
        panel2 = new widget.Panel();
        label2 = new widget.Label();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_mhs1 = new widget.Table();
        txtID1 = new widget.TextBox();
        b_reset1 = new widget.Button();
        b_hapus1 = new widget.Button();
        b_rubah1 = new widget.Button();
        b_simpan1 = new widget.Button();
        txtNomor1 = new widget.TextBox();
        label9 = new widget.Label();

        setLayout(new java.awt.BorderLayout());

        label1.setText("ID");

        tb_mhs.setForeground(new java.awt.Color(0, 0, 0));
        tb_mhs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_mhs);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

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

        txtNomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomorActionPerformed(evt);
            }
        });

        label8.setText("Nomr");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(b_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_rubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_hapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rubah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        label2.setText("ID");

        tb_mhs1.setForeground(new java.awt.Color(0, 0, 0));
        tb_mhs1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_mhs1);

        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });

        b_reset1.setText("REFRESH DATA");
        b_reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reset1ActionPerformed(evt);
            }
        });

        b_hapus1.setText("HAPUS");
        b_hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hapus1ActionPerformed(evt);
            }
        });

        b_rubah1.setText("RUBAH");
        b_rubah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rubah1ActionPerformed(evt);
            }
        });

        b_simpan1.setText("SIMPAN");
        b_simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpan1ActionPerformed(evt);
            }
        });

        txtNomor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomor1ActionPerformed(evt);
            }
        });

        label9.setText("Nomr");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(b_reset1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_rubah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomor1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_reset1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_hapus1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rubah1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_simpan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jPanel1.add(panel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomorActionPerformed

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed
        // Ambil nilai dari field teks di FilmView
        Integer id;
        Integer nomor;
        try {
            id = Integer.parseInt(txtID.getText());
            nomor = Integer.parseInt(txtNomor.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID dan Nomor harus berupa angka");
            return; 
        }
        // Buat objek FilmModel
        StudioModel studiModel = new StudioModel();
        studiModel.setId_studio(id);        
        studiModel.setNomor_studio(nomor);
        try {
            // Panggil method untuk menyimpan ke database
            studiModel.insertStudio();

            // Jika berhasil, reset field teks di FilmView
            JOptionPane.showMessageDialog(this, "Data film berhasil disimpan");
            studiModel.resetStudio();
            try {
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(StudioVIew.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudioVIew.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Refresh tampilan atau operasi lain setelah penyimpanan berhasil
            // Misalnya, refresh tabel data film di FilmView

        } catch (SQLException | StudioException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data film: " + ex.getMessage());
        }
    }//GEN-LAST:event_b_simpanActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void b_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_resetActionPerformed
        
    }//GEN-LAST:event_b_resetActionPerformed
    public void actionPerformed(ActionEvent evt) {
        // Ambil nilai dari field teks di StudioView
        Integer id;
        Integer nomor;
        try {
            id = Integer.parseInt(txtID.getText());
            nomor = Integer.parseInt(txtNomor.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID dan Nomor harus berupa angka");
            return; 
        }
        // Buat objek StudioModel
        StudioModel studioModel = new StudioModel();
        studioModel.setId_studio(id);        
        studioModel.setNomor_studio(nomor);
        try {
            // Panggil method untuk update ke database
            studioModel.updateStudio();

            // Jika berhasil, reset field teks di StudioView
            JOptionPane.showMessageDialog(StudioVIew.this, "Data studio berhasil diubah");
            studioModel.resetStudio();

            // Refresh tampilan atau operasi lain setelah update berhasil
            // Misalnya, refresh tabel data studio di StudioVIew
            refreshTable();

        } catch (SQLException | StudioException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(StudioVIew.this, "Gagal mengubah data studio: " + ex.getMessage());
        }
    }
    private void b_rubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rubahActionPerformed
        actionPerformed(evt);
    }//GEN-LAST:event_b_rubahActionPerformed
    public void actionPerformedDelete(ActionEvent evt) {
        // Ambil nilai ID dari field teks di StudioView
        Integer id;
        try {
            id = Integer.parseInt(txtID.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID harus berupa angka");
            return; 
        }
        // Buat objek StudioModel
        StudioModel studioModel = new StudioModel();
        studioModel.setId_studio(id);        
        try {
            // Panggil method untuk hapus dari database
            studioModel.deleteStudio();

            // Jika berhasil, reset field teks di StudioView
            JOptionPane.showMessageDialog(StudioVIew.this, "Data studio berhasil dihapus");
            studioModel.resetStudio();

            // Refresh tampilan atau operasi lain setelah hapus berhasil
            // Misalnya, refresh tabel data studio di StudioVIew
            refreshTable();

        } catch (SQLException | StudioException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(StudioVIew.this, "Gagal menghapus data studio: " + ex.getMessage());
        }
    }
    private void b_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hapusActionPerformed
        actionPerformedDelete(evt);
    }//GEN-LAST:event_b_hapusActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void b_reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_reset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_reset1ActionPerformed

    private void b_hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_hapus1ActionPerformed

    private void b_rubah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rubah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_rubah1ActionPerformed

    private void b_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_simpan1ActionPerformed

    private void txtNomor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomor1ActionPerformed
    // Di dalam StudioVIew.java

    public void refreshTable() throws SQLException, ClassNotFoundException {
        try {
            // Ambil data dari service atau model
            List<StudioEntity> listStudio = koneksi.getStudioEntity().SelectAllStudio();

            // Konversi ke objek yang bisa dimasukkan ke dalam tabel
            DefaultTableModel model = (DefaultTableModel) tb_mhs.getModel();
            model.setRowCount(0); // Kosongkan isi tabel sebelum menambahkan data baru

            // Loop untuk menambahkan data ke tabel
            for (StudioEntity studio : listStudio) {
                Object[] row = {studio.getId_studio(), studio.getNomor_studio()};
                model.addRow(row);
            }
        } catch (StudioException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data studio: " + ex.getMessage());
        }
    }

    // Panggil refreshTable() di dalam konstruktor StudioVIew atau event listener yang sesuai


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button b_hapus;
    private widget.Button b_hapus1;
    private widget.Button b_reset;
    private widget.Button b_reset1;
    private widget.Button b_rubah;
    private widget.Button b_rubah1;
    private widget.Button b_simpan;
    private widget.Button b_simpan1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private widget.Label label1;
    private widget.Label label2;
    private widget.Label label8;
    private widget.Label label9;
    private widget.Panel panel1;
    private widget.Panel panel2;
    private widget.Table tb_mhs;
    private widget.Table tb_mhs1;
    private widget.TextBox txtID;
    private widget.TextBox txtID1;
    private widget.TextBox txtNomor;
    private widget.TextBox txtNomor1;
    // End of variables declaration//GEN-END:variables
}
