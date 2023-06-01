package com.spring.nasa.model.services;




import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.nasa.model.dtos.DtoApi;

@FeignClient(name = "API.NASA", url = "https://api.nasa.gov/")
public interface IServiciosOpenFeingApiNasa {
	
	@GetMapping("mars-photos/api/v1/rovers/{robot}/photos?sol=1000&api_key=SGOXgk9N8ZF7amvF0CvanZne1pdDKSAqqYNoqSvG")
	public DtoApi listarFotos(@PathVariable( name = "robot") String robot ) throws Exception;	

}
