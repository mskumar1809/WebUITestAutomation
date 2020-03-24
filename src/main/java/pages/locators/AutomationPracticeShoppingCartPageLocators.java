package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeShoppingCartPageLocators {

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/p[2]/a[1]")
    public WebElement proceedToCheckoutButton;
}
