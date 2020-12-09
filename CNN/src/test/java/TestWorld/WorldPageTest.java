package TestWorld;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import world.WorldPage;

/**
 * Author: Helen Asfaw
 * DueDate: December 1, 2020
 */
public class WorldPageTest extends WebAPI {
    WorldPage worldPage;


    @BeforeMethod
    public void getInit() {
        worldPage = PageFactory.initElements(driver, WorldPage.class);
    }

    @Test
    public void testcnnWorldPage() throws InterruptedException {
        worldPage.cnnWorldPage();
        worldPage.validateWorldPage();
    }

    @Test
    public void testeuropeworkablepage() throws InterruptedException {
        worldPage.europeworkablepage();
        worldPage.validateEuropeanPage();
    }

    @Test
    public void testmiddleEastWorkablePage() throws InterruptedException {
        worldPage.middleEastWorkablePage();
        worldPage.validateMiddleEastPage();
    }

    @Test
    public void testafricaWorkablePage() throws InterruptedException {
        worldPage.africaWorkablePage();
        worldPage.validateAfricaPage();
    }

    @Test
    public void testamericasWorkablePage() throws InterruptedException {
        worldPage.europeworkablepage();
        worldPage.validateEuropeanPage();
    }

    @Test
    public void testasiaWorkablePage() throws InterruptedException {
        worldPage.asiaWorkablePage();
        worldPage.validateAsiaPage();
    }

    @Test
    public void testcnnBusinessWorkablePage() throws InterruptedException {
        worldPage.cnnBusinessWorkablePage();
        worldPage.validateCNNBusinessPage();
    }

    @Test
    public void testClimateInCrisisWorkablePage() throws InterruptedException {
        worldPage.climateInCrisisWorkablePage();
        worldPage.validateClimateInCrisisPage();
    }


    @Test
    public void teststyleWorkablePage() throws InterruptedException {
        worldPage.styleWorkablePage();
        worldPage.validateStylePage();
    }

    @Test
    public void testtravelWorkablePage() throws InterruptedException {
        worldPage.travelWorkablePage();
        worldPage.validatetravelPage();
    }

    @Test
    public void testsportWorkablePage() throws InterruptedException {
        worldPage.sportWorkablePage();
        worldPage.validateSportPage();
    }

    @Test
    public void testcnnHeroesWorkablePage() throws InterruptedException {
        worldPage.cnnHeroesWorkablePage();
        worldPage.validateCNNHeroesPage();
    }

    @Test
    public void testfooterUSWorkablePage() throws InterruptedException {
        worldPage.footerUSWorkablePage();
        worldPage.validateFooterUSPage();
    }

    @Test
    public void testfooterWorldWorkablePage() throws InterruptedException {
        worldPage.footerWorldWorkablePage();
        worldPage.validateFooterWorldPage();
    }

    @Test
    public void testfooterPoliticsWorkablePage() throws InterruptedException {
        worldPage.footerPoliticsWorkablePage();
        worldPage.validateFooterPoliticsPage();
    }

    @Test
    public void testfooterBusinessWorkablePage() throws InterruptedException {
        worldPage.footerBusinessWorkablePage();
        worldPage.validateFooterBusinessPage();
    }

    @Test
    public void testfooterOpinionWorkablePage() throws InterruptedException {
        worldPage.footerOpinionWorkablePage();
        worldPage.validateFooterOpinionPage();
    }

    @Test
    public void testfooterHealthWorkablePage() throws InterruptedException {
        worldPage.footerHealthWorkablePage();
        worldPage.validateFooterHealthPage();
    }

    @Test
    public void testfooterEntertainmanetWorkablePage() throws InterruptedException {
        worldPage.footerEntertainmanetWorkablePage();
        worldPage.validateFooterEntertainmentPage();
    }

    @Test
    public void testfooterTechWorkablePage() throws InterruptedException {
        worldPage.footerTechWorkablePage();
        worldPage.validateFooterTechPage();
    }

    @Test
    public void testfooterStyleWorkablePage() throws InterruptedException {
        worldPage.europeworkablepage();
        worldPage.validateEuropeanPage();
    }

    @Test
    public void testfooterTravelWorkablePage() throws InterruptedException {
        worldPage.footerTravelWorkablePage();
        worldPage.validateFooterTravelPage();
    }

    @Test
    public void testfooterSportWorkablePage() throws InterruptedException {
        worldPage.footerSportWorkablePage();
        worldPage.validateFooterSportPage();
    }

    @Test
    public void testfooterVideoWorkablePage() throws InterruptedException {
        worldPage.footerVideoWorkablePage();
        worldPage.validateFooterVideoPage();
    }

    @Test
    public void testfooterAudioWorkablePage() throws InterruptedException {
        worldPage.footerAudioWorkablePage();
        worldPage.validateFooterAudioPage();
    }

}
