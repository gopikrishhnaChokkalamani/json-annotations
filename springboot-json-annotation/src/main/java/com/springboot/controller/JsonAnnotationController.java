package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.AutoMobile;
import com.springboot.model.Car;
import com.springboot.model.JsonAutoDetectModel;
import com.springboot.model.JsonIgnoreModel;
import com.springboot.model.MyJsonAnyGetter;
import com.springboot.model.MyJsonGetter;
import com.springboot.model.MyJsonInclude;

@RestController
@RequestMapping("/json-annotations")
public class JsonAnnotationController {

	@GetMapping("/allJsonIgnore")
	public ResponseEntity<JsonIgnoreModel> getJsonIgnoreModel() {
		// @JsonIgnore
		// @JsonIgnoreProperties
		// @JsonIgnoreType
		JsonIgnoreModel model = new JsonIgnoreModel();
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@GetMapping("/jsonAutoDetect")
	public ResponseEntity<JsonAutoDetectModel> getJsonAutoDetectModel() {
		// @JsonAutoDetect
		JsonAutoDetectModel model = new JsonAutoDetectModel();
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@GetMapping("/jsonInclude")
	public ResponseEntity<MyJsonInclude> getJsonIncludeModel() {
		// @JsonInclude
		MyJsonInclude model = new MyJsonInclude(null, "john", "male", null, "12345");
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@GetMapping("/jsonGetter")
	public ResponseEntity<MyJsonGetter> getJsonGetter() {
		// @JsonGetter
		// @JsonPropertyOrder
		// @JsonRawValue
		// @JsonProperty
		MyJsonGetter model = new MyJsonGetter(null, "john", "male", "{\"somefield\":\"somevalue\"}", "12345",
				"theField");
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@GetMapping("/jsonAnyGetter")
	public ResponseEntity<MyJsonAnyGetter> getJsonAnyGetter() {
		// @JsonAnyGetter
		MyJsonAnyGetter model = new MyJsonAnyGetter();
		model.setName("john");
		Map<String, String> tempMap = new HashMap<>();
		tempMap.put("someField", "someValue");
		tempMap.put("anotherField", "anotherValue");
		model.setProperties(tempMap);
		return new ResponseEntity<>(model, HttpStatus.OK);
	}

	@PostMapping("/jsonTypeInfo")
	public String postJsonTypeInfoExample(@RequestBody AutoMobile autoMobile) {
		// @JsonTypeInfo
		// @JsonSubTypes
		// @JsonTypeName

		// Try sending this request,
		/*
		 * { "name": "name", "vehicle": { "type": "car", "car_name": "car name",
		 * "car_type": "car type" } }
		 */

		if (autoMobile.getVehicle() instanceof Car) {
			Car car = (Car) autoMobile.getVehicle();
			System.out.println(car.getCar_name());
			System.out.println(car.getCar_type());
		}

		// Now try sending the bike_name and bike_type and change type to bike instead
		// of car_name and car_type.
		// Modify the code to get Bike object and observe... pretty cool right...
		return "inspect & see console to see how it works";
	}
}
