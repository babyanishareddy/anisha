Feature: login
Scenario: validate login functionality
Given  launch the site
When   Enter the userid with "Admin" and password with "Admin" data and click on login btn
Then   Branches btn should be displayed and click on branch btn
And    close site

Scenario Outline: validate the branch creation with excel data
Given  launch the site
When   Enter the userid with "Admin" and password with "Admin" data and click on login btn
Then   Branches btn should be displayed and click on branch btn
Then   newbranch btn should be displayed and click newbranch btn
When   Enter the data for newbranch btn with "<row_index>" data set

Examples:
       |row_index|
       |2|
       |3|
       |4|
