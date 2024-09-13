package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.net.URL;

public class HomeTest1 {
    private WebDriver driver;
    // Locators
    @FindBy(id = "inputEmail")
    private WebElement emailField;

    @FindBy(id = "inputPassword")
    private WebElement passwordField;

    @FindBy(css = "#test-1-div > form > button")
    private WebElement loginButton;

    public HomeTest1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize page elements
    }

    public void navigateToHomePage(String url) {

        URL resource = getClass().getClassLoader().getResource(url);
        if (resource != null) {
            String fileURL = resource.toString(); // Convert to file URL format
            driver.get(fileURL);
        } else {
            throw new RuntimeException("Resource not found: HomePageDoc.html");
        }

    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPassword(String pass){
        passwordField.sendKeys(pass);
    }

    public void verifyTest1Elements(){
        Assert.assertTrue(emailField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());
    }
}
