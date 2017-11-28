Feature: User like to test XYZ function

  Background:
    Given User is on homepage

  @Test
  Scenario Outline: User like to test XY function
    When User click on "<X>"
    Then User can see "<Y>" appear on screen

    Examples:
      |X|Y|
      |a|b|
      |c|d|
