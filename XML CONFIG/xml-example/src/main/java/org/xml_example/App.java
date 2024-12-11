package org.xml_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = (Student)context.getBean("student1");
        student1.study();
        System.out.println(student1);
        student1.drive();
      //  Student student2 = (Student)context.getBean("student2");
      //  student2.study();
        
    }
}
