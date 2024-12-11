package org.xml_example;

public class Student {

	int roll;
	String name;
	Address address;
	Vehicle vehicle;
	
	/*
	public Student( int roll , String name )
	{
		System.out.println("Object Created");
		this.roll = roll;
		this.name = name;
	}
	*/
	
	
	public Address getAddress() {
		return address;
	}

	public Student(int roll, String name, Address address ) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void drive()
	{
		this.vehicle.drive();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void study()
	{
		System.out.println("Studing");
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
