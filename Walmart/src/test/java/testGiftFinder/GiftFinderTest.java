package testGiftFinder;

import common.WebAPI;
import giftFinder.GiftFinderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartHome.HomePage;

import java.util.concurrent.TimeUnit;

public class GiftFinderTest extends WebAPI {
    GiftFinderPage GiftFinderPage;


    @BeforeMethod
    public void getInit() {
        GiftFinderPage = PageFactory.initElements(driver, GiftFinderPage.class);
    }

    @Test
    public void testBirthdayOccasion() throws InterruptedException {
        GiftFinderPage.navigateToGiftFinder();
        GiftFinderPage.selectOccasion();
        GiftFinderPage.validateSelectOccasion();
    }

    @Test
    public void scrollDownTest() {
        GiftFinderPage.scrollDown();
        GiftFinderPage.validateScrollDown();
    }

    @Test
    public void showAllRadioTest() {
        GiftFinderPage.showAllRadioSelect();
        GiftFinderPage.validateShowAllSelect();
    }

}
