/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.controller;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import kelompok_empat.view.BerandaNew;
import kelompok_empat.view.Login;
import kelompok_empat.view.NavbarLayout;
import kelompok_empat.view.Register;

/**
 *
 * @author wisnu
 */
public abstract class RootController extends JFrame {

    private UserController userController;

    public void loadController(UserController userController) {
        this.userController = userController;
    }

    public UserController getUserController() {
        return userController;
    }

    private RootController getFrame(String namaFrame) {
        switch (namaFrame) {
            case "login" -> {
                return new Login();
            }
            case "register" -> {
                return new Register();
            }

            // Frame dengan navbar
            default -> {
                JPanel content = null;

                switch (namaFrame) {
                    case "beranda" -> {
                        content = new BerandaNew();
                        break;
                    }
                }

                if (content == null) {
                    return null;
                }
                return new NavbarLayout(content);
            }
        }
    }
    public void bukaFrame(String namaFrame) {
        RootController frame = getFrame(namaFrame);

        if (frame == null) {
            JOptionPane.showMessageDialog(this, "Frame tidak ditemukan!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            frame.loadController(userController);
            frame.setLocationRelativeTo(this);
            dispose();
            frame.setVisible(true);
        }
    }
    public void setBarColor(Color color) {
        getRootPane().putClientProperty("JRootPane.titleBarBackground", color);
    }
    public void setTitleColor(Color color) {
        getRootPane().putClientProperty("JRootPane.titleBarForeground", color);
    }
}
