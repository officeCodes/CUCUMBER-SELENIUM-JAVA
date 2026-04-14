Feature: Application Login

Scenario: Admin Page default login

Given User is on netbanking landing page
When user login into application
Then Home Page is displayed
And Cars are displayed