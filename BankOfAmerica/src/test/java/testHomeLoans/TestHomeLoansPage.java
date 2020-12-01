package testHomeLoans;

import common.WebAPI;
import homeLoansPage.HomeLoansPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomeLoansPage extends WebAPI {

    HomeLoansPage homeLoansPage;

    @BeforeMethod
    public void getInit() {
        homeLoansPage = PageFactory.initElements(driver, HomeLoansPage.class);
    }

    @Test(enabled = false)
    public void testHomeLoans() throws InterruptedException {
        homeLoansPage.homeLoansCheck();
    }

    @Test(enabled = false)
    public void testMortgages() throws InterruptedException {
        homeLoansPage.mortgagesCheck();
    }

    @Test(enabled = false)
    public void testFinance() throws InterruptedException {
        homeLoansPage.financeCheck();
    }

    @Test(enabled = false)
    public void testHomeEquity() throws InterruptedException {
        homeLoansPage.homeEquityCheck();
    }

    @Test(enabled = false)
    public void testFirstTimeHomeBuyer() throws InterruptedException {
        homeLoansPage.firstTimeHomeBuyerCheck();
    }

    @Test(enabled = false)
    public void testFindAHome() throws InterruptedException {
        homeLoansPage.findAHomeCheck();
    }

    @Test(enabled = false)
    public void testManageYourLoan() throws InterruptedException {
        homeLoansPage.manageYourLoanCheck();
    }

    @Test(enabled = false)
    public void testWealthManagement() throws InterruptedException {
        homeLoansPage.wealthManagementCheck();
    }

    @Test(enabled = false)
    public void testMerrillLearnMore() throws InterruptedException {
        homeLoansPage.merrillLearnMoreCheck();
    }

    @Test(enabled = false)
    public void testBOALearnMore() throws InterruptedException {
        homeLoansPage.BOALearnMoreCheck();
    }

    @Test(enabled = false)
    public void testAboutUs() throws InterruptedException {
        homeLoansPage.aboutUsCheck();
    }

    @Test(enabled = false)
    public void testWhoWeAre() throws InterruptedException {
        homeLoansPage.whoWeAreCheck();
    }

    @Test(enabled = false)
    public void testWhatGuidesUs() throws InterruptedException {
        homeLoansPage.whatGuidesUsCheck();
    }

    @Test(enabled = false)
    public void testPartnerLocally() throws InterruptedException {
        homeLoansPage.partneringLocallyCheck();
    }

    @Test(enabled = false)
    public void testNewsRoom() throws InterruptedException {
        homeLoansPage.newsRoomUsCheck();
    }

    @Test(enabled = false)
    public void testInvestorRelations() throws InterruptedException {
        homeLoansPage.investorRelationsUsCheck();
    }


    @Test(enabled = false)
    public void testBOACareers() throws InterruptedException {
        homeLoansPage.BOACareersUsCheck();
    }

    @Test(enabled = false)
    public void testSearchTab() throws InterruptedException {
        homeLoansPage.searchTabUsCheck();
    }









}
