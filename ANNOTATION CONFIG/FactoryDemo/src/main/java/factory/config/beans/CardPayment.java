package factory.config.beans;

import org.springframework.stereotype.Service;

@Service("card")
public class CardPayment implements PaymentProvider {

	public void acceptPayment() {
		System.out.println("Accepting payment Using Card");
		
	}

}
