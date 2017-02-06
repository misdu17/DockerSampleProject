Feature: Login functionality feature

  Scenario: Login with valid credentials
    Given User will navigate to Docker page with "loginUrl"
    When User will click on the docker id field
        And User will type "dockerId" in docker id field
        And User will click on the password field
        And User will type "password" in password field
        And User will click login button
    Then User will be able to see home page

  Scenario: Login with invalid credentials
    Given User will navigate to Docker page "loginUrl"
    When User will click on the docker id field
        And User will type "dockerId" in docker id field
        And User will click on the password field
        And User will type "password" in password field
        And User will click login button
    Then User will see 'Incorrect authentication credentials.' error message
        And User will stay on login page


  Scenario: Login with empty credentials
    Given User will navigate to Docker page "loginUrl"
    When User will click login button
    Then User will stay on login page
        And User will see Docker id field is red
        And User will see Password field is red

  Scenario: Login with short length password
    Given User will navigate to Docker page "loginUrl"
    When User will click on the docker id field
        And User will type "dockerId" in docker id field
        And User will click on the password field
        And User will type "password" in password field
        And User will click login button
    Then User will see 'Ensure this value has at least 5 characters.' error message below password field
        And User will stay on login page

  Scenario: Login with forget password option
    Given User will navigate to Docker page "loginUrl"
    When User will click on the 'Forget Password' link
    Then User will see 'Enter your email to reset your password' message
        And User will redirect to reset password page
        And User will see option to enter email address
        And User will see a send button

