package com.spring.nasa.model.services;



import com.spring.nasa.model.dtos.DtoApi;

public interface IServiciosApiNasa {

	public DtoApi listarFotos(String nombreRobot) throws Exception;
	
}
