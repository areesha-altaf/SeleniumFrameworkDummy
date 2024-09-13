package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.net.URL;
import java.util.List;

public class HomeTest2 {
    private WebDriver driver;
    // Locators
    @FindBy(className = "list-group")
    private WebElement listGroup;

    public HomeTest2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize page elements
    }

    public void verifyListGroupSize(int listSize) {
        List<WebElement> items = listGroup.findElements(By.tagName("li"));
        Assert.assertEquals(items.size(), listSize);
    }

    public void verifySecondListItem(String listItem2) {
        WebElement item2 = listGroup.findElements(By.className("list-group-item")).get(1);
        Assert.assertTrue(item2.getText().contains(listItem2));
    }

    public void verifySecondListItemBadge(String badge){
        WebElement item2badge = listGroup.findElements(By.className("list-group-item")).get(1).findElement(By.className("badge"));
        Assert.assertEquals(item2badge.getText(),badge);
    }

}
