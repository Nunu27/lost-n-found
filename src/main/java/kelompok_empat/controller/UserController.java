/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.controller;

import java.util.ArrayList;
import kelompok_empat.entity.User;

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

    public boolean addUser(String nama, String email, String noWa, String password) {
        if (checkUser(email)) {
            return false;
        }

        userList.add(new User(nama, email, password, noWa));
        return true;
    }

    public void removeUser(User user) {
        userList.remove(user);
    }

    public User login(String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                currentUser = user;
                return user;
            }
        }

        return null;
    }
}
