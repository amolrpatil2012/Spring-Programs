package xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xml.config.beans.CurrencyConverter;
import xml.config.beans.Emp;
import xml.config.beans.HelloWorld;
import xml.config.beans.MessageProcessor;
import xml.config.beans.Student;
import xml.config.beans.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
       HelloWorld hello = context.getBean("helloWorld",HelloWorld.class);
       System.out.println(hello.getMessage());
       
             
       CurrencyConverter curr = context.getBean("currencyConverter",CurrencyConverter.class);
       double rs = curr.dollarsToRupees(50);
       System.out.println(rs);
       
     //  Emp e = context.getBean("emp",Emp.class);
     //  System.out.println(e);
       
       /*
       
       Student student = context.getBean("student",Student.class);
       System.out.println(student);
       
       Student student1 = context.getBean("objStudent",Student.class);
       System.out.println(student1);
       
       Teacher teacher = context.getBean("teacherObj",Teacher.class);
       System.out.println(teacher);
       
       MessageProcessor mp = context.getBean("msg",MessageProcessor.class);
       mp.getService().sendMsg("Hello World");
       */
       
    }
}
