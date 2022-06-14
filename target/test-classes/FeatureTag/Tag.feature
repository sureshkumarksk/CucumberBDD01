Feature: To Validate the Adactin Hotel WebApplication And to Check Weather the Application is Properly Working or not

  @smoke
  Scenario: TC_01 Validate the Adactin Hotel Webpage with Vaild UserName and valid PassWord
    Given User Launch the Webbrowser and hit the Url
    Then User verify the the Adactin webpage Should be Displayed
    When User Enter The Valid UserName And Valid PassWordAnd User Click The login Button
    Then User Verify the Login Feature As should Be open Succesfully

  @reg
  Scenario: TC_02 Validate the Search page And Enter the given Below Details
    Given User Verify the Search page Should Be Displayed
    Given User Enter the 	All the Details With In the text Box and Select the Drop Down Fields
    And User Click the Search Button
    Then User verify the while click the Search Button the page should Be Move to Next page

  @sanity
  Scenario: TC_03 Validate the Select Hotel Page
    Given User Select the Hotel And Click the Hotel By using Radiobutton
    And User click the Continue Button

  @reg @sanity
  Scenario: TC_04 Validate the Book Hotel Page And Enter the Given Below Details
    Given User Enter the Datas In the Given Text Box as Well As Drop Down Fields
    And User click the Booknow  Button As Well As Verify the cancel Button Should Be Displayed
    Then User Verify the Book Hotel page Is Displayed

  @sanity @E2E
  Scenario: TC-05 Validate the Booking Conformation page
    Given User Can See the Order Id and Other Details
    Then User verify the Logout Button Should Be displayed
    Then user verify the My liternery Button as well as Search hotel Button is Displayed in the below the details

  @reg @E2E
  Scenario: TC_06 Validate the logout Button
    Given User click the Log out
    Then User verify the logout Was Succesfully
