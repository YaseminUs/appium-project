Feature: Testing General-Store-apk
  Background:
    Given User launches the app
  Scenario: 01. Toast message verification
    When User input insufficient value
    Then Verify roast message is shown

  Scenario: 02. Login verification
    When User input his name
    Then Verify succsesfull login

  Scenario: 03. Verifying 1 item is in the cart
    When  User input his name
    Then User adds one item to cart
    And Verify the item is in the cart