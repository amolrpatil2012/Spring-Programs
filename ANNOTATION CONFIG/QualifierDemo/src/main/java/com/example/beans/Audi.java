package com.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("audi")
public class Audi implements CarType{

    @Override
    public void displayType() {
        System.out.println("This is an Audi Car");
    }
}
