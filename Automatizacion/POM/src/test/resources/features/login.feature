Feature: Login
  i as services user, i need login in the web page

  Scenario Outline: successful login
    Given The user is on the page view
    When The user enter the data for the login
      | email   | password   |
      | <email> | <password> |

    Then the user should see the accommodation view page

    Examples:
      | email                          | password     |
      | domingolunes314@gmail.com     | Juan123456 |



