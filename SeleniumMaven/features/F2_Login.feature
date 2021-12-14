Feature: Login to the web application
	Scenario: Entering valid credentials and clicking submit should send me to the user portal page
	Given I launch a web browser
	And I navigate to the url of the web application
	When I enter valid credentials
	Then I should land on the user portal page
	
