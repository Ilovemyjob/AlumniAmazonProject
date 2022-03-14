Feature: US-06 User should be able to choose random products and add to cart. You should see that the total price of the added products and the total in the basket are the same.

  Scenario:US-06_TC_001 User should be able to choose random products and add to cart. You should see that the total price of the added products and the total in the basket are the same.
    When User goes to url.
    Then  Logs in with valid data
    Then  Enters a "ball" in the search box.
    Then  Selects the product and clicks the add to cart button.
    Then Verifies that the total in the cart is equal to the sum of the prices of the items.
    And Closes the page

