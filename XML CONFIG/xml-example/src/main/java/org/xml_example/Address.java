package org.xml_example;

public class Address {

	String city;
	
	
	
	public Address(String city) {
		super();
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}



	public Address()
	{
		System.out.println("In Address Constructor");
	}
}
