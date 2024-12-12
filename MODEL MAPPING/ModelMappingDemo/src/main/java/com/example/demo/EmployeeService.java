package com.example.demo;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	 @Autowired
	 @Lazy						// To avoid circular dependency between ModelMapper and EmployeeService
	 private ModelMapper modelMapper;
	 
	 public Employee getEmpFromDTO ( EmployeeDTO dto)
	 {
		 return modelMapper.map(	dto	, Employee.class);
	 }
}
