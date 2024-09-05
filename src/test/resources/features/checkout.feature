Feature: Product(s) Search and Add to cart
  As a user
  He/She want to open the store and search the products
  So they can add into the cart and click checkout

  Background: Navigate to page
    Given user navigates to store page "uk"
    When user searches for "PHOENIX LOGO UNISEX - Cap - navy"

  @checkout_page @smoke
  Scenario: Adding a Product(s) to the Cart and checkout
    Then user get search results and click the Add to basket button
    And user should see the item added to the basket
    Then user click the Go to Bag button and see the items