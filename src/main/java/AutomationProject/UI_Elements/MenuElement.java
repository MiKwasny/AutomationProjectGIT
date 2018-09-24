package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenuElement {
    public MenuElement() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(how = How.CSS, using = "#collapse > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
    public WebElement HomeButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(2) > a:nth-child(1)")
    public WebElement HotelsButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(3) > a:nth-child(1)")
    public WebElement FlightsButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(4) > a:nth-child(1)")
    public WebElement ToursButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(5) > a:nth-child(1)")
    public WebElement CarsButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(6) > a:nth-child(1)")
    public WebElement VisaButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(7) > a:nth-child(1)")
    public WebElement OffersButton;

    @FindBy(how = How.CSS, using = "li.main-lnk:nth-child(8) > a:nth-child(1)")
    public WebElement BlogButton;
}


