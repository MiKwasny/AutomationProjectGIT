package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PathToLogin {

    public PathToLogin() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(how = How.CSS, using = "ul.navbar-side:nth-child(1) > li:nth-child(1) > a:nth-child(1)")
    public WebElement MyAccount;

    @FindBy(how = How.CSS, using = ".open > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)")
    public WebElement LoginPage;
}
