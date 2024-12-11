package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.beans.TextEditor;

@Configuration
@ComponentScan("com.example.beans")
public class App {
	 public static void main(String[] args) {

	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
	        TextEditor textEditor = context.getBean(TextEditor.class);
	        textEditor.getSpellChecker().checkSpell();



	    }
}
