package com.fdmgroup.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.data.DataFile;
import com.fdmgroup.pages.LoginPage;
import com.fdmgroup.pages.PortalPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	DriverUtilities driverUtilities;
	WebDriver driver;
	
	@Before
    public void setup() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
	}
	
	@When("I enter valid credentials")
	public void enterCredentials()
	{
		LoginPage.getUsernameField(driver).sendKeys(DataFile.validUsername);
		LoginPage.getPasswordField(driver).sendKeys(DataFile.validPassword);
		LoginPage.getSubmitButton(driver).click();
	}
	
	@Then("I should land on the user portal page")
	public void confirmPortalPage()
	{
		assertTrue(PortalPage.getLogoutButton(driver).isDisplayed());
	}
}
