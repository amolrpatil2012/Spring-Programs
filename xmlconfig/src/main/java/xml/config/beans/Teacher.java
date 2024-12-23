package xml.config.beans;

import java.util.Map;

public class Teacher {

	String name;
	Map<String, Course> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Course> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Course> courses) {
		this.courses = courses;
	}
	public Teacher(String name, Map<String, Course> courses) {
		super();
		this.name = name;
		this.courses = courses;
	}
	
	public Teacher() {}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", courses=" + courses + "]";
	}
	
}
