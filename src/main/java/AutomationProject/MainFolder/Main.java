//package AutomationProject;
//
//import TestAssertions.TestAssertions;
//import org.junit.Before;
//import org.junit.Test;
//
//public class Main {
//
//    @Before
//
//    public void TestInitiation() {
//
//        WebBrowserLaunch.Launch();
//    }
//
//    @Test
//
//    public void LoginTest() {
//
//        try {
//
//            TitleCheck.TitleChecking("PHPTRAVELS | Travel Technology Partner");
//            Actions.GoToLoginPage();
//            Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);
//            TestAssertions.FinaLoginPageCheck();
//
//        } catch (Exception e) {
//
//        }
//    }
//
//    @Test
//
//    public void HotelModuleSearchTest() {
//
//        Actions.ClickHotelsButton();
//        PickFilters.HotelPageFilters.StarGrade.FiveStar();
//        PickFilters.HotelPageFilters.Amenities.BarLounge();
//        PickFilters.HotelPageFilters.Amenities.Spa();
//        PickFilters.HotelPageFilters.PropertyTypes.Hotel();
//        PickFilters.HotelPageFilters.PriceRange.LeftPriceBarMove(10);
//        PickFilters.HotelPageFilters.PriceRange.RightPriceBarMove(40);
//        PickFilters.HotelPageFilters.SearchHotel();
//        TestAssertions.FinalHotelModulePageCheck();
//    }
//
//    @Test
//
//    public void CarsModuleSearchTest() {
//
//        Actions.ClickCarsButton();
//        PickFilters.CarsPageFilters.AirPortPickUp.Yes();
//        PickFilters.CarsPageFilters.StarGrade.FourStar();
//        PickFilters.CarsPageFilters.CarTypes.Standard();
//        PickFilters.CarsPageFilters.PriceRange.LeftPriceBarMove(10);
//        PickFilters.CarsPageFilters.PriceRange.RightPriceBarMove(50);
//        PickFilters.CarsPageFilters.CarsSearch();
//        TestAssertions.FinalCarModulePageCheck();
//
//    }
//
//    @Test
//
//    public void ToursModuleSearchTest() {
//
//        Actions.ClickToursButton();
//        PickFilters.ToursPageFilters.StarGrade.FourStar();
//        PickFilters.ToursPageFilters.TourTypes.Private();
//        PickFilters.ToursPageFilters.PriceRange.LeftPriceBarMove(5);
//        PickFilters.ToursPageFilters.PriceRange.RightPriceBarMove(25);
//        PickFilters.ToursPageFilters.CarsSearch();
//        TestAssertions.FinalTourModulePageCheck();
//    }
//
//    @Test
//
//    public void FlightsModuleSearchTest() {
//
//
//        Actions.ClickFlightsButton();
//        PickFilters.FlightsPageFilters.NonStop();
//        PickFilters.FlightsPageFilters.Transit();
//        TestAssertions.FinalFlightModulePageCheck();
//    }
//
//    @Test
//
//    public void HotelBarTest() {
//
//        try {
//
//            PickHomeSearchBarOptions.HotelSearchBar.HotelOrLocation("istanbul", 1, 1);
//            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckIn(2019, "Feb", 16);
//            PickHomeSearchBarOptions.HotelSearchBar.PickDate.CheckOut(2020, "Aug", 25);
//            PickHomeSearchBarOptions.HotelSearchBar.AdultAndChildrenNumber(3, 2);
//            PickHomeSearchBarOptions.HotelSearchBar.HotelSearch();
//            TestAssertions.FinalHotelBarPageCheck();
//
//        } catch (Exception e) {
//
//        }
//    }
//
//    @Test
//
//    public void FlightBarTest() {
//
//        try {
//
//            Actions.FlightsBarClick();
//            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportFrom("Warsaw", 1);
//            PickHomeSearchBarOptions.FlightsSearchBar.EnterCityOrAirportDeparture("Athens", 2);
//            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
//            PickHomeSearchBarOptions.FlightsSearchBar.OneWay();
//            PickHomeSearchBarOptions.FlightsSearchBar.RoundTrip();
//            PickHomeSearchBarOptions.FlightsSearchBar.PickClass("Economy");
//            PickHomeSearchBarOptions.FlightsSearchBar.DepartDate(2018, "Nov", 20);
//            PickHomeSearchBarOptions.FlightsSearchBar.ReturnDate(2018, "Nov", 27);
//            PickHomeSearchBarOptions.FlightsSearchBar.NumberOfQuests(2, 1, 0);
//            PickHomeSearchBarOptions.FlightsSearchBar.ConfirmQuests();
//            PickHomeSearchBarOptions.FlightsSearchBar.SearchBy();
//            TestAssertions.FinalFlightBarPageCheck();
//
//        } catch (Exception e) {
//
//        }
//    }
//
//    @Test
//
//    public void ToursBarTest() {
//
//        Actions.ToursBarClick();
//        PickHomeSearchBarOptions.ToursSearchBar.SearchByListingOrCityName("Dubai", 1, 1);
//        PickHomeSearchBarOptions.ToursSearchBar.TourDate(2019, "Jul", 20);
//        PickHomeSearchBarOptions.ToursSearchBar.NumberOfGuests(2);
//        PickHomeSearchBarOptions.ToursSearchBar.TourType("Co", 2);
//        PickHomeSearchBarOptions.ToursSearchBar.SearchBy();
//        TestAssertions.FinalTourBarPageCheck();
//
//    }
//
//
//}






