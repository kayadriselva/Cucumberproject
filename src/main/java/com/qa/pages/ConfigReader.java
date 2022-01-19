package com.qa.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties prop;
	
	public Properties init_prop()
	{
		prop= new Properties();
		 
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\SecondProject\\src\\test\\resources\\config\\config.properties");
			prop.load(ip);
		}
		 catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		return prop;
		}
		
}

