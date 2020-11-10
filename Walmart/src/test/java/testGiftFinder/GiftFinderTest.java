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
    public void getInit(){
        GiftFinderPage= PageFactory.initElements(driver, GiftFinderPage.class);
    }

    @Test
    public void testGiftPageNavigation() throws InterruptedException {
        //Thread.sleep(10000);
        GiftFinderPage.navigateToGiftFinder();
        GiftFinderPage.validateGiftFinderPage();
    }

    @Test
    public void testBirthdayOccasion() throws InterruptedException {
        Thread.sleep(50000);
        GiftFinderPage.selectOccasion();
        GiftFinderPage.validateSelectOccasion();
    }

}
