package annotations.config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotations.config.beans.MessageService;
import annotations.config.beans.Mobile;

public class App {

    public static void main( String[] args )
    {
        ApplicationContext context =
        		new AnnotationConfigApplicationContext(ProjectConfig.class);
        
      // Check Prototype Scope
      Mobile mobile = context.getBean(Mobile.class);
      mobile.setName("Samsung");
      System.out.println(mobile.getName());      
      System.out.println(mobile.hashCode());      
      Mobile mobile1 = context.getBean(Mobile.class);
      System.out.println(mobile1.hashCode());
      
      // Using Primary Annotation
        //MessageService service = (MessageService)context.getBean("email");
        MessageService service = context.getBean(MessageService.class);
        MessageClient client = context.getBean(MessageClient.class);
        client.sendMessage("Hello");
      
    }

}
