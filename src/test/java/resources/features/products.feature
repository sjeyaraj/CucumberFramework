Feature: Products page

Scenario Outline: validate promocode alert is visible
	Given user navigates to "<url>" website
	When user clicks on "<button>"
	Then user should see the product alert
	
	Examples:
	|									url									| 				button 			|
	|http://www.webdriveruniversity.com/Page-Object-Model/products.html#	|#special-offers				|
	
	