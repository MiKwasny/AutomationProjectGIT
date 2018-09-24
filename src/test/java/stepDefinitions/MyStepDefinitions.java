package stepDefinitions;

import AutomationProject.MainFolder.*;
import AutomationProject.TestAssertions.TestAssertions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on PHP Travels main page$")
    public void user_is_on_php_travels_main_page() throws Throwable {
        WebBrowserLaunch.Launch();
        Actions.GoToLoginPage();
    }

    @When("^User Log into application with username and password$")
    public void user_log_into_application_with_username_and_password() throws Throwable {

        Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);
    }

    @Then("^Account page is displayed$")
    public void account_page_is_displayed() {

        TestAssertions.FinaLoginPageCheck();
    }

    @And("^Booked Reservations are visible on the page$")
    public void booked_reservations_are_visible_on_the_page() {

        TestAssertions.FinalLoginBookingPageCheck();
    }

    @Given("^User is on PHP Travels Hotel module page$")
    public void user_is_on_php_travels_hotel_module_page() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.ClickHotelsButton();
    }

    @When("^User picks hotel filters for each section$")
    public void user_picks_hotel_filters_for_each_section() throws Throwable {

        PickFilters.HotelPageFilters.StarGrade.FiveStar();
        PickFilters.HotelPageFilters.Amenities.BarLounge();
        PickFilters.HotelPageFilters.Amenities.Spa();
        PickFilters.HotelPageFilters.PropertyTypes.Hotel();
        PickFilters.HotelPageFilters.PriceRange.LeftPriceBarMove(10);
        PickFilters.HotelPageFilters.PriceRange.RightPriceBarMove(40);
    }

    @Then("^User clicks Hotel Search button$")
    public void user_clicks_Hotel_search_button() throws Throwable {

        PickFilters.HotelPageFilters.SearchHotel();
    }

    @And("^Hotel with picked criteria is visible on the Page$")
    public void hotel_with_picked_criteria_is_visible_on_the_page() throws Throwable {

        TestAssertions.FinalHotelModulePageCheck();
    }

    @Given("^User is on PHP Travels Car module page$")
    public void user_is_on_php_travels_car_module_page() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.ClickCarsButton();
    }

    @When("^User picks car filters for each section$")
    public void user_picks_car_filters_for_each_section() throws Throwable {

        PickFilters.CarsPageFilters.AirPortPickUp.Yes();
        PickFilters.CarsPageFilters.StarGrade.FourStar();
        PickFilters.CarsPageFilters.CarTypes.Standard();
        PickFilters.CarsPageFilters.PriceRange.LeftPriceBarMove(10);
        PickFilters.CarsPageFilters.PriceRange.RightPriceBarMove(50);
    }

    @Then("^User clicks Car Search button$")
    public void user_clicks_car_search_button() throws Throwable {

        PickFilters.CarsPageFilters.CarsSearch();
    }

    @And("^Car with picked criteria is visible on the Page$")
    public void car_with_picked_criteria_is_visible_on_the_page() throws Throwable {

        TestAssertions.FinalCarModulePageCheck();
    }

    @Given("^User is on PHP Travels Tours module page$")
    public void user_is_on_php_travels_tours_module_page() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.ClickToursButton();
    }

    @When("^User picks Tours filters for each section$")
    public void user_picks_tours_filters_for_each_section() throws Throwable {

        PickFilters.ToursPageFilters.StarGrade.FourStar();
        PickFilters.ToursPageFilters.TourTypes.Private();
        PickFilters.ToursPageFilters.PriceRange.LeftPriceBarMove(5);
        PickFilters.ToursPageFilters.PriceRange.RightPriceBarMove(25);
    }

    @Then("^User clicks Tours Search button$")
    public void user_clicks_tours_search_button() throws Throwable {

        PickFilters.ToursPageFilters.CarsSearch();
    }

    @And("^Tours with picked criteria is visible on the Page$")
    public void tours_with_picked_criteria_is_visible_on_the_page() throws Throwable {

        TestAssertions.FinalTourModulePageCheck();
    }

    @Given("^User is on PHP Travels Flights module page$")
    public void user_is_on_php_travels_flights_module_page() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.ClickFlightsButton();
    }

    @When("^User picks Flights filters for each section$")
    public void user_picks_flights_filters_for_each_section() throws Throwable {

        PickFilters.FlightsPageFilters.NonStop();
        PickFilters.FlightsPageFilters.Transit();

    }

    @Then("^User clicks Flights Search button$")
    public void user_clicks_flights_search_button() throws Throwable {

        PickFilters.FlightsPageFilters.SearchByAirLines(2);
    }

    @And("^Flights with picked criteria is visible on the Page$")
    public void flights_with_picked_criteria_is_visible_on_the_page() throws Throwable {

        TestAssertions.FinalFlightModulePageCheck();
    }

    @Given("^User is on PHP Travels HomePage with Hotel bar$")
    public void user_is_on_php_travels_homepage_with_hotel_bar() throws Throwable {

        WebBrowserLaunch.Launch();
    }

    @When("^User picks Hotel bar filters for each section$")
    public void user_picks_hotel_bar_filters_for_each_section() throws Throwable {

            PickHomeSearchBarOptions.HotelSearchBar.HotelOrLocation("istanbul", 1, 1);
            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckIn(2019, "Feb", 16);
            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckOut(2020, "Aug", 25);
            PickHomeSearchBarOptions.HotelSearchBar.AdultAndChildrenNumber(3, 2);
    }

    @Then("^User clicks Hotel bar Search button$")
    public void user_clicks_hotel_bar_search_button() throws Throwable {

        PickHomeSearchBarOptions.HotelSearchBar.HotelSearch();
    }

    @And("^Hotels with picked criteria is visible on the Hotel module Page$")
    public void hotels_with_picked_criteria_is_visible_on_the_hotel_module_page() throws Throwable {

        TestAssertions.FinalHotelBarPageCheck();
    }

    @Given("^User is on PHP Travels HomePage with Flights bar$")
    public void user_is_on_php_travels_homepage_with_flights_bar() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.FlightsBarClick();
    }

    @When("^User picks Flights bar filters for each section$")
    public void user_picks_flights_bar_filters_for_each_section() throws Throwable {

        PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportFrom("Warsaw", 1);
        PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportDeparture("Athens", 2);
        PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
        PickHomeSearchBarOptions.FlightsSearchBar.OneWay();
        PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
        PickHomeSearchBarOptions.FlightsSearchBar.PickClass("Economy");
        PickHomeSearchBarOptions.FlightsSearchBar.DepartDate(2018, "Nov", 20);
        PickHomeSearchBarOptions.FlightsSearchBar.ReturnDate(2018, "Nov", 27);
        PickHomeSearchBarOptions.FlightsSearchBar.NumberOfQuests(2, 1, 0);
        PickHomeSearchBarOptions.FlightsSearchBar.ConfirmQuests();
    }

    @Then("^User clicks Flights bar Search button$")
    public void user_clicks_flights_bar_search_button() throws Throwable {

        PickHomeSearchBarOptions.FlightsSearchBar.SearchBy();
    }

    @And("^Flights with picked criteria is visible on the Flights module Page$")
    public void flights_with_picked_criteria_is_visible_on_the_flights_module_page() throws Throwable {

        TestAssertions.FinalFlightBarPageCheck();
    }

    @Given("^User is on PHP Travels HomePage with Tours bar$")
    public void user_is_on_php_travels_homepage_with_tours_bar() throws Throwable {

        WebBrowserLaunch.Launch();
        Actions.ToursBarClick();
    }

    @When("^User picks Tours bar filters for each section$")
    public void user_picks_tours_bar_filters_for_each_section() throws Throwable {

        PickHomeSearchBarOptions.ToursSearchBar.SearchByListingOrCityName("Dubai", 1, 1);
        PickHomeSearchBarOptions.ToursSearchBar.TourDate(2019, "Jul", 20);
        PickHomeSearchBarOptions.ToursSearchBar.NumberOfGuests(2);
        PickHomeSearchBarOptions.ToursSearchBar.TourType("Co", 2);
    }

    @Then("^User clicks Tours bar Search button$")
    public void user_clicks_tours_bar_search_button() throws Throwable {

        PickHomeSearchBarOptions.ToursSearchBar.SearchBy();
    }

    @And("^Tours with picked criteria is visible on the Tours module Page$")
    public void tours_with_picked_criteria_is_visible_on_the_tours_module_page() throws Throwable {

        TestAssertions.FinalTourBarPageCheck();
    }
}

