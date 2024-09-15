package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ReusableFunctions;


public class HomeTest6 {
    private WebDriver driver;
    @FindBy(className = "table")
    private WebElement table;

    public HomeTest6(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void findCellValue(int row, int column, String AppName){
        String cellValue = table.findElement(By.xpath(".//tr[" + (row + 1) + "]/td[" + (column + 1) + "]")).getText();
        Assert.assertTrue(cellValue.contains(AppName));
//        ReusableFunctions.waitFor3Seconds();
    }

}
