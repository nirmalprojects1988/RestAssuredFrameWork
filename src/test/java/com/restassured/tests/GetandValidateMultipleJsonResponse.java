package com.restassured.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;

public class GetandValidateMultipleJsonResponse extends FunctionalTest{

	private GetandValidateMultipleJsonResponse() {
		super();
	}
	
	
	@Test
	public void ValidateMultipleResponse() {
		//Refactor the emailids from the excel or json
		given().
		queryParam(FrameworkConstants.queryparam(), FrameworkConstants.pagenumber()).
		when().
	get(FrameworkConstants.listofUsers()).
	then().body("data.email", hasItems("lindsay.ferguson@reqres.in","tobias.funke@reqres.in")).
	statusCode(Responsecodes.GET).log().all();
		
	}
}
