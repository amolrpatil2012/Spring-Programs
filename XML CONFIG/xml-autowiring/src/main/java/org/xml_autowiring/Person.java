package org.xml_autowiring;

public class Person {
	
	String name;
	Car car;
	
	public Person ( Car car)
	{
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
	

}
