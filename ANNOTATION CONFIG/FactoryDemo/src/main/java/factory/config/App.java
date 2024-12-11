package factory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import factory.config.beans.PaymentClient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan("factory.config.beans")
public class App {
	public static void main(String[] args) {
		  ApplicationContext context =
	        		new AnnotationConfigApplicationContext(App.class);
		  PaymentClient client = context.getBean(PaymentClient.class);
	      client.test("card");
	        
	}

}
