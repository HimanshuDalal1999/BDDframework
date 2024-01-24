Feature: Amazon Home page functionality

Scenario: verify cart icon

Given verify tital of page

When user is at Home page
Then page tital should be containts "shopping"

Scenario: verify cart icon
When user is at Home page
Then page cart should display

Scenario: verify login page
When user is at Home page
And user enter username "matindesai"
And user enter password "pass@123"

Scenario: verify search box
When user is at Home page
And user enter mobile Realme mobile "realme 5 pro"
And user click on search btn
And user cheak price

