package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AutomationPracticeProductDetailsPageLocators {

    @FindBy(how = How.XPATH, using = "//div[@class='right-block']//a[@class='product-name']")
    public List<WebElement> productNames;

    @FindBy(how = How.XPATH, using = "//div[@class='right-block']//div[@class='content_price']//span[@class='price product-price']")
    public List<WebElement> productPrices;

    @FindBy(how = How.XPATH, using = "//span[@id='our_price_display']")
    public WebElement productPrice;

    @FindBy(how = How.XPATH, using = "//h1[@itemprop='name']")
    public WebElement productName;

    @FindBy(how = How.XPATH, using = "//li//a[@title='Women' and not(img)]")
    public WebElement subMenuWomen;

    @FindBy(how = How.XPATH, using = "(//li//a[@title='Dresses' and not(img)])[2]")
    public WebElement subMenuDresses;

    @FindBy(how = How.XPATH, using = "(//li//a[@title='T-shirts' and not(img)])[2]")
    public WebElement subMenuTshirts;

    @FindBy(how = How.XPATH, using = "//span[@class='cat-name']")
    public WebElement subMenuChosenCategory;

    @FindBy(how = How.XPATH, using = "//*[@id='center_column']/div[1]/div/div/span")
    public WebElement womenLogo;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public WebElement quantity;

    @FindBy(how = How.XPATH, using = "//div[@id='uniform-group_1']//select")
    public WebElement sizeDropdown;

    @FindBy(how = How.CSS, using = "#add_to_cart > button")
    public WebElement addToCart;

    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[1]/h2")
    public WebElement productAddedSucccessfulText;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-default button button-medium']")
    public WebElement proceedToCheckoutButton;

    @FindBy(how = How.XPATH, using = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/span")
    public WebElement continueShoppingButton;

    @FindBy(how = How.XPATH, using = "//*[@title='View my shopping cart']")
    public WebElement shoppingCartButton;
}
