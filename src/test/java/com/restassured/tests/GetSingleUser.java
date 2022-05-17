package com.restassured.tests;

import org.testng.annotations.Test;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;

import static io.restassured.RestAssured.*;


public class GetSingleUser extends FunctionalTest {
	private GetSingleUser() {
		super();
	}
	
	@Test
	public void Getuserdetailsbyuserid() {
		given().when().get(FrameworkConstants.getSingleUser()).then().statusCode(Responsecodes.GET).log().all();
	}
}
