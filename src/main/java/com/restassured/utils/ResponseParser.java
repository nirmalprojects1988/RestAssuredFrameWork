package com.restassured.utils;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseParser {
	
	private ResponseParser() {}
	@SuppressWarnings("deprecation")
	public static ObjectMapper parseResponse(){
	ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		return objectMapper;
	}

}
