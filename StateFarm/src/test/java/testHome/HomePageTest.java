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

    @DataProvider(name = "privacyAssertion")
    public Object[] assertionPrivacy() {
        return new Object[]{
                "We value your privacy.",
                "We value your privacy. But we will steal your money anyway"
        };
    }
    @Test (dataProvider = "privacyAssertion")
    public void testReadMorePrivacy(String assertionMessage) {
        homePage.getToReadMorePrivacy();
        homePage.assertReadMorePrivacy(assertionMessage);
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
    @DataProvider(name = "InvalidData")//20
    public Object[][] getData() {

        Object[][] data = new Object[5][2];

        data[0][0] = "Shaila";
        data[0][1] = "crazyKiyare1123";
        data[1][0] = "Runa";
        data[1][1] = "MyMywhatcanIsay";
        data[2][0] = "Aldrin";
        data[2][1] = "Iamtheking007";
        data[3][0] = "Emelda";
        data[3][1] = "KingsQueen";
        data[4][0] = "Yeti";
        data[4][1] = "3141";

        return data;
    }
    @Test (dataProvider = "InvalidData")
    public void testLoginFunctionalityThree(String someId, String somePassword) {
        homePage.loginFunctionality(someId,somePassword);
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
