Feature:
  Scenario:
    Given Send PUT request for "nisan"  board
    Then Assert put status code 200
    Then Assert new board name "nisan"

    Scenario: DELETE

    Given Delete board with id of "622cd1fb76441f28f8fba014"