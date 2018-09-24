package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class FilterPositions {

    public FilterPositions() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(3)")

    public WebElement StarsBar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(1) > div > ins")

    public WebElement OneStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(3) > div > ins")

    public WebElement TwoStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(5) > div > ins")

    public WebElement ThreeStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(7) > div > ins")

    public WebElement FourStar;

    @FindBy(how = How.CSS, using = "#collapse1 > div.hpadding20 > div > div:nth-child(9) > div > ins")

    public WebElement FiveStar;

    //Price Range

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(5)")

    public WebElement PriceRangeBar;

    @FindBy(how = How.CSS, using = "#collapse2 > div > div > div.slider-track > div:nth-child(2)")

    public WebElement LeftPriceRangeBar;

    @FindBy(how = How.CSS, using = "#collapse2 > div > div > div.slider-track > div:nth-child(3)")

    public WebElement RightPriceRangeBar;


    //Property Types

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(7)")

    public WebElement PropertyTypesBar;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement Apartment;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement Hotel;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement GuestHouse;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement Motel;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement Residence;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Resort;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement TimeShare;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(17) > div > ins")

    public WebElement ExtendedStay;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(19) > div > ins")

    public WebElement Villa;

    //Amenities

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button.collapsebtn.last.go-text-right")

    public WebElement CollapseAmenitiesBar;

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button.collapsebtn.last.go-text-right.collapsed")

    public WebElement OpenAmenitiesBar;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement AirportTransport;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement BusinessCenter;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement DisabledFacilities;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement NightClub;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement LaundryService;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Restaurant;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement WifiInternet;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(17) > div > ins")

    public WebElement BarLounge;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(19) > div > ins")

    public WebElement SwimmingPool;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(21) > div > ins")

    public WebElement InsideParking;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(23) > div > ins")

    public WebElement ShuttleBusService;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(25) > div > ins")

    public WebElement FitnessCenter;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(27) > div > ins")

    public WebElement Spa;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(29) > div > ins")

    public WebElement ChildrenActivities;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(31) > div > ins")

    public WebElement AirConditioner;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(33) > div > ins")

    public WebElement BanquetHall;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(35) > div > ins")

    public WebElement CardsAccepted;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(37) > div > ins")

    public WebElement Elevator;

    @FindBy(how = How.CSS, using = "#collapse4 > div.hpadding20 > div:nth-child(39) > div > ins")

    public WebElement PetsAllowed;

    //Search

    @FindBy(how = How.CSS, using = "#searchform")

    public WebElement SearchHotel;

    //Flights

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3 > div > div.panel-body > div:nth-child(1) > label > div > ins")

    public WebElement NonStop;

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3 > div > div.panel-body > div:nth-child(2) > label > div > ins")

    public WebElement Transit;

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3 > div > div.panel-body > div:nth-child(4) > div > div > ins")

    public WebElement Refundable;

    //Tours

    @FindBy(how = How.CSS, using = "#body-section > div.listingbg > div > div.col-md-3.hidden-sm.hidden-xs.filter > form > button:nth-child(7)")

    public WebElement TourTypesBar;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement Private;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement JoinIn;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement Adventure;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement Educational;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement Corporate;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Couples;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement StaffTraining;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(17) > div > ins")

    public WebElement DiscoveryTours;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(19) > div > ins")

    public WebElement Family;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(21) > div > ins")

    public WebElement Holidays1;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(23) > div > ins")

    public WebElement WildlifeSafaris;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(25) > div > ins")

    public WebElement Holidays2;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(27) > div > ins")

    public WebElement HistoryCulture;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(29) > div > ins")

    public WebElement BeachHolidays;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(31) > div > ins")

    public WebElement Sightseeing;

    @FindBy(how = How.CSS, using = "#searchform")

    public WebElement SearchTour;

    //Cars

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(3) > div > ins")

    public WebElement Van;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(5) > div > ins")

    public WebElement Luxury;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(7) > div > ins")

    public WebElement FullSize;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(9) > div > ins")

    public WebElement Standard;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(11) > div > ins")

    public WebElement Compact;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(13) > div > ins")

    public WebElement Economy;

    @FindBy(how = How.CSS, using = "#collapse3 > div.hpadding20 > div:nth-child(15) > div > ins")

    public WebElement Mini;

    @FindBy(how = How.CSS, using = "#searchform")

    public WebElement SearchCar;

//@FindBy(how = How.CSS, using = "#collapse5 > div > select")

//public WebElement ListSelect;
}


