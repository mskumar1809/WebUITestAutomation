package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AutomationPracticeLandingPageActions;
import pages.locators.AutomationPracticeLandingPageLocators;
import utils.SeleniumDriver;

public class AutomationPracticeSteps {

    AutomationPracticeLandingPageActions automationPracticeLandingPageActions = new AutomationPracticeLandingPageActions();

    @Given("^the user is on the home page \"([^\"]*)\"$")
    public void theUserIsOnTheHomePage(String BaseURL)   {
        SeleniumDriver.openPage(BaseURL);
        automationPracticeLandingPageActions.verifyTheLandingPage();
    }

    @And("^the user enters the \"([^\"]*)\" under \"([^\"]*)\" field$")
    public void entersTheUnderField(String fieldName, String userInput) {
        switch (fieldName) {
            case "emailaddress":
                automationPracticeLandingPageActions.enterEmailAddress(userInput);
                break;
            case "password":
                automationPracticeLandingPageActions.enterPassword(userInput);
                break;
        }
    }

    @When("^the user clicks on the \"([^\"]*)\" button$")
    public void theUserClicksOnTheButton(String buttonName)  {
        switch (buttonName) {
            case "SignIn":
                automationPracticeLandingPageActions.clickOnSignInButton();
                break;
            case "Submit":
                automationPracticeLandingPageActions.clickOnSubmitButton();
                break;
        }
    }

    @Then("^the user should see the corresponding \"([^\"]*)\"$")
    public void theUserShouldSeeTheCorresponding(String expected) {
        switch (expected) {
            case "InvalidPassword":
            case "InvalidEmail":
            case "InvalidDetails":
                automationPracticeLandingPageActions.verifyTheAuthenticationFailed();
                break;
            case "BlankPassword":
                automationPracticeLandingPageActions.verifyThePasswordRequired();
                break;
            case "BlankEmail":
            case "BlankDetails":
                automationPracticeLandingPageActions.verifyTheEmailRequired();
                break;
            case "Successful":
                break;
        }
    }
}


