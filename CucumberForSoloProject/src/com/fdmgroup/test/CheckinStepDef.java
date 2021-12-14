package com.fdmgroup.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.PortalPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckinStepDef {
	
	DriverUtilities driverUtilities;
	WebDriver driver;
	
	@Before
    public void setup() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
	}
	
	@When("I click the check-in button")
	public void checkIn()
	{
		PortalPage.getDropDownMenu(driver).click();
		PortalPage.getCheckInButton(driver).click();
		
	}
	
	@Then("I should see a message confirming I checked in")
	public void confirmCheckin()
	{
		assertTrue(PortalPage.getConfirmationMessage(driver).isDisplayed());
	}

}
