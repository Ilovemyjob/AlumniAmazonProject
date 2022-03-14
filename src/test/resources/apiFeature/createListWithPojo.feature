Feature: Trello api test with pojo

  Scenario: Create_List_Pojo
    Given POST request for create list "deneme2"with pojo
    Then get list response with pojo
    And assert list response "deneme2"


  Scenario: Updatelist_Pojo
    Given PUT request for update list "son" with pojo
    Then Verify update response with pojo "son"