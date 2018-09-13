package com.action.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String arg[]) throws IOException {
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\test2.properties");
		FileInputStream fileInput = new FileInputStream(file);
		
		Properties properties = new Properties();
		properties.load(fileInput);
		fileInput.close();
		
		FileOutputStream fout = new FileOutputStream(file);
		properties.setProperty("text1", "Here we are");
		properties.store(fout, null);
		fout.close();
		Enumeration enuKeys = properties.keys();
		while(enuKeys.hasMoreElements()) {
			String key = (String)enuKeys.nextElement();
			String value = properties.getProperty(key);
			System.out.println(key+" : "+value);
		}
		
	}
}
