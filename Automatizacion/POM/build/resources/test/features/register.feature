

Feature: Register
  i as services user, i need register in the web page

  Scenario Outline: successful registration
  Given The user is on the page
  When The user enter the data for the register
    | email   | password   |
    | <email> | <password> |

  Then the user should see the accommodation view.age

    Examples:
      | email                          | password     |
      | acadenacuellar22@gmail.com     | Cadena123456 |
      | domingomartes213215@gmail.com  | Juan123456   |
