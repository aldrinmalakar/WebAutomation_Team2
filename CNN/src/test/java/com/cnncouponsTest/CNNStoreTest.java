package com.cnncouponsTest;

import com.cnncoupons.CNNCHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class CNNStoreTest extends WebAPI {
    static CNNCHomePage cnncHomePage;
    @BeforeMethod
    public void getInit() {
        cnncHomePage = PageFactory.initElements(driver, CNNCHomePage.class);
    }
    @Test
    public void navigateToCNNStoreHomePage() throws InterruptedException {
        cnncHomePage.navigateToCNNStoreElements();
        cnncHomePage.validateNavigateToCNNStoreElements();
    }
    @Test
    public void searchFunctionalitiesIphone() throws InterruptedException {
        cnncHomePage.searchFunctionalitiesElements();
        cnncHomePage.validateSearchFunctionalitiesElements();
    }
    @Test
    public void searchAppleAirPodsPro() throws InterruptedException {
        cnncHomePage.searchAppleAirPodsProElements();
        cnncHomePage.validateSearchAppleAirPodsProElements();
    }
    @Test
    public void purchaseIphoneProductFunction() throws InterruptedException {
        cnncHomePage.purchaseProductFunctionElements();
        cnncHomePage.validatePurchaseProductFunctionElements();
    }
    @Test
    public void purchaseAirPodsProductFunction() throws InterruptedException {
        cnncHomePage.purchaseProductAirPodsFunctionElements();
        cnncHomePage.validatePurchaseProductAirPodsFunctionElements();
    }
    @Test
    public void removeItemFromCartFunction() throws InterruptedException {
        cnncHomePage.removeItemFromCartElements();
        cnncHomePage.validateRemoveItemFromCartElements();
    }
    @Test
    public void loginWithInvalidEmailAndPassword() throws InterruptedException {
        cnncHomePage.loginWithInvalidEmailAndPasswordElement();
        cnncHomePage.validateLoginWithInvalidEmailAndPasswordElement();
    }
    @Test
    public void signUpForCNNStoreAccount() throws InterruptedException {
        cnncHomePage.signUpForCNNStoreAccountElement();
        cnncHomePage.validateSignUpForCNNStoreAccountElement();
    }


}
