package com.devops.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.*;

@SpringBootApplication
public class Application {
	
	public static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("This is for Jenkins Testing");
		SpringApplication.run(Application.class, args);
	}

}
