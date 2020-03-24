package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeLandingPageLocators {

    @FindBy(how = How.CSS, using = ".login[title='Log in to your customer account']")
    public WebElement signInButton;
}
