Feature: feature file to check register functionality
  @SmokeTest
  Scenario: user wants to check the functionality
    Given user open the browser
    Then user enters the "https://www.smartbazaar.co.uk/"
    And user clicks on the register and enters the data
    When user clicks on register button
    Then user verify the result
    And user closes the browser




