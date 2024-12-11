package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.DisplayCarType;

@Configuration
@ComponentScan("com.example.beans")
public class App {
	
	public static void main(String[] args) {

        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(App.class);
       // Person  person = context.getBean(Person.class);
        //System.out.println(person.getVehicle().getName());

        DisplayCarType carType = context.getBean(DisplayCarType.class);
        carType.display();

	}

}
