package com.astach.application.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



public class User {
    private String name;
    private User friend;


    public User getFriend() {
        return friend;
    }

    @Autowired
    public void setFriend(User friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
