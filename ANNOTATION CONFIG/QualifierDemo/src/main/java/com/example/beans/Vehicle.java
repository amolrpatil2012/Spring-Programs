package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public Vehicle()
    {
        name="Audi";
        System.out.println("Vehicle Bean Created");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
