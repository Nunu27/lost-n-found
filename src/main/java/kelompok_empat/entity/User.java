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

    private String nama;
    private String email;
    private String password;
    private String noWa;

    public User(String nama, String email, String password, String noWa) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.noWa = noWa.startsWith("0") ? "62" + noWa.substring(1) : noWa;
    }

    public String getEmail() {
        return email;
    }

    public String getNama() {
        return nama;
    }

    public String getNoWa() {
        return noWa;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoWa(String noWa) {
        this.noWa = noWa;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean bukaKontak() {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;

        if (desktop == null || !desktop.isSupported(Desktop.Action.BROWSE)) {
            return false;
        }
        
        try {
            desktop.browse(new URI("https://wa.me/" + noWa));
            return true;
            
        } catch (IOException | URISyntaxException e) {
            return false;
        }
    }
}
