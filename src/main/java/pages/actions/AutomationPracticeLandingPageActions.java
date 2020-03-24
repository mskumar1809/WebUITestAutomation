package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.locators.AutomationPracticeLandingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;


public class AutomationPracticeLandingPageActions {

    AutomationPracticeLandingPageLocators automationPracticeLandingPageLocators = null;


    public AutomationPracticeLandingPageActions() {
        this.automationPracticeLandingPageLocators = new AutomationPracticeLandingPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeLandingPageLocators);
    }

    public void verifyTheLandingPage(){
        String actualTitle = SeleniumDriver.getDriver().getTitle();
        assertTrue(actualTitle.contains("Store"));
    }

    public void clickOnSignInButton() {
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeLandingPageLocators.signInButton));
        automationPracticeLandingPageLocators.signInButton.click();
        assertTrue(SeleniumDriver.getDriver().getCurrentUrl().contains("authentication"));
    }

}
