package com.fdmgroup.test;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.pages.AddClassPage;
import com.fdmgroup.pages.PortalPage;
import com.fdmgroup.util.DriverUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddClassStepDef {
	
	DriverUtilities driverUtilities;
	WebDriver driver;
	
	@Before
    public void setup() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		
	}
	
	@When("I click the manage attendence button")
	public void clickManageAttendence()
	{
		PortalPage.getDropDownMenu(driver).click();
		PortalPage.getAddClassButton(driver).click();
	}
	
	@And("enter a valid class id {string} and submit")
	public void enterValidClassId(String id)
	{
		AddClassPage.getClassIdField(driver).sendKeys(id);
		AddClassPage.getSubmitButton(driver).click();
	}
	
	@Then("I should receive confirmation I was added to the class")
	public void confirmConfirmationMessage()
	{
		assertTrue(PortalPage.getAddedClassConfirmationMessage(driver).isDisplayed());
	}
	
	@And("enter an invalid class id {string} and submit")
	public void enterInvalidClassId(String id)
	{
		AddClassPage.getClassIdField(driver).sendKeys(id);
		AddClassPage.getSubmitButton(driver).click();
	}
	
	@Then("I should receive an error message")
	public void confirmErrorMessage()
	{
		assertTrue(PortalPage.getErrorMessage(driver).isDisplayed());
	}

}
