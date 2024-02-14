Feature: Calculate Billing Amount

Scenario Outline: Billing amount
Given User is on billing page
When User eneter billing amount "<billingAmount>"
When User enters tax amount "<taxAmount>" 
And User clicks on calculate button
Then it gives the final amount "<finalAmount>" 

Examples: 
|billingAmount |taxAmount |finalAmount|
|1000					 |10				|1010				| 
|500           |20        |520        |
|100           |5.5       |105.5      |