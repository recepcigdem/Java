package com.denemeProje.denemeProje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class DenemeProjeApplication {

	@CrossOrigin(origins = "*")
	public static void main(String[] args) {
		SpringApplication.run(DenemeProjeApplication.class, args);
	}

}
