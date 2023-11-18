/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author wisnu
 */
public abstract class Navigator extends JFrame {

    private JFrame getFrame(String namaFrame) {
        switch (namaFrame) {
            case "login" -> {
                return new Login();
            }
            case "register" -> {
                return new Register();
            }
            default -> {
                return null;
            }
        }
    }

    public void bukaFrame(String namaFrame) {
        JFrame frame = getFrame(namaFrame);

        if (frame == null) {
            JOptionPane.showMessageDialog(this, "Frame tidak ditemukan!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        frame.setLocationRelativeTo(this);
        dispose();
        frame.setVisible(true);
    }
}
