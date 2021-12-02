Feature: test the login functionality
Scenario: To login with valid email and valid password
  Given user open the website and go to login page
  When user fill email and password and click on login
  Then user should navigate to home page

