package annotations.config.beans;

import org.springframework.stereotype.Component;

@Component("twitter")
public class TwitterService implements MessageService {

	public void sendMsg(String msg) {
	System.out.println("Sending msg using twitter");
		
	}

}
