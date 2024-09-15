package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomeTest3 {
    private WebDriver driver;
    @FindBy(id = "dropdownMenuButton")
    private WebElement dropDownMenuButton;

    @FindBy(xpath = "//a[text()='Option 3']")
    private WebElement option3;

    public HomeTest3(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyDefaultOption(String option) {
        Assert.assertTrue(dropDownMenuButton.getText().contains(option));
    }

    public void selectOption3(String option){
        dropDownMenuButton.click();
        Assert.assertTrue(option3.isDisplayed());
        option3.click();
        Assert.assertTrue(dropDownMenuButton.getText().contains(option));
    }

}
