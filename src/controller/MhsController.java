/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.MhsEntity;
import event.MhsListener;
import javax.swing.JOptionPane;
import model.MhsModel;
import view.MhsView;

/**
 *
 * @author User
 */
public class MhsController {

    private MhsModel mhsModel;

    public void setMhsModel(MhsModel mhsModel) {
        this.mhsModel = mhsModel;
    }

    public void resetMhs(MhsView mhsView) {
        mhsModel.resetMhs();

    }

    public void onInsert(MhsView mhsView) {

        String nim = mhsView.getT_nim().getText();
        String nama = mhsView.getT_nama().getText();
        String fakultas = mhsView.getT_fak().getText();
        String prodi = mhsView.getT_prodi().getText();
        String nohp = mhsView.getT_nohp().getText();
        String email = mhsView.getT_email().getText();

        if (nim.trim().equals("")) {
            JOptionPane.showMessageDialog(mhsView, "NIM tidak boleh kosong");

        } else if (nim.length() >= 12) {
            JOptionPane.showMessageDialog(mhsView, "NIM tidak boleh lebih dari 12 digit");
        } else if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(mhsView, "NAMA tidak boleh kosong");
        } else if (nama.length() >= 255) {
            JOptionPane.showMessageDialog(mhsView, "NAMA tidak boleh lebih dari 255 KARAKTER");
        } else if (fakultas.trim().equals("")) {
            JOptionPane.showMessageDialog(mhsView, "fakultas tidak boleh kosong");
        } else {
            mhsModel.setNim(nim);
            mhsModel.setFakultas(fakultas);
            mhsModel.setProdi(prodi);
            mhsModel.setNohp(nohp);
            mhsModel.setEmail(email);
            try {
                mhsModel.insertMhs();
                JOptionPane.showMessageDialog(mhsView, "data mhs berhasil dimasukan");
                mhsModel.resetMhs();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(mhsView, "eror ke database");
            }

        }
    }

}
