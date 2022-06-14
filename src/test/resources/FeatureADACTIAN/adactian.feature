Feature: Validate the Adactian Hotel and Book the Hotel And Get the order ID

  Background: 
    Given User launch the Browser And enter into the Adactian Web application

  Scenario: TC_01 Validate the adactian hotel and enter the Username and Password and login to the hotel
    When User enter the Valid Username and Valid Password
    And User click the Login Button
    Then User verify the page should be displayed
    And User enter the search Hotel after enter the all fields and Drop and Down Fields and click the Search buttom
    Then User verify select page should be dispalyed
    And User select the Hotel and click  the hotel by using Radio button And click the Continue button
    Then User verify the Book hotel page should be Displayed
    And User enter the details within the textBox and Card datails and Click the Booknow button
    Then User verify the order id Can be visible in the text Box and get the order Id

  Scenario Outline: TC_02 Validate the Adactian Hotel and pass the Pass the Multiple booking Details
    When User enter the Valid "< Username>" and "< Valid Password>"
    And User click the Login Button
    Then User verify the page should be displayed
    And User enter the Search Hotel Enter the Below Details location and hotels and Roomtype and rooms and adults and children
    Then User verify select page should be dispalyed
    And User select the Hotel and click  the hotel by using Radio button And click the Continue button
    Then User verify the Book hotel page should be Displayed
    And User enter the details "< firstName>" and 	"<lastName>" and "<address>"and"<creditcard>"and ctype and cmonth and cyear and "<cvv>"
    Then User verify the order id Can be visible in the text Box and get the order Id

    Examples: 
      | Username   | Valid Password | firstName    | lastName | address  | creditcard      | cvv  |
      | RVAravindh | @12345         | Aravindh     | RV       | Chennai  | 123456789123456 | 1212 |
      | RVAravindh | @12345         | Suresh kumar | K        | Pollachi |  98756125444555 | 9999 |
