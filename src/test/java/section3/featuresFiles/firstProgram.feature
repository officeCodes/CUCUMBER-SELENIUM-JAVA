Feature: Application Login

Scenario: Admin Page default login

Given User is on netbanking landing page
When user login into application with "admin" and password "1234"
Then Home Page is displayed
And Cars are displayed

# Reusable

Given User is on netbanking landing page
When user login into application with "user1" and password "0953"
Then Home Page is displayed
And Cars are displayed
