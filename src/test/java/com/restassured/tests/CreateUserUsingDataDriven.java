package com.restassured.tests;

import org.testng.annotations.Test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.utils.CreateDataPayload;
import com.restassured.utils.ExcelFileReader;
import com.restassured.utils.ExtentReportsHelper;
import static io.restassured.RestAssured.*;
import java.util.Map;


public class CreateUserUsingDataDriven extends FunctionalTest {

	private CreateUserUsingDataDriven() {}
	

	Map<String,String> payload;
	@Test(dataProvider="getData1",dataProviderClass =ExcelFileReader.class)
	public void createUser(Map<String , String> map) {
		
		 payload=CreateDataPayload.sendData(map.get("name"), map.get("job"));
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
