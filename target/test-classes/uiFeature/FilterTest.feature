Feature: US_05 User should be able to use filters and sorting in product listing process

  Scenario:
    When User goes to url.
    Then  Logs in with valid data
    Then  Enters a "imac" in the search box.
    Then  In the top right of the results, sees the sorting by options.
    Then  Sees the filters on the left side of the results.
    Then  Clicks on the desired option in the Sort section
    Then  Sees results re-listed in desired order
    Then  Customizes the filters on the left side of the results.
    Then  Sees that the results are re-listed according to the desired filtering.
    And Closes the page