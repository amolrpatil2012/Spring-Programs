package annotations.config;
import annotations.config.beans.*;

import org.springframework.stereotype.Component;



@Component
public class MessageClient {

	

	private  MessageService service;

	public MessageClient(MessageService service) {
		super();
		this.service = service;
	}
	
	public MessageService getService() {
		return service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}

	public void sendMessage ( String msg)
	{

		service.sendMsg(msg);
	}
}
