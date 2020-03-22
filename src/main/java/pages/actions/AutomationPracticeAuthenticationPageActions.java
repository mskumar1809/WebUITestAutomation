package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.AutomationPracticeAuthenticationPageLocators;
import pages.locators.AutomationPracticeLandingPageLocators;
import utils.SeleniumDriver;

import static org.junit.Assert.assertTrue;

public class AutomationPracticeAuthenticationPageActions {

    AutomationPracticeAuthenticationPageLocators automationPracticeAuthenticationPageLocators = null;

    public AutomationPracticeAuthenticationPageActions() {
        this.automationPracticeAuthenticationPageLocators = new AutomationPracticeAuthenticationPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeAuthenticationPageLocators);
    }

    public void enterEmailAddress(String emailAddress) {
        automationPracticeAuthenticationPageLocators.emailTextField.sendKeys(emailAddress);
        String enteredValue = automationPracticeAuthenticationPageLocators.emailTextField.getAttribute("value");
        assertTrue(enteredValue.contentEquals(emailAddress));
    }

    public void enterPassword(String password){
        automationPracticeAuthenticationPageLocators.passwordTextField.sendKeys(password);
        String enteredValue = automationPracticeAuthenticationPageLocators.passwordTextField.getAttribute("value");
        assertTrue(enteredValue.contentEquals(password));
    }

    public void clickOnSubmitButton(){
        automationPracticeAuthenticationPageLocators.SubmitLoginButton.click();
    }

    public void verifyTheAuthenticationFailed(){
        String text = automationPracticeAuthenticationPageLocators.errorMessage.getText();
        assertTrue(text.contains("Authentication failed."));
    }

    public void verifyThePasswordRequired(){
        String text = automationPracticeAuthenticationPageLocators.errorMessage.getText();
        assertTrue(text.contains("Password is required."));
    }

    public void verifyTheEmailRequired(){
        String text = automationPracticeAuthenticationPageLocators.errorMessage.getText();
        assertTrue(text.contains("An email address required."));
    }

    public void verifySuccessfulLogin(){
        String text = automationPracticeAuthenticationPageLocators.myAccount.getText();
        assertTrue(text.contentEquals("My Account"));
    }
}
