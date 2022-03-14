Feature:
  Scenario: Create_Board_POJO
    Given POST request for create board "yeni" with pojo
    And get response with pojo
    And assert response "yeni"