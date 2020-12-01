package com.cnncouponsTest;

import com.cnncoupons.CNNCHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CNNCouponsTest extends WebAPI {
    static CNNCHomePage CNNCHomePage;

    @BeforeMethod
    public void getInit() {
        CNNCHomePage = PageFactory.initElements(driver, CNNCHomePage.class);
    }

    @Test
    public void CNNCouponsPage() {
        CNNCHomePage.validateCNNCouponsPage();
    }

    @Test
    public void homePageOfferImagesRight() {
        CNNCHomePage.OfferImagesRightSlide();
        CNNCHomePage.validateOfferImagesRightSlide();
    }

    @Test
    public void homePageOfferImagesLeft() {
        CNNCHomePage.OfferImagesLeftSlide();
        CNNCHomePage.validateOfferImagesLeftSlide();
    }

    @Test
    public void selectTopStores() {
        CNNCHomePage.selectTopStores();
        CNNCHomePage.validateSelectTopStores();
    }

    @Test
    public void searchFunctionality() {
        CNNCHomePage.searchFunctionalityElements();
        CNNCHomePage.validateSearchFunctionalityElements();

    }

    @Test
    public void searchFunctionalityUsingNumbers() {
        CNNCHomePage.searchFunctionalityNumbers();
        CNNCHomePage.validateSearchFunctionalityNumbers();
    }

    @Test
    public void ASOSDealsCods() throws InterruptedException {
        CNNCHomePage.fetchUpDealsCods();
        CNNCHomePage.validateFetchUpDealsCods();
    }


}
