Feature: verifying facebook login Module
Scenario Outline: verifying fb facebook with valid credentials
Given user is on the facebook page
When user enter "<username>" and "<password>"
And user clicks the login button
Then user should verify after login success message 
Examples:
|username|password|
|gowtham|123|
|naughty|gafgej|
|jai|mani|
