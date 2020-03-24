package steps;

import cucumber.api.PendingException;
import org.junit.Test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.AutomationPracticeAuthenticationPageActions;
import pages.actions.AutomationPracticeLandingPageActions;

import pages.actions.AutomationPracticeProductDetailsPageActions;
import pages.actions.AutomationPracticeShoppingCartPageActions;
import utils.SeleniumDriver;

public class AutomationPracticeSteps {


    AutomationPracticeLandingPageActions automationPracticeLandingPageActions = new AutomationPracticeLandingPageActions();
    AutomationPracticeAuthenticationPageActions automationPracticeAuthenticationPageActions = new AutomationPracticeAuthenticationPageActions();
    AutomationPracticeProductDetailsPageActions automationPracticeProductDetailsPageActions = new AutomationPracticeProductDetailsPageActions();
    AutomationPracticeShoppingCartPageActions automationPracticeShoppingCartPageActions = new AutomationPracticeShoppingCartPageActions();

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
            case "Women":
                automationPracticeProductDetailsPageActions.clickOnWomenButton();
                break;
            case "cart":
                automationPracticeProductDetailsPageActions.clickOnCart();
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

    @When("^the user logs into the application successfully with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserLogsIntoTheApplicationSuccessfullyWithAnd(String emailAddress, String password) {
        automationPracticeLandingPageActions.clickOnSignInButton();
        automationPracticeAuthenticationPageActions.enterEmailAddress(emailAddress);
        automationPracticeAuthenticationPageActions.enterPassword(password);
        automationPracticeAuthenticationPageActions.clickOnSubmitButton();

    }


    @And("^the user chooses the products with desired details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void theUserChoosesTheProductsWithDesiredDetails(String dressNames, String quantities, String size) {
        String[] sizeArray = size.split(", ");
        String[] dressNameArray = dressNames.split(", ");
        String[] quantityArray = quantities.split(", ");
        automationPracticeProductDetailsPageActions.chooseTheDesiredProduct(dressNameArray, quantityArray, sizeArray );

    }


    @Then("^the user should see the Shopping-Cart with selected values of \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserShouldSeeTheShoppingCartWithSelectedValuesOfAnd(String dressNames, String quantities, String size)  {
        String[] sizeArray = size.split(", ");
        String[] dressNameArray = dressNames.split(", ");
        String[] quantityArray = quantities.split(", ");
        automationPracticeShoppingCartPageActions.verifyTheProductNamesInShoppingCart(dressNameArray);
        automationPracticeShoppingCartPageActions.verifyTheProductsSizeInShoppingCart(sizeArray);
    }
}


