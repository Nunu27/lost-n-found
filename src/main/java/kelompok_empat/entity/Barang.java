/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.entity;

import java.time.LocalDate;

/**
 *
 * @author Jhiven Agnar
 */
public class Barang {
    private String judul;
    private String namaBarang;
    private String pathFotoBarang;
    private String deskripsiBarang;
    private String alamat;
    private boolean telahDitemukan;
    private LocalDate tanggalPosting;
    private User dipostingOleh;
    
    public Barang(User dipostingOleh, String namaBarang, String alamat){
        this.namaBarang = namaBarang;
        this.pathFotoBarang = "";
        this.deskripsiBarang = "";
        this.alamat = alamat;
        this.telahDitemukan = false;
        this.tanggalPosting = LocalDate.now();
        this.dipostingOleh = dipostingOleh;
    }

    public void setPathFotoBarang(String pathFotoBarang) {
        this.pathFotoBarang = pathFotoBarang;
    }

    public void setDeskripsiBarang(String deskripsiBarang) {
        this.deskripsiBarang = deskripsiBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelahDitemukan(boolean telahDitemukan) {
        this.telahDitemukan = telahDitemukan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getJudul() {
        return judul;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getPathFotoBarang() {
        return pathFotoBarang;
    }

    public String getDeskripsiBarang() {
        return deskripsiBarang;
    }

    public String getAlamat() {
        return alamat;
    }

    public boolean getTelahDitemukan() {
        return telahDitemukan;
    }

    public LocalDate getTanggalPosting() {
        return tanggalPosting;
    }

    public User getDipostingOleh() {
        return dipostingOleh;
    }
    
    
}
