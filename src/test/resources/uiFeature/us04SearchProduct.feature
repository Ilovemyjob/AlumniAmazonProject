@Parallel2
Feature: Searching a product

  Background:
  When User goes to url.

  Feature: Enter a valid product name and click on the search icon.It should show the result with the given product name.

  Scenario: checking search icon results

    Given Types anything on search box
    Then Clicks on search button
    And Verify that the results starts with what user types
  @us04tc2

  Scenario: The same word enters multiple times, it should load results with a product containing the given text.

    Then Types sameword multiple times on search box
    Then Clicks on search button
    And Verify that the results starts with containing the given text

