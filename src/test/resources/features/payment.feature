Feature: Goto Payments page from Checkout and Make the payment
  As a user
  He/She want to open the checkout page and navigate to payment
  So they can do the payment

  Background: Navigate to page
    Given user navigates to store page "uk"
    When user click the Go to Bag button and see the items

  @payment_page @ignore
  Scenario: Goto the checkout and perform the payment
    Then user select the payment type
    And user add the Card Holder name
    And user add the Card Number
    And user add the Expiry Date
    And user add the Security code
    Then user click the Next button for confirm the payment



