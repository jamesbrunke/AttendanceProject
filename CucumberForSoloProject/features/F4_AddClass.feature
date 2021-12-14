Feature: Adding a class feature of the web App
	Scenario Outline: Entering in a valid class Id to the add class form and submitting should add me to the class
	Given I launch a web browser
	And I navigate to the url of the web application
	And I enter valid credentials
	When I click the manage attendence button
	And enter a valid class id '<id>' and submit
	Then I should receive confirmation I was added to the class 
	
	Examples: 
	|id|
	|3|
	|6|
	
	Scenario Outline: Entering in an invalid class Id to the add class form and submitting should give me an error
	Given I launch a web browser
	And I navigate to the url of the web application
	And I enter valid credentials
	When I click the manage attendence button
	And enter an invalid class id '<id>' and submit
	Then I should receive an error message
	
	Examples:
	|id|
	|100|
	|27|
