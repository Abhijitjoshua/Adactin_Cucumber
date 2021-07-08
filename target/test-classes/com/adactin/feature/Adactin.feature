Feature: login functionality of adactin application

Scenario: User enters valid username and password
      Given User launches the url of adactin application
      When User enters "vinovicky" as username
      And User enters "Jan@2020" as password
      And User click login button
      Then User click on the login button and it navigates to the hotel search page
      
      Scenario: User Search the hotel
      When User selects location
      And User selects hotels
      And User selects roomtype
      And user selects no of rooms
      And User clear check in date
      And user enter check in date
      And User Clear check out date
      And User enters check out date
      And User selects adults per room
      And User selects children per room
      And user validate search button
      
      Scenario: User checks the information of select hotel
      When User click on radio button
      Then User validate continue button
      
      Scenario: User book the hotel
      When User enters the firstname 
      And User enters the lastname
      And User enters the billing address
      And User enters the credit card number
      And User selects credit card type
      And User selects credit card expiry month
      And User selects credit card expiry year
      And User enters CVV number 
      And User enters click booknow button
      And User validate booknow button  