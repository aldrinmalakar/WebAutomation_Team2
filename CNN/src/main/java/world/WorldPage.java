package world;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static world.WorldWebElement.*;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */

public class WorldPage extends WebAPI {


    @FindBy(how = How.XPATH, using = clickOnWorldPage)
    public WebElement worldPage;
    @FindBy(how = How.XPATH, using = validateWorldPage)
    public WebElement worldPageValidate;

    public void cnnWorldPage() throws InterruptedException {
        worldPage.click();
        Thread.sleep(5000);
    }

    public void validateWorldPage() {
        String expextedText = "World";
        String actualText = worldPageValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = europeCheckPage)
    public WebElement checkEurope;
    @FindBy(how = How.XPATH, using = playVideo)
    public WebElement videoPlay;
    @FindBy(how = How.XPATH, using = validateEurope)
    public WebElement europeValidate;

    public void europeworkablepage() throws InterruptedException {
        worldPage.click();
        checkEurope.submit();
        wait(5000);
        videoPlay.click();
    }

    public void validateEuropeanPage() {
        String expextedText = "France's ruling party promises change in controversial proposed security law";
        String actualText = europeValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = middleEastCheckPage)
    public WebElement checkMiddleEaste;
    @FindBy(how = How.XPATH, using = validateMiddleEast)
    public WebElement middleEastValidate;


    public void middleEastWorkablePage() throws InterruptedException {
        worldPage.click();
        checkMiddleEaste.click();
        Thread.sleep(5000);

    }

    public void validateMiddleEastPage() {
        String expextedText = "Assassinated Iranian nuclear scientist shot with remote-controlled machine gun, news agency says";
        String actualText = middleEastValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = africaCheckPage)
    public WebElement checkAfrica;
    @FindBy(how = How.XPATH, using = validateAfrica)
    public WebElement africaValidate;

    public void africaWorkablePage() throws InterruptedException {
        worldPage.click();
        checkAfrica.click();
        Thread.sleep(400);
    }

    public void validateAfricaPage() {
        String expextedText = "Capital of Ethiopia's Tigray region under control of Ethiopian forces, says PM after intense bombardment";
        String actualText = africaValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = americasCheckPage)
    public WebElement checkAmericas;
    @FindBy(how = How.XPATH, using = validateAmericas)
    public WebElement americasValidate;

    public void americasWorkablePage() throws InterruptedException {
        worldPage.click();
        checkAmericas.click();
        Thread.sleep(400);
    }

    public void validateAmericasPage() {
        String expextedText = "Fury over brutal beating in Brazil amid pattern of 'daily' violence, activists say";
        String actualText = americasValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = asiaCheckPage)
    public WebElement checkAsias;
    @FindBy(how = How.XPATH, using = validateAsia)
    public WebElement asiaValidate;

    public void asiaWorkablePage() throws InterruptedException {
        worldPage.click();
        checkAsias.click();
        Thread.sleep(400);
    }

    public void validateAsiaPage() {
        String expextedText = "The Wuhan files";
        String actualText = asiaValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = cnnBusinessPage)
    public WebElement checkCNNBusiness;
    @FindBy(how = How.XPATH, using = validateBusinessPage)
    public WebElement businessValidate;

    public void cnnBusinessWorkablePage() throws InterruptedException {
        worldPage.click();
        checkCNNBusiness.click();
        Thread.sleep(400);
    }

    public void validateCNNBusinessPage() {
        String expextedText = "Britain's final Brexit choice could prolong the worst recession in 300 years";
        String actualText = businessValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = climateInCrisisPage)
    public WebElement checkClimateInCrisis;
    @FindBy(how = How.XPATH, using = validateClimateInCrisis)
    public WebElement climateValidate;

    public void climateInCrisisWorkablePage() throws InterruptedException {
        worldPage.click();
        checkClimateInCrisis.click();
        Thread.sleep(400);
    }

    public void validateClimateInCrisisPage() {
        String expextedText = "US cities are losing 36 million trees a year. Here's why it matters and how you can stop it";
        String actualText = climateValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = styleWorkablePage)
    public WebElement checkStyle;
    @FindBy(how = How.XPATH, using = validateStylePage)
    public WebElement styleValidate;

    public void styleWorkablePage() throws InterruptedException {
        worldPage.click();
        checkStyle.click();
        Thread.sleep(400);
    }

    public void validateStylePage() {
        String expextedText = "Unseen photos provide a sensitive look at America's early 'working girls'";
        String actualText = styleValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = travelWorkablePage)
    public WebElement checkTravel;
    @FindBy(how = How.XPATH, using = validateTravelPage)
    public WebElement travelValidate;

    public void travelWorkablePage() throws InterruptedException {
        worldPage.click();
        checkTravel.click();
        Thread.sleep(400);
    }

    public void validatetravelPage() {
        String expextedText = "Castropignano: The latest Italian village to sell $1 houses";
        String actualText = travelValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = sportWorkablePage)
    public WebElement checkSport;
    @FindBy(how = How.XPATH, using = validateSportPage)
    public WebElement sportValidate;

    public void sportWorkablePage() throws InterruptedException {
        worldPage.click();
        checkSport.click();
        Thread.sleep(400);
    }

    public void validateSportPage() {
        String expextedText = "This Week's Games";
        String actualText = sportValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = cnnHeroesWorkablePage)
    public WebElement checkHeroes;
    @FindBy(how = How.XPATH, using = validateCNNHeroes)
    public WebElement heroesValidate;

    public void cnnHeroesWorkablePage() throws InterruptedException {
        worldPage.click();
        checkHeroes.click();
        Thread.sleep(400);
    }

    public void validateCNNHeroesPage() {
        String expextedText = "How California prisoners raised $30,000 for a high";
        String actualText = heroesValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterUS)
    public WebElement checkUSs;
    @FindBy(how = How.XPATH, using = validateFooterUS)
    public WebElement usValidate;

    public void footerUSWorkablePage() throws InterruptedException {
        worldPage.click();
        checkHeroes.click();
        Thread.sleep(400);
    }

    public void validateFooterUSPage() {
        String expextedText = "US";
        String actualText = usValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterWorld)
    public WebElement checkWorlds;
    @FindBy(how = How.XPATH, using = validateFooterWorld)
    public WebElement WorldValidate;

    public void footerWorldWorkablePage() throws InterruptedException {
        worldPage.click();
        checkWorlds.click();
        Thread.sleep(400);
    }

    public void validateFooterWorldPage() {
        String expextedText = "World";
        String actualText = usValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterPolitics)
    public WebElement checkPolitics;
    @FindBy(how = How.XPATH, using = validateFooterPolitics)
    public WebElement politicsValidate;

    public void footerPoliticsWorkablePage() throws InterruptedException {
        worldPage.click();
        checkPolitics.click();
        Thread.sleep(400);
    }

    public void validateFooterPoliticsPage() {
        String expextedText = "politics";
        String actualText = politicsValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterBusiness)
    public WebElement checkBusinessfoot;
    @FindBy(how = How.XPATH, using = validateFooterBusiness)
    public WebElement businessfootValidate;

    public void footerBusinessWorkablePage() throws InterruptedException {
        worldPage.click();
        checkBusinessfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterBusinessPage() {
        String expextedText = "BUSINESS";
        String actualText = businessfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterOpinion)
    public WebElement checkOpinionfoot;
    @FindBy(how = How.XPATH, using = validateFooterOpinion)
    public WebElement opinionfootValidate;

    public void footerOpinionWorkablePage() throws InterruptedException {
        worldPage.click();
        checkOpinionfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterOpinionPage() {
        String expextedText = "Opinion";
        String actualText = opinionfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterHealth)
    public WebElement checkHealthfoot;
    @FindBy(how = How.XPATH, using = validateFooterHealth)
    public WebElement healthfootValidate;

    public void footerHealthWorkablePage() throws InterruptedException {
        worldPage.click();
        checkHealthfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterHealthPage() {
        String expextedText = "Science & Health";
        String actualText = healthfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterEntertainment)
    public WebElement checkEntertainmentfoot;
    @FindBy(how = How.XPATH, using = validateFooterEntertainment)
    public WebElement entertainmentfootValidate;

    public void footerEntertainmanetWorkablePage() throws InterruptedException {
        worldPage.click();
        checkEntertainmentfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterEntertainmentPage() {
        String expextedText = "TOP STORIES";
        String actualText = entertainmentfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterTech)
    public WebElement checktechfoot;
    @FindBy(how = How.XPATH, using = validateFooterTech)
    public WebElement techfootValidate;

    public void footerTechWorkablePage() throws InterruptedException {
        worldPage.click();
        checktechfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterTechPage() {
        String expextedText = "TECH";
        String actualText = techfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterStyle)
    public WebElement checkStylefoot;
    @FindBy(how = How.XPATH, using = validateFooterStyle)
    public WebElement stylefootValidate;

    public void footerStyleWorkablePage() throws InterruptedException {
        worldPage.click();
        checkStylefoot.click();
        Thread.sleep(400);
    }

    public void validateFooterStylePage() {
        String expextedText = "EDITOR'S PICK";
        String actualText = stylefootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterTravel)
    public WebElement checkTravelfoot;
    @FindBy(how = How.XPATH, using = validateFooterTravel)
    public WebElement travelfootValidate;

    public void footerTravelWorkablePage() throws InterruptedException {
        worldPage.click();
        checkTravelfoot.click();
        Thread.sleep(400);
    }

    public void validateFooterTravelPage() {
        String expextedText = "Highlight Destinations";
        String actualText = stylefootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterSport)
    public WebElement checkFooterSport;
    @FindBy(how = How.XPATH, using = validateFooterSport)
    public WebElement sportfootValidate;

    public void footerSportWorkablePage() throws InterruptedException {
        worldPage.click();
        checkFooterSport.click();
        Thread.sleep(400);
    }

    public void validateFooterSportPage() {
        String expextedText = "TOP NEWS";
        String actualText = sportfootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterVideo)
    public WebElement checkFooterVideo;
    @FindBy(how = How.XPATH, using = validateFooterVideo)
    public WebElement videofootValidate;

    public void footerVideoWorkablePage() throws InterruptedException {
        worldPage.click();
        checkFooterVideo.click();
        Thread.sleep(400);
    }

    public void validateFooterVideoPage() {
        String expextedText = "Today's Top News (16 Videos)";
        String actualText = videofootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }

    @FindBy(how = How.XPATH, using = worldFooterAudio)
    public WebElement checkFooterAudio;
    @FindBy(how = How.XPATH, using = validateFooterAudio)
    public WebElement audiofootValidate;

    public void footerAudioWorkablePage() throws InterruptedException {
        worldPage.click();
        checkFooterAudio.click();
        Thread.sleep(400);
    }

    public void validateFooterAudioPage() {
        String expextedText = "Live Audio";
        String actualText = audiofootValidate.getText();
        Assert.assertEquals(actualText, expextedText, "Test Failed: keyword does not match");
    }


}
