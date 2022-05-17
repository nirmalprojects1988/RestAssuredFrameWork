package com.restassured.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.restassured.constants.ConfigProperties;
import com.restassured.constants.FrameworkConstants;

public final class ReadpropertyFile {
	private ReadpropertyFile() {}
	
	public static String readURI() throws IOException   {
		 FileReader reader=null;
		 Properties prop=null;
		try {
		String filepath=FrameworkConstants.getConfigfilepath();
		
		 reader=new FileReader(filepath);  
		 prop=new Properties();
		 prop.load(reader);
		 
		
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		finally {
			reader.close();
		}
		return prop.getProperty(String.valueOf(ConfigProperties.ENDPOINT)); 
	}
}
