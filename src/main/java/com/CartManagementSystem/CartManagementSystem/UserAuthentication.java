package com.CartManagementSystem.CartManagementSystem;

public class UserAuthentication {
    private boolean loggedIn;
    private String username;

    public UserAuthentication() {
        this.loggedIn = false;
        this.username = "";
    }

    // Methods for user authentication
    public void login(String username) {
        this.loggedIn = true;
        this.username = username;
    }

    public void logout() {
        this.loggedIn = false;
        this.username = "";
    }

    // Getters and setters
    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

