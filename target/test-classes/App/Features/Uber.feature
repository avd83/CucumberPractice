Feature: Uber booking feature

@Smoke
Scenario: Booking cab seaden
Given User want to select a car type "seaden" from the uber app
When user select car "Seaden" and pick from "Bangeluru" and drop location "Pune"
Then Driver starts the car
And Driver ends the joureny
Then user should be pay 1500 INR

@Smoke @Regression
Scenario: Booking cab SUV
Given User want to select a car type "SUV" from the uber app
When user select car "Seaden" and pick from "Bangeluru" and drop location "Pune"
Then Driver starts the car
And Driver ends the joureny
Then user should be pay 2000 INR

@Retest
Scenario: Booking cab Mini
Given User want to select a car type "Mini" from the uber app
When user select car "Seaden" and pick from "Bangeluru" and drop location "Pune"
Then Driver starts the car
And Driver ends the joureny
Then user should be pay 1100 INR