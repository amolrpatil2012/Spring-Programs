package annotations.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import annotations.config.beans.Vehicle;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
    			new AnnotationConfigApplicationContext(ProjectConfig.class);
    //	Vehicle vehicle = context.getBean(Vehicle.class);
    	
    	Vehicle vehicle = context.getBean("vehicle2",Vehicle.class);
    	System.out.println(vehicle.getName());
    	
    	Vehicle ferrari = context.getBean("ferrari",Vehicle.class);
    	System.out.println(ferrari.getName());
    	
    	Vehicle primary = context.getBean(Vehicle.class);
    	System.out.println(primary.getName());
    	
    	System.out.println(context.getBean(String.class));
    	
    	((AbstractApplicationContext) context).close();
    	
	}

}
