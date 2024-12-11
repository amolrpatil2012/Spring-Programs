package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayCarType {
    @Autowired
    @Qualifier("audi")
    CarType carType;

    public void display()
    {
        carType.displayType();
    }
}