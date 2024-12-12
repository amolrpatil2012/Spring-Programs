package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4JDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Log4JDemoApplication.class, args);
	}

	@Autowired
	LogExample example;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		example.generateLogs();
	}

}
