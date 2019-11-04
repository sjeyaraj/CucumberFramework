Feature: Submit data to webdriveruniversity.com using contact us form

Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity contact us form
	When I enter a valid firstname
	And I enter a valid last name
	| woods | jackson | jones |
	And I enter a valid email address
	And I enter some comments
	| Comment One | Comment two |
	And I click the submit button
	Then entered comment should be submitted successfully
	