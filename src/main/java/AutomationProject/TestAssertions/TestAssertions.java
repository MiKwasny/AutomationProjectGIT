package AutomationProject.TestAssertions;

import AutomationProject.MainFolder.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestAssertions {

    static WebDriverWait wait = new WebDriverWait(Driver.driver, 20);

    public static void FinalTourBarPageCheck() {

        String TourBarUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/tours/united-arab-emirates/dubai/Big-Bus-Tour-of-Dubai?date=20/07/2019&adults=2", TourBarUrl);
    }

    public static void FinaLoginPageCheck() {

        wait.until(ExpectedConditions.urlContains("http://www.phptravels.net/account/"));
        String LoginUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("http://www.phptravels.net/account/", LoginUrl);

    }

    public static void FinalLoginBookingPageCheck(){
        String bookingSelector = "#body-section > div > div.container.mt25.offset-0 > div > div.col-md-1.offset-0 > ul > li.active > a";
        WebElement bookingPage = Driver.driver.findElement(By.cssSelector(bookingSelector));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(bookingSelector)));
        Assert.assertEquals(true, bookingPage.isDisplayed());
    }

    public static void FinalHotelModulePageCheck() {

        wait.until(ExpectedConditions.urlContains("http://www.phptravels.net/hotels/search/5/80-400/98/183-189"));
        String HotelModuleUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("http://www.phptravels.net/hotels/search/5/80-400/98/183-189", HotelModuleUrl);
    }

    public static void FinalCarModulePageCheck() {

        String CarModuleUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/cars/search?stars=4&price=60%2C460&type=15&pickup=yes&txtSearch=&searching=&modType=", CarModuleUrl);
    }

    public static void FinalTourModulePageCheck() {

        String TourModuleUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/tours/search?stars=4&price=60%2C660&type=187&txtSearch=&searching=&modType=", TourModuleUrl);
    }

    public static void FinalFlightModulePageCheck() {

        String FlightModuleUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/flights/0/0/0/0/0/0/1/0/0/1/1/0", FlightModuleUrl);
    }


    public static void FinalHotelBarPageCheck() {

        wait.until(ExpectedConditions.urlContains("http://www.phptravels.net/hotels/detail/istanbul/alzer-hotel-istanbul/16-02-2019/25-08-2020/3/2"));
        String HotelBarUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("http://www.phptravels.net/hotels/detail/istanbul/alzer-hotel-istanbul/16-02-2019/25-08-2020/3/2", HotelBarUrl);
    }

    public static void FinalFlightBarPageCheck() {

        String FlightBarUrl = Driver.driver.getCurrentUrl();
        Assert.assertEquals("https://www.phptravels.net/flights/WAW/HEW/2018-11-20/2018-11-27/round/economy/2/1/0/0/0/0", FlightBarUrl);
    }


}