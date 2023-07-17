@thankYou
Feature: Verify thank you page
        I want to verify after order complete thankyou page is displayed or not 

  @thankYou
  Scenario: Verify thank you page displayed or not
    Given login to app
    When add product to the cart
    Then click checkout with user info firstname and lastname and zipcode 
    And click finish order 
    Then thank you page should be displayed with message "Thank you for your order!"     


