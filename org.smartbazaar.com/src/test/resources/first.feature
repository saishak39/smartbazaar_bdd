Feature: feature file to check register functionality
  @SmokeTest
  Scenario Outline : user wants to check the functionality
    Given user open the browser
    Then user enters the "https://www.smartbazaar.co.uk/"
    And user clicks on the register
    And user enters the '<username>'
    And  user enters the '<emailid>'
    And user enters the '<password>'
    When user clicks on register button
    Then user verify the result
    And user closes the browser
    Examples:
      |username|emailid|password|
      |kalyan  |kopparty.himapriya+4@gmail.com|Himapriya@123|




