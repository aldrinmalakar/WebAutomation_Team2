package walmartHome;

import common.WebAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static walmartHome.HomePageElements.*;

   public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = samsungActualTextWebElement)
    public WebElement samsungWebElement;

    @FindBy(how = How.XPATH, using = accountWebElement)
    public WebElement account;
    @FindBy(how = How.CSS, using = singUptWebElement)
    public WebElement singUp;
    @FindBy(how = How.CSS, using = createAccountWebElement)
    public WebElement createAccount;
    @FindBy(how = How.ID, using = firstNameForCreateAccountWebElement)
    public WebElement firstName;
    @FindBy(how = How.ID, using = lastNameForCreateAccountWebElement)
    public WebElement lastName;
    @FindBy(how = How.ID, using = emailAddressForCreateAccountWebElement)
    public WebElement emailAddressForCreateAccount;
    @FindBy(how = How.XPATH, using = passwordForCreateAccountWebElement)
    public WebElement passwordForCreateAccount;


    @FindBy(how = How.ID, using = emailAddressWebElement)
    public WebElement emailAddress;
    @FindBy(how = How.ID, using = passwordWebElement)
    public WebElement password;
    @FindBy(how = How.CSS, using = singIntWebElement)
    public WebElement singIn;

    @FindBy(how = How.CSS, using = forgetPasswordWebElement)
    public WebElement forgetPassword;
    @FindBy(how = How.ID, using = emailAddressForForgetPasswordWebElement)
    public WebElement emailAddressForForgetPassword;
    @FindBy(how = How.ID, using = verificationCodeWebElement)
    public WebElement verificationCode;
    @FindBy(how = How.CSS, using = createNewPasswordWebElement)
    public WebElement createNewPassword;
    @FindBy(how = How.CSS, using = clickButtonContinueWebElement)
    public WebElement clickButtonContinue;

    @FindBy(how = How.XPATH, using = ShopAllWebElement)
    public WebElement ShopAll;
    @FindBy(how = How.XPATH, using = priceWebElement)
    public WebElement price;
    @FindBy(how = How.XPATH, using = selectPriceWebElement)
    public WebElement selectPrice;

    @FindBy(how = How.XPATH, using = returnItemWebElement)
    public WebElement returnItem;
    @FindBy(how = How.XPATH, using = selectNoAccountWebElement)
    public WebElement selectNoAccount;
    @FindBy(how = How.CSS, using = ReturnAnInStorePurchaseWebElement)
    public WebElement ReturnAnInStorePurchase;
    @FindBy(how = How.XPATH, using = tcNumberReceiptWebElement)
    public WebElement tcNumberReceipt;
    @FindBy(how = How.XPATH, using = searchWebElement)
    public WebElement search;

    @FindBy(how = How.XPATH, using = careersWebElement)
    public WebElement careers;
    @FindBy(how = How.XPATH, using = walmartManagementJobsWebElement)
    public WebElement walmartManagementJobs;
    @FindBy(how = How.XPATH, using = coManagerWebElement)
    public WebElement coManager;

    @FindBy(how = How.XPATH, using = corporateWebElement)
    public WebElement corporate;
    @FindBy(how = How.XPATH, using = accountingAndFinanceWebElement)
    public WebElement accountingAndFinance;
    @FindBy(how = How.XPATH, using = accountingWebElement)
    public WebElement accounting;

    @FindBy(how = How.XPATH, using = healthcareWebElement)
    public WebElement healthcare;
    @FindBy(how = How.XPATH, using = opticalWebElement)
    public WebElement optical;

    @FindBy(how = How.XPATH, using = technologyWebElement)
    public WebElement technology;
    @FindBy(how = How.XPATH, using = informationTechnologyWebElement)
    public WebElement informationTechnology;

    @FindBy(how = How.XPATH, using = softwareDevelopmentAndEngineeringWebElement)
    public WebElement softwareDevelopmentAndEngineering;
    @FindBy(how = How.XPATH, using = frontEndWebElement)
    public WebElement frontEnd;
    @FindBy(css = usaStaffSoftwareEngineerFrontEndWebElement) public WebElement usaStaffSoftwareEngineerFrontEnd;

    @FindBy(how = How.XPATH, using = BackEndWebElement)
    public WebElement BackEnd;
    @FindBy(xpath = seniorSoftwareEngineerEcommWebElement) public WebElement seniorSoftwareEngineerEcommWeb;
    @FindBy(xpath = applyWebElement) public WebElement apply;

    @FindBy(how = How.CSS, using = videoGameWebElement)
    public WebElement videoGame;
    @FindBy(how = How.CSS, using = XboxWebElement)
    public WebElement Xbox;
    @FindBy(xpath = XboxConsolesWebElement) public WebElement XboxConsoles;
//    @FindBy(how = How.XPATH, using = XboxConsolesWebElement)
//    public WebElement XboxConsoles;


 public void sleep(int time){
    driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
}



    public void searchBox() throws InterruptedException {
        searchBox.sendKeys(searchSamsung);
        Thread.sleep(4000);
        searchButton.click();
//        Thread.sleep(4000);
        sleep(5);
    }

    public void validateSearchBox() {
        String expectedText = "\"Samsung\"";
        String actualText = samsungWebElement.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void createAccountWithValidCredential() throws InterruptedException {
        account.click();
        Thread.sleep(4000);

        singUp.click();
        Thread.sleep(4000);
        createAccount.click();
        Thread.sleep(4000);
        firstName.sendKeys(enterFirstNameForCreateAccountWebElement);
        Thread.sleep(4000);
        lastName.sendKeys(enterLastNameForCreateAccountWebElement);
        Thread.sleep(4000);
        emailAddressForCreateAccount.sendKeys(enterEmailAddressForCreateAccountWebElement);
        Thread.sleep(4000);
        passwordForCreateAccount.sendKeys(enterPasswordForCreateAccountWebElement);
        Thread.sleep(4000);
//        createNewPassword.sendKeys(enterPasswordForCreateAccountWebElement);


    }


    public final String walmartText = "#sign-in-widget > h1 > span:nth-child(2) > span > span";
    @FindBy(css = walmartText) public WebElement WalmartT;

    public void validateAccountWithValidCredential() throws InterruptedException {
        String actualText= WalmartT.getText();
        String expectedText= "Walmart account";
        Assert.assertEquals(actualText,expectedText,"Test Fail: Search keyword does not match");

//        String expectedTitle="Login";
//        String actualTitle= driver.getTitle();
////        String actualTitle= driver.getCurrentUrl();
//        Assert.assertEquals(actualTitle,expectedTitle);

        // validation with text



    }

    public void singInWithValidCredential() throws InterruptedException {
        account.click();
        Thread.sleep(4000);
        singUp.click();
        Thread.sleep(4000);
        emailAddress.sendKeys(enterEmailAddressWebElement);
        Thread.sleep(4000);
        password.sendKeys(enterPasswordWebElement);
        Thread.sleep(4000);
        singIn.click();
        Thread.sleep(4000);


    }

    public void validateSingInCredential() {
        String expectedText="Walmart account";
        String actualText=singIn.getText();
        Assert.assertEquals(actualText,expectedText,"Test Fail: Search keyword does not match");


    }

    public void forgetPasswordWithValidCredential() throws InterruptedException {
        account.click();
        Thread.sleep(4000);
        singUp.click();
        Thread.sleep(4000);
        forgetPassword.click();
        Thread.sleep(4000);
        emailAddressForForgetPassword.sendKeys(enterEmailAddressForForgetPasswordWebElement);
        Thread.sleep(4000);
        verificationCode.sendKeys(enterVerificationCodeWebElement);
        Thread.sleep(4000);
        createNewPassword.sendKeys(enterNewPasswordWebElement);
        Thread.sleep(4000);
        clickButtonContinue.click();
        Thread.sleep(4000);


    }

    public void validateForgetPasswordCredential() {
        String actualText=clickButtonContinue.getText();
        String expectedText="Sign in or create a new password";
        Assert.assertEquals(actualText,expectedText,"Test Fail:Search keyword does not match");


    }

    public void shopByPriceWithValidCredential() throws InterruptedException {
        ShopAll.click();
        Thread.sleep(4000);
        price.click();
        Thread.sleep(4000);
        selectPrice.click();

    }

    public void ValidateShopByPriceCredential() {
        String expectedText = "Price";
        String actualText = selectPrice.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void returnItemWithValidCredential() throws InterruptedException {
        returnItem.click();
        Thread.sleep(4000);
        selectNoAccount.click();
        Thread.sleep(4000);
        ReturnAnInStorePurchase.click();
        Thread.sleep(4000);
        tcNumberReceipt.sendKeys(enterTcNumberReceiptWebElement);
        Thread.sleep(4000);
        search.click();
        Thread.sleep(4000);

    }

    public void validateReturnItemCredential() {
        String expectedText = "Returns";
        String actualText = search.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void searchCoManagerWithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        walmartManagementJobs.click();
        Thread.sleep(4000);
        coManager.click();
        Thread.sleep(4000);
    }

    public void validateSearchCoManagerCredential() {
        String expectedText = "Suggested searches";
        String actualText = coManager.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void accountingWithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        corporate.click();
        Thread.sleep(4000);
        accountingAndFinance.click();
        Thread.sleep(4000);
        accounting.click();
        Thread.sleep(4000);

    }
    public void validateAccountingCredential(){
        String expectedText = "Find the right job for you.";
        String actualText = accounting.getText();
        Assert.assertEquals(actualText, expectedText, "Test Fail: Search keyword does not match");
    }

    public void opticalWithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        healthcare.click();
        Thread.sleep(4000);
        optical.click();
        }

    public void validateOpticalCredential(){
        String expectedText = "Optical";
        String actualText = optical.getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail: Search keyword does not match");


    }

    public void technology1WithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        technology.click();
        Thread.sleep(4000);
        informationTechnology.click();
        Thread.sleep(4000);
    }

    public void validateTechnology1Credential(){
        String expectedText = "Information Technology";
        String actualText = informationTechnology.getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail: Search keyword does not match");
    }

    public void technology2WithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        technology.click();
        Thread.sleep(4000);
        softwareDevelopmentAndEngineering.click();
        Thread.sleep(4000);
        usaStaffSoftwareEngineerFrontEnd.click();
        Thread.sleep(4000);


    }

    public void validateTechnology2Credential(){
        String expectedText = "(USA) Staff Software Engineer-Front End";
        String actualText = usaStaffSoftwareEngineerFrontEnd.getText();
        Assert.assertEquals(expectedText,actualText,"Test Fail: Search keyword does not match");
    }
    public void technology3WithValidCredential() throws InterruptedException {
        careers.click();
        Thread.sleep(4000);
        technology.click();
        Thread.sleep(4000);
        softwareDevelopmentAndEngineering.click();
        Thread.sleep(4000);
        BackEnd.click();
        Thread.sleep(4000);
        seniorSoftwareEngineerEcommWeb.click();
       Thread.sleep(4000);
        apply.click();
        Thread.sleep(4000);

    }
    public void validateTechnology3Credential() {
        String expectedText = "Senior Software Engineer - Ecomm";
        String actualText = apply.getText();
        Assert.assertEquals(expectedText, actualText, "Test Fail: Search keyword does not match");
    }

    public void searchXobConsolesWithCredential() throws InterruptedException {


//        @FindBy(xpath = XboxConsolesWebElement) public WebElement XboxConsoles;

        driver.findElement(By.xpath(videoGameWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(XboxWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(XboxConsolesWebElement)).click();
        Thread.sleep(4000);

    }
    public void validateSearchXobConsolesCredential(){
        String expectedTitle="https://www.walmart.com/browse/video-games/xbox-one-consoles/2636_1224908_1224995";
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }

    public  void walmartPhotoWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(walmartPhotoWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(printsWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(calendarPrintsWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(collegePostCalendarsWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(chooseSizeWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(choosePaperWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(createNowWebElement)).click();
        Thread.sleep(4000);

    }
    public void validateWalmartPhotoCredential(){
        String expectTitle="Collage Poster Calendars | Collage Poster Calendar, 11x14, Glossy Poster Paper | 2021 Custom Color Collage Calendar Poster";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectTitle,"Test Fail: Search keyword does not match");

    }
    public void findLocalStoreWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(homePageWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(localStoreWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(storeWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(findAnotherStoreWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(roundRockStoreWebElement)).click();
        Thread.sleep(4000);
    }
    public void validateFindLocalStoreCredential(){
        String expectedTitle="Store Finder - Walmart.com";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void blackFridayDealsWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(homePageWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(blackFridayDealsWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(toysWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(megaGraveDiggerWebElement)).click();
        Thread.sleep(4000);
    }
    public void validateBlackFridayCredential(){
        String expectedTitle="https://www.walmart.com/ip/Monster-Jam-Official-MEGA-Grave-Digger-All-Terrain-Remote-Control-Monster-Truck-with-Lights-1-6-Scale/573843077";
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void beautyWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(homePageWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(beautyWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(hairColorWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(darkAndNaturalWebElement)).click();
        Thread.sleep(4000);
    }
    public void validateBeautyCredential(){
        String expectedTitle="SoftSheen-Carson Dark and Natural 5 Minute Shampoo In Permanent Men's Hair Color, Natural Black - Walmart.com - Walmart.com";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void homeImprovementWithCredential() throws InterruptedException {
        driver.findElement(By.xpath(homePageWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(homeImprovementWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(leadersWebElement)).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath(leader8WebElement)).click();
        Thread.sleep(4000);
    }
    public void validateHomeImprovementCredential(){
        String expectedTitle="Louisville Ladder 8' Fiberglass Step Ladder, 250-lb Capacity, W-3118-08 - Walmart.com - Walmart.com";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }
    public void babyWithCredential(){
        driver.findElement(By.xpath(babyWebElement)).click();
        driver.findElement(By.xpath(infantCarSeatWebElement)).click();
        driver.findElement(By.xpath(convertibleCarSeatWebElement)).click();
    }
    public void validateBabyCredential(){
        String expectedTitle="Safety 1st Grow and Go Sprint All-in-1 Convertible Car Seat, Silver Lake - Walmart.com - Walmart.com";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");

    }
    public void giftsWithCredential(){
        driver.findElement(By.xpath(GiftsWebElement)).click();
        driver.findElement(By.xpath(giftForKidsWEbElement)).click();
        driver.findElement(By.xpath(nintendoSwitchLiteWebElement)).click();
    }
    public void validateGiftsCredential(){
        String expectedTitle="Nintendo Switch Lite Console, Turquoise - Walmart.com - Walmart.com";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail: Search keyword does not match");
    }


}