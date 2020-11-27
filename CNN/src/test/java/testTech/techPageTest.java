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
        driver.navigate().refresh();
    }


    @Test
    public void testChangeEdition() {
        techPage.changeEdition();
        techPage.AssertChangeEdition(expectedInternationalURL,expectedInternationalTitle);
    }

    @Test
    public void testToolTipAfterHours() {
        techPage.toolTipAfterHours();
        techPage.assertToolTipAfterHours(expectedMoneyMoverToolTipElement);
    }

    @Test
    public void testFindBrokenLinks() {
     techPage.findBrokenLinks(testHomeURL);
    }

    @Test
    public void testNavigateToSuccess() {
        techPage.navigateToSuccess();
        techPage.AssertNavigateToSuccess(exoectedSuccessURL,expectedSuccessTitle);
    }
    @Test
    public void testNavigateToMedia() {
        techPage.navigateToMedia();
        techPage.AssertNavigateToMedia(expectedMediaURL,expectedMediaTitle);
    }
    @Test
    public void testNavigateToWeather() {
        techPage.navigateToWeather();
        techPage.AssertNavigateToWeather(expectedWeatherURL,expectedWeatherTitle);
    }
    @Test
    public void testNavigateToCoupon() {
        techPage.navigateToCoupon();
        techPage.AssertNavigateToCoupon(expectedCouponURL,expectedCouponTitle);
    }
    @Test
    public void testSearchCNN() {
        techPage.searchCNN("Bangladesh");
        techPage.AssertSearchCNN(expectedSearchURL,expectedSearchTitle);
    }

    @Test
    public void testNavigateToMoreNewOne() {
        techPage.navigateToNewsOne(moreNewsR1C1Xpath);
        techPage.assertNavigateToNewsOne();
    }
    @Test
    public void testNavigateToMoreNewTwo() {
        techPage.navigateToNewsOne(moreNewsR1C2Xpath);
        techPage.assertNavigateToNewsOne();
    }
    @Test
    public void testNavigateToMoreNewThree() {
        techPage.navigateToNewsOne(moreNewsR1C3Xpath);
        techPage.assertNavigateToNewsOne();
    }
    @Test
    public void testNavigateToMoreNewFour() {
        techPage.navigateToNewsOne(moreNewsR1C4Xpath);
        techPage.assertNavigateToNewsOne();
    }
    @Test
    public void testNavigateToMoreNewFive() {
        techPage.navigateToNewsOne(moreNewsR2C1Xpath);
        techPage.assertNavigateToNewsOne();
    }

    @Test
    public void testFacebookLogo() {
        techPage.assertFBicon(fbLogoXpath);
    }
    @Test
    public void testTwitterLogo() {
        techPage.assertFBicon(twitterLogoXpath);
    }
    @Test
    public void testInstagramLogo() {
        techPage.assertFBicon(instaLogoXpath);
    }

    @Test
    public void testsocialRedirectionFacebook() {
        techPage.navigateToSocialPage(fbLogoXpath);
        techPage.assertURL(fbExpectedURL);
    }
    @Test
    public void testsocialRedirectionTwitter() {
        techPage.navigateToSocialPage(twitterLogoXpath);
        techPage.assertURL(twitterExpectedURL);
    }
    @Test
    public void testsocialRedirectionInstagram() {
        techPage.navigateToSocialPage(instaLogoXpath);
        techPage.assertURL(instaExpectedURL);
    }

    @Test
    public void testsigningInWithInvalidCredentialsUno() {
        techPage.signInWithIDAndPassword(signInEmailAddressUno,signInPassword);
        techPage.assertErrorMessage(signInAssertErrorMessage);
    }
    @Test
    public void testsigningInWithInvalidCredentialsDos() {
        techPage.signInWithIDAndPassword(signInEmailAddressDos,signInPassword);
        techPage.assertErrorMessage(signInAssertErrorMessage);
    }
    @Test
    public void testsigningInWithInvalidCredentialsTres() {
        techPage.signInWithIDAndPassword(signInEmailAddressTres,signInPassword);
        techPage.assertErrorMessage(signInAssertErrorMessage);
    }
    @Test
    public void testsigningInWithInvalidCredentialsQuatro() {
        techPage.signInWithIDAndPassword(signInEmailAddressQuatro,signInPassword);
        techPage.assertErrorMessage(signInAssertErrorMessage);
    }

    @Test
    public void testSearchForCovid() {
        techPage.searchFor(keywordCovid);
        techPage.assertSearchForKeyword(keywordCovid);
    }
    @Test
    public void testSearchForDonaldTrump() {
        techPage.searchFor(keywordTrump);
        techPage.assertSearchForKeyword(keywordTrump);
    }
    @Test
    public void testSearchForJoeBiden() {
        techPage.searchFor(keywordBiden);
        techPage.assertSearchForKeyword(keywordBiden);
    }
    @Test
    public void testSearchForFinances() {
        techPage.searchFor(keywordFinances);
        techPage.assertSearchForKeyword(keywordFinances);
    }

}
