package testGiftFinder;

import common.WebAPI;
import giftFinder.GiftFinderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartHome.HomePage;

public class GiftFinderTest extends WebAPI {
    GiftFinderPage GiftFinderPage;

    @BeforeMethod
    public void getInit(){
        GiftFinderPage= PageFactory.initElements(driver, GiftFinderPage.class);
    }

    @Test
    public void testGiftPageNavigation(){
        GiftFinderPage.navigateToGiftFinder();
        GiftFinderPage.validateGiftFinderPage();
    }

}
