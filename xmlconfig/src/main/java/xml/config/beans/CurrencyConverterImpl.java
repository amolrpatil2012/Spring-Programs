package xml.config.beans;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private double exchangeRate;

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public CurrencyConverterImpl(double exchangeRate) {
		super();
		this.exchangeRate = exchangeRate;
	}
	
	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}
}
