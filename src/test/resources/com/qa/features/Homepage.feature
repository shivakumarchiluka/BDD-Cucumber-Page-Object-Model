Feature: Truepush Homepage

Scenario: Validate register page

Given User is on the Truepush homepage

When User clicks on Register button

And user enters appname "galaxy"

And user enters mail "galaxy@gmail.com"

And user enters password "chiluka"

Then User should be navigated to Project creation page

@smoke
Scenario: validate Login Page

Given User is on the Truepush HomePage

And page title should be "Truepush- Free Web Push Notification Service for Mobile & Desktop" 

When User clicks on Login button

And user enters email "primescollection@gmail.com"

And  enters password "chiluka"

Then User should be navigated to Main Panel page