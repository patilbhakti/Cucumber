@info
Feature: User info page

  @info @invalidsUserInfo
  Scenario Outline: validate for information page for invalid user info
    Given I want to launch sauceDemo website
    When login to the application
    And add products to the cart
    Then open cart
    And click checkout
    Then give invalid user information "<firstname>", "<lastname>" and "<zipcode>"
    And validate error messages with "<error>"
    
   Examples:
     |firstname|lastname|zipcode|error|
     ||||Error: First Name is required|
     ||Singh|560003|Error: First Name is required|
     |Riya||560003|Error: Last Name is required|
     |Riya|Singh||Error: Postal Code is required|

  @checkout
  Scenario: login to checkout
    Given login to application
    When add items to the cart then checkout
    Then give valid user information to order an items 