package view;

import database.koneksi;
import entity.FilmEntity;
import eror.FilmException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.FilmModel;
import widget.Table;
import widget.TextBox;
import model.TableFilm;
import services.FilmService;
import java.util.List;

public class FilmView extends javax.swing.JPanel {

    private TableFilm tabelModel;
    private FilmService filmService;

    public FilmView() throws SQLException, ClassNotFoundException {
        initComponents();
        refreshTable();
    }

    public TextBox getT_Tahun() {
        return txtTahun;
    }

    public TextBox getT_NamaSutradara() {
        return txtNamaSutradara;
    }

    public TextBox getT_ID() {
        return txtID;
    }

    public TextBox getT_Cover() {
        return txtCover;
    }

    public TextBox getT_NamaFilm() {
        return txtNamaFilm;
    }

    public TextBox getT_Genre() {
        return txtGenre;
    }

    public TextBox getT_NamaPemain() {
        return txtNamaPemain;
    }

    public Table getTb_mhs() {
        return tb_film;
    }

    public void refreshTable() throws SQLException, ClassNotFoundException {

        try {
            tabelModel = new TableFilm();
            tb_film.setModel(tabelModel);
            List<FilmEntity> listfilm = koneksi.getFilmEntity().SelectAllFilm();

            for (FilmEntity film : listfilm) {
                tabelModel.add(film);
            }
        } catch (FilmException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data film: " + ex.getMessage());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new widget.Panel();
        label1 = new widget.Label();
        label2 = new widget.Label();
        label3 = new widget.Label();
        label4 = new widget.Label();
        label5 = new widget.Label();
        label6 = new widget.Label();
        label7 = new widget.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_film = new widget.Table();
        txtID = new widget.TextBox();
        txtNamaFilm = new widget.TextBox();
        txtCover = new widget.TextBox();
        txtNamaSutradara = new widget.TextBox();
        txtNamaPemain = new widget.TextBox();
        txtGenre = new widget.TextBox();
        txtTahun = new widget.TextBox();
        b_hapus = new widget.Button();
        b_rubah = new widget.Button();
        b_simpan = new widget.Button();

        setLayout(new java.awt.BorderLayout());

        label1.setText("ID");

        label2.setText("NAMA FILM");

        label3.setText("COVER");

        label4.setText("SUTRADARA");

        label5.setText("PEMAIN");

        label6.setText("GENRE");

        label7.setText("TAHUN");

        tb_film.setForeground(new java.awt.Color(0, 0, 0));
        tb_film.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_film);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNamaSutradara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaSutradaraActionPerformed(evt);
            }
        });

        txtNamaPemain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaPemainActionPerformed(evt);
            }
        });

        b_hapus.setText("DELETE");
        b_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_hapusActionPerformed(evt);
            }
        });

        b_rubah.setText("UPDATE");
        b_rubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rubahActionPerformed(evt);
            }
        });

        b_simpan.setText("SAVE");
        b_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNamaFilm, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txtCover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNamaSutradara, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(txtNamaPemain, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTahun, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(132, 132, 132)
                .addComponent(b_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_rubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(b_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaSutradara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaPemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(b_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rubah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaPemainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaPemainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaPemainActionPerformed

    private void b_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanActionPerformed

        String id = txtID.getText();
        String namaFilm = txtNamaFilm.getText();
        String cover = txtCover.getText();
        String genre = txtGenre.getText();
        String namaSutradara = txtNamaSutradara.getText();
        String namaPemain = txtNamaPemain.getText();
        String tahun = txtTahun.getText();

        FilmModel filmModel = new FilmModel();
        filmModel.setNama_film(namaFilm);
        filmModel.setCover(cover);
        filmModel.setGenre(genre);
        filmModel.setNama_sutrada(namaSutradara);
        filmModel.setNama_pemain(namaPemain);
        filmModel.setTahun(tahun);

        try {
            filmModel.insertFilm();
            JOptionPane.showMessageDialog(this, "Data film berhasil disimpan");
            filmModel.resetFilm();
            refreshTable();
        } catch (SQLException | FilmException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data film: " + ex.getMessage());
        }


    }//GEN-LAST:event_b_simpanActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNamaSutradaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaSutradaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaSutradaraActionPerformed

    private void b_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_hapusActionPerformed
        int id = Integer.parseInt(txtID.getText());
        FilmModel Film = new FilmModel();
        Film.setId_film(id);
        try {
            Film.deleteFilm();
            JOptionPane.showMessageDialog(FilmView.this, "Film Berhasil dihapus", "Success", JOptionPane.INFORMATION_MESSAGE);
            Film.resetFilm();
            refreshTable();

        } catch (SQLException | FilmException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(FilmView.this, ex.getMessage());
        }

    }//GEN-LAST:event_b_hapusActionPerformed

    private void b_rubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_rubahActionPerformed
        Integer id;
        String namaFilm = txtNamaFilm.getText();
        String cover = txtCover.getText();
        String genre = txtGenre.getText();
        String namaSutradara = txtNamaSutradara.getText();
        String namaPemain = txtNamaPemain.getText();
        String tahun = txtTahun.getText();

        try {
            id = Integer.parseInt(txtID.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return;

        }
        FilmModel filmModel = new FilmModel();
        filmModel.setId_film(id);
        filmModel.setNama_film(namaFilm);
        filmModel.setCover(cover);
        filmModel.setGenre(genre);
        filmModel.setNama_sutrada(namaSutradara);
        filmModel.setNama_pemain(namaPemain);
        filmModel.setTahun(tahun);
        try {
            filmModel.updateFilm();
            JOptionPane.showMessageDialog(FilmView.this, "Data Berhasil Diubah", "Success", JOptionPane.INFORMATION_MESSAGE);
            filmModel.resetFilm();
            refreshTable();
        } catch (SQLException | FilmException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(FilmView.this, "Gagal mengubah data Film: " + ex.getMessage());
        }
    }//GEN-LAST:event_b_rubahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button b_hapus;
    private widget.Button b_rubah;
    private widget.Button b_simpan;
    private javax.swing.JScrollPane jScrollPane1;
    private widget.Label label1;
    private widget.Label label2;
    private widget.Label label3;
    private widget.Label label4;
    private widget.Label label5;
    private widget.Label label6;
    private widget.Label label7;
    private widget.Panel panel1;
    private widget.Table tb_film;
    private widget.TextBox txtCover;
    private widget.TextBox txtGenre;
    private widget.TextBox txtID;
    private widget.TextBox txtNamaFilm;
    private widget.TextBox txtNamaPemain;
    private widget.TextBox txtNamaSutradara;
    private widget.TextBox txtTahun;
    // End of variables declaration//GEN-END:variables
}
