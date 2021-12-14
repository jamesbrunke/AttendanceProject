Feature: Launching the application from a web browser
	Scenario: Launching a browser and navigating to the applications url should open the login page of the application
	Given I launch a web browser
	When I navigate to the url of the web application
	Then I should land on the login page 
