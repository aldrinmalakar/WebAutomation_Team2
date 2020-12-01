package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage home;

    @BeforeMethod
    public void getInit() {
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = true)
    public void testCNNUS() throws InterruptedException {
        home.CNNUSCheck();
    }

    @Test(enabled = true)
    public void testCNNWorld() throws InterruptedException {
        home.CNNWorldCheck();
    }

    @Test(enabled = true)
    public void testPolitics() throws InterruptedException {
        home.politicsCheck();
    }

    @Test(enabled = true)
    public void testBusiness() throws InterruptedException {
        home.businessCheck();
    }

    @Test(enabled = true)
    public void testOpinion() throws InterruptedException {
        home.opinionCheck();
    }

    @Test(enabled = true)
    public void testHealth() throws InterruptedException {
        home.healthCheck();
    }

    @Test(enabled = true)
    public void testEntertainment() throws InterruptedException {
        home.entertainmentCheck();
    }

    @Test(enabled = true)
    public void testStyle() throws InterruptedException {
        home.styleCheck();
    }

    @Test(enabled = true)
    public void testTravel() throws InterruptedException {
        home.travelCheck();
    }

    @Test(enabled = true)
    public void testSports() throws InterruptedException {
        home.sportsCheck();
    }

    @Test(enabled = false)
    public void testVideos() throws InterruptedException {
        home.videosCheck();
    }

    @Test(enabled = false)
    public void testLiveTV() throws InterruptedException {
        home.liveTVCheck();
    }

    @Test(enabled = false)
    public void testEdition() throws InterruptedException {
        home.editionCheck();
    }

    @Test(enabled = false)
    public void testSpanish() throws InterruptedException {
        home.spanishCheck();
    }

    @Test(enabled = false)
    public void testSearchIcon() throws InterruptedException {
        home.searchIconCheck();
        home.searchBoxCheck();
        home.elementToSearchCheck();
        home.searchButtonCheck();
    }

    @Test(enabled = false)
    public void testMenuIcon() throws InterruptedException {
        home.menuIconCheck();
    }


    @Test(enabled = false)
    public void testLiveUpdates() throws InterruptedException {
        home.liveUpdatesCheck();
    }

    @Test(enabled = false)
    public void testCoronaVirus() throws InterruptedException {
        home.coronaVirusCheck();

    }

        @Test(enabled = false)
    public void testElectionNews() throws InterruptedException {
            home.electionNewsCheck();
    }


        @Test(enabled = false)
    public void testStockMarket() throws InterruptedException {
            home.stockMarketCheck();
    }

        @Test(enabled = false)
    public void testTravelDestinations() throws InterruptedException {
            home.travelDestinationsCheck();
    }


        @Test(enabled = false)
    public void testTravelFoodAndDrink() throws InterruptedException {
            home.travelFoodAndDrinkCheck();
    }


        @Test(enabled = false)
    public void testSportsNFL() throws InterruptedException {
        home.sportsNFLCheck();
    }







}
