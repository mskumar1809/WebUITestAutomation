package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeOrderSummaryPageLocators;
import pages.locators.AutomationPracticePaymentPageLocators;
import pages.locators.AutomationPracticeShippingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticePaymentPageActions {
    AutomationPracticePaymentPageLocators automationPracticePaymentPageLocators = null;
    AutomationPracticeOrderSummaryPageLocators automationPracticeOrderSummaryPageLocators = null;

    public AutomationPracticePaymentPageActions() {
        this.automationPracticePaymentPageLocators = new AutomationPracticePaymentPageLocators();
        this.automationPracticeOrderSummaryPageLocators = new AutomationPracticeOrderSummaryPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticePaymentPageLocators);
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeOrderSummaryPageLocators);
    }

    public void clickOnPayByCheck() {

        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticePaymentPageLocators.payByCheckButton));
        automationPracticePaymentPageLocators.payByCheckButton.click();
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.visibilityOf(automationPracticeOrderSummaryPageLocators.orderSummaryText));
        assertTrue(automationPracticeOrderSummaryPageLocators.orderSummaryText.getText().contains("SUMMARY"));
    }
}
