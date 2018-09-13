package com.action.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExample {

	private static XSSFWorkbook excelWBook;
	private static XSSFSheet excelWSheet;
	private static XSSFRow row;
	private static XSSFCell cell;
	
	static String system_path = System.getProperty("user.dir");	
	
	public static void main(String arg[]) throws IOException {
		System.out.println("system_path : "+system_path);
		
		FileInputStream fin = new FileInputStream(new File("C:\\Users\\training_d5.01.02\\Desktop\\emp.xlsx"));
		excelWBook = new XSSFWorkbook(fin);
		excelWSheet = excelWBook.getSheet("Sheet1");
		cell = excelWSheet.getRow(1).getCell(0);
		
		//System.out.println(cell.);
	}
}
