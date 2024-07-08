package model;

import database.koneksi;
import entity.StudioEntity;
import eror.StudioException;
import event.StudioListener;
import java.sql.SQLException;
import services.StudioService;

public class StudioModel {
    private Integer id_studio;
    private Integer nomor_studio;
    private StudioListener studioListener;

    public Integer getId_studio() {
        return id_studio;
    }

    public void setId_studio(Integer id_studio) {
        this.id_studio = id_studio;
    }

    public Integer getNomor_studio() {
        return nomor_studio;
    }

    public void setNomor_studio(Integer nomor_studio) {
        this.nomor_studio = nomor_studio;
    }

    public StudioListener getStudioListener() {
        return studioListener;
    }

    public void setStudioListener(StudioListener studioListener) {
        this.studioListener = studioListener;
    }

    public void resetStudio() {
        setId_studio(0);
        setNomor_studio(0);
    }

    public void fireOnInsert(StudioEntity studioEntity) {
        if (studioListener != null) {
            studioListener.OnInsert(studioEntity);
        }
    }
    public void fireOnUpdate(StudioEntity studioEntity) {
        if (studioListener != null) {
            studioListener.onUpdate(studioEntity);
        }
    }
    public void fireOnDelete() {
        if (studioListener != null) {
            studioListener.onDelete();  // Kemungkinan terjadi rekursi tak terbatas di sini
        }
    }

    public void insertStudio() throws SQLException, StudioException, ClassNotFoundException {
        StudioService trigger = koneksi.getStudioEntity();

        StudioEntity tambah = new StudioEntity();
        tambah.setNomor_studio(nomor_studio);

        trigger.InserStudio(tambah);
        fireOnInsert(tambah);
    }

    public void deleteStudio() throws SQLException, StudioException, ClassNotFoundException {
        StudioService trigger = koneksi.getStudioEntity();

        trigger.DeleteStudio(id_studio);
        fireOnDelete();
    }
    public void updateStudio() throws SQLException, StudioException, ClassNotFoundException {
        StudioService trigger = koneksi.getStudioEntity();

        StudioEntity update = new StudioEntity();
        update.setId_studio(id_studio);
        update.setNomor_studio(nomor_studio);

        trigger.UpdateStudio(update);
        fireOnUpdate(update);
    }
}
