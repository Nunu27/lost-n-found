/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.Login;
import views.NavbarLayout;
import views.Register;

/**
 *
 * @author wisnu
 */
public abstract class RootController extends JFrame {

    private UserController userController;
    private PostController postController;

    public void loadController(UserController userController, PostController postController) {
        this.userController = userController;
        this.postController = postController;
    }

    public UserController getUserController() {
        return userController;
    }

    public PostController getPostController() {
        return postController;
    }

    private RootController getFrame(String name) {
        switch (name) {
            case "login" -> {
                return new Login();
            }
            case "register" -> {
                return new Register();
            }
            case "beranda", "profil", "detailPost", "tambahPost", "editPost" -> {
                return new NavbarLayout(name);
            }

            default -> {
                return null;
            }
        }
    }

    public void openFrame(String name) {
        RootController frame = getFrame(name);

        if (frame == null) {
            JOptionPane.showMessageDialog(this, "Frame tidak ditemukan!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            frame.loadController(userController, postController);
            frame.setLocationRelativeTo(this);
            frame.afterOpen();
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

    public void afterOpen() {

    }
}
