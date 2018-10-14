package com.jenkinsInteg.Dev.Development;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DevelopmentApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(DevelopmentApplication.class);
		logger.debug("Inside DevelopmentApplication");
		SpringApplication.run(DevelopmentApplication.class, args);
		logger.debug("after sprin boot run appl DevelopmentApplication****************************************");



	}
}
