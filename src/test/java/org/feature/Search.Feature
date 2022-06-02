Feature: Validating search function

Scenario: Searching a product in search box
Given User is in Homepage
When User a product Name "sekiro" in search box
And click search button
Then user should be shown same product in search page

