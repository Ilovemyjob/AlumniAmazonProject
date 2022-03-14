@Parallel2
Feature: US_08 User should be able to create and delete shoppinglist

  Background:
    When User goes to url.
    Then  Logs in with valid data
    Then  Clicks on create a list on Hello, TEAM15 text.
    Then  Clicks the Create a list button.

  Scenario: US_08_TC_001 User should be able to create and delete shoppinglist
    Then  Verifies the resulting list by seeing the title of Shopping List
    Then  Clicks more on the right of the Shopping List page, and then click manage list.
    Then  Clicks on Delete list and confirm and perform the delete operation.
    And Closes the page

  Scenario: US_09_TC_001 User should be able to add and delete products in shoppingList
    Then Records the desired data in the boxes under the Shopping List title.
    Then  Clicks on the Delete item deletes the desired data.
    And Closes the page