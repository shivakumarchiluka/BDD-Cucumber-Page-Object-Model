package com.qa.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {
	
	

	private Properties prop;

	/**
	 * This method is used to load the properties from config.properties file
	 * @return 
	 * @return it returns Properties prop object
	 */
	public Properties init_prop() {

		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\HybridCucumber\\src\\test\\resources\\configuration\\properties\\properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;

}
}
