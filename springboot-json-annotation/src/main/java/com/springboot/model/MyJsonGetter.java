package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;


@JsonPropertyOrder({ "zipCode", "age", "name", "id", "gender" })
public class MyJsonGetter {

	private String id;
	private String name;
	private String gender;
	private String age;
	private String zipCode;
	@JsonRawValue
	public String json = "{\"somefield\":\"somevalue\"}";
	private String theField;

	public MyJsonGetter(String id, String name, String gender, String age, String zipCode, String theField) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.zipCode = zipCode;
		this.theField = theField;
	}

	@JsonGetter(value = "student-id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonGetter(value = "student-name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	// Non Standard Getter and Setter
	
	@JsonProperty("theField")
	public String getTheFieldValue() {
		return theField;
	}

	@JsonProperty("theField")
	public void setTheFieldValue(String theField) {
		this.theField = theField;
	}

}
