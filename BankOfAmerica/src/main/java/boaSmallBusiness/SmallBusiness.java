package boaSmallBusiness;

import common.WebAPI;
import org.openqa.selenium.By;
import org.testng.Assert;

import static boaSmallBusiness.SmallBusinessElement.*;

public class SmallBusiness extends WebAPI {

    public void checkingWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(checkingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(businessFundamentalsCheckingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement);
        Thread.sleep(3000);
        driver.findElement(By.xpath(goWebElement)).click();
        driver.findElement(By.xpath(openNoWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(youAreApplyingForABusinessFundamentalsCheckingAccountWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateCheckingCredential(){
        String expectedTitle="Business Fundamentals® Checking Solution from Bank of America";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }
    public void savingWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(savingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(businessInvestmentAccountWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement1);
        Thread.sleep(3000);
        driver.findElement(By.xpath(goWebElement1)).click();
        driver.findElement(By.xpath(openNoWebElement1)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(applyWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateSavingCredential(){
        String expectedTitle="Get Started";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }
    public void businessServicesWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(businessServicesWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(acceptCreditCardPayments)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(findMySolutionWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(cloverMiniWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateBusinessServicesCredential(){
        String expectedTitle="Merchant Services: Credit Card & Payment Processing Solutions";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }
    public void creditCardWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(creditCartWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(popularCreditCardsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(businessAdvantageCashRewardCreditCardWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateCreditCardCredential(){
        String expectedTitle="Popular Business Credit Cards – Must Haves for Your Small Business";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }

    public void lendingWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(lendingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(autoLoneWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(applyNoWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(letsGetRollingWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateLendingCredential(){
        String expectedTitle="Your Application";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }
public void investingWithCredential() throws InterruptedException {
    driver.findElement(By.id(investingWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(simpleIraWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(pricingAndFeesWebElement)).click();
    Thread.sleep(3000);
}
    public void validateInvestingCredential(){
        String expectedTitle="SIMPLE IRA Retirement Plans for Small Business";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
}
public void learningWithCredential() throws InterruptedException {
    driver.findElement(By.xpath(learningWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(startingYourBusinessWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(managingYourBusinessWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(growingYourBusinessWebElement)).click();
    Thread.sleep(3000);
}
public void validateLearningCredential() {
    String expectedTitle = "Small Business Tips and Resources from Bank of America";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "Fail");

}
public void contactUsWithCredential() throws InterruptedException {
    driver.findElement(By.xpath(contactUsWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(requestAPaymentDeferral2)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(forgetIDAndPasscodeWebElement)).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath(cardOrAccountNumberWebElement)).click();
    Thread.sleep(3000);
}
    public void validateContactUsCredential() {
        String expectedTitle = "Bank of America | Online Banking | Forgot Online ID & Passcode";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");
    }
    public void helpWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(helpWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.id(checkingAndSavingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(hawDoIAccessMyAccountWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateHelpCredential(){
        String expectedTitle = "Account Information and Access FAQs - Bank of America";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void smallBusinessCommunityWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(smallBusinessCommunityWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(generalBusinessWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(learnMoreWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateSmallBusinessCredential(){
        String expectedTitle = "General Business | Small Business Community";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");
    }
    public void openCheckingAccountWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(openCheckingAccountWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(viewPersonalCheckingAccountsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getStartedWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(checkingAccountWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateOpenCheckingAccountCredential(){
        String expectedTitle = "Bank of America Advantage Banking - A Flexible Checking Account";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void openAnAccountWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(openAnAccountWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(goToSmallBusinessCheckingWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateOpenAnAccountCredential(){
        String expectedTitle = "Business Checking Accounts | Open a Business Bank Account Online";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void enrollWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(enrollWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(cardOrAccountNumberWebElement2)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(socialSecurityNumberWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateEnrollCredential(){
        String expectedTitle ="Bank of America | Online Banking | Forgot Online ID & Passcode";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void meetCashFlowMonitorWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(meetCashFlowMonitorWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(getStartedWebElement2)).click();
        Thread.sleep(3000);
          driver.findElement(By.xpath(learnMoreAboutOnlineBankingWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateMeetCashFlowMonitorCredential() {

        String expectedTitle = "Mobile Banking & Online Banking Features from Bank of America";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void savings1WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(savings1WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(businessCDProductWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement3);
        Thread.sleep(3000);

    }
    public void validateSavings1Credential(){
        String expectedTitle = "Business Certificate of Deposit (CD) Accounts from Bank of America";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");
    }
    public void lending1WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(lending1WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(SBALoansWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateLending1Credential(){
        String expectedTitle = "Sign in to Bank of America Online & Mobile Banking to Manage Your Accounts";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void lending2WithCredential() throws InterruptedException{
        driver.findElement(By.xpath(lending2WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(CommercialRealEstateLoanWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(signInWebElement)).click();
        Thread.sleep(3000);

    }
    public void validateLending2Credential(){
        String expectedTitle = "Sign in to Bank of America Online & Mobile Banking to Manage Your Accounts";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");
    }
    public void checking3WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(checking3WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(debitCardsWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement);
        Thread.sleep(3000);
        driver.findElement(By.xpath(goWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(locationsWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateChecking3Credential(){
        String expectedTitle = "Bank of America Financial Centers and ATMs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void checking4WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(checking4WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(businessAdvantageCheckingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement);
        Thread.sleep(3000);
        driver.findElement(By.xpath(goWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(locations1WebElement)).click();
        Thread.sleep(3000);
    }
    public void validateChecking4Credential(){
        String expectedTitle = "Bank of America Financial Centers and ATMs";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Fail");

    }
    public void saving6WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(saving6WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(mobileBankingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(singInWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateSaving6Credential(){
        String expectedTitle="Sign in to Bank of America Online & Mobile Banking to Manage Your Accounts";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }
    public void savings7WithCredential() throws InterruptedException {
        driver.findElement(By.xpath(saving6WebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(onlineBankingWebElement)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(homeWebElement)).click();
        Thread.sleep(3000);
    }
    public void validateSavings7Credential(){
        String expectedTitle="Small Business Banking, Credit Cards & Loans – Bank of America";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }





}


