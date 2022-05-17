package com.restassured.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;

public class GetandValidateSingleJsonResponse extends FunctionalTest{
	
	private GetandValidateSingleJsonResponse() {
		super();
	}
	@Test
	public void ValidateSingleResponse() {
		given().
		queryParam(FrameworkConstants.queryparam(), FrameworkConstants.pagenumber()).
	when().
	get(FrameworkConstants.listofUsers()).
	then().body("data[0].id",equalTo(7)).
	statusCode(Responsecodes.GET).log().all();
	}

}
