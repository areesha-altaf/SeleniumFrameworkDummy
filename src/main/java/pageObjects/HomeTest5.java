package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomeTest5 {
    private WebDriver driver;
    private String buttonLocatorText = "test5-button";

    @FindBy(id = "test5-button")
    private WebElement button;

    @FindBy(id = "test5-alert")
    private WebElement buttonAlert;

    By buttonLocator = By.id(buttonLocatorText);


    public HomeTest5(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void waitAndClickButton(){
        WebDriverWait wait = new WebDriverWait(driver, 30);  // Wait for up to 30 seconds
        wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
        button.click();
    }

    public void verifyButtonClickDisable(String msg){
        Assert.assertTrue(buttonAlert.getText().contains(msg));
        Assert.assertFalse(button.isEnabled());
    }

}
