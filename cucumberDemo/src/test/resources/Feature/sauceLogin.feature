@Login
Feature: Login to Sauce Application
 
@Login  @invalidCredentials
 Scenario Outline: Login with different credentials
    Given I want to open sauce lab application
    When I login to the application with "<username>" and "<password>"
    Then I validate the login page errors "<errors>"
    
    Examples:
       |username|password|errors|
       |standard_user||Epic sadface: Password is required|
       ||secret_sauce|Epic sadface: Username is required|
       |||Epic sadface: Username is required|
       |standard_user|1234|Epic sadface: Username and password do not match any user in this service|
       |standard|secret_sauce|Epic sadface: Username and password do not match any user in this service|
 
@Login @validCredentials
Scenario Outline: Verify positive login scenario
  Given Url should be loaded 
  And Login page should be displayed 
  When User login with valid credentials
  Then User should land on homepage
 

