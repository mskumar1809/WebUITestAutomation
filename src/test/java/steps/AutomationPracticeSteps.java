package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AutomationPracticeAuthenticationPageActions;
import pages.actions.AutomationPracticeLandingPageActions;

import utils.SeleniumDriver;

public class AutomationPracticeSteps {

    AutomationPracticeLandingPageActions automationPracticeLandingPageActions = new AutomationPracticeLandingPageActions();
    AutomationPracticeAuthenticationPageActions automationPracticeAuthenticationPageActions = new AutomationPracticeAuthenticationPageActions();
    
  
    @Given("^the user is on the home page \"([^\"]*)\"$")
    public void theUserIsOnTheHomePage(String BaseURL)   {
        SeleniumDriver.openPage(BaseURL);
        automationPracticeLandingPageActions.verifyTheLandingPage();
    }

    @And("^the user enters the \"([^\"]*)\" under \"([^\"]*)\" field$")
  
    public void entersTheUnderField(String fieldName, String userInput) {
        switch (fieldName) {
            case "emailaddress":
                automationPracticeAuthenticationPageActions.enterEmailAddress(userInput);
                break;
            case "password":
                automationPracticeAuthenticationPageActions.enterPassword(userInput);
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
                automationPracticeAuthenticationPageActions.clickOnSubmitButton();
                break;
        }
    }

    @Then("^the user should see the corresponding \"([^\"]*)\"$")
   
    public void theUserShouldSeeTheCorresponding(String expected) {
        switch (expected) {
            case "InvalidPassword":
            case "InvalidEmail":
            case "InvalidDetails":
                automationPracticeAuthenticationPageActions.verifyTheAuthenticationFailed();
                break;
            case "BlankPassword":
                automationPracticeAuthenticationPageActions.verifyThePasswordRequired();
                break;
            case "BlankEmail":
            case "BlankDetails":
                automationPracticeAuthenticationPageActions.verifyTheEmailRequired();
                break;
            case "Successful":
                break;
        }
    }
}


