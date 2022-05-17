package com.restassured.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.pojos.CreateUserRequestPojo;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class CreateUserUsingPojo extends FunctionalTest {

	private CreateUserUsingPojo() {}
	
	@Test
	public void createUser() {
		CreateUserRequestPojo payload=new CreateUserRequestPojo();
		payload.setName("Nirmal");
		payload.setJob("Dev");
		
		Response response=
		given().body(payload).when().post(FrameworkConstants.createUser());
		
		AssertJUnit.assertEquals(response.statusCode(), Responsecodes.POST);
	}
}
