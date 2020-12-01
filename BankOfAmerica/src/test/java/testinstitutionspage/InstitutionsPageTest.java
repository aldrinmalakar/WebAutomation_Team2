package testinstitutionspage;

import busenissesandinstitutions.InstitutionsHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InstitutionsPageTest extends WebAPI {

    InstitutionsHomePage institutionsHomePage;

    @BeforeMethod
    public void getInit() {
        institutionsHomePage = PageFactory.initElements(driver, InstitutionsHomePage.class);
    }


    @Test
    public void BusinessesAndInstitutions() throws InterruptedException {
        institutionsHomePage.BusinessesAndInstitutions();
        institutionsHomePage.validateBusinessesAndInstitutions();
    }

    @Test
    public void inspectSearchBox() throws InterruptedException {
        institutionsHomePage.inspectSearchBox();
        institutionsHomePage.validateInspectSearchBox();
    }

    @Test
    public void searchBox1() throws InterruptedException {
        institutionsHomePage.searchBox1();
        institutionsHomePage.validateSearchBox1();
    }

    @Test
    public void clearFraud() throws InterruptedException {
        institutionsHomePage.clearFraud();
        institutionsHomePage.validateClearFraud();
    }

    @Test
    public void validateSearchBox2() throws InterruptedException {
        institutionsHomePage.validateSearchBox2();
        institutionsHomePage.validateValidateSearchBox2();
    }

    @Test
    public void searchBox3() throws InterruptedException {
        institutionsHomePage.searchBox3();
        institutionsHomePage.validateSearchBox3();
    }

    @Test
    public void humberGurMenu() throws InterruptedException {
        institutionsHomePage.humberGurMenu();
        institutionsHomePage.validateHumberGurMenu();
    }

    @Test
    public void closeHumberGurMenu() throws InterruptedException {
        institutionsHomePage.closeHumberGurMenu();
        institutionsHomePage.validateCloseHumberGurMenu();
    }

    @Test
    public void bankOfAmericaCom() throws InterruptedException {
        institutionsHomePage.bankOfAmericaCom();
        institutionsHomePage.validateBankOfAmericaCom();
    }

    @Test
    public void clientLogIn() throws InterruptedException {
        institutionsHomePage.clientLogIn();
        institutionsHomePage.validateClientLogIn();
    }

    @Test
    public void caseStudies() throws InterruptedException {
        institutionsHomePage.caseStudies();
        institutionsHomePage.validateCaseStudies();
    }
    @Test
    public void inspectAbout() throws InterruptedException {
        institutionsHomePage.inspectAbout();
        institutionsHomePage.validateInspectAbout();
    }
    @Test
    public void inspectCareers() throws InterruptedException {
        institutionsHomePage.inspectCareers();
        institutionsHomePage.validateInspectCareers();
    }
    @Test
    public void inspectSeeDetails() throws InterruptedException {
        institutionsHomePage.inspectSeeDetails();
        institutionsHomePage.validateSeeDetails();
    }
    @Test
    public void inspectSaveFormCRS() throws InterruptedException {
        institutionsHomePage.inspectSaveFormCRS();
        institutionsHomePage.validateSaveFormCRS();
    }
    @Test
    public void inspectBrokerCheck() throws InterruptedException {
        institutionsHomePage.inspectBrokerCheck();
        institutionsHomePage.validateBrokerCheck();
    }
    @Test
    public void inspectContactUs() throws InterruptedException {
        institutionsHomePage.inspectContactUs();
        institutionsHomePage.validateContactUs();
    }
    @Test
    public void inspectDropDawnList() throws InterruptedException {
        institutionsHomePage.inspectDropDawnList();
    }
    @Test
    public void inspectMarketInsights() throws InterruptedException {
        institutionsHomePage.inspectMarketInsights();
        institutionsHomePage.validateMarketInsights();
    }
    @Test
    public void testInspectSaveButton() throws InterruptedException {
        institutionsHomePage.inspectSaveButton();
        institutionsHomePage.validateSaveButton();
    }
    @Test
    public void testInspectShareButton() throws InterruptedException {
        institutionsHomePage.inspectShareButton();
        institutionsHomePage.validateShareButton();
    }
    @Test
    public void testInspectPrintButton() throws InterruptedException {
        institutionsHomePage.inspectPrintButton();
        institutionsHomePage.validatePrintButton();
    }
    @Test
    public void testInspectSelectBox() throws InterruptedException {
        institutionsHomePage.inspectSelectBox();
        institutionsHomePage.validateSelectBox();
    }
    @Test
    public void testInspectSelectBox1() throws InterruptedException {
        institutionsHomePage.inspectSelectBox1();
        institutionsHomePage.validateSelectBox1();
    }
    @Test
    public void testSelectYourLogIn() throws InterruptedException {
        institutionsHomePage.SelectYourLogIn();
        institutionsHomePage.validateSelectYourLogIn();
    }
    @Test
    public void checkBoxId() throws InterruptedException {
        institutionsHomePage.checkBoxId();
        institutionsHomePage.validateCheckBoxId();
    }
    @Test
    public void  playVideo() throws InterruptedException {
        institutionsHomePage. playVideo();
        institutionsHomePage.validateOpenAccount();
    }
}