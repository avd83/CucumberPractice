Feature: Order page
 In order to check my order details
 As a registered user
 I want to specify the features of order details page  
 
 Background:
 Given a registerd user exists
 Given user is on Amazon login page
 When user enters username
 And usr enters password
 And user clicks on login button
 Then user navigate to order page
 
 Scenario: Check Privious Order Details
 When user clicks on order link 
 Then user checks the privious order details  
 
 Scenario: Check Open Order Details
 When user clicks on open order link 
 Then user checks the privious order details
 
 Scenario: Check Cancelled Order Details
 When user clicks on calcelled order link 
 Then user checks the privious order details  