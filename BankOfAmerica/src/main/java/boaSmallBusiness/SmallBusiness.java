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
        driver.findElement(By.xpath(zipCodWebElement)).sendKeys(enterZipCodWebElement);
        Thread.sleep(3000);
        driver.findElement(By.xpath(goWebElement)).click();



    }


}
