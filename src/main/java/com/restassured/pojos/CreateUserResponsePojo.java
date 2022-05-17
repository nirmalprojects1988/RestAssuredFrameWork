package com.restassured.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResponsePojo {

	
	private String id;
	private String createdAt;
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getcreatedAt() {
		return this.createdAt;
	}
	public void setcreatedAt(String createdAt) {
		this.createdAt=createdAt;
	}
	
}
