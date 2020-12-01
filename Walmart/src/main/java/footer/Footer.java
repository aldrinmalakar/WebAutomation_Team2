package footer;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static footer.FooterWebElements.*;

public class Footer extends WebAPI {

    Actions action=new Actions(driver);


    @FindBy(how = How.XPATH,using = webElementWalmartPlusXpath)
    public WebElement walmartPlus;

    @FindBy(how = How.XPATH,using = webElementWalmartPlusText)
    public WebElement walmartPlusText;

    @FindBy(how=How.XPATH,using=webElementMoneyCenter)
    public WebElement moneyCenter;

    @FindBy(how=How.XPATH,using=webElementMoneyCenterText)
    public WebElement moneyCenterText;

    @FindBy(how=How.XPATH,using=webElementFacebookIcon)
    public WebElement faceBookIcon;

    @FindBy(how=How.XPATH,using=webElementNewsLetterSearchBox)
    public WebElement newsLetterSearchBox;

    @FindBy(how=How.XPATH,using=webElementNewsLetterSignUpConfirmationText)
    public WebElement signUpConfirmationText;

    @FindBy(how=How.XPATH,using=webElementTwitterIcon)
    public WebElement twitterIcon;

    @FindBy(how=How.XPATH,using=webElementTwitterIconImg)
    public WebElement twitterIconImg;

    @FindBy(how=How.XPATH,using=webElementHelpCenter)
    public WebElement helpCenter;

    @FindBy(how=How.XPATH,using=webElementHelpCenterSearchBox)
    public WebElement helpCenterSearchBox;

    @FindBy(how=How.XPATH,using=webElementHelpToSearch)
    public WebElement helpToSearch;

    @FindBy(how=How.XPATH,using=webElementSearchBoxSubmit)
    public WebElement searchBoxSubmit;

    @FindBy(how=How.XPATH,using=webElementSearchPageItemText)
    public WebElement searchPageItemText;

    @FindBy(how=How.XPATH,using=webElementSamsClubLink)
    public WebElement samsClubLink;

    @FindBy(how=How.XPATH,using=webElementReturns)
    public WebElement returns;

    @FindBy(how=How.XPATH,using=webElementReturnsPageText)
    public WebElement returnsPageText;

    @FindBy(how=How.XPATH,using=webElementContactUs)
    public WebElement contactUs;

    @FindBy(how=How.XPATH,using=webElementCareers)
    public WebElement careers;

    @FindBy(how=How.XPATH,using=webElementOutDoorFurniture)
    public WebElement outDoorFurniture;

    @FindBy(how=How.XPATH,using=webElementInstagramIcon)
    public WebElement instagramIcon;

    @FindBy(how=How.XPATH,using=webElementWeeklyAds)
    public WebElement weeklyAds;

    @FindBy(how=How.XPATH,using=webElementDigitalMuseum)
    public WebElement digitalMuseum;

    @FindBy(how=How.XPATH,using=webElementTermsOfUse)
    public WebElement termsOfUse;

    @FindBy(how=How.XPATH,using=webElementStorePickUp)
    public WebElement storePickup;

    @FindBy(how=How.XPATH,using=webElementProductRecalls)
    public WebElement productRecalls;

    @FindBy(how=How.XPATH,using=webElementAccessibility)
    public WebElement accessibility;

    @FindBy(how=How.XPATH,using=webElementOurCompany)
    public WebElement ourCompany;

    @FindBy(how=How.XPATH,using=webElementStoreDirectory)
    public WebElement storeDirectory;

    @FindBy(how=How.XPATH,using=webElementOurSuppliers)
    public WebElement ourSuppliers;

    @FindBy(how=How.XPATH,using=webElementOtherServices)
    public WebElement otherServices;

    @FindBy(how=How.XPATH,using=webElementOurAds)
    public WebElement ourAds;



    //Action
    public void walmartPlusCheck() throws InterruptedException {
        walmartPlus.click();
        Thread.sleep(5000);
    }

    public void validateWalmartPlusText (String expectedResult){
        String actualResult = walmartPlusText.getText();
//        String expectedResult="Get free unlimited delivery*, member prices on fuel, & more.";
        Assert.assertEquals(actualResult,expectedResult);
    }

    public void moneyCenterCheck() throws InterruptedException {
        moneyCenter.click();
        String actualResult=moneyCenterText.getText();
        String expectedResult="Walmart MoneyCenter";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void faceBookIconCheck(){
        action.moveToElement(faceBookIcon).perform();

    }

    public void newsLetterSearchBoxCheck() throws InterruptedException {
        newsLetterSearchBox.sendKeys(webElementNewsLetterEmail);
        driver.findElement(By.xpath(webElementNewsLetterSignUpSubmitButton)).click();
        String actualResult=signUpConfirmationText.getText();
        String expectedResult="Thank you for signing up!";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);

    }

    public void twitterIconCheck() throws InterruptedException {
        twitterIcon.click();
        Thread.sleep(5000);
        Point actualResult=twitterIconImg.getLocation();
        String expectedResult="";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);

    }

    public void helpCenterCheck() throws InterruptedException {
        helpCenter.click();
        driver.findElement(By.xpath(webElementHelpCenterSearchBox)).sendKeys(webElementHelpToSearch);
        driver.findElement(By.xpath(webElementSearchBoxSubmit)).click();
        String actualResult=searchPageItemText.getText();
        String expectedResult="Where is my order?";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void samsClubLinkCheck() throws InterruptedException {
        samsClubLink.click();
        Thread.sleep(5000);
    }

    public void returnsCheck() throws InterruptedException {
        returns.click();
        String actualResult=returnsPageText.getText();
        String expectedResult="In response to COVID-19, we’ve made some changes to our return policy";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void contactUsCheck() throws InterruptedException {
        contactUs.click();
        String actualResult=moneyCenterText.getText();
        String expectedResult="Walmart MoneyCenter";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void careersCheck() throws InterruptedException {
        careers.click();
        String actualResult=moneyCenterText.getText();
        String expectedResult="Walmart MoneyCenter";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void outDoorFurnitureCheck() throws InterruptedException {
        outDoorFurniture.click();
        String actualResult=moneyCenterText.getText();
        String expectedResult="Walmart MoneyCenter";
        Assert.assertEquals(actualResult,expectedResult);
        Thread.sleep(5000);
    }

    public void instagramIconCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        instagramIcon.click();
        Thread.sleep(5000);
    }

    public void weeklyAdsCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        weeklyAds.click();
        Thread.sleep(5000);
    }

    public void digitalMuseumCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        digitalMuseum.click();
        Thread.sleep(5000);
    }

    public void termsOfUseCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        termsOfUse.click();
        Thread.sleep(5000);
    }

    public void storePickUpCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        storePickup.click();
        Thread.sleep(5000);
    }

    public void productRecallsCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        productRecalls.click();
        Thread.sleep(5000);
    }

    public void accessibilityCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        accessibility.click();
        Thread.sleep(5000);
    }

    public void ourCompanyCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        ourCompany.click();
        Thread.sleep(5000);
    }

    public void storeDirectoryCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        storeDirectory.click();
        Thread.sleep(5000);
    }

    public void ourSuppliersCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        ourSuppliers.click();
        Thread.sleep(5000);
    }

    public void otherServicesCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        otherServices.click();
        Thread.sleep(5000);
    }

    public void ourAdsCheck() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        ourAds.click();
        Thread.sleep(5000);
    }


}
