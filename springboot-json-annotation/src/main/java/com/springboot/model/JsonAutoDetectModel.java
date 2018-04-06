package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PUBLIC_ONLY)
public class JsonAutoDetectModel {

	public String id = "a10";
	private String name = "John";
	public String gender = "male";
	private String age = "10";
	public String zipCode = "12345";

}
