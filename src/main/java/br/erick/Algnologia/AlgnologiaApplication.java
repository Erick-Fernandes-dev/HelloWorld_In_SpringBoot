package br.erick.Algnologia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AlgnologiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgnologiaApplication.class, args);
		
	}
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello world";
	}

}
