package entity;

import event.StudioListener;

public class StudioEntity {
    private Integer id_studio;
    private Integer nomor_studio;
    private StudioListener StudioListener;

    public StudioEntity(){
        
    }
    public StudioListener getStudioListener() {
        return StudioListener;
    }

    public void setStudioListener(StudioListener StudioListener) {
        this.StudioListener = StudioListener;
    }

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

    public StudioEntity(Integer id_studio, Integer nomor_studio) {
        this.id_studio = id_studio;
        this.nomor_studio = nomor_studio;
    }
    
    
}
