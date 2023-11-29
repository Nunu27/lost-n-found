/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.entity;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author wisnu
 */
public class User {

    private String fotoProfil;
    private String nama;
    private String email;
    private String password;
    private String noWa;

    public User(String fotoProfil, String nama, String email, String password, String noWa) {
        this.fotoProfil = fotoProfil;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.noWa = noWa.startsWith("0") ? "62" + noWa.substring(1) : noWa;
    }

    public String getFotoProfil() {
        return fotoProfil;
    }

    public void setFotoProfil(String fotoProfil) {
        this.fotoProfil = fotoProfil;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNoWa() {
        return noWa;
    }

    public void setNoWa(String noWa) {
        this.noWa = noWa;
    }
    
    

    public void bukaKontak() {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;

        if (desktop == null || !desktop.isSupported(Desktop.Action.BROWSE)) {
            return;
        }

        try {
            desktop.browse(new URI("https://wa.me/" + noWa));
        } catch (IOException | URISyntaxException e) {
        }
    }
}
