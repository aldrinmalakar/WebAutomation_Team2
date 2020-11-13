package testGiftFinder;

import common.WebAPI;
import giftFinder.GiftFinderPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import walmartHome.HomePage;

import java.util.concurrent.TimeUnit;

public class GiftFinderTest extends WebAPI {
    GiftFinderPage giftFinderPage;


    @BeforeMethod
    public void getInit() {
        giftFinderPage = PageFactory.initElements(driver, GiftFinderPage.class);
        giftFinderPage.navigateToGiftFinder();
    }

    @Test
    public void giftFinderNavigation() {
        giftFinderPage.validateGiftFinderPage();
    }

    @Test
    public void testBirthdayOccasion() throws InterruptedException {
        giftFinderPage.selectOccasion();
        giftFinderPage.validateSelectOccasion();
    }

    @Test
    public void scrollDownTest() {
        giftFinderPage.scrollDown();
        giftFinderPage.validateScrollDown();
    }

    @Test
    public void showAllRadioTest() {
        giftFinderPage.showAllRadioSelect();
        giftFinderPage.validateShowAllSelect();
    }

    @Test
    public void backToTopButton() {
        giftFinderPage.selectBackToTop();
        giftFinderPage.validateBackToTopButton();
    }

    @Test
    public void feedBackActions() {
        giftFinderPage.giveFeedBackStars();
        giftFinderPage.validateFiveStars();
    }

    @Test
    public void scrollBrandOption() {
        giftFinderPage.scrollInsideBrand();
        giftFinderPage.validateBrandScrollDown();
    }

    @Test
    public void personalizedTabTest() {
        giftFinderPage.personalizeTabClick();
        giftFinderPage.validatePersonalizeSelected();
    }

    @Test
    public void expandGiftTest() {
        giftFinderPage.expandGiftingOption();
        giftFinderPage.giftEligibleDisplay();
    }

    @Test
    public void filterResetTest() {
        giftFinderPage.filterReset();
        giftFinderPage.validateFilterReset();
    }

    @Test
    public void navigate2ndPage() {
        giftFinderPage.navigateToSecondPage();
        giftFinderPage.validateSecondPage();
    }

    @Test
    public void logoToHomePageTest() {
        giftFinderPage.logoNavigatesToHome();
        giftFinderPage.validateLogoNavigation();
    }

    @Test
    public void wareHouseTest() {
        giftFinderPage.hourWareHouseSelect();
        giftFinderPage.validateHourWareHouse();
    }

    @Test
    public void barbieTest() {

    }

    @Test
    public void rokuTest() {

    }

    @Test
    public void samsungTest() {

    }

    @Test
    public void appleTest() {

    }

    @Test
    public void findABrandByTyping(){

    }

    @Test
    public void typeOfGiftList(){
        giftFinderPage.validateListText();
    }




}
