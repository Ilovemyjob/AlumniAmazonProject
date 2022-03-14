Feature: Trello_Api_Get

  Scenario: Get_board
    Given Send GET request for "a"  board
    Then  Assert get status code 200
