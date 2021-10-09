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

Feature: Login into application
  

  
  Scenario: positive test validation login
    Given Initialize the browser with chrome
    And navigate to "https://qaclickacademy.com" site
    And Click on Login link in home page to land on signin page
    When User enters "test99@gmail.com" and "123456" and logs in
   
    Then verify that user is successfully login

 