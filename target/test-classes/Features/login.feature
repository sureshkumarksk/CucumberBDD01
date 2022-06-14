Feature: To validation the ocado webapplication

  Background: 
    Given user open the browser And enter the FaceBook url
 
    Then user verify the home page is dispalyed

  Scenario: TC_01_ Validation of FaceBook webapplication Enter the Valid username and Validpassword
    When user enter the valid username and valid password
       And user click the login button

  Scenario Outline: TC_02 Validation of Facebbok Webapplication and Enter the Mulitiple Username and Multiple Password
    When user enter the valid "<username>" and valid "<password>"
       And user click the login button
    
    
    Examples:
 |username||password|
 |suresh@123||13223202|
 |RV@123||13223202|
