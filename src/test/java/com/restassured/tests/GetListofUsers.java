package com.restassured.tests;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;


public class GetListofUsers extends FunctionalTest{

	private GetListofUsers() {
		super();
	}
	@Test
	public void getListofUsers() {

	given().
		queryParam(FrameworkConstants.queryparam(), FrameworkConstants.pagenumber()).
	when().
	get(FrameworkConstants.listofUsers()).
	then().
	statusCode(Responsecodes.GET).log().all();
		
	}
}
