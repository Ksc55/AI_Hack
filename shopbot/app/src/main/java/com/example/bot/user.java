package com.example.bot;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class user {
    String name, email, password;


    public user(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public user() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}