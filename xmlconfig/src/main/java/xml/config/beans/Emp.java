package xml.config.beans;

public class Emp {
	
	private long id;
	private String firstName , lastName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public Emp(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("In Emp Constructor");
	}
	
	public void init()
	{
		System.out.println("Inside Init Method");
	}
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	
	
}
