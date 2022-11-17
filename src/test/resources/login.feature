@login
Feature: login feature
  As a customer
  I want to login to the login functionality
  So that I can use my login details

  Scenario: Login with valid credentials
    Given I am on homepage
    When I click on login button
    Then I should see "welcome, Please sign in" text on the login page