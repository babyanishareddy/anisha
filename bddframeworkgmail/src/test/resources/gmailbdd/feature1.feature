Feature: Gmail login
Scenario: Validate gmail site
Given launch gmail site
Then title is "Gmail" login
And close site

Scenario Outline: Validate userid
Given launch gmail site
When enter userid with "<x>" value
And click next button
Then validate userid field with "<y>" criteria
And close site
Examples:
   |      x         |     y           |
   | anudtester     |   valid         |
   | anudtesters    |   invalid       |
   |                |   blank         |  
   