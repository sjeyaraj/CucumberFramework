Feature: Air Asia Landing page
@airasia
Scenario Outline: User searches flights
	Given User navigates given "<url>"
	And verify its title
	And click on Flights icon
	And Enter Origin as "<source>", Destination as "<destination>"
	And Select Depart date as "<departDate>"
	And Select Return date as One Way
	When user clicks on Search Btn
	Then user should be navigated to search flight page
	
	Examples: 
	| 					url	 				| source		|	destination | departDate |
	|https://www.airasia.com/en/home.page 	|  Bangalore     |      Pune	| 30/11/2019  |
		
@airasia
Scenario Outline: User login with invalid username
	Given User navigates given "<url>"
	And verify its title
	And click on login button
	And enter username as "<username>"
	And enter password as "<password>"
	When click on sign In button
	Then Verify that error message is displayed on screen in red and contains the text “Your log in attempt has been unsuccessful.”

	
	Examples:
	|				url 					| username 	|password	|
	|https://www.airasia.com/en/home.page 	|a@gmail.com|India@1234	|
	

@travel
Scenario Outline:User Registration

	Given Navigate to homepage of http://newtours.demoaut.com/mercurywelcome.php
	And Click on the register link
	And Enter First name as "<firstName>"
	And Enter Last Name as "<lastName>"
	And Enter PhoneEnter Email "<email>"
	And Enter address "<address>"
	And Enter city "<city>"
	And Enter State "<state>"
	And Enter Postal Code "<pinCode>"
	And Select Country india
	And Enter Username of your choice "<username>"
	And Enter password "<password>"
	And Enter same password in confirm password field as "<password>"
	When Click on submit
	Then User registration should be successful
	
	Examples:
	|firstName	|lastName	|email							|	address				|city		|state	|pincode|username						|password	|
	|Liam	  	|Lucas		|	lucas_cucufw01@gmail.com	| 	liam street			|Bangalore	|KA		|100001	|Ulucas_cucufw01@gmail.com		|Test123$	|
	|Michael	|Joseph		|	joseph_cucufw01@gmail.com	| 	michael street		|Delhi		|DL		|200002	|Ujoseph_cucufw01@gmail.com		|Test123$	|
	|Alexander	|Jackson	|	jackson_cucufw01@gmail.com	| 	alexandar street	|Chennai	|TN		|300003	|Ujackson_cucufw01@gmail.com	|Test123$	|
	|Ethan		|Noah		|	noah_cucufw01@gmail.com		|	ethan street		|Mumbai		|MP		|400004	|Unoah_cucufw01@gmail.com		|Test123$	|
	|Daniel		|William	|	william_cucufw01@gmail.com	|	daniel street		|Pune		|MP		|500005	|Uwilliam_cucufw01@gmail.com	|Test123$	|
	|Matthew	|James		|	james_cucufw01@gmail.com	|	matthew street		|Trichy		|TN		|600006	|Ujames_cucufw01@gmail.com		|Test123$	|
	|Aiden		|Logan		|	logan_cucufw01@gmail.com	|	aiden street		|Goa		|GA		|700007	|Ulogan_cucufw01@gmail.com		|Test123$	|
	|Henry		|Benjamin	|	benjamin_cucufw01@gmail.com	|	henry street		|Hydrabhad	|AP		|800008	|Ubenjamin_cucufw01@gmail.com	|Test123$	|
	|Mason		|Oliver		|	oliver_cucufw01@gmail.com	|	mason street		|Cochin		|KL		|900009	|Uoliver_cucufw01@gmail.com		|Test123$	|
	|Elijah		|Jacob		|	jacob_cucufw01@gmail.com	|	elijah street		|Kolkata	|WB		|110011	|Ujacob_cucufw01@gmail.com		|Test123$	|


@automationPractice
Scenario Outline: User Registration in Automation Practice
	Given Navigate to http://automationpractice.com/index.php
	And Click on Sign In Button
	And In email address pass a valid email id as "<email>"
	And Click on Register
	And Validate you are on the registration page
	And Select the title radiobox as "<title>"
	And Enter first name as "<firstname>"
	And Enter last name as "<lastname>"
	And Enter password	"<password>"
	And Select date "<date>",month"<month>" and year"<year>" of birth
	And Enter Address "<address>"
	And Enter City "<city>"
	And Select country "<country>"
	And Select state "<state>"
	And Enter postal code "<postalcode>"
	And Enter Mobile Phone "<mobile>"
	And Click on Register button
	And Validate that you are successfully registered


Examples:
	|title	|firstName	|lastName	|email							|	address				|city		|state		|pincode|username						|password	|date	|month	|year	|mobile		|country|
	|Mr		|Liam	  	|Lucas		|	lucas_cucufw01@gmail.com	| 	liam street			|Bangalore	|Texas		|78727	|Ulucas_cucufw01@gmail.com		|Test123$	|01		|11		|1980	|9109109109	|United States|
	|Mrs	|Michael	|Joseph		|	joseph_cucufw01@gmail.com	| 	michael street		|Delhi		|New Jersey	|07859	|Ujoseph_cucufw01@gmail.com		|Test123$	|02		|12		|1981	|9109109108	|United States|
	|Mr		|Alexander	|Jackson	|	jackson_cucufw01@gmail.com	| 	alexandar street	|Chennai	|Georgia	|30003	|Ujackson_cucufw01@gmail.com	|Test123$	|03		|01		|1982	|9109109107	|United States|
	





