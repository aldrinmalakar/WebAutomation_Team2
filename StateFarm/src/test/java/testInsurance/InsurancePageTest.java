package testInsurance;

import common.WebAPI;
import insuranceHealth.InsuranceHealthPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class InsurancePageTest extends WebAPI {
    InsuranceHealthPage insuranceHealthPage;

    @BeforeMethod
    public void getInit() {
        insuranceHealthPage = PageFactory.initElements(driver, InsuranceHealthPage.class);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("incognito");
//        ChromeDriver driver = new ChromeDriver(options);

    }

    @DataProvider(name = "InvalidData")//20
    public Object[][] getData() {

        Object[][] data = new Object[5][2];

        data[0][0] = "Shaila";
        data[0][1] = "1234";
        data[1][0] = "Runa";
        data[1][1] = "5678";
        data[2][0] = "Aldrin";
        data[2][1] = "9101";
        data[3][0] = "Helen";
        data[3][1] = "1121";
        data[4][0] = "Yeti";
        data[4][1] = "3141";

        return data;
    }

    @Test(dataProvider = "InvalidData")//5
    public void testInvalidCredentials(String someId, String somePassword) {
        insuranceHealthPage.loginInvalidCredentials(someId, somePassword);
        insuranceHealthPage.errorDisplaysForInvalidCred();
    }

    @Test//6
    public void broken() {
        insuranceHealthPage.findBrokenLinks();
    }

    @Test//11 excel reader used
    public void searchAgentZipTest() throws InterruptedException {
        insuranceHealthPage.findAgentWithZipCode(insuranceHealthPage.enterZipCode);
        insuranceHealthPage.validateUrlForZipCode();
    }

    @Test//12
    public void changeLanguageTest() {
        insuranceHealthPage.changeLanguageToSpanish();
        insuranceHealthPage.checkSpanishTitle();

    }

    @Test//13
    public void testLanguageAfterNavigatingBack() {
        insuranceHealthPage.navigatingBackToEnglish();
        insuranceHealthPage.checkEnglishLanguage();
    }

    @Test//14
    public void copyRightIsDisplayedAtBottom() {
        insuranceHealthPage.scrollDownToCopyright();
        insuranceHealthPage.copyRightsDisplayed();
    }

    @DataProvider(name = "PayBillInformation")
    public Object[][] information() {

        Object[][] data = new Object[5][2];

        data[0][0] = "7184567890";
        data[0][1] = "02041990";
        data[1][0] = "3475678901";
        data[1][1] = "02221954";
        data[2][0] = "9176789012";
        data[2][1] = "10091994";
        data[3][0] = "9177890123";
        data[3][1] = "07092014";
        data[4][0] = "7188901234";
        data[4][1] = "06102012";

        return data;
    }

    @Test(dataProvider = "PayBillInformation")//20
    public void testErrorForInvalidInfo(String phone, String dob) {
        insuranceHealthPage.payABillWithInvalidCredentials(phone, dob);
        insuranceHealthPage.checkForInformationError();
    }

    @Test//21
    public void logoTest() {
        insuranceHealthPage.stateFarmLogo();
        insuranceHealthPage.checkLogoNavigatesToHome();
    }

    @Test//22
    public void facebookOpensNewTab() {
        insuranceHealthPage.facebookNavigatesNewTab();
        insuranceHealthPage.validateNewTabFacebook();
    }

    @Test//23
    public void goPaperlessValidation(){
        insuranceHealthPage.goPaperLess();
        insuranceHealthPage.goPaperlessText();
    }


}
