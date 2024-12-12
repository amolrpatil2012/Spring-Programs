package com.example.demo;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModelMappingDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ModelMappingDemoApplication.class, args);
	}
	 @Bean
	 ModelMapper modelMapper() {
	        
		 ModelMapper modelMapper = new ModelMapper();

	        // Custom mapping for mismatched fields
	        modelMapper.addMappings(new PropertyMap<Employee, EmployeeDTO>() {
	            @Override
	            protected void configure() {
	                map().setName(source.getFullName()); // Map "fullName" to "name"
	                map().setDepartment(source.getDept()); // Map "dept" to "department"
	            }
	        });

	        return modelMapper;
	    }
	 
	@Autowired
	EmployeeService service;
	@Override
	public void run(String... args) throws Exception {
	
		EmployeeDTO dto = new EmployeeDTO(1000l, "Amol", "IT");
		System.out.println("DTO Object " + dto);
		
		Employee emp = service.getEmpFromDTO(dto);
		System.out.println("Mapped Emp Object " + emp);
		
		
	}
}
