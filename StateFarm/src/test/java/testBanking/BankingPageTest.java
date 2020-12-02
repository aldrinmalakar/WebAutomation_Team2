package testBanking;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stateFarmBanking.BankingPage;

public class BankingPageTest extends WebAPI {
    BankingPage bankingPage;

    @BeforeMethod
    public void gitInit(){bankingPage= PageFactory.initElements(driver, BankingPage.class);}
    @Test(enabled = false)
    public void testHomeLoans() throws InterruptedException {
        bankingPage.homeLoansWithCredential();
        bankingPage.validateHomeLoansCredential();
    }
    @Test(enabled = false)
    public void testSingIn() throws InterruptedException {
        bankingPage.singInWithCredential();
        bankingPage.validateSingInCredential();
    }
    @Test(enabled = false)
    public void testChecking() throws InterruptedException {
        bankingPage.checkingWithCredential();
        bankingPage.validateCheckingCredential();
    }
    @Test(enabled = false)
    public void testInvestment() throws InterruptedException {
        bankingPage.investmentWithCredential();
        bankingPage.validateInvestmentsCredential();
    }
    @Test(enabled = false)
    public void testInvestmentEmergency() throws InterruptedException {
        bankingPage.investmentEmergencyWithCredential();
        bankingPage.validateInvestmentEmergencyCredential();
    }
    @Test(enabled = false)
    public void testSaving() throws InterruptedException {
        bankingPage.savingWithCredential();
        bankingPage.validateSavingCredential();
    }
    @Test(enabled = false)
    public void testLogInButton() throws InterruptedException {
        bankingPage.logInWithCredential();
        bankingPage.validateLogInCredential();
    }
    @Test(enabled = false)
    public void testCreateAccount() throws InterruptedException {
        bankingPage.createAccountWithCredential();
        bankingPage.validateCreateAccountCredential();
    }
    @Test(enabled = true)
    public void testPayBill() throws InterruptedException {
        bankingPage.payBillWithCredential();
        bankingPage.validatePayBillCredential();
    }


}
