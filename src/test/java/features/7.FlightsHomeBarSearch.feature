Feature: Flights HomePage Search
  Scenario: Flights HomePage Search
    Given User is on PHP Travels HomePage with Flights bar
    When User picks Flights bar filters for each section
    Then User clicks Flights bar Search button
    And Flights with picked criteria is visible on the Flights module Page