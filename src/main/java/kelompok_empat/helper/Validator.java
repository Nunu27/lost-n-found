/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.helper;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author wisnu
 */
public class Validator {

    private boolean patternMatches(String string, String pattern) {
        return Pattern.compile(pattern)
                .matcher(string)
                .matches();
    }

    public boolean checkPhone(String phone) {
        return patternMatches(phone, "^\\d{12,}$");
    }

    public boolean checkEmail(String email) {
        return patternMatches(email, "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public boolean validateLoginData(String email, String password) {
        String message = "";
        if (email.isBlank() || password.isBlank()) {
            message = "Harap isi semua data";
        } else if (!checkEmail(email)) {
            message = "Harap masukkan email yang valid";
        } else if (password.length() < 8) {
            message = "Password minimal 8 karakter";
        }

        if (message.isBlank()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, message, "Gagal", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean validateUserData(String nama, String email, String noWa, String password) {
        String message = "";
        if (nama.isBlank() || email.isBlank() || noWa.isBlank() || password.isBlank()) {
            message = "Harap isi semua data";
        } else if (!checkEmail(email)) {
            message = "Harap masukkan email yang valid";
        } else if (!checkPhone(noWa)) {
            message = "Harap masukkan nomor yang valid";
        } else if (password.length() < 8) {
            message = "Password minimal 8 karakter";
        }

        if (message.isBlank()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, message, "Gagal", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}
