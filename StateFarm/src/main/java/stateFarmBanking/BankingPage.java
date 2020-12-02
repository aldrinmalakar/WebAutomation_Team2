package stateFarmBanking;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static stateFarmBanking.BankingPageElement.*;

public class BankingPage extends WebAPI {
    @FindBy(xpath = bankingWebElement) public WebElement banking;
    @FindBy(id = homeLoansWebElement) public WebElement homeLoans;
    @FindBy(id = findAgentWebElement) public WebElement findAgent;
    @FindBy(id = clickFindAgentWebElement) public WebElement clickFindAgent;
    public void homeLoansWithCredential() throws InterruptedException {
        banking.click();
        Thread.sleep(5000);
        homeLoans.click();
        Thread.sleep(5000);
        findAgent.sendKeys(enterZipCodWebElement);
        Thread.sleep(5000);
        clickFindAgent.click();
        Thread.sleep(5000);
    }
    public void validateHomeLoansCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Find State Farm® Agents Near You - State Farm®";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = singInWebElement) public WebElement singIn;
    @FindBy(xpath = userIdWebElement) public WebElement userId;
    @FindBy(xpath = passwordWebElement) public WebElement password;
    @FindBy(xpath = clickLogInWebElement) public WebElement clickLogIn;
    public void singInWithCredential() throws InterruptedException {
        singIn.click();
        Thread.sleep(5000);
        userId.sendKeys(enterUserIdWebElement);
        Thread.sleep(5000);
        password.sendKeys(enterPasswordWebElement);
        Thread.sleep(5000);
        clickLogIn.click();
        Thread.sleep(5000);
    }
    public void validateSingInCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="State Farm® | Login";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = checkingWebElement) public WebElement checking;
    public void checkingWithCredential() throws InterruptedException {
        banking.click();
        Thread.sleep(5000);
        checking.click();
        Thread.sleep(5000);
    }
    public void validateCheckingCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Open an Online Checking Account that Fits Your Needs - State Farm®";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    @FindBy(xpath = investmentsWebElement) public WebElement investments;
    @FindBy(xpath = routhIraWebElement) public WebElement routhIra;
    @FindBy(xpath = additionalCalculatorsWebElement) public WebElement additionalCalculators;
    public void investmentWithCredential() throws InterruptedException {
        banking.click();
        Thread.sleep(5000);
        investments.click();
        Thread.sleep(5000);
        routhIra.click();
        Thread.sleep(5000);
        additionalCalculators.click();
        Thread.sleep(5000);
    }
    public void validateInvestmentsCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Budgeting Calculator - State Farm®";
    }
    @FindBy(xpath = emergencyFoundCalculatorWebElement) public WebElement emergencyFoundCalculator;
    @FindBy(xpath = monthlyLivingExpensesWebElement) public WebElement monthlyLivingExpenses;
    @FindBy(xpath = monthOfExpensesToCoverWebElement) public WebElement monthOfExpensesToCover;
    public void investmentEmergencyWithCredential() throws InterruptedException {
        banking.click();
        Thread.sleep(5000);
        investments.click();
        Thread.sleep(5000);
        routhIra.click();
        Thread.sleep(5000);
        additionalCalculators.click();
        Thread.sleep(5000);
        emergencyFoundCalculator.click();
        Thread.sleep(5000);
        monthlyLivingExpenses.sendKeys(enterMonthlyLivingExpensesWebElement);
        Thread.sleep(5000);
        monthOfExpensesToCover.sendKeys(enterMonthOfExpensesToCoverWebElement);
        Thread.sleep(5000);

    }
    public void validateInvestmentEmergencyCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Building an Emergency Fund: Calculate How Much to Save - State Farm®";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = savingWebElement) public WebElement saving;
    public void savingWithCredential() throws InterruptedException {
        banking.click();
        Thread.sleep(5000);
        saving.click();
        Thread.sleep(5000);
    }
    public void validateSavingCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Types of Savings Accounts";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }

    @FindBy(xpath = logInWebElement) public WebElement logIn;
    @FindBy(xpath = useIdWebElement) public WebElement useId;
    @FindBy(xpath = password1WebElement) public WebElement password1;
    @FindBy(xpath = logInButtonWebElement) public WebElement logInButton;
    public void logInWithCredential() throws InterruptedException {
        logIn.click();
        Thread.sleep(5000);
        useId.sendKeys(enterUseIdWebElement);
        Thread.sleep(5000);
        password1.sendKeys(enterPassword1WebElement);
        Thread.sleep(5000);
        logInButton.click();
        Thread.sleep(5000);
    }
    public void validateLogInCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="State Farm® | Login";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = createAccountWebElement) public WebElement createAccount;
    @FindBy(xpath = firstNameWebElement) public WebElement firstName;
    @FindBy(xpath = lastNameWebElement) public WebElement lastName;
    @FindBy(xpath = dateOfBirthWebElement) public WebElement dateOfBirth;
    @FindBy(css = continueButtonWebElement) public WebElement continueButton;
    public void createAccountWithCredential() throws InterruptedException {
        logIn.click();
        Thread.sleep(5000);
        createAccount.click();
        Thread.sleep(5000);
        firstName.sendKeys(enterFirstNameWebElement);
        Thread.sleep(5000);
        lastName.sendKeys(enterLastNameWebElement);
        Thread.sleep(5000);
        dateOfBirth.sendKeys(enterDateOfBirthWebElement);
        Thread.sleep(5000);
        continueButton.click();
        Thread.sleep(5000);
    }
    public void validateCreateAccountCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Customer Registration";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }

    @FindBy(xpath = payBillWebElement) public WebElement payBill;
    @FindBy(xpath = payByPhoneWebElement) public WebElement payByPhone;
    @FindBy(xpath = PHoneNumberWebElement) public WebElement PHoneNumber;
    @FindBy(xpath = dateOfBirth1WebElement) public WebElement dateOfBirth1;
    @FindBy(xpath = continueButton1WenElement) public WebElement continueButton1;
    public void payBillWithCredential() throws InterruptedException {
        logIn.click();
        Thread.sleep(5000);
        payBill.click();
        Thread.sleep(5000);
        payByPhone.click();
        Thread.sleep(5000);
        PHoneNumber.sendKeys(enterPhoneNumberWebElement);
        Thread.sleep(5000);
        dateOfBirth1.sendKeys(enterDateOfBirth1WebElement);
        Thread.sleep(5000);
        continueButton1.click();
        Thread.sleep(5000);

    }
    public void validatePayBillCredential(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Provide Bill Information";
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }

    @FindBy(xpath = getIdCartWebElement) public WebElement getIdCart;
    public void getIdCardWithCredential(){

    }


}
