package testFooter;

import common.WebAPI;
import footer.Footer;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTest extends WebAPI {
    Footer footer;

    @BeforeMethod
    public void getInit() {
        footer = PageFactory.initElements(driver, Footer.class);
    }
    @Test(enabled = false)
    public void testWalmartPlus() throws InterruptedException {
        footer.walmartPlusCheck();
    }
    @Test(enabled = false)
    public void testValidateWalmartPlusText() throws InterruptedException {
        footer.validateWalmartPlusText("Get free unlimited delivery*, member prices on fuel, & more.");
        Thread.sleep(5000);
    }

    @Test(enabled = true)
    public void testMoneyCenterCheck() throws InterruptedException {
        footer.moneyCenterCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testFaceBookIconCheck() throws InterruptedException {
        footer.faceBookIconCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testNewsLetterSearchBoxCheck() throws InterruptedException {
        footer.newsLetterSearchBoxCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testTwitterIconCheck() throws InterruptedException {
        footer.twitterIconCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testHelpCenterCheck() throws InterruptedException {
        footer.helpCenterCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testSamsClubLinkCheck() throws InterruptedException {
        footer.samsClubLinkCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testReturnsCheck() throws InterruptedException {
        footer.returnsCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testContactUsCheck() throws InterruptedException {
        footer.contactUsCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testCareersCheck() throws InterruptedException {
        footer.careersCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testOutDoorFurnitureCheck() throws InterruptedException {
        footer.outDoorFurnitureCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testInstagramIconCheck() throws InterruptedException {
        footer.instagramIconCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testWeeklyAdsCheck() throws InterruptedException {
        footer.weeklyAdsCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testDigitalMuseumCheck() throws InterruptedException {
        footer.digitalMuseumCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testTermsOfUseCheck() throws InterruptedException {
        footer.termsOfUseCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testStorePickUpCheck() throws InterruptedException {
        footer.storePickUpCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testProductRecallsCheck() throws InterruptedException {
        footer.productRecallsCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testAccessibilityCheck() throws InterruptedException {
        footer.accessibilityCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testOurCompanyCheck() throws InterruptedException {
        footer.ourCompanyCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testStoreDirectoryCheck() throws InterruptedException {
        footer.storeDirectoryCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testOurSuppliersCheck() throws InterruptedException {
        footer.ourSuppliersCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testOtherServicesCheck() throws InterruptedException {
        footer.otherServicesCheck();
        Thread.sleep(5000);
    }

    @Test(enabled=false)
    public void testOurAdsCheck() throws InterruptedException {
        footer.ourAdsCheck();
        Thread.sleep(5000);
    }










}
