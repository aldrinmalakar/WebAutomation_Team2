package uspage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static uspage.UsPageWebElements.*;

public class UsPageHome extends WebAPI {

    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUs;
    @FindBy(how = How.XPATH, using = checkUsActualTextWebElement)
    public WebElement checkUsActualWebElement;
    @FindBy(how = How.CSS, using = energyAndEnvironmentWebElement)
    public WebElement energyAndEnvironment;
    @FindBy(how = How.XPATH, using = energyAndEnvironmentActualResultWebElement)
    public WebElement energyAndEnvironmentAWbElement;
    @FindBy(how = How.XPATH, using = bidenAndTrumpWebElement)
    public WebElement bidenAndTrump;
    @FindBy(how = How.XPATH, using = bidenAndTrumpActualResultWebElement)
    public WebElement bidenAndTrumpAWebElement;
    @FindBy(how = How.ID, using = menuButtonWebElement)
    public WebElement menuButton;
    @FindBy(how = How.CSS, using = menuButtonActualResultWebElement)
    public WebElement menuButtonActual;
    @FindBy(how = How.ID, using = searchCnnBoxWebElement)
    public WebElement searchCnnBox;
    @FindBy(how = How.CSS, using = searchCnnButtonWebElement)
    public WebElement searchCnnButton;
    @FindBy(how = How.CSS, using = searchCnnBoxActualResultWebElement)
    public WebElement searchCnnBoxElement;
    @FindBy(how = How.ID, using = searchCnnBox1WebElement)
    public WebElement searchCnnBox1;
    @FindBy(how = How.CSS, using = searchCnBoxWebElement)
    public WebElement searchCnBox1;
    @FindBy(how = How.XPATH, using = searchCnnBox1ActualResultWebElement)
    public WebElement searCnnBox1tWebElement;
    @FindBy(how = How.XPATH, using = checkBoxUsActualResultWebElement)
    public WebElement checkBoxUstWebElement;
    @FindBy(how = How.ID, using = editionHoverWebElement)
    public WebElement editionHover;
    @FindBy(how = How.CSS, using = editionHoveWebElement)
    public WebElement editionHove;
    @FindBy(how = How.XPATH, using = editionHoverActualResultWebElement)
    public WebElement editionHovWebElement;
    @FindBy(how = How.CSS, using = termOfUseWebElement)
    public WebElement termOfUse;
    @FindBy(how = How.XPATH, using = termOfUseWebElement1)
    public WebElement termOfUse1;
    @FindBy(how = How.CSS, using = termOfUseActualResultWebElement)
    public WebElement termOfUseResultWebElement;
    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUs1;
    @FindBy(how = How.XPATH, using = extremeWeatherWebElement)
    public WebElement extremeWeather1;
    @FindBy(how = How.CSS, using = addChoicesWebElement)
    public WebElement addChoices;
    @FindBy(how = How.CSS, using = moreOptionsWebElement)
    public WebElement moreOptions;
    @FindBy(how = How.XPATH, using = moreOptionsAResultWebElement)
    public WebElement moreOptionsActualWebElement;
    @FindBy(how = How.CSS, using = longFormsWebElement)
    public WebElement longForms;
    @FindBy(how = How.XPATH, using = LongFormsActualResultWebElement)
    public WebElement LongFormsActualWebElement;
    @FindBy(how = How.CSS, using = investigationWebElement)
    public WebElement investigation;
    @FindBy(how = How.XPATH, using = investigationActualResultWebElement)
    public WebElement investigationActualWebElement;
    @FindBy(how = How.CSS, using = leadershipWebElement)
    public WebElement leadership;
    @FindBy(how = How.XPATH, using = leadershipActualResultWebElement)
    public WebElement leadershipActualWebElement;
    @FindBy(how = How.CSS, using = aboutUsNWebElement)
    public WebElement aboutUsN;
    @FindBy(how = How.XPATH, using = aboutUsNActualResultWebElement)
    public WebElement aboutUsNActualWebElement;
    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUsWeb;
    @FindBy(how = How.CSS, using = crimeAndJusticeWebElement)
    public WebElement crimeAndJustice;
    @FindBy(how = How.XPATH, using = crimeAndJusticeActualResultWebElement)
    public WebElement crimeAndJusticeAtWebElement;
    @FindBy(how = How.CSS, using = photosWebElement)
    public WebElement photos;
    @FindBy(how = How.XPATH, using = photosActualResultWebElement)
    public WebElement photosActualWebElement;
    @FindBy(how = How.CSS, using = travelSWebElement)
    public WebElement travelS;
    @FindBy(how = How.CSS, using = travelSActualResultWebElement)
    public WebElement travelSActWebElement;
    @FindBy(how = How.CSS, using = destinationsSWebElement)
    public WebElement destinationsS;
    @FindBy(how = How.XPATH, using = destinationsSActualResultWebElement)
    public WebElement destinationsSActWebElement;
    @FindBy(how = How.CSS, using = extremeWeatherWebElement)
    public WebElement extremeWeatherS;
    @FindBy(how = How.XPATH, using = extremeWeatherSActualResultWebElement)
    public WebElement extremeWeatherSActualWebElement;



    public void checkUS() throws InterruptedException {
        checkUs.click();
        Thread.sleep(3000);
    }

    public void validateCheckUS() {
        String expectedText = "US";
        String actualText = checkUsActualWebElement.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

    public void aboutUs() throws InterruptedException {
        aboutUsN.click();
        Thread.sleep(3000);
    }
    public void validateAboutUs(){
        String expectedResult="ABOUT CNN DIGITAL";
        String actualResult=aboutUsNActualWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    public void crimeAndJustice() throws InterruptedException {
        checkUsWeb.click();
        Thread.sleep(3000);
        crimeAndJustice.click();
        Thread.sleep(3000);
    }

    public void validateCrimeAndJustice() {
        String expectedResult = "Crime + Justice";
        String actualResult = crimeAndJusticeAtWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @Test(enabled = true)
    public void Photos() throws InterruptedException {
        photos.click();
        Thread.sleep(3000);

    }
    public void validatePhotos(){
        String expectedResult="";
        String actualResult=photosActualWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    @Test(enabled = true)
    public void travelS() throws InterruptedException {
        travelS.click();
        Thread.sleep(3000);

    }
    public void validateTravelS(){
        String expectedResult = "";
        String actualResult = travelSActWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    public void energyAndEnvironment() throws InterruptedException {
        checkUs.click();
        Thread.sleep(3000);
        energyAndEnvironment.click();
        Thread.sleep(3000);
    }

    public void validateEnergyAndEnvironment() {
        String expectedResult = "Energy + Environment";
        String actualResult = energyAndEnvironmentAWbElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    public void destinationsS() throws InterruptedException {
        destinationsS.click();
        Thread.sleep(3000);
    }
    public void validateDestinationsS(){
        String expectedResult="DESTINATIONS";
        String actualResult= destinationsSActWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(destinationsSActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    public void extremeWeather() throws InterruptedException {
        extremeWeatherS.click();
        Thread.sleep(3000);

    }
    public void validateExtremeWeather() {
        String expectedResult = "Weather";
        String actualResult = extremeWeatherSActualWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }


    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUsWebE;
    @FindBy(how = How.XPATH, using = spaceAndScienceSWebElement)
    public WebElement spaceAndScienceS;
    @FindBy(how = How.XPATH, using = spaceAndScienceSActualResultWebElement)
    public WebElement spaceAndScienceSActWebElement;

    public void spaceAndScience() throws InterruptedException {
        checkUsWebE.click();
        Thread.sleep(3000);
        spaceAndScienceS.click();
        Thread.sleep(3000);

    }
    public void validateSpaceAndScience(){
        String expectedResult="";
        String actualResult=spaceAndScienceSActWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUsWe;
    @FindBy(how = How.CSS, using = cnnStoreSWebElement)
    public WebElement cnnStoreS;
    @FindBy(how = How.XPATH, using = cnnStoreSActualResultWebElement)
    public WebElement cnnStoreSActualWebElement;

    public void cnnStoreS() throws InterruptedException {
        checkUsWe.click();
        Thread.sleep(2000);
        cnnStoreS.click();
        Thread.sleep(2000);
    }
    public void validateCnnStoreS(){
        String expectedResult="";
        String actualResult=cnnStoreSActualWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    public void menuButton() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);
    }

    public void validateMenuButton() {
        String expectedResult = "Close Menu";
        String actualResult = menuButtonActual.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    public void searchCnnSBox() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox.sendKeys(searchNewPresident);
        Thread.sleep(2000);
        searchCnnButton.click();
        Thread.sleep(2000);
    }

    public void validateSearchCnnSBox() {
        String expectedResult = "New President";
        String actualResult = searchCnnBoxElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void searchCnnSBox1() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox1.sendKeys(searchCovid_19);
        Thread.sleep(2000);
        searchCnBox1.click();
        Thread.sleep(2000);

    }
    public void validateSearchCnnSBox1() {
        String expectedResult = "Covid_19";
        String actualResult = searCnnBox1tWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

   @FindBy(how = How.ID, using = menuButtonWebElement)
    public WebElement menuButtonWeb;
    @FindBy(how = How.ID, using = searchCnnBox1WebElement)
    public WebElement searchCnnBox1Web;
    @FindBy(how = How.CSS, using = searchCnBoxWebElement)
    public WebElement searchCnBox;
    @FindBy(how = How.CSS, using = clearBoxSWebElement)
    public WebElement clearBoxSWeb;
    @FindBy(how = How.XPATH, using = clearBoxSActualResultWebElement)
    public WebElement clearBoxSActualWebElement;


    public void clearSBox() throws InterruptedException {
        menuButtonWeb.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox1Web.sendKeys(searchCovid_19);
        Thread.sleep(2000);
        searchCnBox.click();
        Thread.sleep(2000);
        clearBoxSWeb.click();
        Thread.sleep(5000);
    }
    public void validateClearBox(){
        String expectedResult = "Clear";
        String actualResult=clearBoxSActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    @FindBy(how = How.ID, using = menuButtonWebElement)
    public WebElement menuButtonWebE;
    @FindBy(how = How.ID, using = searchCnnBox1WebElement)
    public WebElement searchCnnBox1WebE;
    @FindBy(how = How.CSS, using = searchCnBoxWebElement)
    public WebElement searchCnBoxWeb;
    @FindBy(how = How.ID, using = checkBoxUsSWebElement)
    public WebElement checkBoxUsS;
    @FindBy(how = How.CSS, using = checkBoxUsASWebElement)
    public WebElement checkBoxUsAS;
    @FindBy(how = How.XPATH, using = checkUsActualResultWebElement)
    public WebElement checkUsActWebElement;

    //15
    @Test(enabled = true)
    public void checkBoxUs() throws InterruptedException {
        menuButtonWebE.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox1WebE.sendKeys(searchCovid_19);
        Thread.sleep(2000);
        searchCnBoxWeb.click();
        Thread.sleep(2000);
        checkBoxUsS.sendKeys(searchUS);
        Thread.sleep(2000);
        checkBoxUsAS.click();
        Thread.sleep(2000);
    }
    public void validateCheckBoxUs(){
        String expectedResult = "";
        String actualResult= checkUsActWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void editionHover() throws InterruptedException {
        driver.findElement(By.id(editionHoverWebElement)).sendKeys(searchEdition);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(editionHoveWebElement)).click();
        Thread.sleep(2000);
    }

    public void validateEditionHover() {
        String expectedResult = "U.S.\n" + "International\n" + "Arabic\n" + "Español";
        String actualResult = editionHovWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }


    @FindBy(how = How.ID, using = selectLanguageWebElement)
    public WebElement selectLanguage;
    @FindBy(how = How.CSS, using = selectLangeWebElement)
    public WebElement selectLange;
    @FindBy(how = How.XPATH, using = selectLangWebElement)
    public WebElement selectLang;
    @FindBy(how = How.ID, using = selectLanguageActualResultWebElement)
    public WebElement selectLanguageActualWebElement;

    public void selectLanguageS() throws InterruptedException {
        selectLanguage.sendKeys(schEdition);
        Thread.sleep(2000);
        selectLange.click();
        Thread.sleep(2000);
        selectLang.click();
        Thread.sleep(2000);
    }
    public void validateSelectLanguageS() {
        String expectedResult = "";
        String actualResult = selectLanguageActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void termOfUses() throws InterruptedException {
        termOfUse.click();
        Thread.sleep(2000);
        termOfUse1.click();
        Thread.sleep(2000);
    }

    public void validateTermOfUses() {
        String expectedResult = "CNN Terms of Use";
        String actualResult = termOfUseResultWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }
    @FindBy(how = How.CSS, using = climateSWebElement)
    public WebElement climateS;
    @FindBy(how = How.CSS, using = climateSWebElement1)
    public WebElement climateSWeb1;
    @FindBy(how = How.XPATH, using = climateSWebElement2)
    public WebElement climateSWeb2;
    @FindBy(how = How.XPATH, using = climateSActualResultWebElement)
    public WebElement climateSActualWebElement;

    public void climateS() throws InterruptedException {
        climateS.click();
        Thread.sleep(2000);
        climateSWeb1.click();
        Thread.sleep(2000);
        climateSWeb2.click();
        Thread.sleep(3000);

    }
    public void validateClimateS(){
        String expectedResult = "";
        String actualResult= climateSActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void addChoices() throws InterruptedException {
        addChoices.click();
        Thread.sleep(2000);
    }
        public void validateAddChoices() {

    }

    @Test(enabled = true)
    public void moreOptions() throws InterruptedException {
        moreOptions.click();
        Thread.sleep(2000);
    }
    public void validateMoreOption(){
        String expectedResult = "More";
        //String actualResult= driver.findElement(By.xpath(moreOptionsAResultWebElement)).getText();
        String actualResult= moreOptionsActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void longForms() throws InterruptedException {
        longForms.click();
        Thread.sleep(2000);
    }
    public void validateLongForms(){
        String expectedResult = "CNN Longform";
        String actualResult= LongFormsActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    public void investigations() throws InterruptedException {
        investigation.click();
        Thread.sleep(2000);
    }
    public void validateInvestigations(){
        String expectedResult = "";
        String actualResult=investigationActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    @Test(enabled = false)
    public void leadership() throws InterruptedException {
        leadership.click();
        Thread.sleep(2000);

    }
    public void validateLeadership(){
        String expectedResult = "CNN Profiles";
        String actualResult= leadershipActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    @FindBy(how = How.CSS, using = cnnNewsLettersSWebElement)
    public WebElement cnnNewsLettersS;
    @FindBy(how = How.XPATH, using = cnnNewsLettersSActualResultWebElement)
    public WebElement cnnNewsLettersSActualWebElement;

    public void cnnNewsLettersS() throws InterruptedException {
        cnnNewsLettersS.click();
        Thread.sleep(2000);
    }
    public void validateCnnNewsLettersS(){
        String expectedResult = "CNN Newsletters";
        String actualResult= cnnNewsLettersSActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

}


