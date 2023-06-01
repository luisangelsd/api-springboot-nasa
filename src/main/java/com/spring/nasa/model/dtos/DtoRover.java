package com.spring.nasa.model.dtos;

import java.time.LocalDate;




public class DtoRover {
	

	public Integer id;
	public String name;
	public LocalDate landing_date;
	public LocalDate launch_date;
	public Boolean active;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getLanding_date() {
		return landing_date;
	}
	public void setLanding_date(LocalDate landing_date) {
		this.landing_date = landing_date;
	}
	public LocalDate getLaunch_date() {
		return launch_date;
	}
	public void setLaunch_date(LocalDate launch_date) {
		this.launch_date = launch_date;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	

}
