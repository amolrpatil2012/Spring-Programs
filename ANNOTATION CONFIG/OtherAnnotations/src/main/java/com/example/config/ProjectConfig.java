package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.example.beans.DatabaseConfig;
import com.example.beans.ServiceConfig;

@Configuration
@ComponentScan("com.example.beans")
@Import({DatabaseConfig.class, ServiceConfig.class})
@ImportResource("classpath:beans.xml")
public class ProjectConfig {

}
