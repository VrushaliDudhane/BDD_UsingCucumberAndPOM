Feature: Home Page Testing 
Background:
When User is on the Home Page


Scenario: To assert the title of apllication's home page
Then He gets The Home Page Title as "Tripadvisor: Over a billion reviews & contributions for Hotels, Attractions, Restaurants, and more"

Scenario: To verify the apllication's log has been displayed
Then Apllication logo has been displayed


Scenario: To assert the apllication's Sign In Link Displayed
Then Sign In Link Is displayed and Clickable