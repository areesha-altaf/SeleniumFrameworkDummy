package testCases;

import org.testng.annotations.Test;
import pageObjects.BaseTest;
import utils.TestData;

public class HomePageTests extends BaseTest {

    @Test
    public void runTest1() {
        homePageObj.navigateToHomePage(TestData.BASE_URL);
        homePageObj.enterEmail(TestData.EMAIL);
        homePageObj.enterPassword(TestData.PASSWORD);
    }

    @Test
    public void runTest2() throws InterruptedException {
        homePageObj.verifyTest1Elements();
        homePageObj2.verifyListGroupSize(TestData.LIST_SIZE);
        homePageObj2.verifySecondListItem(TestData.SECOND_LIST_ITEM);
        homePageObj2.verifySecondListItemBadge(TestData.SECOND_LIST_ITEM_BADGE);
        Thread.sleep(10000);
    }
}