Feature: User is able to Test the Lumens application

@Test1
Scenario: Verify  User is able to Create an account in Lumens application

	Given launch the lumens website using property file
	When  Go to  Account and Select My Account 
	Then enter the given details in the input field and click submit
	

@Test2
Scenario: Verify user is able to Login Lumens  application

	Given launch the lumens website using property file
	When Go to  Account and Select My Account 
	Then enter the valid credentails and submit 
	
@Test3
Scenario: Verify title of the Lumens application 

	Given launch the lumens website using property file
	When Go to  Account and Select My Account 
	Then enter the valid credentails and submit 
	Then  verify the title of lumens page 
	
@Test11
Scenario: Verify the product able to select spcefic product
	Given launch the lumens website using property file
	When Go to  Account and Select My Account 
	Then enter the valid credentails and submit 
	Then Selcted Product and click on cart in HomePage
	
	
	
@Test13  	
Scenario: Verify scroll up, scroll down action on HomePage
    Given launch the lumens website using property file
	When Go to  Account and Select My Account 
	Then enter the valid credentails and submit 
	Then Use scroll up/down method in home page

@Test17	
Scenario: Verify Logout page
	Given launch the lumens website using property file
	When Go to  Account and Select My Account 
	Then enter the valid credentails and submit
	Then Move the mouse hover on Sign out
