@TestCafeExample
Feature: Acceptance Testing to validate the user login and shopping cart functionality

  @tag1
  Scenario Outline: Validate the Test Cafe Example page
    Given the user is on the home page "http://automationpractice.com/index.php"
    When the user clicks on the "SignIn" button
    And the user enters the "emailaddress" under "<emailaddress>" field
    And the user enters the "password" under "<password>" field
    And the user clicks on the "Submit" button
    Then the user should see the corresponding "<message>"
    
     Examples:
      | emailaddress           | password               | message         |
      | mskumar0918@gmail.com  | Helloworld1234         | Successful      |
      | mskumar0918@gmail.com  | Helloworld12345        | InvalidPassword |
      | mskumar09181@gmail.com | Helloworld12345        | InvalidEmail    |
      | mskumar0918@gmail.com  |                        | BlankPassword   |
      |                        | Helloworld12345        | BlankEmail      |
      | mskumar09181@gmail.com | Helloworld12345        | InvalidDetails  |
      |                        |                        | BlankDetails    |
