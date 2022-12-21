Feature: Login page testing

Background:
When User is on the Home Page
And clicked on sign in link


Scenario: To verify Continue With Google option has been displayed
Then the first option "Continue with Facebook" gets displayed



Scenario: To verify Continue With Google option has been displayed
Then the second option "Continue with Google" gets displayed

Scenario: To verify Continue With email option has been displayed
Then the option "Continue with email" gets displayed

Scenario: To verify that user can login with valid credentials
Then the first option "Continue with Facebook" gets displayed
And the second option "Continue with Google" gets displayed
And the option "Continue with email" gets displayed
When User clicked on Continue with email
And enter email and password as
|testingpurposesel@gmail.com|TripAdvisorLogin|
And clicked on login button
Then User gets signed in to application using valid credentials and your's home page gets displayed with Page Title as "Tripadvisor: Over a billion reviews & contributions for Hotels, Attractions, Restaurants, and more"


Scenario Outline: To verify that user cannot login with Invalid credentials
Then the option "Continue with email" gets displayed
When User clicked on Continue with email
And enter email as "<EmailId>" and "<password>"
And clicked on login button
Then error message gets displayed

Examples: 
|EmailId|password|
|testingpurposesel@gmail.com|TripAdvisorLogin123|
|testingpurpose@gmail.com|TripAdvisorLogin|

Scenario: To verify that user can not login with Blank Email address
Then the option "Continue with email" gets displayed
When User clicked on Continue with email
Then User put blank emailId field and password as "TripAdvisorLogin"
And clicked on login button
Then "E-mail address is required" error message gets displayed



Scenario: To verify that user can not login with Blank Password
Then the option "Continue with email" gets displayed
When User clicked on Continue with email
Then User put  emailId as "testingpurposesel@gmail.com" and blank password field
And clicked on login button
Then "Your password should be at least 6 characters long." password error message gets displayed