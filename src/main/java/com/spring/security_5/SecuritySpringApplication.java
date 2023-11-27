package com.spring.security_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SecuritySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuritySpringApplication.class, args);
	}

	@RestController
	class HttpController{

		@GetMapping("/public")
		public String publicRoute(){
			return "<h1> Public route, feel free to look around! 🔓 </h1>";
		}

		@GetMapping("/private")
		public String privateRoute(){
			return "<h1> private </h1>";
		}
	}

}
