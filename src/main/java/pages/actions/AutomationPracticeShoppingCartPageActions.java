package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.locators.AutomationPracticeProductDetailsPageLocators;
import pages.locators.AutomationPracticeShoppingCartPageLocators;

import utils.SeleniumDriver;

import java.awt.*;
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
            String fullProductText = productSet.get(index).getText();
            String nameSubstringFromfullProductText = fullProductText.substring(0,fullProductText.indexOf("SKU")-1);
            assertTrue(dressNameArray[index].contains(nameSubstringFromfullProductText));
        }
    }

    public void verifyTheProductsSizeInShoppingCart(String [] sizeArray){
        List<WebElement> productSet = automationPracticeShoppingCartPageLocators.productsSummaryTable;
        for(int i =0; i<sizeArray.length; i++ ) {
            String fullProductText = productSet.get(i).getText();
            String sizeSubstringFromfullProductText = fullProductText.substring(fullProductText.indexOf("Size"),fullProductText.indexOf("Size")+9);
            assertTrue(sizeSubstringFromfullProductText.contains(sizeArray[i]));
        }
    }

    public void verifyTheProductQuantities(String [] quantityArray){
        for(int i = 1; i <= quantityArray.length; i++){
            WebElement tempElement = SeleniumDriver.getDriver().findElement(By.xpath("//table/tbody/tr["+i+"]/td[5]/input[2]"));
            assertTrue(tempElement.getAttribute("value").contentEquals(quantityArray[i-1]));
        }
    }
}
