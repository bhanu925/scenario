Feature: I am automating the orange hrm application

Background: common reusable steps

Given user launches the browser
Then user enters url as "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

Scenario: recording the skills in skill page

And user enters username as "Admin" and password as "admin123" click login button
Then open the qualification dropdown and open the skills page
Then click the add button
Then user enters skill title as "tester1" and description and "testing the bugs1"
Then click save button
Then logout
Then close the browser

