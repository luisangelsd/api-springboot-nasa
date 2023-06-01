package com.spring.nasa.model.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.nasa.ApiNasaConfig;
import com.spring.nasa.model.dtos.DtoApi;

//-- Name: Puede ser cualquiera
//-- url: Url api a conectarme
//-- ApiNasaConfig.keyNasa: Este es una llave de acceso que necesita la api

@FeignClient(name = "API.NASA", url = "https://api.nasa.gov/")
public interface IServiciosOpenFeingApiNasa {
	
	//-- Aquí programe el metodo al cual queria conectarme, respuesta si es GET, POST, etc
	@GetMapping("mars-photos/api/v1/rovers/{robot}/photos?sol=1000&api_key="+ApiNasaConfig.keyNasa)
	public DtoApi listarFotos(@PathVariable( name = "robot") String robot ) throws Exception;	

}
