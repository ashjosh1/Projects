@Registration
Feature: Entering valid details
Scenario: Upon valid details ,Registration has to be successfull
Given Paymentdetails
When ValidDetails
Then registration is successfull