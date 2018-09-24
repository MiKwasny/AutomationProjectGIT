package AutomationProject.MainFolder;

import AutomationProject.UI_Elements.FilterPositions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static AutomationProject.MainFolder.Driver.driver;

public class PickFilters {

    private static FilterPositions filterPositions = new FilterPositions();

    public static class HotelPageFilters {

        public static class StarGrade {

            public static void StarsBar() {
                filterPositions.StarsBar.click();
            }

            public static void OneStar() {
                filterPositions.OneStar.click();
            }

            public static void TwoStar() {
                filterPositions.TwoStar.click();
            }

            public static void ThreeStar() {
                filterPositions.ThreeStar.click();
            }

            public static void FourStar() {
                filterPositions.FourStar.click();
            }

            public static void FiveStar() {
                filterPositions.FiveStar.click();
            }
        }

        public static class PriceRange {
            public static void PropertyTypesBar() {
                filterPositions.PropertyTypesBar.click();
            }

            public static void LeftPriceBarMove(int x) {

                WebElement slider = filterPositions.LeftPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, x, 0).build();
                action.perform();
            }

            public static void RightPriceBarMove(int x) {

                WebElement slider = filterPositions.RightPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, -x, 0).build();
                action.perform();
            }
        }

        public static class PropertyTypes {

            public static void Apartment() {
                filterPositions.Apartment.click();
            }

            public static void Hotel() {
                filterPositions.Hotel.click();
            }

            public static void GuestHouse() {
                filterPositions.GuestHouse.click();
            }

            public static void Motel() {
                filterPositions.Motel.click();
            }

            public static void Residence() {
                filterPositions.Residence.click();
            }

            public static void Resort() {
                filterPositions.Resort.click();
            }

            public static void TimeShare() {
                filterPositions.TimeShare.click();
            }

            public static void ExtendedStay() {
                filterPositions.ExtendedStay.click();
            }

            public static void Villa() {
                filterPositions.Villa.click();
            }
        }

        public static class Amenities {

            public static void CollapseAmenitiesBar() {
                filterPositions.CollapseAmenitiesBar.click();
            }

            public static void OpenAmenitiesBar() {
                filterPositions.OpenAmenitiesBar.click();
            }

            public static void AirportTransport() {
                filterPositions.AirportTransport.click();
            }

            public static void BusinessCenter() {
                filterPositions.BusinessCenter.click();
            }

            public static void DisabledFacilities() {
                filterPositions.DisabledFacilities.click();
            }

            public static void NightClub() {
                filterPositions.NightClub.click();
            }

            public static void LaundryService() {
                filterPositions.LaundryService.click();
            }

            public static void Restaurant() {
                filterPositions.Restaurant.click();
            }

            public static void WifiInternet() {
                filterPositions.WifiInternet.click();
            }

            public static void BarLounge() {
                filterPositions.BarLounge.click();
            }

            public static void SwimmingPool() {
                filterPositions.SwimmingPool.click();
            }

            public static void InsideParking() {
                filterPositions.InsideParking.click();
            }

            public static void ShuttleBusService() {
                filterPositions.ShuttleBusService.click();
            }

            public static void FitnessCenter() {
                filterPositions.FitnessCenter.click();
            }

            public static void Spa() {
                filterPositions.Spa.click();
            }

            public static void ChildrenActivities() {
                filterPositions.ChildrenActivities.click();
            }

            public static void AirConditioner() {
                filterPositions.AirConditioner.click();
            }

            public static void BanquetHall() {
                filterPositions.BanquetHall.click();
            }

            public static void CardsAccepted() {
                filterPositions.CardsAccepted.click();
            }

            public static void Elevator() {
                filterPositions.Elevator.click();
            }

            public static void PetsAllowed() {
                filterPositions.PetsAllowed.click();
            }
        }

        public static void SearchHotel() {

            filterPositions.SearchHotel.click();
        }
    }

    public static class FlightsPageFilters {

        public static void NonStop() {
            filterPositions.NonStop.click();
        }

        public static void Transit() {
            filterPositions.Transit.click();
        }

        public static void Refundable() {
            filterPositions.Refundable.click();
        }

        public static void SearchByAirLines(int FilterNumber) {
            driver.findElement(By.id("div.row:nth-child(8) > div:nth-child(1) > div:nth-child("+FilterNumber+") > ins:nth-child(2)")).click();
        }
    }

    public static class ToursPageFilters {

        public static class StarGrade {

            public static void StarsBar() {
                filterPositions.StarsBar.click();
            }

            public static void OneStar() {
                filterPositions.OneStar.click();
            }

            public static void TwoStar() {
                filterPositions.TwoStar.click();
            }

            public static void ThreeStar() {
                filterPositions.ThreeStar.click();
            }

            public static void FourStar() {
                filterPositions.FourStar.click();
            }

            public static void FiveStar() {
                filterPositions.FiveStar.click();
            }
        }

        public static class PriceRange {

            public static void PropertyTypesBar() {
                filterPositions.PropertyTypesBar.click();
            }

            public static void LeftPriceBarMove(int x) {

                WebElement slider = filterPositions.LeftPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, x, 0).build();
                action.perform();
            }

            public static void RightPriceBarMove(int x) {

                WebElement slider = filterPositions.RightPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, -x, 0).build();
                action.perform();
            }
        }

        public static class TourTypes {

            public static void TourTypesBar() {
                filterPositions.TourTypesBar.click();
            }

            public static void Private() {
                filterPositions.Private.click();
            }

            public static void JoinIn() {
                filterPositions.JoinIn.click();
            }

            public static void Adventure() {
                filterPositions.Adventure.click();
            }

            public static void Educational() {
                filterPositions.Educational.click();
            }

            public static void Corporate() {
                filterPositions.Corporate.click();
            }

            public static void Couples() {
                filterPositions.Couples.click();
            }

            public static void StaffTraining() {
                filterPositions.StaffTraining.click();
            }

            public static void DiscoveryTours() {
                filterPositions.DiscoveryTours.click();
            }

            public static void Family() {
                filterPositions.Family.click();
            }

            public static void Holidays1() {
                filterPositions.Holidays1.click();
            }

            public static void WildlifeSafaris() {
                filterPositions.WildlifeSafaris.click();
            }

            public static void Holidays2() {
                filterPositions.Holidays2.click();
            }

            public static void HistoryCulture() {
                filterPositions.HistoryCulture.click();
            }

            public static void BeachHolidays() {
                filterPositions.BeachHolidays.click();
            }

            public static void Sightseeing() {
                filterPositions.Sightseeing.click();
            }

        }

        public static void CarsSearch() {

            filterPositions.SearchTour.click();
        }
    }

    public static class CarsPageFilters {

        public static class StarGrade {

            public static void StarsBar() {
                filterPositions.StarsBar.click();
            }

            public static void OneStar() {
                filterPositions.OneStar.click();
            }

            public static void TwoStar() {
                filterPositions.TwoStar.click();
            }

            public static void ThreeStar() {
                filterPositions.ThreeStar.click();
            }

            public static void FourStar() {
                filterPositions.FourStar.click();
            }

            public static void FiveStar() {
                filterPositions.FiveStar.click();
            }
        }

        public static class PriceRange {
            public static void PropertyTypesBar() {
                filterPositions.PropertyTypesBar.click();
            }

            public static void LeftPriceBarMove(int x) {

                WebElement slider = filterPositions.LeftPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, x, 0).build();
                action.perform();
            }

            public static void RightPriceBarMove(int x) {

                WebElement slider = filterPositions.RightPriceRangeBar;

                Actions move = new Actions(Driver.driver);
                Action action = move.dragAndDropBy(slider, -x, 0).build();
                action.perform();
            }
        }

        public static class CarTypes {

            public static void Van() {
                filterPositions.Van.click();
            }

            public static void Luxury() {
                filterPositions.Luxury.click();
            }

            public static void FullSize() {
                filterPositions.FullSize.click();
            }

            public static void Standard() {
                filterPositions.Standard.click();
            }

            public static void Compact() {
                filterPositions.Compact.click();
            }

            public static void Economy() {
                filterPositions.Economy.click();
            }

            public static void Mini() {
                filterPositions.Mini.click();
            }

        }

        public static class AirPortPickUp {

            public static void Yes() {
                //filterPositions.ListSelect.click();

                //driver.findElement(By.linkText("Yes")).click();

                Select PickUp = new Select(driver.findElement(By.cssSelector("#collapse5 > div > select")));
                PickUp.selectByVisibleText("Yes");
            }

            public static void No() {
                //filterPositions.ListSelect.click();

                //driver.findElement(By.linkText("No")).click();

                Select PickUp = new Select(driver.findElement(By.cssSelector("#collapse5 > div > select")));
                PickUp.selectByVisibleText("No");
            }
        }

        public static void CarsSearch() {

            filterPositions.SearchCar.click();
        }

    }
}


