package com.aPractice.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Configuration_Reader {

	
	public static Properties p;
	
	
	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Madhan\\eclipse-workspace\\AutomationPractice_Project\\src\\test\\java\\com\\practice\\property\\configuration.properties");

		FileInputStream file = new FileInputStream(f);
		 p = new Properties();
		 p.load(file);
	}
	
	public String get_browser() {
		String browser = p.getProperty("browser");

		return browser;
	}
	
	public String get_Url() {
		 String url = p.getProperty("url");
		 return url;
	}

}
