package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddClassPage {
	
	public static WebElement getClassIdField(WebDriver driver)
	{
		return driver.findElement(By.name("classId"));
	}
	
	public static WebElement getSubmitButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@type='submit']"));
	}
	
	

}
