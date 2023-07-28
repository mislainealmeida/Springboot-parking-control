package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@SpringBootApplication
@RestController//saber que sera bean do tipo controler e ser gerado as dependencias quando necessario
public class ParkingControlApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ParkingControlApplication.class, args); porta 8080
		SpringApplication app = new SpringApplication( ParkingControlApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
		app.run(args);
	}

	@GetMapping("/")
	public String index(){
		return "Olá Mundo!";
	}
}
