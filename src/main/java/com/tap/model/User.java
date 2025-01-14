package com.tap.model;

import com.tap.model.User.Role;

public class User {
    
    private int id;
    private String userName;
    private String password;
    private Role role;
    
    // Enum for roles
  
        public enum Role {
        	Employee,
        	Manager, 
            Admin,
        }
    

    // Default constructor
    public User() {}

    // Constructor with parameters
    public User(int id, String userName, String password, Role role) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    // Getters and setters for the fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
