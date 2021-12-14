package com.fdmgroup.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
	
	public WebDriver driver;
	
	//Singleton instance of driverUtilities 
	private static DriverUtilities driverUtilities;   //1 step
	private DriverUtilities() {                       //2 step
		super();
	}
	
	public static DriverUtilities getInstance() {     //3 step
		if(driverUtilities == null) {
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}
	
	public WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	private void createDriver() {
		String driverName = getDriverName();
		switch (driverName) {
		case "Google Chrome":
			System.setProperty("webdriver.chrome.driver", "chromedriver 3");
			this.driver = new ChromeDriver();
			break;

		case "Firefox" :
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			this.driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Invalid driver option!!");
			break;
		}
	}

	private String getDriverName() {
		Properties config = new Properties();
		String driverName = "";
		try {
			config.load(new FileInputStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String key : config.stringPropertyNames()) {
			if(key.equals("browser")) {
				driverName = config.getProperty(key);
			}
		}		
		return driverName;
	}
	
}




