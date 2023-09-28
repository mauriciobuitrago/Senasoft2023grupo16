

Feature: Register
  i as services user, i need register in the web page

  Scenario: successful registration
  Given The user is on the page
  When The user enters his e-mail
  And The user clicks on "continue with E-mail".
  Then The user should see the password settings page.
  When the user enters the password and confirms it.
  And the user clicks on "create an account".
  Then the user should see the accommodation view.age