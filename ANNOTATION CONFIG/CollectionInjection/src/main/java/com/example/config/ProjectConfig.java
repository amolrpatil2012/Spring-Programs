package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@ComponentScan("com.example.beans")
@Configuration
public class ProjectConfig {

    @Bean
    public List<String> getNames()
    {
        return Arrays.asList("Rohit","Rahul","Virat");
    }
}