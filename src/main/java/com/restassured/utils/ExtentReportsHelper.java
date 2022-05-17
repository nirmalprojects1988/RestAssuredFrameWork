package com.restassured.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class  ExtentReportsHelper {

	protected static final  ExtentReports extent = new ExtentReports();
	protected static final  ExtentSparkReporter spark = new ExtentSparkReporter("Test Report/index.html");
	protected static ExtentTest test;
	public ExtentReportsHelper() {
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("API test report");
	}
	public static void pass(String testname,String message) {
		
		
		
		test=extent.createTest(testname);
		test.pass(message);
		

		
		
		}
	public static void fail(String testname,String message) {
		test=extent.createTest(testname);
		test.fail(message);
	}
	
	public static void cleanup() {
		extent.flush();
	}
	
	
}
