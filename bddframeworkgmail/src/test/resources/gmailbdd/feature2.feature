Feature: Gmail login
Scenario Outline: validate password
Given launch gmail site
When enter userid with "anudtester" value
And click next button
And enter password with "<p>" value
And click password next button
And validate password with "<pc>" criteria
And close site
Examples: 
    |    p          |    pc        |
    | rouble2015    | valid        |
    | rouble20151   | invalid      |
    |               | blank        |
    
