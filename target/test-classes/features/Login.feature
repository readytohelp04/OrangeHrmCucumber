Feature: Amazon Application Login Test

Background:
Given user is in login page

@Test
Scenario: Amazon login Test sample
Given user is in login page
When user enters username and password
And user clicks on login button
Then validate homepage is displayed

@smoke
Scenario: Amazon login Test with Valid credentials
Given user is in login page
When user enters username "testuname" and password "testpwd"
And user clicks on login button
Then validate homepage is displayed

@Regression
Scenario Outline: Amazon login Test with Valid credentials
Given user is in login page
When user enters username "<username>" and password "<Password>"
And user clicks on login button
Then validate homepage is displayed

Examples:
|username|Password|
|Admin|admin123|
|abc|test1|