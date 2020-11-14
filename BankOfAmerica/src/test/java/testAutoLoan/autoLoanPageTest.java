package testAutoLoan;

import common.WebAPI;
import backOfAmericaAutoLoan.AutoLoanPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class autoLoanPageTest extends WebAPI {
    AutoLoanPage autoLoanPage;

    @BeforeMethod
    public void getInit(){
        autoLoanPage = PageFactory.initElements(driver,AutoLoanPage.class);
        autoLoanPage.navigateToTestPage("https://www.bankofamerica.com/auto-loans/");
    }

    @Test
    public void selectStateTest() {
        autoLoanPage.selectStateAlert();


    }
}
