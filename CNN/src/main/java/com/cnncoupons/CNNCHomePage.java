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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static com.cnncoupons.CNNElements.*;

public class CNNCHomePage extends WebAPI {

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
    //     Deals Cod Locator
    @FindBy(how = How.XPATH, using = dealsCodsLocator)
    public WebElement clickSeeDealsCod;
    @FindBy(how = How.XPATH, using = clickSeeDealsCodLocator)
    public WebElement clickSeeDealsCod2;
    @FindBy(how = How.XPATH, using = clickSeeDealsCod3Locator)
    public WebElement clickSeeDealsCod3;
    @FindBy(how = How.XPATH, using = validateCodLocatorActual)
    public WebElement validateCodLocator;
    @FindBy(how = How.XPATH, using = clickOnWeatherLocator)
    public WebElement clickOnWeather;
    @FindBy(how = How.XPATH, using = climateFunctionalityLocator)
    public WebElement climateFunctionality;
    @FindBy(how = How.XPATH, using = stormTrackerLocator)
    public WebElement stormTracker;
    @FindBy(how = How.XPATH, using = wildFireTrackerLocator)
    public WebElement wildFireTracker;
    @FindBy(how = How.XPATH, using = videosLocator)
    public WebElement videos;
    @FindBy(how = How.XPATH, using = sendLocationLocator)
    public WebElement sendLocation;
    @FindBy(how = How.XPATH, using = clickOnGetForecastLocator)
    public WebElement clickOnGetForecast;
    @FindBy(how = How.XPATH, using = validateForecastLocator)
    public WebElement validateForecast;
    @FindBy(how = How.XPATH, using = clickOnFahrenheitsLocator)
    public WebElement clickOnFahrenheits;
    @FindBy(how = How.XPATH, using = validateFahrenheitsLocator)
    public WebElement validateFahrenheits;
    @FindBy(how = How.XPATH, using = clickOnCNNStoreLocator)
    public WebElement clickOnCNNStore;
    @FindBy(how = How.CSS, using = clickOnSearchLocator)
    public WebElement clickOnSearch;
    @FindBy(how = How.XPATH, using = validateSearchLocator)
    public WebElement validateSearch;
    @FindBy(how = How.XPATH, using = validateSearchAirPodsLocator)
    public WebElement validateSearchAirPods;
    @FindBy(how = How.XPATH, using = clickOnIphoneLocator)
    public WebElement clickOnIphone;
    @FindBy(how = How.XPATH, using = clickOnAirPodsLocator)
    public WebElement clickOnAirPods;
    @FindBy(how = How.XPATH, using = clickOnAddToCartLocator)
    public WebElement clickOnAddToCart;
    @FindBy(how = How.XPATH, using = clickOnAirPodsAddToCartLocator)
    public WebElement clickOnAirPodsAddToCart;
    @FindBy(how = How.CSS, using = addQtyLocator)
    public WebElement addQty;
    @FindBy(how = How.XPATH, using = validatePurchaseLocator)
    public WebElement validatePurchase;
    @FindBy(how = How.XPATH, using = validateAirPodsPurchaseLocator)
    public WebElement validateAirPodsPurchase;
    @FindBy(how = How.XPATH, using = clickOnRemoveItemLocator)
    public WebElement clickOnRemoveItem;
    @FindBy(how = How.XPATH, using = validateRemoveItemLocator)
    public WebElement validateRemoveItem;
    @FindBy(how = How.XPATH, using = clickOnLoginLocator)
    public WebElement clickOnLogin;
    @FindBy(how = How.NAME, using = sendEmailLocator)
    public WebElement sendEmail;
    @FindBy(how = How.XPATH, using = sendPasswordLocator)
    public WebElement sendPassword;
    @FindBy(how = How.ID, using = clickOnLoginButtonLocator)
    public WebElement clickOnLoginButton;
    @FindBy(how = How.XPATH, using = validateInvalidAccountLocator)
    public WebElement validateInvalidAccount;
    @FindBy(how = How.XPATH, using = clickOnSignUpLocator)
    public WebElement clickOnSignUp;
    @FindBy(how = How.XPATH, using = clickOnContinueLocator)
    public WebElement clickOnContinue;
    @FindBy(how = How.CLASS_NAME, using = selectAgreeLocator)
    public WebElement selectAgree;
    @FindBy(how = How.XPATH, using = validateSigningUpLocator)
    public WebElement validateSigningUpLo;

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
        String expected = "Enjoy Up to $399 of Free Accessories with Your Mattress Order";
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
        String expected = "Active American Eagle Promo Codes | 31 Offers Verified Today\n" +
                "Get American Eagle coupons for 50% OFF in November 2020";
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

    public void fetchUpDealsCods() throws InterruptedException {
        clickSeeDealsCod.click();
        clickSeeDealsCod2.click();
        clickSeeDealsCod3.click();
    }

    public void validateFetchUpDealsCods() throws InterruptedException {
        String expected = "H9JDFD57MN";
        String actual = validateCodLocator.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void navigateToWeatherHomeElements() {
        clickOnWeather.click();
    }

    public void validateWeatherHomeElements() {
        String expected = "Weather news and local forecast - CNN";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void climateFunctionalityElements() {
        navigateToWeatherHomeElements();
        climateFunctionality.click();
    }

    public void validateClimateFunctionalityElements() {
        String expected = "Climate change: Latest news and explainers - CNN";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void stormTrackerFunctionalityElements() {
        navigateToWeatherHomeElements();
        stormTracker.click();
    }

    public void validateStormTrackerFunctionalityElements() {
        String expected = "Hurricane tracker: Follow the storm's path";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void wildFireTrackerFunctionalityElements() {
        navigateToWeatherHomeElements();
        wildFireTracker.click();
    }

    public void validateWildFireTrackerFunctionalityElements() {
        String expected = "Wildfire map and air quality tracker";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void videosFunctionalityElements() throws InterruptedException {
        navigateToWeatherHomeElements();
        Thread.sleep(5);
        videos.click();
    }

    public void validateVideosFunctionalityElements() {
        String expected = "Weather video - CNN";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void GetForecastFunctionalityElements() throws InterruptedException {
        navigateToWeatherHomeElements();
        Thread.sleep(5);
        sendLocation.sendKeys("New York,NY");
        clickOnGetForecast.click();
    }

    public void validateGetForecastFunctionalityElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Manhattan, New York\n" +
                "Make Default\n" +
                " ";
        String actual = validateForecast.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void changeWeatherDegreesElements() throws InterruptedException {
        navigateToWeatherHomeElements();
        Thread.sleep(5);
        clickOnFahrenheits.click();
    }

    public void validateChangeWeatherDegreesElements() throws InterruptedException {
        sleepFor(5);
        String expected = "33";
        String actual = validateFahrenheits.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void navigateToCNNStoreElements() throws InterruptedException {
        clickOnCNNStore.click();
    }

    public void validateNavigateToCNNStoreElements() throws InterruptedException {
        sleepFor(5);
        String expected = "CNN STORE";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void searchFunctionalitiesElements() throws InterruptedException {
        navigateToCNNStoreElements();
        clickOnSearch.sendKeys("Apple iPhone");
        clickOnSearch.sendKeys(Keys.ENTER);
    }

    public void validateSearchAppleAirPodsProElements() throws InterruptedException {
        sleepFor(5);
        String expected = "\"Apple iPhone\"";
        String actual = validateSearch.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void searchAppleAirPodsProElements() throws InterruptedException {
        navigateToCNNStoreElements();
        clickOnSearch.sendKeys("Apple AirPods Pro");
        clickOnSearch.sendKeys(Keys.ENTER);
    }

    public void validateSearchFunctionalitiesElements() throws InterruptedException {
        sleepFor(5);
        String expected = "\"Apple AirPods Pro\"";
        String actual = validateSearchAirPods.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void purchaseProductFunctionElements() throws InterruptedException {
        searchFunctionalitiesElements();
        clickOnIphone.click();
        Select select = new Select(addQty);
        select.selectByVisibleText("3");
        List<WebElement> value = driver.findElements(By.tagName("li"));
//        System.out.println("Total value are: " + value.size());
        System.out.println(((WebElement) value.get(3)).getText());
        sleepFor(5);
        clickOnAddToCart.click();
    }

    public void validatePurchaseProductFunctionElements() throws InterruptedException {
        sleepFor(5);
        String expected = "$1,050.00";
        String actual = validatePurchase.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void purchaseProductAirPodsFunctionElements() throws InterruptedException {
        searchAppleAirPodsProElements();
        clickOnAirPods.click();
        sleepFor(5);
        clickOnAirPodsAddToCart.click();
    }

    public void validatePurchaseProductAirPodsFunctionElements() throws InterruptedException {
        sleepFor(5);
        String expected = "$459.98";
        String actual = validateAirPodsPurchase.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void removeItemFromCartElements() throws InterruptedException {
        purchaseProductAirPodsFunctionElements();
        new Actions(driver).moveToElement(clickOnRemoveItem).build().perform();
        clickOnRemoveItem.click();
    }

    public void validateRemoveItemFromCartElements() throws InterruptedException {
        sleepFor(5);
        String expected = "Your cart is empty. ";
        String actual = validateRemoveItem.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void loginWithInvalidEmailAndPasswordElement() throws InterruptedException {
        navigateToCNNStoreElements();
        clickOnLogin.click();
        sleepFor(8);
        sendEmail.sendKeys("RiyadMahrez@gmail.com");
        sendPassword.sendKeys("RiyadMahrez12345");
        clickOnLoginButton.click();
    }

    public void validateLoginWithInvalidEmailAndPasswordElement() throws InterruptedException {
        sleepFor(5);
        String expected = "Invalid email or password. Your account will be locked after 5 failed attempts. Please use Forgot Password to unlock your account or reset your password.";
        String actual = validateInvalidAccount.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }

    public void signUpForCNNStoreAccountElement() throws InterruptedException {
        navigateToCNNStoreElements();
        clickOnLogin.click();
        sleepFor(8);
        clickOnSignUp.click();
        sendEmail.sendKeys("RiyadMahrezz12@gmail.com");
        sendPassword.sendKeys("RiyaddMahrezz12345");
        selectAgree.click();
        clickOnContinue.click();
    }

    public void validateSignUpForCNNStoreAccountElement() throws InterruptedException {
        sleepFor(5);
        String expected = "\n" +
                "      Account";
        String actual = validateSigningUpLo.getText();
        Assert.assertEquals(actual, expected, "Test Fail, Expected Not Match With Actual ");
    }
}
