package com.matthias.paintball.model;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> users;

    public Users(){
        this.users = new ArrayList<User>();
    }
    public List<User> getUser() {
        return users;
    }

    public void setUser(List<User> user) {
        this.users = user;
    }

    public void addUser(User user){
        
        this.users.add(user);
    }
}