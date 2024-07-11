package entity;

public class JadwalEntity {
    Integer idJadwal;
    Integer IdFilm;
    Integer IdStudio;
    String tanggal;
    String jam;
    public JadwalEntity(){
        
    }
    public JadwalEntity(Integer idJadwal, Integer IdFilm, Integer IdStudio, String tanggal, String jam) {
        this.idJadwal = idJadwal;
        this.IdFilm = IdFilm;
        this.IdStudio = IdStudio;
        this.tanggal = tanggal;
        this.jam = jam;
    }

    public Integer getIdJadwal() {
        return idJadwal;
    }

    public void setIdJadwal(Integer idJadwal) {
        this.idJadwal = idJadwal;
    }

    public Integer getIdFilm() {
        return IdFilm;
    }

    public void setIdFilm(Integer IdFilm) {
        this.IdFilm = IdFilm;
    }

    public Integer getIdStudio() {
        return IdStudio;
    }

    public void setIdStudio(Integer IdStudio) {
        this.IdStudio = IdStudio;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
}
