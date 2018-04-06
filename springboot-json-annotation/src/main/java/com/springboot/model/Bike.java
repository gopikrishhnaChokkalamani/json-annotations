package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("bike")
public class Bike extends Vehicle {
	
	private String bike_name;
	private String bike_type;
	
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getBike_type() {
		return bike_type;
	}
	public void setBike_type(String bike_type) {
		this.bike_type = bike_type;
	}
	
	
}
