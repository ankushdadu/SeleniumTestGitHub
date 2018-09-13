package com.action.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;

public class FileDemo {
	
	private static Logger logger = Logger.getLogger("LoggerLogs");
	
	public static void main(String arg[]) throws IOException {
		FileReader file=null;
		try {
			file = new FileReader("C:\\temp\\copy1.txt");
			BufferedReader br = new BufferedReader(file);			
			String i;			
			while((i=br.readLine())!=null) {
				System.out.println(i);
			}			
			br.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			logger.debug("Test Manual");
			logger.warn("This is a warning message");
			logger.info("File not found");
			e.printStackTrace();
		}		
		
		FileWriter fw = new FileWriter("C:\\temp\\copy.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str = "tttttttttt e frd dftttttvsdf4cx ew";
		bw.append(str);
		
		bw.close();
		fw.close();
		
		FileReader file1 = new FileReader("C:\\temp\\copy.txt");
		BufferedReader br1 = new BufferedReader(file1);
		String i;
		while((i=br1.readLine())!=null) {
			System.out.println(i);
		}
		
		br1.close();
		file1.close();
		
	}

}
