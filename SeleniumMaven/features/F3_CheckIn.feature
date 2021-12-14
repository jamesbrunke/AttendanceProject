Feature: Checkin feature of the web application 
	Scenario: Clicking the check in button when I have a class that day should result in a confirmation that I checked in
	Given I launch a web browser
	And I navigate to the url of the web application
	And I enter valid credentials
	When I click the check-in button
	Then I should see a message confirming I checked in