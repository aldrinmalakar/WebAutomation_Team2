package testUspage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uspage.UsPageHome;

public class UsPageTest extends WebAPI {
    UsPageHome usPageHome;

    @BeforeMethod
    public void getInit() {
        usPageHome = PageFactory.initElements(driver, UsPageHome.class);
    }

    //1
    @Test(enabled = false)
    public void testCheckUS() throws InterruptedException {
        usPageHome.checkUS();
        usPageHome.validateCheckUS();

    }
    //2
    @Test(enabled = false)
    public void testAboutUs() throws InterruptedException {
        usPageHome.aboutUs();
        usPageHome.validateAboutUs();
    }


    //3
    @Test(enabled = false)
    public void testCrimeAndJustice() throws InterruptedException {
        usPageHome.crimeAndJustice();
        usPageHome.validateCrimeAndJustice();
    }


    //4
    @Test(enabled = false)
    public void Photos() throws InterruptedException {
        usPageHome.Photos();
        usPageHome.validatePhotos();
    }

    //5
    @Test(enabled = false)
    public void testTravelS() throws InterruptedException {
        usPageHome.travelS();
        usPageHome.validateTravelS();
    }

    //6
    @Test(enabled = false)
    public void testEnergyAndEnvironment() throws InterruptedException {
        usPageHome.energyAndEnvironment();
        usPageHome.validateEnergyAndEnvironment();
    }

    //7
    @Test(enabled = false)
    public void testDestinationsS() throws InterruptedException {
        usPageHome.destinationsS();
        usPageHome.validateDestinationsS();
    }

    //8
    @Test(enabled = false)
    public void testExtremeWeather() throws InterruptedException {
        usPageHome.extremeWeather();
        usPageHome.validateExtremeWeather();
    }

    //9
    @Test(enabled = false)
    public void testSpaceAndScience() throws InterruptedException {
        usPageHome.spaceAndScience();
        usPageHome.validateSpaceAndScience();
    }

    //10
    @Test(enabled = false)
    public void testCnnStoreS() throws InterruptedException {
        usPageHome.cnnStoreS();
        usPageHome.validateCnnStoreS();
    }

    //11
    @Test(enabled = false)
    public void testMenuButton() throws InterruptedException {
        usPageHome.menuButton();
        usPageHome.validateMenuButton();
    }

    //12
    @Test(enabled = false)
    public void testSearchCnnSBox() throws InterruptedException {
        usPageHome.searchCnnSBox();
        usPageHome.validateSearchCnnSBox();
    }

    //13
    @Test(enabled = false)
    public void testSearchCnnSBox1() throws InterruptedException {
        usPageHome.searchCnnSBox1();
        usPageHome.validateSearchCnnSBox1();
    }

    //14
    @Test(enabled = false)
    public void clearSBox() throws InterruptedException {
        usPageHome.clearSBox();
        usPageHome.validateClearBox();

    }

    //15
    @Test(enabled = false)
    public void testCheckSBoxUs() throws InterruptedException {
        usPageHome.checkSBoxUs();
        usPageHome.validateCheckSBoxUs();
    }

    //16
    @Test(enabled = false)
    public void testEditionHover() throws InterruptedException {
        usPageHome.editionHover();
        usPageHome.validateEditionHover();
    }

    //17
    @Test(enabled = false)
    public void testSelectLanguage() throws InterruptedException {
        usPageHome.selectLanguage();
        usPageHome.validateSelectLanguage();
    }

    //18
    @Test(enabled = false)
    public void testTermOfUse() throws InterruptedException {
        usPageHome.termOfUse();
        usPageHome.validateTermOfUse();
    }

    //19
    @Test(enabled = false)
    public void testClimate() throws InterruptedException {
        usPageHome.climate();
        usPageHome.validateClimate();
    }

    //20
    @Test(enabled = false)
    public void addChoices() throws InterruptedException {
        usPageHome.addChoices();
        usPageHome.validateAddChoices();
    }

    //21
    @Test(enabled = false)
    public void moreOptions() throws InterruptedException {
        usPageHome.moreOptions();
        usPageHome.validateMoreOption();
    }

    //22
    @Test(enabled = false)
    public void longForms() throws InterruptedException {
        usPageHome.longForms();
        usPageHome.validateLongForms();
    }

    //23
    @Test(enabled = false)
    public void investigations() throws InterruptedException {
        usPageHome.investigations();
        usPageHome.validateInvestigations();
    }

    //24
    @Test(enabled = false)
    public void leadership() throws InterruptedException {
        usPageHome.leadership();
        usPageHome.validateLeadership();
    }
    //25
    @Test(enabled = false)
    public void cnnNewsLettersS() throws InterruptedException {
        usPageHome.cnnNewsLettersS();
        usPageHome.validateCnnNewsLettersS();
    }
}