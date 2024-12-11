package factory.config.beans;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class PaymentProviderFactory {


	  private final Map<String, PaymentProvider> map;
	
	   	
	  public PaymentProviderFactory(Map<String, PaymentProvider> map) {
		super();
		this.map = map;
		System.out.println("Hello"+this.map);
	}


	public PaymentProvider getPaymentProvider(String paymentProviderType) {
	        return map.get(paymentProviderType);
	    }
}
