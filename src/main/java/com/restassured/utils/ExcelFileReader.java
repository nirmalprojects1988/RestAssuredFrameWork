package com.restassured.utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.restassured.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelFileReader {
	
	
	@Test(dataProvider="getData1")
	public void test2(Map<String , String> map) {
		System.out.println(map.get("name"));
		System.out.println(map.get("job"));
	}
	@DataProvider
	public static Object[] getData1() throws IOException {
		FileInputStream fs = new FileInputStream(FrameworkConstants.getExcelFilePath());
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Data");
		
		int rownum = sheet.getLastRowNum();
		int columnnum = sheet.getRow(0).getLastCellNum();
		
		Object[] data = new Object[rownum];
		Map<String, String> map ;
		
		for(int i=1;i<= rownum ;i++) {
			map = new HashMap<String, String>();
			for(int j=0;j<columnnum ;j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value= sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1]= map;
			}
		}
		return data;
		
	}
}
