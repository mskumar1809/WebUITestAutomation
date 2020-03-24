package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.locators.AutomationPracticeProductDetailsPageLocators;
import pages.locators.AutomationPracticeShoppingCartPageLocators;

import utils.SeleniumDriver;

import java.util.List;

import static org.junit.Assert.*;

public class AutomationPracticeShoppingCartPageActions {
    AutomationPracticeShoppingCartPageLocators automationPracticeShoppingCartPageLocators = null;

    public AutomationPracticeShoppingCartPageActions() {
        this.automationPracticeShoppingCartPageLocators = new AutomationPracticeShoppingCartPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), automationPracticeShoppingCartPageLocators);
    }

    public void verifyTheProductNamesInShoppingCart(String [] dressNameArray){
        List<WebElement> productSet = automationPracticeShoppingCartPageLocators.productsSummaryTable;
        int numberofProducts = dressNameArray.length;
        assertEquals(productSet.size(), numberofProducts);
        for(int index =0; index<dressNameArray.length; index++ ) {
            assertTrue(productSet.get(index).getText().contains(dressNameArray[index]));
        }
    }

    public void verifyTheProductsSizeInShoppingCart(String [] sizeArray){
        List<WebElement> productSet = automationPracticeShoppingCartPageLocators.productsSummaryTable;

        for(int index =0; index<sizeArray.length; index++ ) {
            assertTrue(productSet.get(index).getText().contains(sizeArray[index]));
        }
    }
}
