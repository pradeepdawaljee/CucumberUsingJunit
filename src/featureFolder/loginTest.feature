#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Functionality
Description: This Feature file is to test the Login Functionality of the application.

  @tag1
  Scenario: Successful login with valid credentials
    Given User is on the Home Page
    When Entered valid username
    And Entered valid password
    And Clicks on login button
    Then Should display Successful Login message or Landing screen
    
#  Scenario: Login with Invalid credentials
#      Given User is on the Home Page
   #   When Entered Invalid username
    #  And Entered Invalid password
    #  And Clicks on login button
    #  Then Should display Error message

  