@cart
Feature: Validate cart page

  
  Scenario: check items selected on products page are added to the cart or not
    Given I want to add products to the cart
    When open cart link
    Then  verify added products are present or not

  @overview
  Scenario: check all the product details is present or not
    Given add items to the cart
    When checkout to order
    Then give user information 
    And verify all the product information and checkout information is present on overview page or not 