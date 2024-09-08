Feature: Goto Landing page and search for the product
  As a user
  He/She want to open the store
  So they can search products

  Background: Navigate to page
    Given user navigates to store page uk
    When user searches for "PHOENIX LOGO UNISEX - Cap - navy"

  @product_page @smoke
  Scenario: Searching for a Product(s) by Enter Key
    Then user press the Enter key and get search results