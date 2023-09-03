Feature: Launch the site
Scenario: Launch the site

Given I launch the site
When I click on about us hyperlink
And Open the about us page
And I click on back button
And Go to the home page
And when i click on contact us hyperlink
And Contant us page should open
And Enter the last name
And Enter the email ID
And Enter the message
And Click on submit button
Then Validation message should displayed