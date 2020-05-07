package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeAddressPageLocators;
import pages.locators.AutomationPracticePaymentPageLocators;
import pages.locators.AutomationPracticeShippingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeShippingPageActions {
    AutomationPracticeShippingPageLocators automationPracticeShippingPageLocators = null;
    AutomationPracticePaymentPageLocators automationPracticePaymentPageLocators = null;

    public AutomationPracticeShippingPageActions() {
        this.automationPracticeShippingPageLocators = new AutomationPracticeShippingPageLocators();
        this.automationPracticePaymentPageLocators = new AutomationPracticePaymentPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeShippingPageLocators);
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticePaymentPageLocators);
    }

    public void acceptTermsAndClickOnProceedToCheckout() {

        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeShippingPageLocators.proceedToCheckout));
        automationPracticeShippingPageLocators.acceptTerms.click();
        automationPracticeShippingPageLocators.proceedToCheckout.click();
        assertTrue(automationPracticePaymentPageLocators.paymentMethodText.getText().contains("PAYMENT"));

    }
}
