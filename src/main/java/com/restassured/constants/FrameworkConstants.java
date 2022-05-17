package com.restassured.constants;

public final class FrameworkConstants {

		private FrameworkConstants() {
			
		}
		private static final String LIST_USERS="users";
		private static final String PARAMVALUE="page";
		private static final int PAGE=2;
		private static final String SINGLE_USER_URI="users/2";
		private static final String CREATE_USER_URI=LIST_USERS;
		private static final String UPDATE_USER_URI=SINGLE_USER_URI;
		private static final String RESOURCEPATH=System.getProperty("user.dir")+"/src/test/resources";
		private static final String CONFIGFILEPATH=RESOURCEPATH+"/config/Framework.properties";
		private static final String EXCEL_FILE_PATH=RESOURCEPATH+"/Data/UserData.xlsx";
		

		public static String getConfigfilepath() {
			return CONFIGFILEPATH;
		}
		
		public static String queryparam() {
			return PARAMVALUE;
		}
		public static int pagenumber() {
			return PAGE;
		}
		public static String listofUsers() {
			return LIST_USERS;
		}
		
		public static String getSingleUser() {
			return SINGLE_USER_URI;
		}
		
		public static String createUser() {
			return CREATE_USER_URI;
		}
		public static String updateUser() {
			return UPDATE_USER_URI;
		}
		public static String getExcelFilePath() {
			return EXCEL_FILE_PATH;
		}
		
		
		
}
