package testHome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import stateFarmHome.HomePage;

import java.util.concurrent.TimeUnit;

import static stateFarmHome.HomePageElements.*;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(stateFarmHomepageUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testAssertHomePageURL() {
        driver.navigate().refresh();
        homePage.assertHomepageURL(stateFarmHomepageUrl);
    }

    @Test
    public void testBrokenLinks() {
        homePage.findBrokenLinks(stateFarmHomepageUrl);
    }

    @Test
    public void testReadMorePrivacy() {
        homePage.getToReadMorePrivacy();
        homePage.assertReadMorePrivacy("We value your privacy.");
    }

    @Test
    public void testInsuranceDropDown() {
        homePage.dropdownNavigation(dropdownInsuranceCss, insuranceOverviewCss);
        homePage.assertDropDown(insuranceOverviewUrl);
    }

    @Test
    public void testBankingDropDown() {
        homePage.dropdownNavigation(dropdownBankingCss, bankingOverviewCss);
        homePage.assertDropDown(bankingOverviewUrl);
    }

    @Test
    public void testInvestmentsDropDown() {
        homePage.dropdownNavigation(dropdownInvestmentsCss, investmentsOverviewCss);
        homePage.assertDropDown(investmentsOverviewUrl);
    }

    @Test
    public void testGetQuotesDropDown() {
        homePage.getQuotesDropDown("Homeowners", getQuoteZipcode);
        homePage.assertGetQuotesDropDown(getQuoteZipcode);
    }

    @Test
    public void testLogoEmbededLink() {
        homePage.assertLogoEmbededLink(stateFarmHomepageUrl);
    }

    @Test
    public void testLoginFunctionality() {
        homePage.loginFunctionality(loginUsernameKey, loginPasswordKey);
        homePage.assertURL(loginErrorURL);
    }

    @Test
    public void testLoginFunctionalityTwo() {
        homePage.loginFunctionality("testUser@testserver.com", "testPassword!@@31");
        homePage.assertURL(loginErrorURL);
    }

    @Test
    public void testLoginFunctionalityThree() {
        homePage.loginFunctionality("**************", "");
        homePage.assertURL(loginErrorURL);
    }

    @Test
    public void testCheckCovidUpdate() {
        homePage.dropdownNavigation(covidUpdateCss, covidResponseCss);
        homePage.assertDropDown(covidURL);
    }

    @Test
    public void testChangeLanguage() {
        homePage.changeLanguage();
        homePage.assertChangeLanguage();
    }

    @Test
    public void testFindAnAgentFor11377() {
        homePage.findAnAgent("11377");
        homePage.assertFindAnAgent("11377");
    }

    @Test
    public void testFindAnAgentForNewYork() {
        homePage.findAnAgent("NewYork");
        homePage.assertFindAnAgent("NewYork");
    }

    @DataProvider(name = "searchData")
    public Object[] searchData() {
        Object[] data = new Object[5];
        data[0] = "Home Loan";
        data[1] = "Auto Loan";
        data[2] = "ATM Booth";
        data[4] = "Rental Loan";
        return data;
    }

    @Test(dataProvider = "searchData")
    public void testSearchFunctionality(String searchKey) {
        homePage.searchWithDataProvider(searchKey);
        homePage.assertSearchWithDataProvider();
    }

    @Test
    public void testGetIphoneApp() {
        homePage.getIphoneApp();
        homePage.assertGetIphoneApp();
    }

    @Test
    public void testGetAndroidApp() {
        homePage.getAndroidApp();
        homePage.assertGetAndroidApp();
    }

    @Test
    public void testSocialFacebookPage() {
        homePage.SocialFacebookPage(socialFBButtonCss);
        homePage.assertSocialFacebookPage(socialFBUrl);
    }
    @Test
    public void testSocialLinkedInPage() {
        homePage.SocialFacebookPage(socialLinkedInCss);
        homePage.assertSocialFacebookPage(socialLinkedInUrl);
    }
    @Test
    public void testSocialYouTubePage() {
        homePage.SocialFacebookPage(socialYouTubeCss);
        homePage.assertSocialFacebookPage(socialYoutubeUrl);
    }

    @Test
    public void testSeekHelpHeaderContactUs() {
        homePage.seekHelpHeader(contactUsXpath);
        homePage.assertSeekHelpHeader(contactUsUrl);
    }
    @Test
    public void testSeekHelpHeaderCustomerCare() {
        homePage.seekHelpHeader(customerCareXpath);
        homePage.assertSeekHelpHeader(customerCareUrl);
    }
    @Test
    public void testSeekHelpHeaderFAQs() {
        homePage.seekHelpHeader(faqsHelpXpath);
        homePage.assertSeekHelpHeader(faqsHelpUrl);
    }
}
