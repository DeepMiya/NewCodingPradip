#trial to test git
Feature: Login functionality of Open Cart gitecoomerce
  As a user of open cart Website
  I want to login with my email id
  So that I can access my account related features and manage my orders


  Background:
    Given I am on the login page of opencart
  @positive
  Scenario: Successfull login with valid credentials
    Given User entered the valid username "qatestertest@gmail.com" and password "Test@123"
    When user click on login button
    Then user should be login successfuly

  @negative
  Scenario Outline: Unsuccessfull login with invalid or empty credentials
    Given User entered invalid <username> and <password>
    When user click on login button
    Then user should see the error message indicating <error_message>
    Examples:
      |username|password|error_message|
      |acd.faef@gmail.com|adaf.ad@2123|Warning: No match for E-Mail Address and/or Password|
      |fgs.ging@gmail.com|fjshsf@123|Warning: No match for E-Mail Address and/or Password|

  @positive
  Scenario: navigating to the forgotton password
    When user click on the "Forgotten Password" link
    Then user should be redirected to password reset page

