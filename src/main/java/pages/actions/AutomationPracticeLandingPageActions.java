package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AutomationPracticeAuthenticationPageLocators;
import pages.locators.AutomationPracticeLandingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
        automationPracticeLandingPageLocators.signInButton.click();
        assertTrue(SeleniumDriver.getDriver().getCurrentUrl().contains("authentication"));
    }

}
