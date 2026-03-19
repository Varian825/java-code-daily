/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

public class UserDAO {

    public ArrayList<UserDTO> list;

    public UserDAO() {
        list = new ArrayList<>();
        list.add(new UserDTO("admin", "admin", "Nguyen Van A"));
        list.add(new UserDTO("user1", "user1", "Nguyen Van B"));
    }

    public UserDTO searchById(String username) {
        for (UserDTO u : list) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;
    }

    public UserDTO login(String username, String password) {
        UserDTO u = searchById(username);
        if (u != null && u.getPassword().equals(password)) {
            return u;
        }
        return null;
    }
}
