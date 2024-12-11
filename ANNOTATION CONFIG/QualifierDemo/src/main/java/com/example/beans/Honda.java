package com.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
@Component
@Qualifier("honda")
public class Honda implements CarType{
    @Override
    public void displayType() {
        System.out.println("This is Honda Car");
    }
}
