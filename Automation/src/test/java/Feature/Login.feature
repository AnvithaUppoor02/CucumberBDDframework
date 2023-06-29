Feature: Application Login
@RegTest
Scenario: Home page default login
Given User is on practicetestautomation page
When User login into application with "anvitha" and "5678"
Then Home Page is populated
And Logout button is displayed in homepage "true"

@SmokeTest
Scenario: Home page default login
Given User is on practicetestautomation page
When User login into application with "jon" and "1234"
Then Home Page is populated
And Logout button is displayed in homepage "false"

@RegTest
Scenario: Home page default login
Given User is on practicetestautomation page
When User data
|Anvitha|Uppoor|
Then Home Page is populated
And Logout button is displayed in homepage "false"

@SmokeTest 
Scenario Outline: Home page default login
Given User is on practicetestautomation page
When User credentials <username> and <password>
Then Home Page is populated
And Logout button is displayed in homepage "false"

Examples:
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|