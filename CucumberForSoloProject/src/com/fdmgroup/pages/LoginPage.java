package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebElement getUsernameField(WebDriver driver)
	{
		return driver.findElement(By.name("username"));
	}
	
	public static WebElement getPasswordField(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement getSubmitButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type = 'Submit']"));
	}

}
