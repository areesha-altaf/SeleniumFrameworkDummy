package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected WebDriver driver;
    protected HomeTest1 homePageObj;
    protected HomeTest2 homePageObj2;
    protected HomeTest3 homePageObj3;
    protected HomeTest4 homePageObj4;

    @BeforeSuite
    public void setUp() {
        // Set up the WebDriver using WebDriver Manager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePageObj = new HomeTest1(driver); // Initialize homePageObj here
        homePageObj2 = new HomeTest2(driver);
        homePageObj3 = new HomeTest3(driver);
        homePageObj4 = new HomeTest4(driver);
    }

    @AfterSuite()
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
