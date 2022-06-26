package com.eazego.www.EazeGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


@RestController
public class EazeGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EazeGoApplication.class, args);
	}
	
	
	@GetMapping(value="api/v1/hello")
	public String hello() {
		
		return "hellow ";
	}
		

}
