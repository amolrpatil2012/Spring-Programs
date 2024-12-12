package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogExample {

    private static final Logger logger = LoggerFactory.getLogger(LogExample.class);

    public void generateLogs() {
        logger.info("This is an INFO log");
        logger.debug("This is a DEBUG log");
        logger.warn("This is a WARN log");
        logger.error("This is an ERROR log");
    }
}