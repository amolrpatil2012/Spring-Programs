package com.example.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("databaseConnection")
public class ApplicationInitializer {

    public ApplicationInitializer() {
        System.out.println("Initializing Application...");
    }
}