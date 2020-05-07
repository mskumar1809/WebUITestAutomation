package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeOrderConfirmationPageLocators;
import pages.locators.AutomationPracticeOrderSummaryPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeOrderSummaryPageActions {
    AutomationPracticeOrderSummaryPageLocators automationPracticeOrderSummaryPageLocators = null;
    AutomationPracticeOrderConfirmationPageLocators automationPracticeOrderConfirmationPageLocators = null;

    public AutomationPracticeOrderSummaryPageActions() {
        this.automationPracticeOrderSummaryPageLocators = new AutomationPracticeOrderSummaryPageLocators();
        this.automationPracticeOrderConfirmationPageLocators = new AutomationPracticeOrderConfirmationPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeOrderSummaryPageLocators);
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeOrderConfirmationPageLocators);
    }

    public void clickOnConfirmOrderButton() {

        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeOrderSummaryPageLocators.confirmOrderButton));
        automationPracticeOrderSummaryPageLocators.confirmOrderButton.click();
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.visibilityOf(automationPracticeOrderConfirmationPageLocators.orderSuccessText));
        assertTrue(automationPracticeOrderConfirmationPageLocators.orderSuccessText.getText().contains("My Store is complete"));
    }
}
