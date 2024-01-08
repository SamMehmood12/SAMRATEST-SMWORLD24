Feature: Testing Products
  Background:
    Given User Logins with standard_user and secret_sauce
    Then User redirects to Dashboard


  Scenario: Select and Product and Go to Checkout
    Then Select a Product from the items list
    Then Go to shopping Cart
    Then Proceed towards checkout
    Then Enter Information samra mehmood 056000
    Then Verify Information and Finish
    Then user logouts



  Scenario: Filtering and verifying products
    Then Selecting filter
    Then select price filter from low to high
    Then verify product according to the price order
