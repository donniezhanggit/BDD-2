Feature: abc


Scenario: I login with valid credential
Given I navigate to flipkart site
When I click on sign in button
Then I enter email id
And I enter password
And Click on login button
Then I close browser