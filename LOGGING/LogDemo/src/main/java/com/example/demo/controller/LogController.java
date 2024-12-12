package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	 private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	    @GetMapping("/log")
	    public String logExample() {
	        logger.info("INFO log message");
	        logger.debug("DEBUG log message");
	        logger.error("ERROR log message");

	        return "Logs written successfully!";
	    }
}
