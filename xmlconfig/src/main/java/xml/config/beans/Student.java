package xml.config.beans;

public class Student {
	
	String name;
	Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
		System.out.println("In Student Constructor");
	}
	public Student() {
		super();
	}
	
	

}
