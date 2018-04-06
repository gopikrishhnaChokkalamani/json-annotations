package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "age", "zipCode" })
public class JsonIgnoreModel {
	@JsonIgnore
	public String id = "a10";
	public String name = "John";
	public String gender = "male";
	public String age = "10";
	public String zipCode = "12345";
	public Address address = new Address();
}
