package com.fdmgroup.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalPage {
	
	public static WebElement getLogoutButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Logout"));
	}
	
	public static WebElement getNextSession(WebDriver driver)
	{
		return driver.findElement(By.xpath("/html/body/div[3]/p[2]"));
	}
	
	public static WebElement getDropDownMenu(WebDriver driver)
	{
		return driver.findElement(By.className("DropDownMenu"));
	}
	
	public static WebElement getCheckInButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Check-In"));
	}
	
	public static WebElement getConfirmationMessage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[contains(text(),'check into')]"));
	}
	
	public static WebElement getManageAttendanceButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Manage Attendance"));
	}
	
	public static WebElement getAddClassButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Add Class"));
	}
	
	public static WebElement getAddedClassConfirmationMessage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[contains(text(),'Successfully')]"));
	}
	
	public static WebElement getErrorMessage(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[contains(text(),'No such class')]"));
	}
	

}
