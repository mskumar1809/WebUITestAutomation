package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeOrderConfirmationPageLocators;
import pages.locators.AutomationPracticeOrderSummaryPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeOrderConfirmationPageActions {
        AutomationPracticeOrderConfirmationPageLocators automationPracticeOrderConfirmationPageLocators = null;

        public AutomationPracticeOrderConfirmationPageActions() {
            this.automationPracticeOrderConfirmationPageLocators = new AutomationPracticeOrderConfirmationPageLocators();
            PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeOrderConfirmationPageLocators);
        }

        public void verifyTheOrderConfirmation() {
            SeleniumDriver.getWaitDriver().until(ExpectedConditions.visibilityOf(automationPracticeOrderConfirmationPageLocators.orderSuccessText));
            assertTrue(automationPracticeOrderConfirmationPageLocators.orderSuccessText.getText().contains("My Store is complete"));
        }
}
