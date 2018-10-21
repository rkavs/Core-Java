package com.datadriven.test;

import com.excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\Saurav Saha\\eclipse-workspace\\JavaTrainingSession\\src\\com\\testdata\\DataDriveTest.xlsx");
		
		if(!reader.isSheetExist("HomePage")) {
			reader.addSheet("HomePage");
		}
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println("Total cols present in RegTestData:==="+colCount);
		
		System.out.println(reader.getCellRowNum("RegTestData", "firstname", "Tom"));
		
		

	}

}
