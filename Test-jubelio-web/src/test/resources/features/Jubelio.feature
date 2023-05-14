Feature: Alta Shop

  @Login @NormalPositive @LoginSuccess
    Scenario: User can success to login
    Given user on the login page
    When user input the valid email "qa.rakamin.jubelio@gmail.com"
    And user input the valid password "Jubelio123!"
    Then user click login button

  @Login @NormalNegative @LoginFailed
    Scenario: User can't login with invalid email and invalid password
    Given user on the login page
    When user input invalid email "invalidmail"
    And user input invalid password "invalidpassword"
    Then user click login button
#    Then user see this "record not found" alert message invalid account
