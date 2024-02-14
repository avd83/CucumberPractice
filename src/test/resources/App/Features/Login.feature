Feature: Login Feature

Scenario Outline: Login fail possible combinations
Given User is on application landing page
When User click on sign in button
Then User is displayed login screen
When User eneter "<userName>" in username field
And User enter "<password>" in password field
And clicks on signin button
Then Usr gets login failed message

Examples:
|  userName       |   password      |
|incorrectusername|    1234         |
|abhay            |incorrectpassword|
|incorrectusername|incorrectusername|
 