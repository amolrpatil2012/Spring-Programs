package com.example.demo;

public class EmployeeDTO {

    private Long id;

    private String name; // Maps to "fullName" in Entity

    private String department; // Maps to "dept" in Entity

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public EmployeeDTO(Long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
