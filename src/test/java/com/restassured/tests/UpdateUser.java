package com.restassured.tests;

import org.testng.annotations.Test;
import java.util.Map;
import com.restassured.base.FunctionalTest;
import com.restassured.constants.FrameworkConstants;
import com.restassured.constants.Responsecodes;
import com.restassured.utils.UpdateDataPayload;
import static io.restassured.RestAssured.*;

public class UpdateUser extends FunctionalTest{
	private UpdateUser() {}
	
	@Test
	public void updateUser() {
		Map<String,String> updatepayload=UpdateDataPayload.sendData("morph", "zion");
		given().body(updatepayload).when().put(FrameworkConstants.updateUser()).then().statusCode(Responsecodes.PUT).log().all();
	}
}
