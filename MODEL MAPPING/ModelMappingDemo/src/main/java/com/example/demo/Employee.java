package com.example.demo;




public class Employee {

	public Employee() {}
    public Employee(Long id, String fullName, String dept, double salary) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", dept=" + dept + ", salary=" + salary + "]";
	}

	private Long id;

    private String fullName; // Field name does not match DTO's "name"

    private String dept; // Field name does not match DTO's "department"

    private double salary;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

