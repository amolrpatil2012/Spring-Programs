package xml.config.beans;

public class SMSService implements MessageService{

	public void sendMsg(String message) {
		System.out.println(message);
	}
}
