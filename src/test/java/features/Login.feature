Feature: Web Application Login
  Scenario: Application Login
    Given User is on PHP Travels main page
    When User Log into application with username and password
    Then Account page is displayed
    And Booked Reservations are visible on the page