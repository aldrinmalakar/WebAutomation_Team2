package com.cnncoupons;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.cnncoupons.CNNCouponsElements.*;

public class CNNCouponsPage extends WebAPI {

    // image in home page
    @FindBy(how = How.XPATH, using = SlideRightLocator)
    public WebElement SlideRight;
    @FindBy(how = How.XPATH, using = SlideLeftLocator)
    public WebElement SlideLeft;
    @FindBy(how = How.XPATH, using = SlideRightLocatorActual)
    public WebElement SlideRightActual;
    @FindBy(how = How.XPATH, using = SlideLeftLocatorActual)
    public WebElement SlideLeftActual;
    // select Top Stores
    @FindBy(how = How.XPATH, using = selectTopStoresLocatorsActual)
    public WebElement selectTopStoreActual;
    //Search Functionality
    @FindBy(how = How.XPATH, using = clickSearchFunctionalityLocators)
    public WebElement clickSearchFunctionality;
    @FindBy(how = How.XPATH, using = sendSearchFunctionalityLocators)
    public WebElement sendSearchFunctionality;
    @FindBy(how = How.XPATH, using = SearchFunctionalityActual)
    public WebElement validateSearchFunctionality;
    //Search Functionality Locators using numbers
    @FindBy(how = How.XPATH, using = SearchFunctionalityNumActual)
    public WebElement validSearchFunctionalityNumActual;
    // Deals Cod Locator
//    @FindBy(how = How.XPATH, using = dealsCodsLocator)
//    public WebElement clickSeeDealsCod;
//    @FindBy(how = How.XPATH, using = clickSeeDealsCodLocator)
//    public WebElement clickSeeDealsCod2;
//    @FindBy(how = How.XPATH, using = clickSeeDealsCod3Locator)
//    public WebElement clickSeeDealsCod3;
//    @FindBy(how = How.XPATH, using = validateCodLocatorActual)
//    public WebElement validateCodLocator;

    public void validateCNNCouponsPage() {
        String expected = "CNN Coupons: Promo codes, Coupons & Deals for November 2020";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");

    }

    public void OfferImagesRightSlide() {
        SlideRight.click();
    }

    public void validateOfferImagesRightSlide() {
        String expected = "Save Up to 50% on Today's Deals for Every Pet";
        String actual = SlideRightActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");

    }

    public void OfferImagesLeftSlide() {
        SlideLeft.click();
        SlideLeft.click();
    }

    public void validateOfferImagesLeftSlide() {
        String expected = "Save Now with New adidas Fall Discounts";
        String actual = SlideLeftActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");

    }

    public void selectTopStores() {
        WebElement source = driver.findElement(By.xpath(selectTopStoresLocators));
        Actions action = new Actions(driver);
        action.moveToElement(source).perform();
        WebDriverWait wait = new WebDriverWait(driver, 8);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectTopStoresLocatorsASOS))).click();
    }

    public void validateSelectTopStores() {
        String expected = "Active American Eagle Promo Codes | 23 Offers Verified Today\n" +
                "Get American Eagle coupons for 500 POINTS in November 2020";
        String actual = selectTopStoreActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void searchFunctionalityElements() {
        clickSearchFunctionality.click();
        sendSearchFunctionality.sendKeys("Clothing");
        sendSearchFunctionality.sendKeys(Keys.ENTER);
    }

    public void validateSearchFunctionalityElements() {
        String expected = "offers related to Clothing";
        String actual = validateSearchFunctionality.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void searchFunctionalityNumbers() {
        clickSearchFunctionality.click();
        sendSearchFunctionality.sendKeys("1234");
        sendSearchFunctionality.sendKeys(Keys.ENTER);
    }

    public void validateSearchFunctionalityNumbers() {
        String expected = "Sorry! Unfortunately, we were not able to find results for: \"1234\"";
        String actual = validSearchFunctionalityNumActual.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

//    public void fetchUpDealsCods() throws InterruptedException {
//        clickSeeDealsCod.click();
//        clickSeeDealsCod2.click();
//        clickSeeDealsCod3.click();
//    }
//
//    public void validateFetchUpDealsCods() throws InterruptedException {
//        String expected = "H9JDFD57MN";
//        String actual = validateCodLocator.getText();
//        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
//    }
}
