package testTech;
import cnnTech.TechPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static cnnTech.techPageElements.*;

public class techPageTest extends WebAPI {
    TechPage techPage;

    @BeforeMethod
    public void getInit() {
        techPage = PageFactory.initElements(driver, TechPage.class);
        techPage.navigateToTestPage(testHomeURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void testPageLink() {
        techPage.assertHomePage();
    }

    @Test
    public void testOpenLiveTV() {
        techPage.openLiveTV();
        techPage.AssertOpenLiveTV(liveTVURLElement);
         }

    @Test
    public void testChangeEdition() {
        techPage.changeEdition();
        techPage.AssertChangeEdition();
    }
}
