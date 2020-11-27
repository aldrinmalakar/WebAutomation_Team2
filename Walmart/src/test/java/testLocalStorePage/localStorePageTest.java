package testLocalStorePage;

import common.WebAPI;
import localStore.LocalStorePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static localStore.localStorePageElements.*;

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
    public void testBrokenLinks() {
        localStorePage.findBrokenLinks(localStoreURL);}

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

    @Test
    public void clickAppStoreTest() {
        localStorePage.clickAppStore();
        localStorePage.validateAppStoreRedirection();
    }

    @Test
    public void clickPlayStoreTest() {
        localStorePage.clickPlayStore();
        localStorePage.validatePlayStoreRedirection();
    }

    @Test
    public void learnAboutWalmartPlusTest() {
        localStorePage.clickWalmartPlus();
        localStorePage.validateWalmartPlus();
    }

    @Test
    public void wPlusPageTest() {
        localStorePage.clickWalmartPlus();
        localStorePage.searchAvailability("49120");
    }

    @Test
    public void productRecallTest() {
        localStorePage.navigateToProductRecall();
        localStorePage.validateProdRecall("https://corporate.walmart.com/recalls");
    }

    @Test
    public void accountSignInTest() {
        localStorePage.clickAccount();
        localStorePage.validateClickAccount("Looking for your Walmart.com order?");
    }

    @Test
    public void trackOrderTest() {
        localStorePage.clickTrackOrder();
        localStorePage.validateTrackOrder("https://www.walmart.com/account/trackorder","Track your order");
    }

    @Test
    public void feedbackReviewTest() {
        localStorePage.feedbackMethod();
    }

    @Test
    public void submitComplaintTest() {
        localStorePage.clickTellUs();
        localStorePage.validateComplaintSubmission("Your feedback helps us make Walmart shopping better for millions of customers.");
    }

    @Test
    public void assertCopyRightTextTest() {
        localStorePage.getCopyRightText("© 2020 Walmart. All Rights Reserved.");
            }

    @Test
    public void careersPageTest() {
        localStorePage.navigateToCareers();
        localStorePage.assertCareerSearch("Member Frontline Cashier");


    }
}
