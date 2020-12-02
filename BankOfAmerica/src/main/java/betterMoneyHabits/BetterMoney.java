package betterMoneyHabits;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static betterMoneyHabits.BetterMoneyElements.*;

public class BetterMoney extends WebAPI {

    @FindBy(xpath =betterMoneyWebElement) public WebElement betterMoney;
    @FindBy(xpath = creditWebElement) public WebElement creditWeb;
    @FindBy(xpath = myPrioritiesWebElement) public WebElement myPriority;


    public void myPrioritiesWithCredential() throws InterruptedException {
        betterMoney.click();
        Thread.sleep(5000);
        creditWeb.click();
        Thread.sleep(5000);
        myPriority.click();
        Thread.sleep(5000);

    }

    public void validateMyPrioritiesCredential(){
        String expectedTitle ="What are Your Financial Priorities?";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Fail");
    }

    public void creditWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(choosingCreditCartWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateCreditCredential(){
        String expectedTitle="Understanding Credit Cards, Credit Management & Credit Scores";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void singINWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(singINWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(onlineIdWebElement)).sendKeys(enterIdWebElement);
        Thread.sleep(5000);
        driver.findElement(By.xpath(passcodeWebElement)).sendKeys(enterPasscodeWebElement);
        Thread.sleep(5000);
        driver.findElement(By.className(singInWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateSingInCredential(){
        String expectedTitle="Sign in to Bank of America Online & Mobile Banking to Manage Your Accounts";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    @FindBy(xpath =betterMoneyWebElement) public WebElement betterMoney1;
    @FindBy(xpath =creditWebElement) public WebElement credit;
    @FindBy(xpath = singInWebElement) public WebElement singIn;
    @FindBy(xpath =enrollInOnlineBankingWebElement) public WebElement enrollInOnlineBanking;
    @FindBy(xpath = cardOrAccountNumberWebElement) public WebElement cardOrAccountNumber;
    @FindBy(xpath = ssnOrTinWebElement) public WebElement ssnOrTin;
    @FindBy(id=continueWebElement) public WebElement continueButton;

    public void enrollInOnlineBankingWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        credit.click();
        Thread.sleep(5000);
        singIn.click();
        Thread.sleep(5000);
        enrollInOnlineBanking.click();
        Thread.sleep(5000);
        cardOrAccountNumber.sendKeys(enterLast6DigitsWebElement);
        Thread.sleep(5000);
        ssnOrTin.sendKeys(enterSSNOrTINWebElement);
        Thread.sleep(5000);
        continueButton.click();
    }
    public void validateEnrollInOnlineBankingCredential(){
        String expectedText="Let's get started";
        String actualText=continueButton.getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail: Search keyword does not match");
    }
    public void creditWithCredential1() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditReportWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateCreditCredential1(){
        String expectedTitle="Understanding Credit Cards, Credit Management & Credit Scores";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void creditWithCredential2() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(improvingYourCreditScoreWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateCreditCredential2(){
        String expectedTitle="Understanding Credit Cards, Credit Management & Credit Scores";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void creditWithCredential3() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(howCreditCartWorkWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateCreditCredential3(){
        String expectedTitle="Understanding Credit Cards, Credit Management & Credit Scores";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void creditWithCredential4() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(creditWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(managingCreditCartWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateCreditCredential4(){
        String expectedTitle="Understanding Credit Cards, Credit Management & Credit Scores";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    public void debtWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(debitWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(debtAndFinancialAssistance)).click();
        Thread.sleep(5000);
    }
    public void validateDebtCredential(){
        String expectedTitle="Tips to Manage, Payoff & Get Out of Debt";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void debtWithCredential1() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(debitWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(payingOfDebtWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateDebtCredential1(){
        String expectedTitle="Tips to Manage, Payoff & Get Out of Debt";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void debtWithCredential2() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(debitWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(understandingDebtWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateDebtCredential2(){
        String expectedTitle="Tips to Manage, Payoff & Get Out of Debt";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void savingAndBudgetingWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(betterMoneyWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(savingAndBudgetingWebElement)).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(budgetingTipsWebElement)).click();
        Thread.sleep(5000);
    }
    public void validateSavingAndBudgetingCredential(){
        String expectedTitle="Tips for Saving Money & Budgeting Finances";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    @FindBy(css = homeOwnershipWebElement) public WebElement homeOwnership;
    @FindBy(xpath = mortgageBasicWebElement) public WebElement mortgageBasic;
    public void homeOwnershipWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        homeOwnership.click();
        Thread.sleep(5000);
        mortgageBasic.click();
        Thread.sleep(5000);
    }
    public void validateHomeOwnershipCredential(){
        String expectedTitle="Tips on Home Ownership, Mortgages and Home Equity";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = autoWebElement) WebElement auto;
    @FindBy(css = buyingACarWebElement) WebElement buyingACar;
    public void autoWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        auto.click();
        Thread.sleep(5000);
        buyingACar.click();
        Thread.sleep(5000);


    }
    public void validateAutoCredential(){
        String expectedText="Auto";
        String actualText=driver.findElement(By.xpath(autoActualTextWebElement)).getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail");
    }
    @FindBy(xpath = retirementWebElement) public WebElement retirement;
    @FindBy(xpath = livingInRetirementWebElement) public WebElement livingInRetirement;
    public void retirementWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        retirement.click();
        Thread.sleep(5000);
        livingInRetirement.click();
        Thread.sleep(5000);
    }
    public void validateRetirementCredential(){
        String expectedTitle="Tips on Planning and Saving for Retirement";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    @FindBy(xpath = collegeWebElement) public WebElement college;
    @FindBy(xpath = payingBackStudentLoanWithElement) public WebElement payingBackStudentLoan;
    public void collegeWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        college.click();
        Thread.sleep(5000);
        payingBackStudentLoan.click();
        Thread.sleep(5000);
    }
    public void validateCollegeCredential(){
        String expectedTitle="Tips for Planning and How to Pay for College";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    @FindBy(xpath = privacyAndSecurityWebElement) public WebElement privacyAndSecurity;
    @FindBy(xpath = identityTheftWebElement) public WebElement identityTheft;
    public void privacyAndSecurityWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        privacyAndSecurity.click();
        Thread.sleep(5000);
        identityTheft.click();
        Thread.sleep(5000);
    }
    public void validatePrivacyAndSecurityCredential(){
        String expectedTitle="Personal Privacy, Data Security and Avoiding Identity Theft";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = personalBankingWebElement) public WebElement personalBanking;
    @FindBy(xpath = howBankWorksWebElement) public WebElement howBankWorks;
    public void personalBankingWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        personalBanking.click();
        Thread.sleep(5000);
        howBankWorks.click();
        Thread.sleep(5000);
    }
    public void validatePersonalBankingCredential(){
        String expectedTitle="Tips about Personal Banking and Managing Bank Accounts";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = menuWebElement) public WebElement menu;
    @FindBy(xpath = militaryWebElement) public WebElement military;
    @FindBy(xpath = allSpotlightsWebElement) public WebElement allSpotlights;
    public void menuWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        personalBanking.click();
        Thread.sleep(5000);
        menu.click();
        Thread.sleep(5000);
        military.click();
        Thread.sleep(5000);
        allSpotlights.click();
        Thread.sleep(5000);
    }
    public void validateMenuCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Spotlight Financial Goals for Your Future";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = SearchMenuWebElement) public WebElement SearchMenu;
    @FindBy(xpath = searchBoxWebElement) public WebElement searchBox;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = creditCardRewardWebElement) public WebElement creditCardReward;
    public void SearchCreditCartWithCredential() throws InterruptedException {
        betterMoney1.click();
        Thread.sleep(5000);
        personalBanking.click();
        Thread.sleep(5000);
        SearchMenu.click();
        Thread.sleep(5000);
        searchBox.sendKeys(searchCard);
        Thread.sleep(5000);
        searchButton.click();
        Thread.sleep(5000);
        creditCardReward.click();
        Thread.sleep(5000);
    }
    public void validateSearchCreditCartCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Bank of America | Online Banking | Sign In | Online ID";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail:Search keyword does not match");
    }


}
