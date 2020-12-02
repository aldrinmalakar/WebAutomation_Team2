package stateFarmInsurance;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


import static stateFarmInsurance.InsuranceElement.*;

public class Insurance extends WebAPI {
    @FindBy(xpath = insuranceWebElement) public WebElement insurance;
    @FindBy(xpath = homePropertyWebElement) public WebElement homeProperty;
    @FindBy(xpath = zipCodWebElement) public WebElement zipCod;
    @FindBy(xpath = startACotWebElement) public WebElement startACot;
    public void homePropertyWithCredential() throws InterruptedException {
        insurance.click();
        Thread.sleep(3000);
        homeProperty.click();
        Thread.sleep(3000);
        zipCod.sendKeys(enterZipCodWebElement);
        Thread.sleep(3000);
        startACot.click();
        Thread.sleep(3000);

    }
    public void validateHomePropertyCredential(){
        String expectedTitle="Welcome Homeowners State Farm";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"");
    }
    @FindBy(xpath = insurance0WebElement) public WebElement insurance0;
    @FindBy(xpath = lifeWebElement)public WebElement life;
    @FindBy(xpath = contactAnAgentAboutLifeInsurance1WebElement)public WebElement contactAnAgentAboutLifeInsurance1;
    @FindBy(xpath = advancedSearchOptionsWebElement)public WebElement advancedSearchOptions;

        public void lifeWithCredential() throws InterruptedException {
            insurance0.click();
            Thread.sleep(3000);
            life.click();
            Thread.sleep(3000);
            contactAnAgentAboutLifeInsurance1.click();
            Thread.sleep(3000);
            advancedSearchOptions.click();
            Thread.sleep(3000);

        }
        public void validateLifeCredential(){
                String expectedTitle = "Find State Farm® Agents Near You - State Farm®";
                String actualTitle = driver.getTitle();
                Assert.assertEquals(actualTitle, expectedTitle, "");

        }
    @FindBy(xpath = insurance20WebElement) public WebElement insurance20;
        @FindBy(id = healthWebElement)public WebElement health;
        @FindBy(xpath = zipCod5WebElement) public WebElement zipCod5;
         @FindBy(xpath = findAnAgentWebElement)public  WebElement findAnAgent;
        public void healthWithCredential() throws InterruptedException {
            insurance20.click();
            Thread.sleep(3000);
            health.click();

            Thread.sleep(3000);
            zipCod5.sendKeys(enterZipCod5WebElement);
            Thread.sleep(3000);
            findAnAgent.click();
            Thread.sleep(3000);
        }
        public void validateHealthCredential(){
            String expectedTitle = "Find State Farm® Agents Near You - State Farm®";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle, "");
        }

         @FindBy(xpath = insurance3WebElement) public WebElement insurance3;
        @FindBy(xpath = boatWebElement)public WebElement boat;
        @FindBy(xpath = zipCod3WebElement) public WebElement zipCod3;
        @FindBy(xpath = findAnAgent3tWebElement)public WebElement findAnAgent3;
        public void boatWithCredential() throws InterruptedException {
            insurance.click();
            Thread.sleep(3000);
            boat.click();
            Thread.sleep(3000);
            zipCod3.sendKeys(enterZipCod3WebElement);
            Thread.sleep(3000);
            findAnAgent3.click();
            Thread.sleep(3000);
        }
    public void validateBoat(){
        String expectedTitle = "Find State Farm® Agents Near You - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance4WebElement) public WebElement insurance4;
        @FindBy(xpath = autoInsuranceSavingsWebElement)public WebElement autoInsuranceSavings;
        @FindBy(xpath = readSimpleInsightsInAutoInsuranceWebElement)public WebElement  readSimpleInsightsInAutoInsurance;
        public void autoInsuranceSavingsWithCredential() throws InterruptedException {
            insurance4.click();
            Thread.sleep(3000);
            autoInsuranceSavings.click();
            Thread.sleep(3000);
            readSimpleInsightsInAutoInsurance.click();
            Thread.sleep(3000);

        }
    public void validateAutoInsuranceSavings(){
        String expectedTitle = "Car Insurance Information - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance5WebElement) public WebElement insurance5;
    @FindBy(xpath = autoInsuranceSavings1WebElement)public WebElement autoInsuranceSavings1;
    @FindBy(xpath =  factorsInfluencingCarInsuranceRatesWebElement)private WebElement factorsInfluencingCarInsuranceRates;
    public void autoInsuranceSavings1WithCredential() throws InterruptedException {
        insurance5.click();
        Thread.sleep(3000);
        autoInsuranceSavings1.click();
        Thread.sleep(3000);
        factorsInfluencingCarInsuranceRates.click();
        Thread.sleep(3000);

    }
    public void validateAutoInsuranceSavings1(){
        String expectedTitle = "Car Insurance Prices - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance6WebElement) public WebElement insurance6;
    @FindBy(xpath = autoInsuranceSavings2WebElement)public WebElement autoInsuranceSavings2;
     @FindBy(xpath = exploreTheTriangleOfProtectionWebElement)private WebElement exploreTheTriangleOfProtection;
     public void autoInsuranceSavings2WithCredential() throws InterruptedException {
         insurance6.click();
         Thread.sleep(3000);
         autoInsuranceSavings2.click();
         Thread.sleep(3000);
         exploreTheTriangleOfProtection.click();
         Thread.sleep(3000);
     }
    public void validateAutoInsuranceSavings2(){
        String expectedTitle = "Triangle of Protection - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance7WebElement) public WebElement insurance7;
    @FindBy(xpath = steerClearAnsDiscountsWebElement)public WebElement steerClearAnsDiscounts ;
    @FindBy(xpath = FAQWebElement)public WebElement FAQ;

    public void steerClearAnsDiscountsWithCredential() throws InterruptedException {
        insurance6.click();
        Thread.sleep(3000);
        steerClearAnsDiscounts.click();
        Thread.sleep(3000);
        FAQ.click();
        Thread.sleep(3000);
    }
    public void validateSteerClearAnsDiscounts(){
        String expectedTitle = "Mobile App Questions - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance8WebElement) public WebElement insurance8;
    @FindBy(xpath = steerClearAnsDiscounts1WebElement)public WebElement steerClearAnsDiscounts1 ;
    @FindBy(xpath = lookWebElement)public WebElement look;
    public void steerClearAnsDiscounts1WithCredential() throws InterruptedException {
        insurance6.click();
        Thread.sleep(3000);
        steerClearAnsDiscounts1.click();
        Thread.sleep(3000);
        look.click();
        Thread.sleep(3000);
    }
    public void validateSteerClearAnsDiscounts1(){
        String expectedTitle = "Steer Clear Safe Driver Discount - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance9WebElement) public WebElement insurance9;
    @FindBy(xpath = steerClearAnsDiscounts2WebElement)public WebElement steerClearAnsDiscounts2 ;
    @FindBy(xpath = viewDetailsWebElement)public  WebElement  viewDetails;
    public void steerClearAnsDiscounts2WithCredential() throws InterruptedException {
        insurance7.click();
        Thread.sleep(3000);
        steerClearAnsDiscounts2.click();
        Thread.sleep(3000);
        viewDetails.click();
        Thread.sleep(3000);
    }
    public void validateSteerClearAnsDiscounts2(){
        String expectedTitle = "State Farm® Mobile App - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance10WebElement) public WebElement insurance10;
    @FindBy(xpath = steerClearAnsDiscounts3WebElement)public WebElement steerClearAnsDiscounts3 ;
    @FindBy(xpath =  surprisingRisksThatTeenPassengersFaceWebElement)public WebElement  surprisingRisksThatTeenPassengersFace;
    public void validateSurprisingRisksThatTeenPassengersFace(){
        String expectedTitle = "Teen Driving and Texts - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance11WebElement) public WebElement insurance11;
    @FindBy(xpath = steerClearAnsDiscounts4WebElement)public WebElement steerClearAnsDiscounts4 ;
    @FindBy(xpath = helpYourTeenBeBetterDriverWebElement)public  WebElement helpYourTeenBeBetterDriver ;
    public void steerClearAnsDiscounts4WithCredential() throws InterruptedException {
        insurance8.click();
        Thread.sleep(3000);
        steerClearAnsDiscounts4.click();
        Thread.sleep(3000);
        helpYourTeenBeBetterDriver.click();
        Thread.sleep(3000);
    }
    public void validateSteerClearAnsDiscounts4(){
        String expectedTitle = "Ways to Help Your Teen Driver Stay Safe - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance12WebElement) public WebElement insurance12;
    @FindBy(xpath = steerClearAnsDiscounts5WebElement)public WebElement steerClearAnsDiscounts5;
    @FindBy(xpath = teenDriving101WebElement)public WebElement teenDriving101;
    public void steerClearAnsDiscounts5WithCredential() throws InterruptedException {
        insurance9.click();
        Thread.sleep(3000);
        steerClearAnsDiscounts5.click();
        Thread.sleep(3000);
        teenDriving101.click();
        Thread.sleep(3000);
    }
    public void validateSteerClearAnsDiscounts5(){
        String expectedTitle = "Teen Driving 101: A Step-by-Step Test of Essential Driving Skills - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance13WebElement) public WebElement insurance13;
    @FindBy(xpath = driveSafeAndSaveWebElement)public WebElement driveSafeAndSave ;
    @FindBy(xpath = driveSafeAndSaveMobileAppWebElement)public WebElement driveSafeAndSaveMobileApp;
    public void  driveSafeAndSaveWithCredential() throws InterruptedException {
        insurance10.click();
        Thread.sleep(3000);
        driveSafeAndSave.click();
        Thread.sleep(3000);
        driveSafeAndSaveMobileApp.click();
        Thread.sleep(3000);
    }
    public void validateDriveSafeAndSave(){
        String expectedTitle = "Drive Safe & Save™ Mobile - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance14WebElement) public WebElement insurance14;
    @FindBy(xpath = driveSafeAndSave1WebElement)public WebElement driveSafeAndSave1 ;
    @FindBy(xpath = driveSafeAndSaveFAQsWebElement)public WebElement driveSafeAndSaveFAQs;
    public void  driveSafeAndSave1WithCredential() throws InterruptedException {
        insurance11.click();
        Thread.sleep(3000);
        driveSafeAndSave1.click();
        Thread.sleep(3000);
        driveSafeAndSaveFAQs.click();
        Thread.sleep(3000);
    }
    public void validateDriveSafeAndSave1(){
        String expectedTitle = "Have Drive Safe & Save™ Questions? We've Got Answers. - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "");
    }
    @FindBy(xpath = insurance15WebElement) public WebElement insurance15;
    @FindBy(xpath = driveSafeAndSave2WebElement)public WebElement driveSafeAndSave2 ;
    @FindBy(xpath = getAnAutoQuoteWebElement)public WebElement getAnAutoQuote;
    public void driveSafeAndSave2WithCredential() throws InterruptedException{
        insurance15.click();
        Thread.sleep(3000);
        driveSafeAndSave2.click();
        Thread.sleep(3000);
        getAnAutoQuote.click();
        Thread.sleep(3000);
    }
    public void validateDriveSafeAndSave2(){
        String expectedTitle = "Free Car Insurance Quote - Save on Auto Insurance - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = insurance16WebElement) public WebElement insurance16;
    @FindBy(xpath = petMedicalInsuranceWebElement)public WebElement petMedicalInsurance;
    @FindBy(xpath = driveSafeWithPetsWebElement)public WebElement driveSafeWithPets;
    public void petMedicalInsuranceWithCredential() throws InterruptedException{
        insurance16.click();
        Thread.sleep(3000);
        petMedicalInsurance.click();
        Thread.sleep(3000);
        driveSafeWithPets.click();
        Thread.sleep(3000);
    }
    public void validatePetMedicalInsurance(){
        String expectedTitle = "Pet Safety in Cars - Traveling With Cats or Dogs - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = insurance17WebElement) public WebElement insurance17;
    @FindBy(xpath = petMedicalInsurance1WebElement)public WebElement petMedicalInsurance1;
    @FindBy(xpath = petProofYourHomeInASnapWebElement)public WebElement petProofYourHomeInASnap;
    public void petMedicalInsurance1WithCredential() throws InterruptedException{
        insurance17.click();
        Thread.sleep(3000);
        petMedicalInsurance1.click();
        Thread.sleep(3000);
        petProofYourHomeInASnap.click();
        Thread.sleep(3000);
    }
    public void validatePetMedicalInsurance1(){
        String expectedTitle = "Pet Proof Your Home in a Snap - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = insurance18WebElement) public WebElement insurance18;
    @FindBy(xpath = petMedicalInsurance2WebElement)public WebElement petMedicalInsurance2;
    @FindBy(xpath = petFriendFixesForInsideAndOutWebElement)public WebElement petFriendFixesForInsideAndOut;
    public void petMedicalInsurance2WithCredential() throws InterruptedException{
        insurance18.click();
        Thread.sleep(3000);
        petMedicalInsurance2.click();
        Thread.sleep(3000);
        petFriendFixesForInsideAndOut.click();
        Thread.sleep(3000);
    }
    public void validatePetMedicalInsurance2(){
        String expectedTitle = "Pet Proof Your Home in a Snap - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }
    @FindBy(xpath = insurance19WebElement) public WebElement insurance19;
    @FindBy(xpath = petMedicalInsurance3WebElement)public WebElement petMedicalInsurance3;
    @FindBy(xpath = WhyYouShouldConsiderPetMedicalInsuranceWebElement)public WebElement WhyYouShouldConsiderPetMedicalInsurance;
    public void petMedicalInsurance3WithCredential() throws InterruptedException{
        insurance19.click();
        Thread.sleep(3000);
        petMedicalInsurance3.click();
        Thread.sleep(3000);
        WhyYouShouldConsiderPetMedicalInsurance.click();
        Thread.sleep(3000);
    }
    public void validatePetMedicalInsurance3(){
        String expectedTitle = "Why Should You Consider Pet Medical Insurance - State Farm®";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Test Fail");
    }

}
