Feature: Save excel
  I want to use this template for my feature file

  Scenario Outline: ExcelFile
    Given I have set <filename>
    And I enter the <result>
    When I press save
    Then I verify the <filename> and <result>

    Examples:
      | filename       | result | score | errormessage |
      | "asdf"         |  "250" |    16 |              |
