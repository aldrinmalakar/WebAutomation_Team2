package teststatefarmepage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stateFarm.StateFarmHomePage;

public class StateFarmPageTest extends WebAPI {


    StateFarmHomePage stateFarmHomePage;

    @BeforeMethod
    public void getInit() {
        stateFarmHomePage = PageFactory.initElements(driver, StateFarmHomePage.class);
    }


    @Test
    public void insurance() throws InterruptedException {
        stateFarmHomePage.insurance();
        stateFarmHomePage.validateInsurance();
    }


    @Test
    public void clickFindAnAgent() throws InterruptedException {
        stateFarmHomePage.clickFindAnAgent();
        stateFarmHomePage.validateFindAnAgent();
    }


    @Test
    public void clickClaims() throws InterruptedException {
        stateFarmHomePage.clickClaims();
        stateFarmHomePage.validateClaims();
    }


    @Test
    public void payABill() throws InterruptedException {
        stateFarmHomePage.payABill();
        stateFarmHomePage.validatePayABill();
    }


    @Test
    public void getAQuote() throws InterruptedException {
        stateFarmHomePage.getAQuote();
        stateFarmHomePage.validateGetAQuote();
    }


    @Test
    public void investmentsS() throws InterruptedException {
        stateFarmHomePage.investmentsS();
        stateFarmHomePage.validateInvestmentsS();
    }


    @Test
    public void clickAnnuitiesS() throws InterruptedException {
        stateFarmHomePage.clickAnnuitiesS();
        stateFarmHomePage.validateAnnuitiesS();
    }


    @Test
    public void searchBoxZipCodeS() throws InterruptedException {
        stateFarmHomePage.searchBoxZipCodeS();
        stateFarmHomePage.validateSearchBoxZipCodeS();
    }


    }
