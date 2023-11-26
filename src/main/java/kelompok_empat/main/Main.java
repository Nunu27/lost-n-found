/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.main;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import kelompok_empat.controller.PostController;
import kelompok_empat.controller.UserController;
import kelompok_empat.view.Login;

/**
 *
 * @author wisnu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login frame = new Login();
                UserController userController = new UserController();
                PostController postController = new PostController();

                userController.addUser("Jhiven Agnar Fuad", "", "081217610185", "");
                userController.addUser("Wisnu", "wisnu.agung.001@gmail.com", "081217610185", "123456");
                postController.tambahPost(userController.getCurrentUser(), "Bolpen ilang!", "Pilot", "PENS HH101", "bolpen.jpg", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "HP ilang", "iPhone", "Starbuck", "iphone.png", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "Koceng oren", "Elmo", "Keputih", "kucing.jpg", "", "Lost");
                postController.tambahPost(userController.getCurrentUser(), "Kunci rumah", "Kunci", "PENS", "kunci.jpg", "", "Lost");

                userController.logout();

                frame.setLocationRelativeTo(null);
                frame.loadController(userController, postController);
                frame.setVisible(true);
            }
        });
    }
}
