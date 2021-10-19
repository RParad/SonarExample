Feature: Is it Harry Potter?
  The library users want to know if the book is called Harry Potter
  Scenario: The book picked is Harry Potter
    Given The book is called Harry Potter
    When I ask if it is called Harry Potter
    Then I should be told "Yes, it is"