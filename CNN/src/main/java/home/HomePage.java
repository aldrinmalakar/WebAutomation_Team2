package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static home.HomePageWebElement.*;

public class HomePage extends WebAPI {


    Actions action=new Actions(driver);


    @FindBy(how = How.XPATH,using = webElementCNNUS)
    public WebElement CNNUS;

    @FindBy(how = How.XPATH,using = webElementCNNWorld)
    public WebElement CNNWorld;

    @FindBy(how=How.XPATH,using=webElementPolitics)
    public WebElement politics;

    @FindBy(how=How.XPATH,using=webElementBusiness)
    public WebElement business;

    @FindBy(how=How.XPATH,using=webElementOpinion)
    public WebElement opinion;

    @FindBy(how=How.XPATH,using=webElementHealth)
    public WebElement health;

    @FindBy(how=How.XPATH,using=webElementEntertainment)
    public WebElement entertainment;

    @FindBy(how=How.XPATH,using=webElementStyle)
    public WebElement style;

    @FindBy(how=How.XPATH,using=webElementTravel)
    public WebElement travel;

    @FindBy(how=How.XPATH,using=webElementSports)
    public WebElement sports;

    @FindBy(how=How.XPATH,using=webElementVideos)
    public WebElement videos;

    @FindBy(how=How.XPATH,using=webElementLiveTV)
    public WebElement liveTV;

    @FindBy(how=How.XPATH,using=webElementEdition)
    public WebElement edition;

    @FindBy(how=How.XPATH,using=webElementSpanish)
    public WebElement spanish;

    @FindBy(how=How.XPATH,using=webElementSearchIcon)
    public WebElement searchIcon;

    @FindBy(how=How.XPATH,using=webElementSearchBox)
    public WebElement searchBox;

    @FindBy(how=How.XPATH,using=webElementElementToSearch)
    public WebElement elementToSearch;

    @FindBy(how=How.XPATH,using=webElementSearchButton)
    public WebElement searchButton;

    @FindBy(how=How.XPATH,using=webElementMenuIcon)
    public WebElement menuIcon;

    @FindBy(how=How.XPATH,using=webElementLiveUpdates)
       public WebElement liveUpdates;

    @FindBy(how=How.XPATH,using=webElementCoronaVirus)
    public WebElement coronaVirus;

    @FindBy(how=How.XPATH,using=webElementElectionNews)
    public WebElement electionNews;

    @FindBy(how=How.XPATH,using=webElementStockMarket)
    public WebElement stockMarket;

    @FindBy(how=How.XPATH,using=webElementTravelDestinations)
    public WebElement travelDestinations;

    @FindBy(how=How.XPATH,using=webElementTravelFoodAndDrink)
    public WebElement travelFoodAndDrink;

    @FindBy(how=How.XPATH,using=webElementSportsNFL)
      public WebElement sportsNFL;

    @FindBy(how=How.XPATH,using=webElementSportsNBA)
    public WebElement sportsNBA;


    public void CNNUSCheck() throws InterruptedException {
        CNNUS.click();
        Thread.sleep(5000);
    }

    public void CNNWorldCheck() throws InterruptedException {
        CNNWorld.click();
        Thread.sleep(5000);
    }


    public void politicsCheck() throws InterruptedException {
        politics.click();
        Thread.sleep(5000);
    }


    public void businessCheck() throws InterruptedException {
        business.click();
        Thread.sleep(5000);
    }


    public void opinionCheck() throws InterruptedException {
        opinion.click();
        Thread.sleep(5000);
    }


    public void healthCheck() throws InterruptedException {
        health.click();
        Thread.sleep(5000);
    }


    public void entertainmentCheck() throws InterruptedException {
        entertainment.click();
        Thread.sleep(5000);
    }


    public void styleCheck() throws InterruptedException {
        style.click();
        Thread.sleep(5000);
    }


    public void travelCheck() throws InterruptedException {
        travel.click();
        Thread.sleep(5000);
    }


    public void sportsCheck() throws InterruptedException {
        sports.click();
        Thread.sleep(5000);
    }


    public void videosCheck() throws InterruptedException {
        videos.click();
        Thread.sleep(5000);
    }


    public void liveTVCheck() throws InterruptedException {
        liveTV.click();
        Thread.sleep(5000);
    }


    public void editionCheck() throws InterruptedException {
        edition.click();
        Thread.sleep(5000);
    }


    public void spanishCheck() throws InterruptedException {
        spanish.click();
        Thread.sleep(5000);
    }

    public void searchIconCheck() throws InterruptedException {
        searchIcon.click();
        Thread.sleep(5000);
    }

    public void searchBoxCheck() throws InterruptedException {
        searchBox.click();
        Thread.sleep(5000);
    }

    public void elementToSearchCheck() throws InterruptedException {
        elementToSearch.click();
        Thread.sleep(5000);
    }

    public void searchButtonCheck() throws InterruptedException {
        searchButton.click();
        Thread.sleep(5000);
    }

    public void menuIconCheck() throws InterruptedException {
        menuIcon.click();
        Thread.sleep(5000);
    }

    public void liveUpdatesCheck() throws InterruptedException {
        liveUpdates.click();
        Thread.sleep(5000);
    }

        public void coronaVirusCheck() throws InterruptedException {
        coronaVirus.click();
        Thread.sleep(5000);
    }


        public void electionNewsCheck() throws InterruptedException {
        electionNews.click();
        Thread.sleep(5000);
    }


        public void stockMarketCheck() throws InterruptedException {
        stockMarket.click();
        Thread.sleep(5000);
    }


        public void travelDestinationsCheck() throws InterruptedException {
        travelDestinations.click();
        Thread.sleep(5000);
    }


        public void travelFoodAndDrinkCheck() throws InterruptedException {
        travelFoodAndDrink.click();
        Thread.sleep(5000);
    }


        public void sportsNFLCheck() throws InterruptedException {
        sportsNFL.click();
        Thread.sleep(5000);
    }


        public void sportsNBACheck() throws InterruptedException {
        sportsNBA.click();
        Thread.sleep(5000);
    }


}
