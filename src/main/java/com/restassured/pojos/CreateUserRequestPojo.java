package com.restassured.pojos;

public class CreateUserRequestPojo {

	
	
	private String name;
	private String job;
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job=job;
	}
}
