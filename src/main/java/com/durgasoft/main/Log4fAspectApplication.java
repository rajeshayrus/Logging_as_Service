package com.durgasoft.main;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4fAspectApplication {

	public static Logger log = Logger.getLogger(Log4fAspectApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4fAspectApplication.class, args);
	}

}
