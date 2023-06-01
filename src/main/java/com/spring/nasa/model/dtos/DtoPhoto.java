package com.spring.nasa.model.dtos;

import java.time.LocalDate;



public class DtoPhoto {
	
	private Integer id;
	private Integer sol;
	private DtoCamera camera;
	private String img_src;
	private LocalDate earth_date;
	private DtoRover rover;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSol() {
		return sol;
	}
	public void setSol(Integer sol) {
		this.sol = sol;
	}
	public DtoCamera getCamera() {
		return camera;
	}
	public void setCamera(DtoCamera camera) {
		this.camera = camera;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public LocalDate getEarth_date() {
		return earth_date;
	}
	public void setEarth_date(LocalDate earth_date) {
		this.earth_date = earth_date;
	}
	public DtoRover getRover() {
		return rover;
	}
	public void setRover(DtoRover rover) {
		this.rover = rover;
	}
	
	

}
