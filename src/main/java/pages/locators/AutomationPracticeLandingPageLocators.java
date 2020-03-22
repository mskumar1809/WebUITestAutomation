package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutomationPracticeLandingPageLocators {

    @FindBy(how = How.CSS, using = ".login[title='Log in to your customer account']")
    public WebElement signInButton;

    @FindBy(how = How.CSS, using="#email")
    public WebElement emailTextField;

    @FindBy(how = How.CSS, using="#passwd")
    public WebElement passwordTextField;

    @FindBy(how = How.CSS, using="#SubmitLogin")
    public WebElement SubmitLoginButton;

    @FindBy(how = How.XPATH, using="//*[@id='center_column']/div[1]/ol/li")
    public WebElement errorMessage;

    @FindBy(how = How.CSS, using="#center_column > h1")
    public WebElement myAccount;

    @FindBy(how = How.CSS, using="#traffic-markup-analysis")
    public WebElement advancedTrafficMarkupCheckBox;

    @FindBy(how = How.CSS, using="#tried-test-cafe")
    public WebElement triedTestCafeCheckBox;

    @FindBy(how = How.CSS, using="#slider > span")
    public WebElement slider;

    @FindBy(how = How.CSS, using="#windows")
    public WebElement windowsRadioButton;

    @FindBy(how = How.CSS, using="#macos")
    public WebElement macOsRadioButton;

    @FindBy(how = How.CSS, using="#linux")
    public WebElement linuxRadioButton;

    @FindBy(how = How.CSS, using="#preferred-interface")
    public WebElement preferredInterfaceDropDown;

    @FindBy(how = How.CSS, using="#option")
    public WebElement option;

    @FindBy(how = How.CSS, using="#comments")
    public WebElement commentsFreeTextField;

    @FindBy(how = How.CSS, using="#submit-button")
    public WebElement submitButton;

}
