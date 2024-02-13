#Author: David Sánchez
Feature: Verify fill out the form of the Block Validation page

  Scenario Outline: Fill out the form of the Block Validation page

    Given A user enters to the colorlib app and go to the Block Validation page
    When the user fill out the form of the Block Validation page
      | required   | email   | password   | confirmPassword   | date       | url   | digits   | range   |
      | <required> | <email> | <password> | <confirmPassword> | 12/02/2024 | <url> | <digits> | <range> |
    Then verifies that the form was filled out correctly with This field is required.

    Examples:
      | required         | email             | password    | confirmPassword | date  | url                     | digits     | range |
    ##@externaldata@./src/test/resources/data/DataDriven.xlsx@Hoja1
      | Choucair Testing | bdavesm@gmail.com | 519941+dave | 519941+dave     | 45334 | https://www.google.com/ | 3045386489 | 8     |

