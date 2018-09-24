package AutomationProject.MainFolder;

import AutomationProject.UI_Elements.HomeSearchBarElements;;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.List;

public class PickHomeSearchBarOptions {

    static WebDriverWait wait = new WebDriverWait(Driver.driver, 10);

    static HomeSearchBarElements homeSearchBarElements = new HomeSearchBarElements();

    public static class HotelSearchBar {

        public static void HotelOrLocation(String HotelOrLocation, int Category, int PositionInCategory) throws InterruptedException {

            try {

                homeSearchBarElements.SearchByHotelOrCityNameUnactive.click();

                homeSearchBarElements.SearchByHotelOrCityNameActive.sendKeys(HotelOrLocation);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-drop > ul > li:nth-child(1) > ul > li:nth-child(1)")));

                Driver.driver.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(" + Category + ") > ul > li:nth-child(" + PositionInCategory + ")")).click();
            } catch (Exception ele) {

                System.out.println("The amount of results do not match with selected category number or category position!");
            }
        }

        public static class PickDate {

            public static void CheckIn(int year, String month, int day) {

                homeSearchBarElements.HotelCalendarCheckInField.click();

                Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

                int currentYear = Calendar.getInstance().get(Calendar.YEAR);

                int calculation = year - currentYear;

                for (int i = Math.abs(calculation); i > 0; i--) {

                    if (year >= currentYear) {

                        Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(13) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(3)")).click();
                    } else {

                        Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(13) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(1)")).click();
                    }
                }

                for (int i = 1; i <= 12; i++) {

                    String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                    if (monthName.contentEquals(month)) {

                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();
                    }
                }

                Driver.driver.findElement(By.cssSelector(".dpd1")).click();

                String MyDay = Integer.toString(day);

                WebElement tBody = Driver.driver.findElement(By.cssSelector("body > div:nth-child(13) > div.datepicker-days > table > tbody"));

                List<WebElement> columns = tBody.findElements(By.tagName("td"));

                for (WebElement cell : columns) {
                    if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old")) {
                        cell.click();
                        break;
                    }
                }
            }

            public static void CheckOut(int year, String month, int day) {

                Driver.driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

                String visibleDate0 = Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(14) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)")).getText();

                int visibleDate = Integer.parseInt(visibleDate0);

                int calculation = year - visibleDate;

                for (int i = Math.abs(calculation); i > 0; i--) {

                    if (year >= visibleDate) {

                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-months > table > thead > tr > th.next")).click();
                    } else {

                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-months > table > thead > tr > th.prev")).click();
                    }
                }

                for (int i = 1; i <= 12; i++) {

                    String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                    if (monthName.contentEquals(month)) {

                        Driver.driver.findElement(By.cssSelector("body > div:nth-child(14) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();
                    }
                }

                Driver.driver.findElement(By.cssSelector("#dpd2 > div > input")).click();

                String MyDay = Integer.toString(day);

                WebElement tBody = Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(14) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2)"));

                List<WebElement> columns = tBody.findElements(By.tagName("td"));

                for (WebElement cell : columns)

                {
                    if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old"))

                    {
                        cell.click();
                        break;
                    }
                }
            }
        }

        public static void AdultAndChildrenNumber(int adult, int children) {

            homeSearchBarElements.AdultOrChildField.click();

            int calculation = adult - 2;

            if (adult >= 2) {

                for (int i = 0; i < calculation; i++) {

                    Driver.driver.findElement(By.cssSelector("#adultPlusBtn")).click();
                }
            } else {

                for (int i = 2; i >= adult; i--) {

                    Driver.driver.findElement(By.cssSelector("#adultMinusBtn")).click();
                }
            }

            if (children > 0) {


                for (int i = 0; i < children; i++) {

                    Driver.driver.findElement(By.cssSelector("#childPlusBtn")).click();
                }
            } else {
            }
        }

        public static void HotelSearch() {

            homeSearchBarElements.HotelsSearchBy.click();
        }
    }

    public static class FlightsSearchBar {

        public static void EnterCityOrAirportFrom(String HotelOrLocation, int PositionNumber) throws InterruptedException {

            try {

                homeSearchBarElements.FromCityOrAirportUnactive.click();

                homeSearchBarElements.FromCityOrAirportActive.sendKeys(HotelOrLocation);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select2-results-dept-0")));

                if (PositionNumber == 1) {

                    Driver.driver.findElement(By.cssSelector(".select2-results-dept-0")).click();
                } else {
                    Driver.driver.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(" + PositionNumber + ")")).click();
                }
            } catch (Exception ele) {

                System.out.println("The amount of results do not match with selected position!");
            }
        }

        public static void EnterCityOrAirportDeparture(String HotelOrLocation, int PositionNumber) throws InterruptedException {

            try {

                homeSearchBarElements.ToCityOrAirportUnactive.click();

                homeSearchBarElements.ToCityOrAirportActive.sendKeys(HotelOrLocation);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".select2-results-dept-0")));

                if (PositionNumber == 1) {

                    Driver.driver.findElement(By.cssSelector(".select2-results-dept-0")).click();
                } else {
                    Driver.driver.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(" + PositionNumber + ")")).click();
                }
            } catch (Exception ele) {

                System.out.println("The amount of results do not match with selected position!");
            }

        }

        public static void OneWay() {

            homeSearchBarElements.OneWayButton.click();
        }

        public static void RoundTrip() {

            homeSearchBarElements.RoundTripButton.click();
        }

        public static void PickClass(String Class) {

            homeSearchBarElements.ClassDropDownList.click();

            Select PickUp = new Select(Driver.driver.findElement(By.cssSelector("#flights > form > div.trip-check > div.go-text-right.form-horizontal > div > select")));

            PickUp.selectByVisibleText(Class);
        }

        public static void DepartDate(int year, String month, int day) {

            homeSearchBarElements.StartFlightDate.click();

            Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            int calculation = year - currentYear;

            for (int i = Math.abs(calculation); i > 0; i--) {

                if (year >= currentYear) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-months > table > thead > tr > th.next")).click();
                } else {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-months > table > thead > tr > th.prev")).click();
                }
            }

            for (int i = 1; i <= 12; i++) {

                String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                if (monthName.contentEquals(month)) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();
                }
            }

            Driver.driver.findElement(By.cssSelector("#flights > form > div:nth-child(3) > div > input")).click();

            String MyDay = Integer.toString(day);

            WebElement tBody = Driver.driver.findElement(By.cssSelector("body > div:nth-child(18) > div.datepicker-days > table > tbody"));

            List<WebElement> columns = tBody.findElements(By.tagName("td"));

            for (WebElement cell : columns) {
                if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old")) {
                    cell.click();
                    break;
                }
            }
        }

        public static void ReturnDate(int year, String month, int day) {

            Driver.driver.findElement(By.cssSelector("body > div:nth-child(19) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

            String visibleDate0 = Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(19) > div:nth-child(2) > table:nth-child(1) > thead:nth-child(1) > tr:nth-child(1) > th:nth-child(2)")).getText();

            int visibleDate = Integer.parseInt(visibleDate0);

            int calculation = year - visibleDate;

            for (int i = Math.abs(calculation); i > 0; i--) {

                if (year >= visibleDate) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(19) > div.datepicker-months > table > thead > tr > th.next")).click();
                } else {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(19) > div.datepicker-months > table > thead > tr > th.prev")).click();
                }
            }

            for (int i = 1; i <= 12; i++) {

                String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(19) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                if (monthName.contentEquals(month)) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(19) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();
                }
            }

            Driver.driver.findElement(By.cssSelector("#flights > form > div:nth-child(4) > div > input")).click();

            String MyDay = Integer.toString(day);

            WebElement tBody = Driver.driver.findElement(By.cssSelector("div.datepicker:nth-child(19) > div:nth-child(1) > table:nth-child(1) > tbody:nth-child(2)"));

            List<WebElement> columns = tBody.findElements(By.tagName("td"));

            for (WebElement cell : columns)

            {
                if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old"))

                {
                    cell.click();
                    break;
                }
            }
        }

        public static void NumberOfQuests(int adults, int child, int infants) {

            homeSearchBarElements.NumberOfQuestsField.click();

            Select PickUpAdults = new Select(Driver.driver.findElement(By.cssSelector("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(1) > div.col-sm-5.col-xs-5 > select")));

            String adultsString = Integer.toString(adults);

            PickUpAdults.selectByVisibleText(adultsString);


            Select PickUpChild = new Select(Driver.driver.findElement(By.cssSelector("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(2) > div.col-sm-5.col-xs-5 > select")));

            String childString = Integer.toString(child);

            PickUpChild.selectByVisibleText(childString);


            Select PickUpInfants = new Select(Driver.driver.findElement(By.cssSelector("#manual_flightTravelers > div > div > div.modal-body > section > div > div:nth-child(3) > div.col-sm-5.col-xs-5 > select")));

            String infantsString = Integer.toString(infants);

            PickUpInfants.selectByVisibleText(infantsString);

        }

        public static void ConfirmQuests() {

            homeSearchBarElements.QuestsDoneButton.click();
        }

        public static void SearchBy() {

            homeSearchBarElements.FlightSearchBy.click();
        }
    }

    public static class ToursSearchBar {

        public static void SearchByListingOrCityName(String ListingOrCity, int PositionInCategory, int Category) {

            try {

                homeSearchBarElements.SearchByListingOrCityUnactive.click();

                homeSearchBarElements.SearchByListingOrCityActive.sendKeys(ListingOrCity);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-drop > ul > li:nth-child(1) > ul > li:nth-child(1)")));

                Driver.driver.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(" + Category + ") > ul > li:nth-child(" + PositionInCategory + ")")).click();
            } catch (Exception ele) {

                System.out.println("The amount of results do not match with selected category number or category position!");
            }
        }

        public static void TourDate(int year, String month, int day) {

            homeSearchBarElements.TourCalendarField.click();

            Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-days > table > thead > tr:nth-child(1) > th.switch")).click();

            int currentYear = Calendar.getInstance().get(Calendar.YEAR);

            int calculation = year - currentYear;

            for (int i = Math.abs(calculation); i > 0; i--) {

                if (year >= currentYear) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-months > table > thead > tr > th.next")).click();
                } else {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-months > table > thead > tr > th.prev")).click();
                }
            }

            for (int i = 1; i <= 12; i++) {

                String monthName = Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).getText();

                if (monthName.contentEquals(month)) {

                    Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-months > table > tbody > tr > td > span:nth-child(" + i + ")")).click();
                }
            }

            Driver.driver.findElement(By.cssSelector("#tchkin > div > input")).click();

            String MyDay = Integer.toString(day);

            WebElement tBody = Driver.driver.findElement(By.cssSelector("body > div:nth-child(15) > div.datepicker-days > table > tbody"));

            List<WebElement> columns = tBody.findElements(By.tagName("td"));

            for (WebElement cell : columns) {
                if (cell.getText().equals(MyDay) && !cell.getAttribute("Class").equals("day  old")) {
                    cell.click();
                    break;
                }
            }

        }

        public static void NumberOfGuests(int NumberOfGuests) {

            if (NumberOfGuests <= 5 && NumberOfGuests > 0) {

                homeSearchBarElements.QuestsDropDownList.click();

                Select PickGuestsNumber = new Select(Driver.driver.findElement(By.cssSelector("#adults")));

                String GuestsNumber = Integer.toString(NumberOfGuests);

                PickGuestsNumber.selectByVisibleText(GuestsNumber + " Guests");
            } else {

                System.out.println("Please pick a value between 0 and 5!");
            }
        }

        public static void TourType(String TourType, int position) {

            homeSearchBarElements.KindOfTour.click();

            Driver.driver.findElement(By.cssSelector("#select2-drop > div > input")).sendKeys(TourType);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#select2-drop > ul > li:nth-child(2)")));

            Driver.driver.findElement(By.cssSelector("#select2-drop > ul > li:nth-child(" + position + ")")).click();
        }

        public static void SearchBy() {

            homeSearchBarElements.TourSearchBy.click();
        }


    }

}