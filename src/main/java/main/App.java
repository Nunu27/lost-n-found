/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import controller.PostController;
import controller.UserController;
import javax.swing.JOptionPane;
import views.Login;

/**
 *
 * @author wisnu
 */
public class App {

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

                userController.addUser("/resources/profile_placeholder.jpg", "Wisnu", "wisnu.agung.001@gmail.com", "081217610185", "12345678");
                userController.addUser("/resources/profile_placeholder.jpg", "Jhiven Agnar Fuad", "jhiven@gmail.com", "081217610185", "87654321");

                postController.addPost(userController.getCurrentUser(), "Bolpen ilang!", "Pilot", "PENS HH101", "/resources/posts/bolpen.jpg", "", "Lost");
                postController.addPost(userController.getCurrentUser(), "HP ilang", "iPhone", "Starbuck", "/resources/posts/iphone.png", "", "Lost");
                postController.addPost(userController.getCurrentUser(), "Koceng oren", "Elmo", "Keputih", "/resources/posts/kucing.jpg", "", "Lost");
                postController.addPost(userController.getCurrentUser(), "Kunci rumah", "Kunci", "PENS", "/resources/posts/kunci.jpg", "", "Found");

                userController.logout();

                frame.setLocationRelativeTo(null);
                frame.loadController(userController, postController);
                frame.setVisible(true);
            }
        });
    }
}
