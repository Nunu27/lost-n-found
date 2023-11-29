/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Jhiven Agnar
 */
public class Post {

    private String judul;
    private String namaBarang;
    private String pathFoto;
    private String deskripsi;
    private String alamat;
    private String kategori;
    private boolean telahDitemukan;
    private LocalDateTime tanggalPost;
    private User dipostingOleh;

    public Post(User dipostingOleh, String namaBarang, String alamat, String judul, String kategori) {
        this.judul = judul;
        this.namaBarang = namaBarang;
        this.pathFoto = "";
        this.deskripsi = "";
        this.alamat = alamat;
        this.kategori = kategori;
        this.telahDitemukan = false;
        this.tanggalPost = LocalDateTime.now();
        this.dipostingOleh = dipostingOleh;
    }

    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getPathFoto() {
        if(pathFoto == null) return null;
        return "/kelompok_empat/resources/posts/" + pathFoto;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getAlamat() {
        return alamat;
    }

    public boolean getTelahDitemukan() {
        return telahDitemukan;
    }

    public User getDipostingOleh() {
        return dipostingOleh;
    }

    public String getRelativeTime() {
        LocalDateTime current = LocalDateTime.now();

        Duration duration = Duration.between(tanggalPost, current);
        long seconds = duration.getSeconds();

        if (seconds == 0) {
            return "baru saja";
        } else if (seconds < 60) {
            return seconds + " detik yang lalu";
        } else if (seconds < 3600) {
            long minutes = seconds / 60;
            return minutes + " menit yang lalu";
        } else if (seconds < 86400) {
            long hours = seconds / 3600;
            return hours + " jam yang lalu";
        } else {
            long days = seconds / 86400;
            return days + " hari yang lalu";
        }
    }
}
