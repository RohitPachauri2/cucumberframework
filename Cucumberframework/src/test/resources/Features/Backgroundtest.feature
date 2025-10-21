Feature: User is checking multiple scenarios of saucedemo application
Background: User is able to login or not
Given the user is already in login page
When user enters the username and password1
And clicks on login button 
Then user is naviagted to inventory page

Scenario:scenario1
Given user is on the inventory page
When user adds items
Then items are selected

Scenario:scenario2
Given user is on the inventory page
When user click on cart icon
And user clicks on checkout
Then user is on checkout page

 