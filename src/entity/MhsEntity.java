/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author User
 */
public class MhsEntity {
    private Integer kode;
    private String nim;
    private String nama;
    private String fakultas;
    private String prodi;
    private String nohp;
    private String email;

    public MhsEntity() {
    }

   

    public MhsEntity(String nim, String nama, String fakultas, String prodi, String nohp, String email) {
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.nohp = nohp;
        this.email = email;
    }

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.kode);
        hash = 97 * hash + Objects.hashCode(this.nim);
        hash = 97 * hash + Objects.hashCode(this.nama);
        hash = 97 * hash + Objects.hashCode(this.fakultas);
        hash = 97 * hash + Objects.hashCode(this.prodi);
        hash = 97 * hash + Objects.hashCode(this.nohp);
        hash = 97 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MhsEntity other = (MhsEntity) obj;
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.fakultas, other.fakultas)) {
            return false;
        }
        if (!Objects.equals(this.prodi, other.prodi)) {
            return false;
        }
        if (!Objects.equals(this.nohp, other.nohp)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.kode, other.kode)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
}
