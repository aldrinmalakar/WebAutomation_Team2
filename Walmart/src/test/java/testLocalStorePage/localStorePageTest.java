package testLocalStorePage;

import common.WebAPI;
import localStore.LocalStorePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class localStorePageTest extends WebAPI {
    LocalStorePage localStorePage;

    @BeforeMethod
    public void getInit() throws InterruptedException {
        localStorePage = PageFactory.initElements(driver, LocalStorePage.class);
        localStorePage.navigateToLocalStorePage();
    }

    @Test
    public void navigateToLocalStoreTest() {

        localStorePage.validateNavigateToLocalStorePage();
    }

    @Test
    public void makeThisMyStoreTest() {

        localStorePage.makeThisYourStore();
        localStorePage.validateMakeThisYourStore();

    }

    @Test
    public void findAnotherStoreTest() {
        localStorePage.findAnotherStore();
        localStorePage.validateFindAnotherStore();
    }

    @Test
    public void getDirectionTest() {
        localStorePage.getDirection();
        localStorePage.validateGetDirection();
    }

    @Test
    public void callTheStoreTest() {
        localStorePage.callTheStore();
        //localStorePage.validateCallTheStore();

    }

    @Test
    public void openHoursTest() {
        localStorePage.validateOpenHours();
    }

    @Test
    public void featureCoronaTest() {
        localStorePage.featureCorona();
        localStorePage.validateFeatureCorona();

    }

    @Test
    public void featureCoronaPageTest() {
        localStorePage.featureCorona();
        localStorePage.bannerNext();
        localStorePage.validateBannerText();

    }

    @Test
    public void pharmacyDropDownTest() {
        localStorePage.pharmacyDropDown();
        localStorePage.validatePharmacyDropDown();
    }

    @Test
    public void searchStoreTest() {
        localStorePage.searchStore();
        localStorePage.validateSearchStore();

    }

    @Test
    public void newsAndEventsTest() {
        localStorePage.newsEvents();
        localStorePage.validateNewsEvents();
    }

    @Test
    public void footerWeeklyAdsCheckTest() {
        localStorePage.weeklyAdsCheck();
        localStorePage.validateWeeklyAdsCheck();

    }

    @Test
    public void emailSignupTest() {
        localStorePage.signUpMethod();
        localStorePage.validateSignupMethod();

    }


    @Test
    public void footerDigitalMuseumCheckTest() {
        localStorePage.digitalMuseumCheck();
        localStorePage.validateDigitalMuseumCheck();
    }


}
