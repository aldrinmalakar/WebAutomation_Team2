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

    @Test
    public void testCheckUS() throws InterruptedException {
        usPageHome.checkUS();
        usPageHome.validateCheckUS();

    }

    @Test
    public void testAboutUs() throws InterruptedException {
        usPageHome.aboutUs();
        usPageHome.validateAboutUs();
    }

    @Test
    public void testCrimeAndJustice() throws InterruptedException {
        usPageHome.crimeAndJustice();
        usPageHome.validateCrimeAndJustice();
    }

    @Test
    public void Photos() throws InterruptedException {
        usPageHome.Photos();
        usPageHome.validatePhotos();
    }

    @Test
    public void testTravelS() throws InterruptedException {
        usPageHome.travelS();
        usPageHome.validateTravelS();
    }

    @Test
    public void testEnergyAndEnvironment() throws InterruptedException {
        usPageHome.energyAndEnvironment();
        usPageHome.validateEnergyAndEnvironment();
    }

    @Test
    public void testDestinationsS() throws InterruptedException {
        usPageHome.destinationsS();
        usPageHome.validateDestinationsS();
    }

    @Test
    public void testExtremeWeather() throws InterruptedException {
        usPageHome.extremeWeather();
        usPageHome.validateExtremeWeather();
    }

    @Test
    public void testSpaceAndScience() throws InterruptedException {
        usPageHome.spaceAndScience();
        usPageHome.validateSpaceAndScience();
    }

    @Test
    public void testCnnStoreS() throws InterruptedException {
        usPageHome.cnnStoreS();
        usPageHome.validateCnnStoreS();
    }

    @Test
    public void testMenuButton() throws InterruptedException {
        usPageHome.menuButton();
        usPageHome.validateMenuButton();
    }

    @Test
    public void testSearchCnnSBox() throws InterruptedException {
        usPageHome.searchCnnSBox();
        usPageHome.validateSearchCnnSBox();
    }

    @Test
    public void testSearchCnnSBox1() throws InterruptedException {
        usPageHome.searchCnnSBox1();
        usPageHome.validateSearchCnnSBox1();
    }

    @Test
    public void testClearSBox() throws InterruptedException {
        usPageHome.clearSBox();
        usPageHome.validateClearBox();

    }

    @Test
    public void checkBoxUs() throws InterruptedException {
        usPageHome.checkBoxUs();
        usPageHome.validateCheckBoxUs();
    }

    @Test
    public void testEditionHover() throws InterruptedException {
        usPageHome.editionHover();
        usPageHome.validateEditionHover();
    }

    @Test
    public void selectLanguageS() throws InterruptedException {
        usPageHome.selectLanguageS();
        usPageHome.validateSelectLanguageS();
    }

    @Test
    public void testTermOfUses() throws InterruptedException {
        usPageHome.termOfUses();
        usPageHome.validateTermOfUses();
    }

    @Test
    public void climateS() throws InterruptedException {
        usPageHome.climateS();
        usPageHome.validateClimateS();
    }

    @Test
    public void addChoices() throws InterruptedException {
        usPageHome.addChoices();
        usPageHome.validateAddChoices();
    }
    @Test
    public void moreOptions() throws InterruptedException {
        usPageHome.moreOptions();
        usPageHome.validateMoreOption();
    }
    @Test
    public void longForms() throws InterruptedException {
        usPageHome.longForms();
        usPageHome.validateLongForms();
    }

    @Test
    public void investigations() throws InterruptedException {
        usPageHome.investigations();
        usPageHome.validateInvestigations();
    }

    @Test
    public void leadership() throws InterruptedException {
        usPageHome.leadership();
        usPageHome.validateLeadership();
    }

    @Test
    public void cnnNewsLettersS() throws InterruptedException {
        usPageHome.cnnNewsLettersS();
        usPageHome.validateCnnNewsLettersS();
    }
}