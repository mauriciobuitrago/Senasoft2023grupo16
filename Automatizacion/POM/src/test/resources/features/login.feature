Feature: login
  i as a service user, I need to log in to the website

  Scenario: successful login
    Given The user is on the login page.
    When The user enters his e-mail
    And The user clicks on "continue with E-mail"
    Then the user should see the "Ingrese su contraseña" page.
    Given The user is on the "Ingrese su contraseña" page.
    When The user enters his password
    And The user clicks on "iniciar sesion"
    Then The user should be logged in



