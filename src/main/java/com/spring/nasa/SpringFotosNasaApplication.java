package com.spring.nasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringFotosNasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFotosNasaApplication.class, args);
	}

}
