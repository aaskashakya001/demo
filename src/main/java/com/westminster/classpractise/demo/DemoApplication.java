package com.westminster.classpractise.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class DemoApplication {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot!";
	}
	@GetMapping("/status")
	public String status() {
		return "API running — " + LocalDate.now().toString();

		public static void main(String[] args) {
		    SpringApplication.run(DemoApplication.class, args);
	}

}
