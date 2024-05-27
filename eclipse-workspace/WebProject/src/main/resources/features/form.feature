Feature: Form submission

  Scenario: Successfully submit the form
    Given I am on the form page
    When I enter "John Doe" into the name field
    And I enter "john.doe@example.com" into the email field
    And I enter "This is a test comment." into the comments field
    And I submit the form
    Then the form should be submitted successfully
