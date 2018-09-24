Feature: Flights Page Search
  Scenario: Flights Page Search
    Given User is on PHP Travels Flights module page
    When User picks Flights filters for each section
    Then User clicks Flights Search button
    And Flights with picked criteria is visible on the Page