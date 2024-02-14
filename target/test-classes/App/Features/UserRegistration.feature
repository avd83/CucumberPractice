Feature: User Registration Page

Scenario: User registration with diffrent data
Given User is on registration page
When User enter following registration details 
| abhay |abc@gmail.com|9876758908|Pune|
|Dilip|xyz@gmail.com|8765869842|Mumbai|
Then User registration should be successful

Scenario: User registration with diffrent data with coulmns
Given User is on registration page
When User enter following registration details with columns
|firstName|email|phoneNo|city|
| abhay |abc@gmail.com|9876758908|Pune|
|Dilip|xyz@gmail.com|8765869842|Mumbai|
Then User registration should be successful
 