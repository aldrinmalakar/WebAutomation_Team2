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
    @FindBy(how = How.ID, using = checkBoxUsWebElement)
    public WebElement checkBoxUs;
    @FindBy(how = How.CSS, using = checkBoxUsxWebElement)
    public WebElement checkBoxUsx;
    @FindBy(how = How.XPATH, using = checkBoxUsActualResultWebElement)
    public WebElement checkBoxUstWebElement;
    @FindBy(how = How.ID, using = editionHoverWebElement)
    public WebElement editionHover;
    @FindBy(how = How.CSS, using = editionHoveWebElement)
    public WebElement editionHove;
    @FindBy(how = How.XPATH, using = editionHoverActualResultWebElement)
    public WebElement editionHovWebElement;
    @FindBy(how = How.ID, using = selectLanguageWebElement)
    public WebElement selectLanguage;
    @FindBy(how = How.CSS, using = selectLangeWebElement)
    public WebElement selectLange;
    @FindBy(how = How.XPATH, using = selectLangWebElement)
    public WebElement selectLang;
    @FindBy(how = How.XPATH, using = selectLanguageActualResultWebElement)
    public WebElement selectLgtWebElement;
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
    @FindBy(how = How.XPATH, using = climateWebElement1)
    public WebElement climate1;
    @FindBy(how = How.XPATH, using = climateActualResultWebElement)
    public WebElement validateClimateWebElement;
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



    //test1
    public void checkUS() throws InterruptedException {
        checkUs.click();
        Thread.sleep(3000);
    }

    public void validateCheckUS() {
        String expectedText = "US";
        String actualText = checkUsActualWebElement.getText();
        Assert.assertEquals(expectedText, actualText, "test fail: language setting not shows");
    }

//    @FindBy(how = How.CSS, using = checkUsWebElement)
//    public WebElement checkUs2;
    @FindBy(how = How.CSS, using = aboutUsNWebElement)
    public WebElement aboutUsN;
    @FindBy(how = How.XPATH, using = aboutUsNActualResultWebElement)
    public WebElement aboutUsNActualWebElement;

    //test2
    public void aboutUs() throws InterruptedException {
        aboutUsN.click();
        Thread.sleep(3000);
//        aboutUsNActualWebElement.click();
//        Thread.sleep(3000);
        //driver.findElement(By.cssSelector(checkUsWebElement)).click();
        //driver.findElement(By.xpath(crimeAndJusticeWebElement)).click();
    }
    public void validateAboutUs(){
        String expectedResult="ABOUT CNN DIGITAL";
        String actualResult=aboutUsNActualWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(crimeAndJusticeActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }
    @FindBy(how = How.CSS, using = checkUsWebElement)
    public WebElement checkUsWeb;
    @FindBy(how = How.CSS, using = crimeAndJusticeWebElement)
    public WebElement crimeAndJustice;
    @FindBy(how = How.XPATH, using = crimeAndJusticeActualResultWebElement)
    public WebElement crimeAndJusticeAtWebElement;

    //test3
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
    @FindBy(how = How.CSS, using = photosWebElement)
    public WebElement photos;
    @FindBy(how = How.XPATH, using = photosActualResultWebElement)
    public WebElement photosActualWebElement;

    //test4
    @Test(enabled = true)
    public void Photos() throws InterruptedException {
        photos.click();
        Thread.sleep(3000);
        //driver.get(cnnUrl);
        // driver.findElement(By.cssSelector(photosWebElement)).click();
    }
    public void validatePhotos(){
        String expectedResult="";
        String actualResult=photosActualWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(photosActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }
    @FindBy(how = How.CSS, using = travelSWebElement)
    public WebElement travelS;
    @FindBy(how = How.CSS, using = travelSActualResultWebElement)
    public WebElement travelSActWebElement;
    //test5
    @Test(enabled = true)
    public void travelS() throws InterruptedException {
        travelS.click();
        Thread.sleep(3000);
        //driver.get(cnnUrl);
        // driver.findElement(By.cssSelector(travelSWebElement)).click();
    }
    public void validateTravelS(){
        String expectedResult = "";
        String actualResult = travelSActWebElement.getText();
        //String actualResult = driver.findElement(By.cssSelector(travelSActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //test6

    public void energyAndEnvironment() throws InterruptedException {
        checkUs.click();
        Thread.sleep(3000);
        energyAndEnvironment.click();
        Thread.sleep(3000);
        //driver.get(cnnUrl);
//        driver.findElement(By.cssSelector(checkUsWebElement)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector(energyAndEnvironmentWebElement)).click();
//        Thread.sleep(3000);
    }

    public void validateEnergyAndEnvironment() {
        String expectedResult = "Energy + Environment";
        //String actualResult=driver.findElement(By.xpath(energyAndEnvironmentActualResultWebElement)).getText();
        String actualResult = energyAndEnvironmentAWbElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    @FindBy(how = How.CSS, using = destinationsSWebElement)
    public WebElement destinationsS;
    @FindBy(how = How.XPATH, using = destinationsSActualResultWebElement)
    public WebElement destinationsSActWebElement;
    //test7

    public void destinationsS() throws InterruptedException {
        destinationsS.click();
        Thread.sleep(3000);
        // driver.get(cnnUrl);
        // driver.findElement(By.cssSelector(destinationsSWebElement)).click();
    }
    public void validateDestinationsS(){
        String expectedResult="DESTINATIONS";
        String actualResult= destinationsSActWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(destinationsSActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }

    @FindBy(how = How.CSS, using = extremeWeatherWebElement)
    public WebElement extremeWeatherS;
    @FindBy(how = How.XPATH, using = extremeWeatherSActualResultWebElement)
    public WebElement extremeWeatherSActualWebElement;

    //test8

    public void extremeWeather() throws InterruptedException {
        extremeWeatherS.click();
        Thread.sleep(3000);
//        //driver.get(cnnUrl);
//        driver.findElement(By.xpath(extremeWeatherWebElement)).click();
//        Thread.sleep(3000);
    }
    public void validateExtremeWeather() {
        String expectedResult = "Weather";
        //String actualResult=driver.findElement(By.xpath(extremeWeatherActualResultWebElement)).getText();
        String actualResult = extremeWeatherSActualWebElement.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    //9
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
        // driver.get(cnnUrl);
//        driver.findElement(By.cssSelector(checkUsWebElement)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath(spaceAndScienceSWebElement)).click();
//        Thread.sleep(3000);
    }
    public void validateSpaceAndScience(){
        String expectedResult="";
        String actualResult=spaceAndScienceSActWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(spaceAndScienceSActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");

    }
//10
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
        //driver.findElement(By.cssSelector(checkUsWebElement)).click();
        //driver.findElement(By.cssSelector(cnnStoreSWebElement)).click();
    }
    public void validateCnnStoreS(){
        String expectedResult="";
        String actualResult=cnnStoreSActualWebElement.getText();
        //String actualResult=driver.findElement(By.xpath(cnnStoreSActualResultWebElement)).getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }
    //11

    public void menuButton() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);

//        driver.findElement(By.id(menuButtonWebElement)).sendKeys(searchMenu);
//        Thread.sleep(2000);
    }

    public void validateMenuButton() {
        String expectedResult = "Close Menu";
        //String actualResult=driver.findElement(By.cssSelector( menuButtonActualResultWebElement)).getText();
        String actualResult = menuButtonActual.getText();
        Assert.assertEquals(expectedResult, actualResult, "test fail: language setting not shows");
    }

    //12

    public void searchCnnSBox() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox.sendKeys(searchNewPresident);
        Thread.sleep(2000);
        searchCnnButton.click();
        Thread.sleep(2000);


//        driver.findElement(By.id(menuButtonWebElement)).sendKeys(searchMenu);
//        Thread.sleep(2000);
//        driver.findElement(By.id(searchCnnBoxWebElement)).sendKeys(searchNewPresident);
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(searchCnnButtonWebElement)).click();
//        Thread.sleep(2000);
    }

    public void validateSearchCnnSBox() {
        String expectedResult = "New President";
        // String actualResult= driver.findElement(By.cssSelector(searchCnnBoxActualResultWebElement)).getText();
        String actualResult = searchCnnBoxElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }
//
//    @FindBy(how = How.ID, using = searchCnnBoxWebElement)
//    public WebElement searchCnnBox;
//    @FindBy(how = How.CSS, using = searchCnnButtonWebElement)
//    public WebElement searchCnnButton;
//    @FindBy(how = How.CSS, using = searchCnnBoxActualResultWebElement)
//    public WebElement searchCnnBoxElement;

    //13

    public void searchCnnSBox1() throws InterruptedException {
        menuButton.sendKeys(searchMenu);
        Thread.sleep(2000);
        searchCnnBox1.sendKeys(searchCovid_19);
        Thread.sleep(2000);
        searchCnBox1.click();
        Thread.sleep(2000);

//        driver.findElement(By.id(menuButtonWebElement)).sendKeys(searchMenu);
//        Thread.sleep(2000);
//        driver.findElement(By.id(searchCnnBox1WebElement)).sendKeys(searchCovid_19);
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(searchCnBoxWebElement)).click();
//        Thread.sleep(2000);
    }
    public void validateSearchCnnSBox1() {
        //validate result
        String expectedResult = "Covid_19";
        //String actualResult= driver.findElement(By.xpath(searchCnnBox1ActualResultWebElement)).getText();
        String actualResult = searCnnBox1tWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }
   // 14
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
        // driver.get(cnnUrl);
//        driver.findElement(By.id(menuButtonWebElement)).sendKeys(searchMenu);
//        driver.findElement(By.id(searchCnnBox1WebElement)).sendKeys(searchCovid_19);
//        driver.findElement(By.cssSelector(searchCnBoxWebElement)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(clearBoxSWebElement)).click();
//        Thread.sleep(5000);
    }
    public void validateClearBox(){
        String expectedResult = "Clear";
        String actualResult=clearBoxSActualWebElement.getText();
        //String actualResult= driver.findElement(By.xpath(clearBoxSActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }
    //15
    public void checkSBoxUs() throws InterruptedException {
        checkBoxUs.sendKeys(searchUS);
        Thread.sleep(2000);
        checkBoxUsx.click();
        Thread.sleep(2000);

        //driver.get(cnnUrl);
//        driver.get("https://www.cnn.com/search?q=Covid_19&size=10");
//        driver.findElement(By.id(checkBoxUsWebElement)).sendKeys(searchUS);
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(checkBoxUsxWebElement)).click();
//        Thread.sleep(2000);
    }

    public void validateCheckSBoxUs() {
        //validate result
        String expectedResult = "";
        //String actualResult= driver.findElement(By.xpath(checkBoxUsActualResultWebElement)).getText();
        String actualResult = checkBoxUstWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    //16

    public void editionHover() throws InterruptedException {
        driver.findElement(By.id(editionHoverWebElement)).sendKeys(searchEdition);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(editionHoveWebElement)).click();
        Thread.sleep(2000);
    }

    public void validateEditionHover() {
        String expectedResult = "U.S.\n" + "International\n" + "Arabic\n" + "Español";
        String actualResult = editionHovWebElement.getText();
        // String actualResult= driver.findElement(By.xpath(editionHoverActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    //17
    @Test(enabled = false)
    public void selectLanguage() throws InterruptedException {
        //driver.get(cnnUrl);
        driver.findElement(By.id(selectLanguageWebElement)).sendKeys(schEdition);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(selectLangeWebElement)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(selectLangWebElement)).click();
        Thread.sleep(2000);
    }

    public void validateSelectLanguage() {
        String expectedResult = "";
        // String actualResult= driver.findElement(By.id(selectLanguageActualResultWebElement)).getText();
        String actualResult = selectLgtWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }


    //18
    public void termOfUse() throws InterruptedException {
        termOfUse.click();
        Thread.sleep(2000);
        termOfUse1.click();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(termOfUseWebElement)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(termOfUseWebElement1)).click();
//        Thread.sleep(2000);
    }

    public void validateTermOfUse() {
        //validate result
        String expectedResult = "CNN Terms of Use";
        // String actualResult= driver.findElement(By.cssSelector(termOfUseActualResultWebElement)).getText();
        String actualResult = termOfUseResultWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }
//    @FindBy(how = How.CSS, using = checkUsWebElement)
//    public WebElement checkUs1;
//    @FindBy(how = How.XPATH, using = extremeWeatherWebElement)
//    public WebElement extremeWeather1;
//    @FindBy(how = How.XPATH, using = climateWebElement1)
//    public WebElement climate1;
//    @FindBy(how = How.XPATH, using = climateActualResultWebElement)
//    public WebElement validateClimateWebElement;
    //19

    public void climate() throws InterruptedException {
        checkUs1.click();
        Thread.sleep(2000);
        extremeWeather1.click();
        Thread.sleep(2000);
        climate1.click();
        Thread.sleep(2000);

        //driver.get(cnnUrl);
//        driver.findElement(By.cssSelector(checkUsWebElement)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(extremeWeatherWebElement)).click();//chang locator
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(climateWebElement1)).click();
//        Thread.sleep(3000);
    }

    public void validateClimate() {
        //validate result
        String expectedResult = "";
        //String actualResult= driver.findElement(By.xpath(climateActualResultWebElement)).getText();
        String actualResult = validateClimateWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }


//20
    public void addChoices() throws InterruptedException {
        addChoices.click();
        Thread.sleep(2000);
        //driver.get(cnnUrl);
//        driver.findElement(By.cssSelector(addChoicesWebElement)).click();
//        Thread.sleep(2000);
    }
        public void validateAddChoices() {

    }

//21
    @Test(enabled = true)
    public void moreOptions() throws InterruptedException {
        moreOptions.click();
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector(moreOptionsWebElement)).click();
        //Thread.sleep(2000);
    }
    public void validateMoreOption(){
        String expectedResult = "More";
        //String actualResult= driver.findElement(By.xpath(moreOptionsAResultWebElement)).getText();
        String actualResult= moreOptionsActualWebElement.getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }


//22

    public void longForms() throws InterruptedException {
        longForms.click();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(longFormsWebElement)).click();
//        Thread.sleep(2000);
    }
    public void validateLongForms(){
        String expectedResult = "CNN Longform";
        String actualResult= LongFormsActualWebElement.getText();
        //String actualResult= driver.findElement(By.xpath(LongFormsActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    //23
    public void investigations() throws InterruptedException {
        investigation.click();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(investigationWebElement)).click();
//        Thread.sleep(2000);
    }
    public void validateInvestigations(){
        String expectedResult = "";
        String actualResult=investigationActualWebElement.getText();
        //String actualResult= driver.findElement(By.xpath(investigationActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    //24
    @Test(enabled = false)
    public void leadership() throws InterruptedException {
        leadership.click();
        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(leadershipWebElement)).click();
//        Thread.sleep(2000);
    }
    public void validateLeadership(){
        String expectedResult = "CNN Profiles";
        String actualResult= leadershipActualWebElement.getText();
        //String actualResult= driver.findElement(By.xpath(leadershipActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

    @FindBy(how = How.CSS, using = cnnNewsLettersSWebElement)
    public WebElement cnnNewsLettersS;
    @FindBy(how = How.XPATH, using = cnnNewsLettersSActualResultWebElement)
    public WebElement cnnNewsLettersSActualWebElement;
    //25

    public void cnnNewsLettersS() throws InterruptedException {
        cnnNewsLettersS.click();
        Thread.sleep(2000);
        // driver.findElement(By.cssSelector(cnnNewsLettersSWebElement)).click();
    }
    public void validateCnnNewsLettersS(){
        String expectedResult = "CNN Newsletters";
        String actualResult= cnnNewsLettersSActualWebElement.getText();
        //String actualResult= driver.findElement(By.xpath(cnnNewsLettersSActualResultWebElement)).getText();
        Assert.assertEquals(actualResult, expectedResult, "Test Failed: search keyword doe not match");
    }

}


