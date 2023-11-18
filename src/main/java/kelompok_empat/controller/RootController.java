/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import kelompok_empat.view.Beranda;
import kelompok_empat.view.Login;
import kelompok_empat.view.Register;

/**
 *
 * @author wisnu
 */
public abstract class RootController extends JFrame {

    private UserController userController = new UserController();

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
            case "beranda" -> {
                return new Beranda();
            }
            default -> {
                return null;
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
}
