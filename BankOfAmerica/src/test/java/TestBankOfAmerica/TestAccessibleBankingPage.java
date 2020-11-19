package TestBankOfAmerica;

import accessibleBanking.accessibleBankingPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static accessibleBanking.accessibleBankingLocators.accessiblePage;
import static accessibleBanking.accessibleBankingLocators.bankOfAmericaURL;

public class TestAccessibleBankingPage extends WebAPI {

    @BeforeMethod
    public void goToAccessible() throws InterruptedException {
        driver.get(bankOfAmericaURL);
        clickByCss(accessiblePage);
    }

    accessibleBankingPage accessible ;
    @BeforeMethod
    public void getInit(){
        accessible= PageFactory.initElements(driver, accessibleBankingPage.class);
    }



    @Test(enabled = false)
    public void testValidateTitle() throws InterruptedException {
        accessible.ValidateTitle();
    }


    @Test(enabled = true)
    public void testSearchBar() throws InterruptedException {
        accessible.SearchBar();
        accessible.validateSearchBar();
    }










}
