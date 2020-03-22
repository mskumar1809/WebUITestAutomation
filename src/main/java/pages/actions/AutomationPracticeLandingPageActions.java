package pages.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
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
        automationPracticeLandingPageLocators.signInButton.click();
        assertTrue(automationPracticeLandingPageLocators.emailTextField.isDisplayed());
    }

    public void enterEmailAddress(String emailAddress) {
        automationPracticeLandingPageLocators.emailTextField.sendKeys(emailAddress);
        String enteredValue = automationPracticeLandingPageLocators.emailTextField.getAttribute("value");
        assertTrue(enteredValue.contentEquals(emailAddress));
    }

    public void enterPassword(String password){
        automationPracticeLandingPageLocators.passwordTextField.sendKeys(password);
        String enteredValue = automationPracticeLandingPageLocators.passwordTextField.getAttribute("value");
        assertTrue(enteredValue.contentEquals(password));
    }

    public void clickOnSubmitButton(){
        automationPracticeLandingPageLocators.SubmitLoginButton.click();
    }

    public void verifyTheAuthenticationFailed(){
        String text = automationPracticeLandingPageLocators.errorMessage.getText();
        assertTrue(text.contains("Authentication failed."));
    }

    public void verifyThePasswordRequired(){
        String text = automationPracticeLandingPageLocators.errorMessage.getText();
        assertTrue(text.contains("Password is required."));
    }

    public void verifyTheEmailRequired(){
        String text = automationPracticeLandingPageLocators.errorMessage.getText();
        assertTrue(text.contains("An email address required."));
    }

    public void verifySuccessfulLogin(){
        String text = automationPracticeLandingPageLocators.myAccount.getText();
        assertTrue(text.contentEquals("My Account"));
    }

}
