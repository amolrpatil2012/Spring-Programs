package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.beans.ValueDemo;
import com.example.config.ProjectConfig;

public class App {

	public static void main(String[] args) {
		
		   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		   ValueDemo valueDemo = context.getBean(ValueDemo.class);
		   valueDemo.printConfig();
		   
		   System.out.println(context.getBean("databaseBean"));
	       System.out.println(context.getBean("serviceBean"));
	       
	       Object xmlBean = context.getBean("xmlBean");
	       System.out.println(xmlBean);
	}
}
