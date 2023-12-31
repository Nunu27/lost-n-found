/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import entity.User;

/**
 *
 * @author wisnu
 */
public class UserController {

    private ArrayList<User> userList;
    private User currentUser;

    public UserController() {
        userList = new ArrayList<>();
    }

    public User getCurrentUser() {
        return currentUser;
    }
    
    public boolean checkUser(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }

        return false;
    }

    public boolean addUser(String fotoProfil, String nama, String email, String noWa, String password) {
        if (checkUser(email)) {
            return false;
        }

        currentUser = new User(fotoProfil, nama, email, password, noWa);
        userList.add(currentUser);
        return true;
    }

    public void removeUser() {
        userList.remove(currentUser);
        currentUser = null;
    }

    public boolean login(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                currentUser = user;
                return true;
            }
        }

        return false;
    }
    
    public void logout(){
        this.currentUser = null;
    }
}
