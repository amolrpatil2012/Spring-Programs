package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String getHelloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping("/")
    public String home() {
        return "hello"; // Spring Boot automatically looks for index.html in the static folder
    }
	
	 @GetMapping("/greetingForm")
	    public String showForm() {
	        return "greetingForm"; // Renders the greetingForm.html template
	    }

	    @PostMapping("/greet")
	    public String greetUser(@RequestParam("name") String name, Model model) {
	        model.addAttribute("name", name); // Pass the name to the template
	        return "greeting"; // Renders the greeting.html template
	    }
	    
	    
	    @GetMapping("register")
	    public String userRegistrationPage(Model model){
	        // Empty UserForm model object to store form data
	        User user = new User();
	        model.addAttribute("user", user);

	        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
	        model.addAttribute("listProfession", listProfession);
	        return "register";
	    }   
	    
	    @PostMapping("register/save")
	    public String submitForm(Model model,
	                             @ModelAttribute("user") User userForm){
	        model.addAttribute("userForm", userForm);
	        return "success";
	    }
}
