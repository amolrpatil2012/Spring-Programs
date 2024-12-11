package factory.config.beans;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalProvider implements PaymentProvider {

	public void acceptPayment() {
		System.out.println("Accepting payment using Paypal");
		
	}
	
	

}
