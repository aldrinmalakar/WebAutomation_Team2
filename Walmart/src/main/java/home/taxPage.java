package home;
import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home.taxePageLocators.*;
public class taxPage extends WebAPI {

//    @BeforeMethod
//    public void goToTaxPage() {
//        driver.get(walmartURL);
//        clickByXpath(goToTaxPageX);
//    }

    public void titleValidation() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"failed");
    }

    public void logoButton(){
        clickByXpath(LogoX);
    }
    public void validateLogoButton(){
    String actualText= driver.findElement(By.xpath(actualLogoText)).getText();
    Assert.assertEquals(actualText,ExpectedLogoTestX,"failed");
    }

    public void myLocalStoreButton(){
        clickByXpath(mylocalStore);

    }
    public void validatMyLocalStoreButton(){
        String expectedText="Make this your store";
        String actualText=getTextByXpath(makeThisYourStoreText);
        Assert.assertEquals(actualText,expectedText,"failed");
    }

    public void cartButton(){
        boolean b=driver.findElement(By.xpath(checkCartDisplay)).isDisplayed();
        System.out.println(b);
    }

    public void signMouseOver() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.cssSelector(allDepartments))).build().perform();
        Thread.sleep(5000);
        clickByXpath(selectBaby);
    }


    public void helpButton(){
        driver.findElement(By.xpath(helpWebElement)).click();
    }
    public void validateHelpButton(){

        String actualHelpText=getTextByXpath(expHelpText);
        Assert.assertEquals(actualHelpText,expectedText,message);
    }

    public void helpLink(){
       clickByXpath(helpLinkWebElement);
    }
    public void validateHelpLink(){
        boolean b1=driver.findElement(By.xpath(imageLocator)).isDisplayed();
        System.out.println(b1);
    }

    public void TaxExemptApplication(){
        clickByXpath(TaxExemptApplicationWebElement);
    }
    public void validateTaxExemptApplication(){
       String actualTaxExemptApplicationText= getTextByXpath(expectedTaxExemptApplicationText);
      Assert.assertEquals(actualTaxExemptApplicationText,signLocator,message);
    }

    public void signWithInvalidPassword() throws InterruptedException {
        clickByXpath(TaxExemptApplicationWebElement);
        driver.findElement(By.xpath(emailSearchBoxWebElement)).sendKeys(emailData);
        driver.findElement(By.cssSelector(passwordFieldWebElement)).sendKeys(passwordData);
        clickByCss(signInButtonWebElement);
    }
    public void validateSignWithInvalidPassword() throws InterruptedException {
        Thread.sleep(5000);
        String expectedMessageError="Reset Your Password";
        String actualMessageError= driver.findElement(By.xpath(messageErrorLocator)).getText();
        Assert.assertEquals(actualMessageError,expectedMessageError,message);

    }

    public void  taxExemptHelPage(){
        clickByXpath("//a[contains(text(),'tax-exempt help page')]");

    }
    public void validatetaxExemptHelPage(){
        boolean b3=driver.findElement(By.xpath("//input[@id='searchInputBar']")).isDisplayed();
        System.out.println(b3);
    }

    public void  TaxExemptDocumentList(){
        clickByXpath(ExemptDocumentListWebElement);

    }
    public void validateTaxExemptDocumentList(){
        String expectedPageText="REQUESTED TAX DOCUMENTS BY STATE - ENTITY TYPE";
        String actualPageText=driver.findElement(By.xpath(textWebElement)).getText();
        Assert.assertEquals(actualPageText,expectedPageText,message);
    }

    public void creditCard(){
        clickByXpath(creditCardWebElement);
    }
    public void validateCreditCard(){
        driver.switchTo().frame(1);
        boolean b4=driver.findElement(By.cssSelector(AlreadyAcardholderWebElement)).isDisplayed();
        driver.switchTo().parentFrame();
        System.out.println(b4);
    }

    public void pickItUpTodayButton(){
        clickByXpath(PickItUpTodayWebElement);
        //driver.findElement(By.xpath(PickItUpTodayWebElement)).click();

    }
    public void validatePickItUpTodayButton(){
        String expectedAttribute="povActive";
        String actualAttribute= driver.findElement(By.id("povActive")).getAttribute("id");
        Assert.assertEquals(actualAttribute,expectedAttribute,message);
    }

    public void mouseOverStoreFinder(){
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(StoreFinderWebElement))).build().perform();
        driver.findElement(By.xpath(searchButtonWebElement)).sendKeys("Philadelphia");
        driver.findElement(By.cssSelector(findWebElement)).click();
    }
    public void validateMouseOverStoreFinder(){
        boolean b4=driver.findElement(By.className("elc-icon elc-icon-pin-nav")).isDisplayed();
        System.out.println(b4);
    }


    public void trackOrdersButton() throws InterruptedException {
        clickByXpath("//span[contains(text(),'Track Orders')]");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailData);
        driver.findElement(By.xpath("//input[@id='fullOrderId']")).sendKeys(passwordData);
        driver.findElement(By.className("spin-button-children")).click();
        Thread.sleep(20000);
    }
    public void validateTrackOrdersButton(){
        boolean b4=driver.findElement(By.xpath("//span[contains(text(),'Please correct the errors below.')]")).isDisplayed();
        System.out.println(b4);
    }

    public void SearchBox(){
        driver.findElement(By.className(searchBoxWebElement)).sendKeys("heater");
        clickByXpath(okSearchButtonWebElement);

    }
    public void validateSearchBox(){
        boolean b5=driver.findElement(By.xpath(element)).isDisplayed();
        System.out.println(b5);
    }

    public void reorderItems(){
        clickByXpath(reorderItemsWebElement);
    }
    public void validateReorderItems(){
        String expectedAttribute2="EasyReorder-logo";
        String actualAttribute2= driver.findElement(By.className(attributeWebElement)).getAttribute("class");
        Assert.assertEquals(actualAttribute2,expectedAttribute2,message);
    }

    public void LearnMore(){
        clickByXpath(creditCardWebElement);
        clickByXpath("//a[contains(text(),'Learn more')]");

    }
    public void ValidateLearnMore(){
        boolean b5=driver.findElement(By.xpath(learnMoreWebElement)).isDisplayed();
        System.out.println(b5);
    }

    public void AddToCart() throws InterruptedException {
        driver.findElement(By.xpath(checkCartDisplay)).click();
        clickByCss(cssLocator);
        Select select=new Select(driver.findElement(By.xpath(xpathLocator)));
        Thread.sleep(2000);
        select.selectByVisibleText("3");
    }

    public void WalmartPay(){
        clickByXpath(walmartPayWebElement);
    }
    public void validateWalmartPay(){
        String expectedTitleW="Walmart Pay - Walmart.com - Walmart.com";
      String ActualTitle=  driver.getTitle();
      Assert.assertEquals(ActualTitle,expectedTitleW,"failed");
    }

    public void SignUp() throws InterruptedException {
        driver.findElement(By.xpath(signUpSearchButton)).sendKeys(emailData);
        Thread.sleep(2000);
        clickByXpath(okSignUpSearchButton);
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

    }


    public void ClothingButton(){
        clickByXpath("//a[contains(text(),'Clothing')]");

    }
    public void ValidateClothingButton(){
       String expectedClothingTitle="Black Friday Apperal Deals by Brand 2020 - Walmart.com";
       String ActualClothingTitle= driver.getTitle();
       Assert.assertEquals(ActualClothingTitle,expectedClothingTitle,message);
    }

    public void SignUpFromClothingPage(){
        ClothingButton();
        driver.findElement(By.xpath(clothingWebElement)).sendKeys(emailData);
        clickByXpath(signUpFromClothingWeb);
        Alert alert =driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();



    }

    public void CorporateButton(){
        clickByXpath(corporateWebElement);

    }
    public void ValidateCorporateButton(){
        boolean b6=driver.findElement(By.xpath(imageWeb)).isDisplayed();
        System.out.println(b6);
    }





}