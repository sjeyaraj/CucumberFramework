Feature: Login into account
	Login with an existing user account

Scenario: Log into with valid user name
	Given User launches website
	And User clicks on login button
	And User enters a valid username
	And User enters a valid password
	When User clicks on the login button
	Then User should be taken to home page