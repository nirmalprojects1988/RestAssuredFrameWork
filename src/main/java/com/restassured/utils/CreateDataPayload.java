package com.restassured.utils;

import java.util.HashMap;
import java.util.Map;

public final class CreateDataPayload {
	
	private CreateDataPayload() {}
	
	public static Map<String,String> sendData(String name,String job) {
		Map<String,String> createuserdata=new HashMap<String,String>();
		createuserdata.put("name", name);
		createuserdata.put("Job", job);
		return createuserdata;
	}

}
