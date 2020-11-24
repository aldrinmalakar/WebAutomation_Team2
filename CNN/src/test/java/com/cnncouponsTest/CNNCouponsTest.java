package com.cnncouponsTest;

import com.cnncoupons.CNNCouponsPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CNNCouponsTest extends WebAPI {
    static CNNCouponsPage cnnCouponsPage;

    @BeforeMethod
    public void getInit() {
        cnnCouponsPage = PageFactory.initElements(driver, CNNCouponsPage.class);
    }

    @Test
    public void CNNCouponsPage() {
        cnnCouponsPage.validateCNNCouponsPage();
    }

    @Test
    public void homePageOfferImagesRight() {
        cnnCouponsPage.OfferImagesRightSlide();
        cnnCouponsPage.validateOfferImagesRightSlide();
    }
    @Test
    public void homePageOfferImagesLeft() {
        cnnCouponsPage.OfferImagesLeftSlide();
        cnnCouponsPage.validateOfferImagesLeftSlide();
    }
    @Test
    public void selectTopStores() {
        cnnCouponsPage.selectTopStores();
        cnnCouponsPage.validateSelectTopStores();
    }

    @Test
    public void searchFunctionality() {
        cnnCouponsPage.searchFunctionalityElements();
        cnnCouponsPage.validateSearchFunctionalityElements();

    }

    @Test
    public void searchFunctionalityUsingNumbers() {
        cnnCouponsPage.searchFunctionalityNumbers();
        cnnCouponsPage.validateSearchFunctionalityNumbers();
    }

//    @Test
//    public void ASOSDealsCods() throws InterruptedException {
//        cnnCouponsPage.fetchUpDealsCods();
//        cnnCouponsPage.validateFetchUpDealsCods();
//    }
//
//    @Test
//    public void name() {
//    }
//
//    @Test
//    public void name() {
//    }

}
