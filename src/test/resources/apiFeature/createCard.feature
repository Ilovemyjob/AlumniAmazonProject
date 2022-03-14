Feature: Trello_testi

  Scenario: Create_card
    Given Send POST request for create "bir" card
    Then  Assert for create card status code is 200
    And Assert card name is "bir"