package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomeSearchBarElements {

    public HomeSearchBarElements() {
        PageFactory.initElements(Driver.driver, this);
    }

    //Modules SearchBars

    @FindBy(how = How.CSS, using = "#body-section > section > div.cell > div > div > div.col-md-12 > ul > li:nth-child(1) > a")

    public WebElement HomeHotelsBar;

    @FindBy(how = How.CSS, using = "#body-section > section > div.cell > div > div > div.col-md-12 > ul > li:nth-child(2) > a")

    public WebElement HomeFlightsBar;

    @FindBy(how = How.CSS, using = "#body-section > section > div.cell > div > div > div.col-md-12 > ul > li:nth-child(4) > a")

    public WebElement HomeCarsBar;

    @FindBy(how = How.CSS, using = "#body-section > section > div.cell > div > div > div.col-md-12 > ul > li:nth-child(3) > a")

    public WebElement HomeToursBar;

    @FindBy(how = How.CSS, using = "#body-section > section > div.cell > div > div > div.col-md-12 > ul > li:nth-child(5) > a")

    public WebElement HomeVisaBar;

    //Hotels SearchBar

    @FindBy(how = How.CSS, using = "#s2id_autogen8 > a > span.select2-chosen")

    public WebElement SearchByHotelOrCityNameUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement SearchByHotelOrCityNameActive;

    @FindBy(how = How.CSS, using = "#dpd1 > div > input")

    public WebElement HotelCalendarCheckInField;

    @FindBy(how = How.CSS, using = "#dpd2 > div > input")

    public WebElement HotelCalendarCheckOutField;

    @FindBy(how = How.CSS, using = "#travellersInput")

    public WebElement AdultOrChildField;

    @FindBy(how = How.CSS, using = "#HOTELS > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button")

    public WebElement HotelsSearchBy;

    //Flights SearchBar

    @FindBy(how = How.CSS, using = "#s2id_location_from > a")

    public WebElement FromCityOrAirportUnactive;

    @FindBy(how = How.CSS, using = "#s2id_location_to > a")

    public WebElement ToCityOrAirportUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement FromCityOrAirportActive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement ToCityOrAirportActive;

    @FindBy(how = How.CSS, using = "#flights > form > div:nth-child(3) > div > input")

    public WebElement StartFlightDate;

    @FindBy(how = How.CSS, using = "#flights > form > div:nth-child(4) > div > input")

    public WebElement ReturnFlightDate;

    @FindBy(how = How.CSS, using = "#flights > form > div.col-md-1.form-group.go-right.col-xs-12 > div > input")

    public WebElement NumberOfQuestsField;

    @FindBy(how = How.CSS, using = "#flights > form > div.bgfade.col-md-1.col-xs-12.search-button > button")

    public WebElement FlightSearchBy;

    @FindBy(how = How.CSS, using = "#flights > form > div.trip-check > div:nth-child(1) > div > div > ins")

    public WebElement OneWayButton;

    @FindBy(how = How.CSS, using = "#flights > form > div.trip-check > div:nth-child(2) > div > div > ins")

    public WebElement RoundTripButton;

    @FindBy(how = How.CSS, using = "#flights > form > div.trip-check > div.go-text-right.form-horizontal > div > select")

    public WebElement ClassDropDownList;

    @FindBy(how = How.CSS, using = "#flights > form > div.col-md-1.form-group.go-right.col-xs-12 > div > input")

    public WebElement PickPassengersNumber;

    @FindBy(how = How.CSS, using = "#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(1) > div.col-sm-5.col-xs-5 > select")

    public WebElement NumberOfAdultsDropDownList;

    @FindBy(how = How.CSS, using = "#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(2) > div.col-sm-5.col-xs-5 > select")

    public WebElement NumberOfChildrenDropDownList;

    @FindBy(how = How.CSS, using = "#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(3) > div.col-sm-5.col-xs-5 > select")

    public WebElement NumberOfInfantsDropDownList;

    @FindBy(how = How.CSS, using = "#sumManualPassenger")

    public WebElement QuestsDoneButton;

    //Tours SearchBar

    @FindBy(how = How.CSS, using = "#s2id_autogen10 > a > span.select2-chosen")

    public WebElement SearchByListingOrCityUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement SearchByListingOrCityActive;

    @FindBy(how = How.CSS, using = "#tchkin > div > input")

    public WebElement TourCalendarField;

    @FindBy(how = How.CSS, using = "#adults")

    public WebElement QuestsDropDownList;

    @FindBy(how = How.CSS, using = "#s2id_tourtype > a")

    public WebElement KindOfTour;

    @FindBy(how = How.CSS, using = "#TOURS > form > div.col-md-2.form-group.go-right.col-xs-12.search-button > button")

    public WebElement TourSearchBy;

    //Cars SearchBar

    @FindBy(how = How.CSS, using = "#s2id_carlocations > a > span.select2-chosen")

    public WebElement PickupLocationUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement PickUpLocationActive;

    @FindBy(how = How.CSS, using = "#s2id_carlocations2 > a > span.select2-chosen")

    public WebElement DropOffLocationUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement DropOffLocationActive;

    @FindBy(how = How.CSS, using = "#departcar")

    public WebElement FromCarCalendarField;

    @FindBy(how = How.CSS, using = "#CARS > form > div:nth-child(4) > div > select")

    public WebElement FromTimeDropDownList;

    @FindBy(how = How.CSS, using = "#returncar")

    public WebElement ToCarCalendarField;

    @FindBy(how = How.CSS, using = "#CARS > form > div:nth-child(6) > div > select")

    public WebElement ToTimeDropDownList;

    @FindBy(how = How.CSS, using = "#CARS > form > div.bgfade.col-md-2.form-group.go-right.col-xs-12.search-button > button")

    public WebElement CarSearchBy;

    //Visa

    @FindBy(how = How.CSS, using = "#s2id_autogen4 > a")

    public WebElement SelectFirstCountryUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement SelectFirstCountryActive;

    @FindBy(how = How.CSS, using = "#s2id_autogen6 > a")

    public WebElement SelectSecondCountryUnactive;

    @FindBy(how = How.CSS, using = "#select2-drop > div > input")

    public WebElement SelectSecondCountryActive;

    @FindBy(how = How.CSS, using = "#VISA > form > div.col-md-4.form-group.go-right.col-xs-12.search-button > button")

    public WebElement VisaSearchBy;


}
