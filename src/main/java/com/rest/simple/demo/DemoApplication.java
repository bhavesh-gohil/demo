package com.rest.simple.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	private int index = 1;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	 @RequestMapping("/")
	    public String index() {
	        return "Application count :" + index++;
	    }
	
}
