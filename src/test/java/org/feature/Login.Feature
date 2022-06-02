


Feature: Validating the login page

Scenario : Login using valid credentials

Given User is in login page
When User enter valid email id and valid password in their respective input field
Then user should be logged in and taken to home page

Scenario Outline: Login using various credentials

Given User is in login page
When User enter email "<email id>" and password "<password>" in their respective input field
Then user account should be validated according to credentials "<validity>"

Examples:
|email id|password|validity|
|xyx@gmail.com|Sample@123|invalid|
|cibicivilofficial@gmail.com|xyz@123|invalid|
|cibicivilofficial@gmail.com|Sample@123|valid|
 