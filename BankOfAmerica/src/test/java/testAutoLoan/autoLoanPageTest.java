package testAutoLoan;

import common.WebAPI;
import backOfAmericaAutoLoan.AutoLoanPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static backOfAmericaAutoLoan.autoLoanPageElements.*;

public class autoLoanPageTest extends WebAPI {
    AutoLoanPage autoLoanPage;

    @BeforeMethod
    public void getInit() {
        autoLoanPage = PageFactory.initElements(driver, AutoLoanPage.class);
        autoLoanPage.navigateToTestPage(testHomeURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        autoLoanPage.selectStateAlert();
    }

    @Test
    public void navigateToHomePage() {
        autoLoanPage.assetHomePage(testHomeURL);
    }

    @Test
    public void searchBoxMobileBankingTest() {
        autoLoanPage.searchMobileBanking();
        autoLoanPage.assertMobileBankSearch(headerMobileBankingSearch);
    }

    @Test
    public void searchBoxScheduleAppointmentTest() {
        autoLoanPage.searchScheduleAppoint();
        autoLoanPage.assertScdlAppt(expectedScheduleAppt);
    }

    @Test
    public void scheduleAppointmentTest() {
        autoLoanPage.scheduleAppointment();
        autoLoanPage.assertAppointmentTabOpened(expectedHeaderScdlAppt);
    }

    @Test
    public void menuDropDownTest() {
        autoLoanPage.openingMenu();
        autoLoanPage.assertOpeningMenu(expectedDDMenuText);
    }

    @Test
    public void contactUsDropDownMenuTest() {
        autoLoanPage.navigateContactUs();
        autoLoanPage.assertNavigateContactUs(exptectedContactUs);
    }

    @Test
    public void applyNowTest() {
        autoLoanPage.applyNow();
        autoLoanPage.assertApplyNow(expectedURLapplyNow, expectedApplyNowText);
    }

    @Test
    public void shopForYourCarTest() {
        autoLoanPage.shopForYourCar("49120");
        autoLoanPage.AssertShopForYourCar(expectedCarBuyHeader);
    }

    @Test
    public void assertRatesTest() {
        autoLoanPage.assertNewCarRate(expectedNewCarRate);
        autoLoanPage.assertUsedCarRate(expectedUsedCarRate);
        autoLoanPage.assertRefinancedCarRate(expectedRefinancedCarRate);
    }

    @Test
    public void assertSelectYourPageTest() {
        autoLoanPage.assertSelectYourPage(expectedSelectYourState);
    }

    @Test
    public void gotoSignInTest() {
        autoLoanPage.gotoSignIn();
        autoLoanPage.assertGotoSignIn(expectedURLSignIn);
    }

    @Test
    public void invalidSignInTest() {
        autoLoanPage.invalidSignInTest(invalidOnlineID,invalidPassword);
        autoLoanPage.assertInvalidSignInTest();
    }

    @Test
    public void gotoTransferMoneyPageTest() {
        autoLoanPage.gotoTransfersMoneyPage();
        autoLoanPage.assertGotoTransfersMoneyPage(expectedTransferMoneyURL);
    }

    @Test
    public void getAppStickyTest() {
        autoLoanPage.getAppSticky();
        autoLoanPage.assertGetAppSticky(expectedDestinationPhone);
    }

    @Test
    public void testName() {
       String x = driver.findElement(By.xpath("//input[@id='currencyInputField']")).;
        System.out.println(x);
    }
}
