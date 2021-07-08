$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "login functionality of adactin application",
  "description": "",
  "id": "login-functionality-of-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User enters valid username and password",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-enters-valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launches the url of adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters \"vinovicky\" as username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Jan@2020\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on the login button and it navigates to the hotel search page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_launches_the_url_of_adactin_application()"
});
formatter.result({
  "duration": 1712985100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinovicky",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_username(String)"
});
formatter.result({
  "duration": 81850300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jan@2020",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_password(String)"
});
formatter.result({
  "duration": 56743700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_login_button()"
});
formatter.result({
  "duration": 552418400,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "User Search the hotel",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-search-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "User selects location",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User selects hotels",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User selects roomtype",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects no of rooms",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clear check in date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enter check in date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Clear check out date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters check out date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User selects adults per room",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User selects children per room",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user validate search button",
  "keyword": "And "
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_location()"
});
formatter.result({
  "duration": 79466600,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_hotels()"
});
formatter.result({
  "duration": 66625500,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_roomtype()"
});
formatter.result({
  "duration": 61191600,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_no_of_rooms()"
});
formatter.result({
  "duration": 65518300,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_clear_check_in_date()"
});
formatter.result({
  "duration": 30874500,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_enter_check_in_date()"
});
formatter.result({
  "duration": 41620500,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_Clear_check_out_date()"
});
formatter.result({
  "duration": 32566600,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_enters_check_out_date()"
});
formatter.result({
  "duration": 30645100,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_adults_per_room()"
});
formatter.result({
  "duration": 58805000,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_selects_children_per_room()"
});
formatter.result({
  "duration": 56386700,
  "status": "passed"
});
formatter.match({
  "location": "BookingStepdefinition.user_validate_search_button()"
});
formatter.result({
  "duration": 642181500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User checks the information of select hotel",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-checks-the-information-of-select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "User click on radio button",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User validate continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_click_on_radio_button()"
});
formatter.result({
  "duration": 33474700,
  "status": "passed"
});
formatter.match({
  "location": "SelectHotel_Stepdefinition.user_validate_continue_button()"
});
formatter.result({
  "duration": 814044900,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "User book the hotel",
  "description": "",
  "id": "login-functionality-of-adactin-application;user-book-the-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "User enters the firstname",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enters the lastname",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User enters the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User enters the credit card number",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User selects credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User selects credit card expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User selects credit card expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User enters CVV number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User enters click booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User validate booknow button",
  "keyword": "And "
});
formatter.match({
  "location": "Personallnfo.user_enters_the_firstname()"
});
formatter.result({
  "duration": 46402700,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_enters_the_lastname()"
});
formatter.result({
  "duration": 40551800,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_enters_the_billing_address()"
});
formatter.result({
  "duration": 37780200,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_enters_the_credit_card_number()"
});
formatter.result({
  "duration": 42197100,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_selects_credit_card_type()"
});
formatter.result({
  "duration": 55969900,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_selects_credit_card_expiry_month()"
});
formatter.result({
  "duration": 60613400,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_selects_credit_card_expiry_year()"
});
formatter.result({
  "duration": 55414900,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_enters_CVV_number()"
});
formatter.result({
  "duration": 37018600,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_enters_click_booknow_button()"
});
formatter.result({
  "duration": 32491700,
  "status": "passed"
});
formatter.match({
  "location": "Personallnfo.user_validate_booknow_button()"
});
formatter.result({
  "duration": 15000,
  "status": "passed"
});
});