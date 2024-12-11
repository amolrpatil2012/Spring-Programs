package com.example.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestBean {

    @Autowired
    private List<String> names;

    public void printList()
    {
        names.forEach(System.out::println);
    }
}
