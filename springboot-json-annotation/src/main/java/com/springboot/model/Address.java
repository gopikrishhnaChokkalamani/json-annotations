package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

@JsonIgnoreType
public class Address {

	public String address1 = "123 abc";
	public String address2 = "456 def";
	public String city = "qwerty";
	public String state = "AC";
}
