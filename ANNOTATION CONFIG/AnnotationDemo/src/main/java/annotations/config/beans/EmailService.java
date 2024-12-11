package annotations.config.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("email")
public class EmailService implements MessageService {

	public void sendMsg(String msg) {
		System.out.println("Sending Msg using Mail");
		
	}
	
	

}
