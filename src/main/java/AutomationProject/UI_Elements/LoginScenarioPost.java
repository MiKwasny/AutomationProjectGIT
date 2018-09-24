package AutomationProject.UI_Elements;

import AutomationProject.MainFolder.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginScenarioPost {
    public LoginScenarioPost() {
        PageFactory.initElements(Driver.driver, this);
    }

    @FindBy(how = How.CSS, using = "div.form-group:nth-child(1) > input:nth-child(2)")
    public WebElement UserNameField;

    @FindBy(how = How.CSS, using = ".panel-body > div:nth-child(2) > input:nth-child(2)")
    public WebElement PasswordField;

    @FindBy(how = How.CSS, using = "button.btn:nth-child(2)")
    public WebElement LoginButton;


}

