Feature: Application Login
Background:
Given validate the browser
When Browser is triggered
Then Check if browser is started 
@SanityTest
Scenario: Home page default login
Given User is on practicetestautomation page
When User login into application with "anvitha" and "5678"
Then Home Page is populated
And Logout button is displayed in homepage "true"
