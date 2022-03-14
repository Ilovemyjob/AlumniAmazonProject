Feature: Trello_Testi

  Scenario: Create_board
    Given Send POST request for create "ab" board
    Then  Assert post status code 200
    And Assert board name is "ab"
