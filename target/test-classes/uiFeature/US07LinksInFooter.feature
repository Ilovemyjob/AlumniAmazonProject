Feature: US_07


  @TC_07
  Scenario: User should see that the second column of the links
  listed at the bottom of the home page navigate user to right pages.

    When User goes to url.
    Then scroll down to the bottom of the home page
    Then click the links in the second column and verifies page name