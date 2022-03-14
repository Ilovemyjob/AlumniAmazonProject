Feature:  US_01 User must be able to access Amazon.com page
  @Parallel1
  Scenario: TC_001 User goes to relevant url
    When  User goes to url.
    And Closes the page


  Scenario: US_02_TC_001  User must be able to login with valid information (positive)
    When  User goes to url.
    Then  Clicks the sign in button on the Account & Lists article
    Then  Enters the valid data into the e-mail box and click the continue button.
    Then  Enters the valid data in the password box and click the sign in button.
    Then  The user logs in successfully.
    And Closes the page


  Scenario: US_02_TC_002 User mustn't be able to login with invalid information (negative)
    When User goes to url.
    Then Clicks the sign in button on the Account & Lists article
    Then Enters the invalid data into the e-mail box and clicks the continue button.
    Then Sees There was a problem
    And Closes the page


  Scenario: US_02_TC_002/2 User mustn't be able to login with invalid information (negative2)
    When User goes to url.
    Then Clicks the sign in button on the Account & Lists article
    Then  Enters the valid data into the e-mail box and click the continue button.
    Then Enters the invalid data in the password box and clicks the sign in button.
    Then User cannot login successfully.
    And Closes the page

