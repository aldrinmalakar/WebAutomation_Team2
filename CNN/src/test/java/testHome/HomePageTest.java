package testHome;

import cnnHome.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends WebAPI {
HomePage homePage;
    @BeforeMethod
    public void getInit(){homePage= PageFactory.initElements(driver, HomePage.class);
    }
    public void testSport() throws InterruptedException {
        homePage.sportWithCredential();
        homePage.validateSportCredential();
    }
}
