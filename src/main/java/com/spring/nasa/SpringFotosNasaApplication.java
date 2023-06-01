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

	/*Descripcion:
	 En este proyecto buscaba conectarme a una api externa para obtener los datos y regresarnos de una forma distinta utilizando OpenFeing
	 
	 
	 Pasos:
	 	
	 	1) Añadir dependencias:
	 		OpenFeing
	 		
	 	2)  Agregar @EnableFeingClients en Main Principal

		3) Crea la clase "ApiNasaConfig"
		
		4) Configure clase: IServiciosOpenFeingApiNasa
		
		5) Configure las class DTOS
		
		6) Crear una Interfaz y en base a ella cree los servicios
			IServiciosApiNasa
			ServiciosApiNasa	
		
		7) Configure controlador
	 
	 * */
}
