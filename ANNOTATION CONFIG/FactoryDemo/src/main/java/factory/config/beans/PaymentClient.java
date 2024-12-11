package factory.config.beans;


import org.springframework.stereotype.Component;



@Component
public class PaymentClient {

	private PaymentProviderFactory factory;

	public PaymentClient(PaymentProviderFactory factory) {
		super();
		this.factory = factory;
	}
	public void test ( String type)
	{
		PaymentProvider provider = factory.getPaymentProvider(type);
		provider.acceptPayment();
	}
	
}
