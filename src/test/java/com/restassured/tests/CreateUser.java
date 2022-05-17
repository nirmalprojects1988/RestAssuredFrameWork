package com.restassured.tests;

import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.utils.CreateDataPayload;
import com.restassured.utils.ExtentReportsHelper;

import static io.restassured.RestAssured.*;
import java.util.Map;


public class CreateUser extends FunctionalTest {

	private CreateUser() {}
	
	
//	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//	Date date = new Date();
	

	/* send request using 
	 * i.e create user using map
	 * 
	 * 
	 * */
	Map<String,String> payload;
	@Test
	public void createUser() {
		 payload=CreateDataPayload.sendData("nirmal", "QA");
		given().body(payload).when().post(FrameworkConstants.createUser()).then().statusCode(Responsecodes.POST).log().all();
		ExtentReportsHelper.pass("Create User", "create user testcase is passed");
	}
	
	@AfterMethod
	public static void cleanUp(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			ExtentReportsHelper.fail(result.getName(), "Test has failed");
			}
		
			
	}
}
