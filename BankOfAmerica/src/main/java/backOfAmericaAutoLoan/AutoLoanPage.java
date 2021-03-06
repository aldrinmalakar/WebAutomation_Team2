package backOfAmericaAutoLoan;

import common.WebAPI;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import static backOfAmericaAutoLoan.autoLoanPageElements.*;

public class AutoLoanPage extends WebAPI {
    public void switchTab() {
        threadSleep(2000);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void threadSleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void assertFailed(String actual, String expected) {
        Assert.assertEquals(actual, expected, "Test Failed");
    }

    //Selecting the state: DC
    @FindBy(how = How.ID, using = selectStateID)
    public WebElement selectStateDD;
    @FindBy(how = How.ID, using = goSelectedState)
    public WebElement goState;
    @FindBy(how = How.ID, using = searchID)
    public WebElement searchWith;
    @FindBy(how = How.NAME, using = suggestionMobileBanking)
    public WebElement mobileBankSearch;
    @FindBy(how = How.CSS, using = searchAnswerMobileBanking)
    public WebElement mobileActual;
    @FindBy(how = How.CSS, using = clickScheduleAppt)
    public WebElement scdlAppt;
    @FindBy(how = How.NAME, using = scheduleApptButton)
    public WebElement buttonScdlAppt;
    @FindBy(how = How.ID, using = actualHeaderScdlAppt)
    public WebElement actualHeaderScheduleAppt;
    @FindBy(how = How.CSS, using = dropdownMenu)
    public WebElement ddMenu;
    @FindBy(how = How.XPATH, using = actualDDMenuText)
    public WebElement actualMenuDDText;
    @FindBy(how = How.ID, using = headerContactUs)
    public WebElement clkContactUs;
    @FindBy(how = How.ID, using = contactUsSearch)
    public WebElement selectContactUs;
    @FindBy(how = How.ID, using = searchGoButton)
    public WebElement clickSearchGo;
    @FindBy(how = How.XPATH, using = actualContactUs)
    public WebElement getContactUs;
    @FindBy(how = How.ID, using = applyNowloc)
    public WebElement applyNow;
    @FindBy(how = How.ID, using = applyNowSelect)
    public WebElement selectApplyNow;
    @FindBy(how = How.ID, using = noCarInfo)
    public WebElement getNoCarInfo;
    @FindBy(how = How.ID, using = actualApplyNowText)
    public WebElement applyNowActual;
    @FindBy(how = How.ID, using = carShopButton)
    public WebElement buttonCarShop;
    @FindBy(how = How.ID, using = zipCodeBox)
    public WebElement boxZipCode;
    @FindBy(how = How.ID, using = shopCarbutton)
    public WebElement buttonShopCar;
    @FindBy(how = How.ID, using = shopNowButton)
    public WebElement getShopNowButton;
    @FindBy(how = How.CLASS_NAME, using = actualCarBuyHeader)
    public WebElement getActualCarBuyHeader;
    @FindBy(how = How.XPATH, using = actualNewCarRate)
    public WebElement newCarRate;
    @FindBy(how = How.XPATH, using = actualUsedCarRate)
    public WebElement usedCarRate;
    @FindBy(how = How.XPATH, using = actualRefinancedCarRate)
    public WebElement refinancedCarRate;
    @FindBy(how = How.ID, using = actualSelectYourState)
    public WebElement stateElement;
    @FindBy(how = How.ID, using = clickSignIn)
    public WebElement signInElement;
    @FindBy(how = How.ID, using = enterOnlineID)
    public WebElement elementOnlineIDBox;
    @FindBy(how = How.ID, using = enterPassword)
    public WebElement elementPasswordBox;
    @FindBy(how = How.ID, using = buttonSignIn)
    public WebElement elementSignInButton;
    @FindBy(how = How.CSS, using = transferMoney)
    public WebElement elementTransferMoney;
    @FindBy(how = How.ID, using = stickyGetAppButton)
    public WebElement elementGetApp;
    @FindBy(how = How.ID, using = selectAppDevice)
    public WebElement elementAppDevice;
    @FindBy(how = How.ID, using = stickyGoButton)
    public WebElement elementStickyGoButton;
    @FindBy(how = How.ID, using = stickyPhoneInput)
    public WebElement elementStickyPhoneInput;
    @FindBy(how = How.ID, using = stickySendToDevice)
    public WebElement elementStickySendToDevice;
    @FindBy(how = How.XPATH, using = actualStickyDestinationPhone)
    public WebElement getMobileActual;
    @FindBy(how = How.ID, using = scrollDownApply)
    public WebElement getScrollApplyNow;
    @FindBy(how = How.XPATH, using = actualLoanApplication)
    public WebElement getActualLoanApplication;
    @FindBy(how = How.XPATH, using = scrollDownContactUs)
    public WebElement ContactUs;
    @FindBy(how = How.XPATH, using = scrollDownScheduleAnAppt)
    public WebElement scrollSchedule;
    @FindBy(how = How.XPATH, using = zipcodeInput)
    public WebElement getZipcodeInput;
    @FindBy(how = How.ID, using = filterInput)
    public WebElement getFilterInput;
    @FindBy(how = How.ID, using = actualHeaderDealer)
    public WebElement getActualHeaderDealer;
    @FindBy(how = How.CSS, using = actualDealerHeader)
    public WebElement getDealerHeader;
    @FindBy(how = How.CSS, using = linkToAccessible)
    public WebElement getLinkToAccessible;
    @FindBy(how = How.CLASS_NAME, using = actualFooterText)
    public WebElement getFooterText;
    @FindBy(how = How.ID, using = carBuyingTips)
    public WebElement getCarBuyingTips;
    @FindBy(how = How.ID, using = checkStatus)
    public WebElement getCheckStatus;
    @FindBy(how = How.ID, using = checkStatusDOBEntry)
    public WebElement getcheckStatusDOBEntry;
    @FindBy(how = How.ID, using = checkStatusMothersMaidenName)
    public WebElement getcheckStatusMothersMaidenName;
    @FindBy(how = How.ID, using = checkSSNEntry)
    public WebElement getcheckSSNEntry;
    @FindBy(how = How.CSS, using = continueButtonStatus)
    public WebElement getcontinueButtonStatus;
    @FindBy(how = How.XPATH, using = actualCheckStatusText)
    public WebElement getactualCheckStatusText;
    @FindBy(how = How.ID, using = youtubeFollow)
    public WebElement getYoutubefollow;
    @FindBy(how = How.CSS, using = popupYoutubeFollow)
    public WebElement getpopupYoutubeFollow;

    public void navigateToTestPage(String URL) {
        driver.get(URL);
    }

    //Has a Select Method
    public void selectStateAlert() {
        Select select = new Select(selectStateDD);
        threadSleep(2000);
        select.selectByVisibleText("District Of Columbia");
        goState.click();
    }

    public void assetHomePage(String expected) {
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed. HomePage did not load as expected.");
    }

    public void searchMobileBanking() {
        searchWith.click();
        mobileBankSearch.click();
    }

    public void assertMobileBankSearch(String expected) {
        String actual = mobileActual.getText();
        Assert.assertEquals(actual, expected, "Test Failed. Search Result Did Not Appear As Expected");
    }

    public void searchScheduleAppoint() {
        searchWith.click();
        scdlAppt.click();
    }

    public void assertScdlAppt(String expected) {
        String actual = buttonScdlAppt.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Search for Scheduling and apointment was not successful");

    }

    public void scheduleAppointment() {
        searchScheduleAppoint();
        buttonScdlAppt.click();
        threadSleep(2000);
        switchTab();
    }

    public void assertAppointmentTabOpened(String expected) {

        String actual = actualHeaderScheduleAppt.getText();
        assertFailed(actual, expected);

    }

    public void openingMenu() {
        ddMenu.click();
    }

    public void assertOpeningMenu(String expected) {
        String actual = actualMenuDDText.getText();
        assertFailed(actual, expected);
    }

    public void navigateContactUs() {
        openingMenu();
        clkContactUs.click();
        Select select = new Select(selectContactUs);
        select.selectByVisibleText(contactUsSearchText);
        clickSearchGo.click();
    }

    public void assertNavigateContactUs(String expected) {
        String actual = getContactUs.getText();
        assertFailed(actual, expected);
    }

    public void applyNow() {
        applyNow.click();
        threadSleep(5000);
        Select select = new Select(selectApplyNow);
        select.selectByVisibleText("Dealer purchase");
        getNoCarInfo.click();
        threadSleep(2000);
    }

    public void assertApplyNow(String expectedURL, String expectedText) {
        String actualURL = driver.getCurrentUrl();
        String actualText = applyNowActual.getText();
        Assert.assertEquals(actualURL, expectedURL, "Test Failed");
        Assert.assertEquals(actualText, expectedText, "Test Failed.");
    }

    public void shopForYourCar(String zipCode) {
        buttonCarShop.click();
        boxZipCode.sendKeys(zipCode);
        buttonShopCar.click();
        threadSleep(2000);
        getShopNowButton.click();
    }

    public void AssertShopForYourCar(String expected) {
        String actual = getActualCarBuyHeader.getText();
        assertFailed(actual, expected);
    }

    public void assertNewCarRate(String expected) {
        String actual = newCarRate.getText();
        assertFailed(actual, expected);
    }

    public void assertUsedCarRate(String expected) {
        String actual = usedCarRate.getText();
        assertFailed(actual, expected);
    }

    public void assertRefinancedCarRate(String expected) {
        String actual = refinancedCarRate.getText();
        assertFailed(actual, expected);
    }

    public void assertSelectYourPage(String expected) {
        String actual = stateElement.getText();
        assertFailed(actual, expected);
    }

    public void gotoSignIn() {
        signInElement.click();
    }

    public void assertGotoSignIn(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual, expected);
    }

    public void invalidSignInTest(String onlineID, String password) {
        gotoSignIn();
        elementOnlineIDBox.sendKeys(invalidOnlineID);
        elementPasswordBox.sendKeys(invalidPassword, Keys.ENTER);
        threadSleep(1000);
        //elementSignInButton.click();

    }

    public void assertInvalidSignInTest() {
        if (invalidOnlineID.isEmpty()) {
            if (invalidPassword.isEmpty()) {

            }
        } else {
            Assert.fail("Test Failed");
        }

    }

    public void gotoTransfersMoneyPage() {
        gotoSignIn();
        elementTransferMoney.click();
        threadSleep(2500);
        switchTab();
    }

    public void assertGotoTransfersMoneyPage(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual, expected);
    }

    public void getAppSticky() {
        gotoSignIn();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(750,750)");
        threadSleep(1500);
        elementGetApp.click();
        Select select = new Select(elementAppDevice);
        select.selectByIndex(2);
        elementStickyGoButton.click();
        threadSleep(1500);
        elementStickyPhoneInput.sendKeys(stickyPhoneNumber);
        elementStickySendToDevice.click();
        threadSleep(2500);
    }

    public void assertGetAppSticky(String expected) {
        String actual = getMobileActual.getText();
        assertFailed(actual, expected);
    }


    public void scrollDownApplyNow() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(950,750)");
        threadSleep(1500);
        getScrollApplyNow.click();
        threadSleep(3000);
    }

    public void assertScrollDownApplyNow(String expected) {
        String actual = getActualLoanApplication.getText();
        assertFailed(actual, expected);
    }

    public void scrollDownContactUs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("javascript:window.scrollBy(950,750)");
        threadSleep(1500);
        ContactUs.click();
        threadSleep(500);
        scrollSchedule.click();
        switchTab();
    }


    public void assertScrollDownContactUs(String expected) {
        String actual = driver.getTitle();
        assertFailed(actual, expected);
    }


    public void findNearByDealers(String zipcode) {
        getZipcodeInput.sendKeys(zipcode, Keys.ENTER);
        switchTab();
    }

    public void assertFindNearByDealers(String expected) {
        String actual = getDealerHeader.getText();
        assertFailed(actual, expected);
    }

    public void refineDealer() {
        findNearByDealers("49120");
        getFilterInput.sendKeys(filterInputKeyword, Keys.ENTER);
    }

    public void assertRefineDealer(String expected) {
        String actual = getActualHeaderDealer.getText();
        assertFailed(actual, expected);
    }

    public void accessibleVehicleLoanLink() {
        getLinkToAccessible.click();
    }

    public void assertAccessibleVehicleLoanLink(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual, expected);
    }

    public void assertFooterText(String expected) {
        String actual = getFooterText.getText();
        assertFailed(actual, expected);
    }

    public void footLinkCarBuyingTips() {
        getCarBuyingTips.click();
    }

    public void assertFootLinkCarBuyingTips(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual, expected);
    }

    public void checkApplicationStatus() {
        getCheckStatus.click();
    }

    public void assertCheckApplicationStatus(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual, expected);
    }

    public void checkStatusEntry() {
        checkApplicationStatus();
        threadSleep(2500);
        getcheckStatusDOBEntry.sendKeys(dobEntry);
        threadSleep(500);
        getcheckStatusMothersMaidenName.sendKeys(maidenNameEntry);
        threadSleep(500);
        getcheckSSNEntry.sendKeys(ssnEntry);
        threadSleep(500);
        getcontinueButtonStatus.click();

    }

    public void assertCheckStatusEntry(String expected) {
        String actual = getactualCheckStatusText.getText();
        assertFailed(actual, expected);
    }

    public void footerYouTubeChannel() {
        getYoutubefollow.click();
        threadSleep(1000);
        getpopupYoutubeFollow.click();
        threadSleep(1500);
        switchTab();
    }

    public void assertFooterYouTubeChannel(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual,expected);
    }
    @FindBy(how = How.ID,using = applyOnlineHP) public WebElement getApplyOnlineHP;
    public void applyOnline() {
        getApplyOnlineHP.click();
    }

    public void assertApplyOnline(String expected) {
        String actual = driver.getCurrentUrl();
        assertFailed(actual,expected);
    }


}
