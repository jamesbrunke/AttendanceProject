package com.fdmgroup.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaunchAppStepDef {
	
	DriverUtilities driverUtilities;
	WebDriver driver;
	
	@Given("I launch a web browser")
	public void launchBrowser()
	{
		driverUtilities=DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
	}
	
	@When("I navigate to the url of the web application")
	public void openWebApp()
	{
		driver.get(DataFile.homeURL);
	}
	
	@Then("I should land on the login page")
	public void confirmLoginPage()
	{
		assertTrue(LoginPage.getUsernameField(driver).isDisplayed());
	}

}
