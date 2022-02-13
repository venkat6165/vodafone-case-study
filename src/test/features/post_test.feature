Feature: verify the API call results in pet data creation

  Scenario: verify the pet data creation
    Given the pet details
    When the request has been made to post the pet details
      | id  | categoryID | categoryName | name   | tagID | tagName | Status    |
      | 250 | 34         | Sporting     | snoopy | 56    | Ruby    | Available |
      | 230 | 45         | Working      | floppy | 28    | Julie   | Available |

    Then the new entry should be created