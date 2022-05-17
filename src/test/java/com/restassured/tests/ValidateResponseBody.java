package com.restassured.tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.util.Map;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.pojos.CreateUserResponsePojo;
import com.restassured.utils.CreateDataPayload;
import com.restassured.utils.ExtentReportsHelper;
import com.restassured.utils.ResponseParser;



public class ValidateResponseBody extends FunctionalTest{
	
	
	private ValidateResponseBody() {}
	
	
	Map<String,String> payload;
	@Test
	public void validateResponse() throws JsonMappingException, JsonProcessingException {
		payload=CreateDataPayload.sendData("nirmal", "QA");
		String responsebody=given().body(payload).when().post(FrameworkConstants.createUser()).then().extract().asPrettyString();
		CreateUserResponsePojo response=ResponseParser.parseResponse().readValue(responsebody, CreateUserResponsePojo.class);
		System.out.println(response.getId());
		System.out.println(response.getcreatedAt());
		ExtentReportsHelper.pass("Validate Response", "Validate response case is passed");
		
	}
	
	@AfterMethod
	public static void cleanUp(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			ExtentReportsHelper.fail(result.getName(), "Test has failed");
			}
		
			
	}

}
