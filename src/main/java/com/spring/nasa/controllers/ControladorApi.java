package com.spring.nasa.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.nasa.model.dtos.DtoPhoto;
import com.spring.nasa.model.dtos.DtoApi;
import com.spring.nasa.model.services.IServiciosApiNasa;

@RestController()
@RequestMapping("api/v1/")
public class ControladorApi {
	
	//-- Variables globales
	public Map<String, Object> response=new HashMap<>();
	public List<DtoPhoto> listDtoPhoto=new ArrayList<>();
	
	
	//--Inyeccion de servicios
	@Autowired
	@Qualifier("serviciosApiNasa")
	private IServiciosApiNasa servicioApiNasa;
	

	
	
	
	@GetMapping("{nombreRobot}/listar")
	public ResponseEntity<?> listar(@PathVariable(required = true) String nombreRobot ){
		try {

			//-- Consumir servicio  y validar que no este vacia
			DtoApi datos=servicioApiNasa.listarFotos(nombreRobot);
			
			if (datos.getPhotos()==null) {
				this.response.put("mensaje", "Lista Vacia");
				return new ResponseEntity<Map<String, Object>>(this.response, HttpStatus.NO_CONTENT);
			}
			
			
			//----Convertir datos a ArrayList
			for (DtoPhoto dtoPhoto : datos.getPhotos()) {
				this.listDtoPhoto.add(dtoPhoto);
			}
			
			
			//---- Validar que no este vacia
			if (this.listDtoPhoto.isEmpty()) {
				this.response.put("mensaje", "Lista Vacia");
				return new ResponseEntity<Map<String, Object>>(this.response, HttpStatus.NO_CONTENT);
			}

			
			//-- Regresar respuesta
			return new ResponseEntity<List<DtoPhoto>>(this.listDtoPhoto, HttpStatus.OK);	
			
		} catch (Exception e) {
			this.response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(this.response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
