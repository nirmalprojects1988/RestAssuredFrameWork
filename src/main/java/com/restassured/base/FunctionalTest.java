package com.restassured.base;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.restassured.utils.ExtentReportsHelper;
import com.restassured.utils.ReadpropertyFile;

public class FunctionalTest extends ExtentReportsHelper{

	


	@BeforeClass
	public static void setup() {
		try {
			baseURI=ReadpropertyFile.readURI();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public static void cleanup() {
		ExtentReportsHelper.cleanup();
	}
	
}
