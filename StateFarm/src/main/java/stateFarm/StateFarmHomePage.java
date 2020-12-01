package stateFarm;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static stateFarm.StateFarmPageElements.*;

public class StateFarmHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = clickInsuranceWebElements)
    public WebElement clickInsurance;
    @FindBy(how = How.XPATH, using = validateInsuranceWebElements)
    public WebElement validateInsurance;


    @Test
    public void insurance() throws InterruptedException {
        clickInsurance.click();
        Thread.sleep(3000);
    }

    public void validateInsurance() {
        String expectedText = "INSURANCE OVERVIEW";
        String actualText = validateInsurance.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = findAnAgentWebElements)
    public WebElement findAnAgent;
    @FindBy(how = How.XPATH, using = validateMutualFundsWebElements)
    public WebElement validateMutualFunds;

    @Test
    public void clickFindAnAgent() throws InterruptedException {
        findAnAgent.click();
        Thread.sleep(3000);
    }

    public void validateFindAnAgent() {
        String expectedText = "Find an Agent";
        String actualText = validateMutualFunds.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = clickOnClaimsWebElements)
    public WebElement clickOnClaims;
    @FindBy(how = How.XPATH, using = validateOnClaimsWebElements)
    public WebElement validateOnClaims;

  @Test
    public void clickClaims() throws InterruptedException {
        clickOnClaims.click();
        Thread.sleep(3000);
    }
    public void validateClaims() {
        String expectedText = "How can we help?";
        String actualText = validateOnClaims.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = payABillWebElements)
    public WebElement payABill;
    @FindBy(how = How.XPATH, using = validatePayABillWebElements)
    public WebElement validatePayABill;

    @Test
    public void payABill() throws InterruptedException {
        payABill.click();
        Thread.sleep(3000);
    }
    public void validatePayABill() {
        String expectedText = "";
        String actualText = validatePayABill.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.XPATH, using = clickGetAQuoteWebElements)
    public WebElement clickGetAQuote;
    @FindBy(how = How.CSS, using = validateGetAQuoteWebElements)
    public WebElement validateGetAQuote;

    public void getAQuote() throws InterruptedException {
        clickGetAQuote.click();
        Thread.sleep(3000);
    }
    public void validateGetAQuote() {
        String expectedText = "or continue a quote";
        String actualText = validateGetAQuote.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = clickInvestmentsWebElements)
    public WebElement clickInvestments;
    @FindBy(how = How.XPATH, using = validateInvestmentsWebElements)
    public WebElement validateInvestments;

    public void investmentsS() throws InterruptedException {
        clickInvestments.click();
        Thread.sleep(3000);
    }
    public void validateInvestmentsS() {
        String expectedText = "INVESTMENTS OVERVIEW";
        String actualText = validateInvestments.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }
//7
    @FindBy(how = How.ID, using = hoverOnAutoWebElements)
    public WebElement hoverOnAuto;
    @FindBy(how = How.CSS, using = validateAutoWebElements)
    public WebElement validateAuto;

    public void clickAnnuitiesS() throws InterruptedException {
        hoverOnAuto.click();
        Thread.sleep(3000);

    }
    public void validateAnnuitiesS() {
        String expectedText = "Product";
        String actualText = validateAuto.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }
//8
    @FindBy(how = How.ID, using = hoverOnAutoWebElements)
    public WebElement hoverOnAuto1;
    @FindBy(how = How.ID, using = searchBoxZipCodeWebElements)
    public WebElement searchBoxZipCode;
    @FindBy(how = How.CSS, using = clickSearchBoxZipCodeWebElements)
    public WebElement clickSearchBoxZipCode;
    @FindBy(how = How.XPATH, using = validateSearchBoxZipCodeWebElements)
    public WebElement validateSearchBoxZipCode;

    public void searchBoxZipCodeS() throws InterruptedException {
        hoverOnAuto1.click();
        Thread.sleep(3000);
        searchBoxZipCode.sendKeys(search19111);
        Thread.sleep(3000);
        clickSearchBoxZipCode.click();
        Thread.sleep(3000);

    }
    public void validateSearchBoxZipCodeS() {
        String expectedText = "";
        String actualText = validateSearchBoxZipCode.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }





}
