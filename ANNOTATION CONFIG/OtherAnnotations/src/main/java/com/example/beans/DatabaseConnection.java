package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {

    public DatabaseConnection() {
        System.out.println("Initializing Database Connection...");
        // Simulate database connection setup
    }
}