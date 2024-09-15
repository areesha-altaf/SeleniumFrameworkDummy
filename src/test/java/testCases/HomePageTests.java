package testCases;

import org.testng.annotations.Test;
import pageObjects.BaseTest;
import utils.TestData;

public class HomePageTests extends BaseTest {

    @Test(description = "Test 1: Verify email and password fields")
    public void runTest1() {
        homePageObj.navigateToHomePage(TestData.BASE_URL);
        homePageObj.enterEmail(TestData.EMAIL);
        homePageObj.enterPassword(TestData.PASSWORD);
    }

    @Test(description = "Test 2: Verify list group items")
    public void runTest2() {
        homePageObj.verifyTest1Elements();
        homePageObj2.verifyListGroupSize(TestData.LIST_SIZE);
        homePageObj2.verifySecondListItem(TestData.SECOND_LIST_ITEM);
        homePageObj2.verifySecondListItemBadge(TestData.SECOND_LIST_ITEM_BADGE);
    }

    @Test(description = "Test 3: Verify dropdown option selection")
    public void runTest3() {
        homePageObj3.verifyDefaultOption(TestData.OPTION_1);
        homePageObj3.selectOption3(TestData.OPTION_3);
    }

    @Test(description = "Test 4: Verify enabled and disabled buttons")
    public void runTest4() {
        homePageObj4.verifyFirstButtonEnabled();
        homePageObj4.verifySecondButtonDisabled();
    }

    @Test(description = "Test 5: Verify random wait button")
    public void runTest5() {
        homePageObj5.waitAndClickButton();
        homePageObj5.verifyButtonClickDisable(TestData.CLICK_MSG);
    }

    @Test(description = "Test 6: Verify table cell value")
    public void runTest6() {
        homePageObj6.findCellValue(TestData.CELL_INDEXES,TestData.CELL_INDEXES,TestData.CELL_NAME);
    }
}