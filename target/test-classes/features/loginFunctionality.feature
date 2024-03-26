Feature: User Login Tests


Background: User must be on the login page
		Given the user has navigated to the login page


@smokeTest
Scenario: Successful login with valid credentials
		When the user enters the correct username and password
		And the user clicks on the login button
		Then the user is redirected to the homepage
		And a welcome message is displayed
		
@smokeTest @otherTag
Scenario: Unsuccessful login with invalid credentials
		When the user enters an incorrect username or password
		And the user clicks on the login button
		Then an error message is displayed
		
Scenario: Forgot password link
		When the user clicks on the "Forgot Password" link
		Then the user is redirected to the password rocovery page		

@otherTag
Scenario: Hello World
		When Testing this scenario for the new feature steps
		Then its all about the cookie	


