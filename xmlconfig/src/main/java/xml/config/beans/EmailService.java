package xml.config.beans;

public class EmailService implements MessageService{
	public void sendMsg(String message) {
		System.out.println(message);
	}
}
