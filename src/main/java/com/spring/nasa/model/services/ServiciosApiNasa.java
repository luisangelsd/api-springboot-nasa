package com.spring.nasa.model.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.nasa.model.dtos.DtoApi;

@Service("serviciosApiNasa")
public class ServiciosApiNasa implements IServiciosApiNasa {

	//-- Inyeccion de servicio OpenFeing
	@Autowired
	private IServiciosOpenFeingApiNasa feingApiNasa;
	
	
	@Override
	public DtoApi listarFotos(String nombreRobot) throws Exception {
		return this.feingApiNasa.listarFotos(nombreRobot);
	}
	
	

}
