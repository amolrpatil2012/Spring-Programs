package com.example.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("PrototypeBean instance created!");
    }

    public void performTask() {
        System.out.println("Task performed by: " + this);
    }
}
