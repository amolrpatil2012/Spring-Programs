package com.example;

import com.example.beans.TestBean;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.printList();
    }
}
