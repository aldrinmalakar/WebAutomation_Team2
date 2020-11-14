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

    @Test//1
    public void giftFinderNavigation() {
        giftFinderPage.validateGiftFinderPage();
    }

    @Test//2
    public void selectForHerTest(){
        giftFinderPage.selectForHer();
        giftFinderPage.forHerSelectValidation();
    }

    @Test//3
    public void forBabyTest(){
        giftFinderPage.selectAgeBaby();
        giftFinderPage.babySelected();
    }

    @Test//4
    public void priceRangeTest(){
        giftFinderPage.priceRangeSelect();
        giftFinderPage.priceRangeIs25();
    }

    @Test//5
    public void testBirthdayOccasion() throws InterruptedException {
        giftFinderPage.selectOccasion();
        giftFinderPage.validateSelectOccasion();
    }

    @Test//6
    public void scrollDownTest() {
        giftFinderPage.scrollDown();
        giftFinderPage.validateScrollDown();
    }

    @Test//7
    public void showAllRadioTest() {
        giftFinderPage.showAllRadioSelect();
        giftFinderPage.validateShowAllSelect();
    }

    @Test//8
    public void backToTopButton() {
        giftFinderPage.selectBackToTop();
        giftFinderPage.validateBackToTopButton();
    }

    @Test//9
    public void feedBackActions() {
        giftFinderPage.giveFeedBackStars();
        giftFinderPage.validateFiveStars();
    }

    @Test//10
    public void scrollBrandOption() {
        giftFinderPage.scrollInsideBrand();
        giftFinderPage.validateBrandScrollDown();
    }

    @Test//11
    public void personalizedTabTest() {
        giftFinderPage.personalizeTabClick();
        giftFinderPage.validatePersonalizeSelected();
    }

    @Test//12
    public void expandGiftTest() {
        giftFinderPage.expandGiftingOption();
        giftFinderPage.giftEligibleDisplay();
    }

    @Test//13
    public void filterResetTest() {
        giftFinderPage.filterReset();
        giftFinderPage.validateFilterReset();
    }

    @Test//14
    public void navigate2ndPage() {
        giftFinderPage.navigateToSecondPage();
        giftFinderPage.validateSecondPage();
    }

    @Test//15
    public void logoToHomePageTest() {
        giftFinderPage.logoNavigatesToHome();
        giftFinderPage.validateLogoNavigation();
    }

    @Test//16
    public void wareHouseTest() {
        giftFinderPage.hourWareHouseSelect();
        giftFinderPage.validateHourWareHouse();
    }

    @Test//17
    public void barbieTest() {
        giftFinderPage.barbie();
        giftFinderPage.validateBarbie();
    }

    @Test//18
    public void rokuTest() {
        giftFinderPage.roku();
        giftFinderPage.validateRoku();
    }

    @Test//19
    public void samsungTest() {
        giftFinderPage.samsung();
        giftFinderPage.validateSamsung();
    }

    @Test//20
    public void championTest() {
        giftFinderPage.champion();
        giftFinderPage.validateChampion();
    }

    @Test//21
    public void appleTest() {
        giftFinderPage.apple();
        giftFinderPage.validateApple();
    }

    @Test//22
    public void findABrandByTyping() {

    }

    @Test//23
    public void typeOfGiftList() {
        giftFinderPage.validateListText();
    }

    @Test//24
    public void seeMoreGiftIdeasText(){
        giftFinderPage.seeMoreGiftTextExpand();
        giftFinderPage.seeMoreGiftValidation();
    }

    @Test
    public void testest(){

    }


}
