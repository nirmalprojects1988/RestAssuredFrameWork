package com.restassured.utils;

import java.util.HashMap;
import java.util.Map;

public class UpdateDataPayload {
	
	private UpdateDataPayload() {}
	
	public static Map<String,String> sendData(String name,String job) {
		Map<String,String> updateuserdata=new HashMap<String,String>();
		updateuserdata.put("name", name);
		updateuserdata.put("Job", job);
		return updateuserdata;
	}
}
