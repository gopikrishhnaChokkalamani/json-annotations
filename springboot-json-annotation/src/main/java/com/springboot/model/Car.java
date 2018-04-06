package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("car")
public class Car extends Vehicle {

	private String car_name;
	private String car_type;

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}

	public String getCar_type() {
		return car_type;
	}

	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}

}
