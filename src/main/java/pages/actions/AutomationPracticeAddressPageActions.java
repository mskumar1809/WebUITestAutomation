package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeAddressPageLocators;
import pages.locators.AutomationPracticeAuthenticationPageLocators;
import pages.locators.AutomationPracticeShippingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeAddressPageActions {

    AutomationPracticeAddressPageLocators automationPracticeAddressPageLocators = null;
    AutomationPracticeShippingPageLocators automationPracticeShippingPageLocators = null;

    public AutomationPracticeAddressPageActions() {
        this.automationPracticeAddressPageLocators = new AutomationPracticeAddressPageLocators();
        this.automationPracticeShippingPageLocators = new AutomationPracticeShippingPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeAddressPageLocators);
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeShippingPageLocators);
    }

    public void clickOnProceedToCheckout() {

        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeAddressPageLocators.proceedToCheckout));
        automationPracticeAddressPageLocators.proceedToCheckout.click();
        assertTrue(automationPracticeShippingPageLocators.shippingText.getText().equalsIgnoreCase("shipping"));
    }
}
