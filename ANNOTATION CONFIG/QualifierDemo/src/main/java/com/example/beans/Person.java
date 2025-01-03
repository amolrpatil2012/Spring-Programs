package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

    @Autowired
    private final Vehicle vehicle;

   // @Autowired
    public Person(Vehicle vehicle)
    {
        this.vehicle = vehicle;
        System.out.println("Person Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

   // @Autowired
    //public void setVehicle(Vehicle vehicle) {
      //  this.vehicle = vehicle;
    //}
}
