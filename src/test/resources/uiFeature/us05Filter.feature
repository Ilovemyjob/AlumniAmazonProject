@Parallel2
Feature: Verify that user can filter search results and can use any of filters such as price,color
  Scenario: filtering search result
   When User goes to url.
    Then  Logs in with valid data
   Then  Enters a "imac" in the search box.
    And   Clicks on search button
    Then Choose any filter option

