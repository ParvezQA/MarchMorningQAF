Feature: google search 


Scenario Outline: simple search


Given I am on the google homepage

When I enter search "<term>"

And I click on google search button

Then I receive releted search result



Examples:

|term		 |
|facebook|
|movie|