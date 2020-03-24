package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.locators.AutomationPracticeLandingPageLocators;
import pages.locators.AutomationPracticeProductDetailsPageLocators;
import utils.SeleniumDriver;
import static org.junit.Assert.assertTrue;

public class AutomationPracticeProductDetailsPageActions {
    AutomationPracticeProductDetailsPageLocators automationPracticeProductDetailsPageLocators = null;

    public AutomationPracticeProductDetailsPageActions() {
        this.automationPracticeProductDetailsPageLocators = new AutomationPracticeProductDetailsPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeProductDetailsPageLocators);
    }

    public void clickOnWomenButton(){
        automationPracticeProductDetailsPageLocators.subMenuWomen.click();
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.visibilityOf(automationPracticeProductDetailsPageLocators.womenLogo));
        assertTrue(automationPracticeProductDetailsPageLocators.womenLogo.isDisplayed());

    }

    public void chooseTheDesiredProduct(String[] productName, String [] quantityArray, String [] sizeArray){
        int index = 0;
        for (String dressName: productName) {
            WebElement ProductToSelect = SeleniumDriver.getDriver().findElement(new By.ByXPath
                    ("//div[@id='center_column']//a[@class='product-name' and contains(text(),'" + dressName + "')]"));
            SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(ProductToSelect));
            ProductToSelect.click();
            assertTrue(automationPracticeProductDetailsPageLocators.productName.getText().toLowerCase().contentEquals(dressName.toLowerCase()));
            setQuantity(index, quantityArray);
            setSize(index, sizeArray);
            clickOnAddToCart();
            clickOnContinueShopping();
            index++;
            SeleniumDriver.getDriver().navigate().back();
        }

    }

    public void setQuantity(int index, String [] quantityArray){
        String quantity = quantityArray[index];
        automationPracticeProductDetailsPageLocators.quantity.clear();
        automationPracticeProductDetailsPageLocators.quantity.sendKeys(quantity);
        assertTrue(automationPracticeProductDetailsPageLocators.quantity.getAttribute("value").contentEquals(quantity));
    }

    public void setSize(int index, String[] sizeArray){
        String textValue = sizeArray[index];
        Select dropdown = new Select(automationPracticeProductDetailsPageLocators.sizeDropdown);
        dropdown.selectByVisibleText(textValue);
    }

    public void clickOnAddToCart(){
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeProductDetailsPageLocators.addToCart));
        automationPracticeProductDetailsPageLocators.addToCart.click();
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.visibilityOf(automationPracticeProductDetailsPageLocators.productAddedSucccessfulText));
        assertTrue(automationPracticeProductDetailsPageLocators.productAddedSucccessfulText.getText().contains("successfully"));
    }

    public void clickOnContinueShopping() {
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeProductDetailsPageLocators.continueShoppingButton));
        automationPracticeProductDetailsPageLocators.continueShoppingButton.click();
    }

    public void clickOnCart() {
        SeleniumDriver.getWaitDriver().until(ExpectedConditions.elementToBeClickable(automationPracticeProductDetailsPageLocators.shoppingCartButton));
        automationPracticeProductDetailsPageLocators.shoppingCartButton.click();
    }

}

