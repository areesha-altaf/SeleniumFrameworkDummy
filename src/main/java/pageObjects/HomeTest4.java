package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomeTest4 {
    private WebDriver driver;
    // Locators
    @FindBy(xpath = "//div[@id='test-4-div']/button[contains(@class, 'btn-primary')]")
    private WebElement firstButton;

    @FindBy(xpath = "//div[@id='test-4-div']/button[contains(@class, 'btn-secondary')]")
    private WebElement secondButton;

    public HomeTest4(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize page elements
    }

    public void verifyFirstButtonEnabled(){
        Assert.assertTrue(firstButton.isEnabled());
    }

    public void verifySecondButtonDisabled(){
        Assert.assertFalse(secondButton.isEnabled());
    }


}
