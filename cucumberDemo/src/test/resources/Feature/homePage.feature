@homepage
Feature: Validate menu options

  @menuOptions
  Scenario: I want to validate all the menu options
    Given open sauceDemo and login
    When click on menu options 
    Then validate all the options one by one


  @sortOptions
  Scenario Outline: I want to validate all sort options on product page
    Given open sauceDemo website 
    When login with valid credentials
    Then validate all sort options for "<options>"
    
    Examples:
       |options|
       |Name (A to Z)|
       |Name (Z to A)|
       |Price (low to high)|
       |Price (high to low)|