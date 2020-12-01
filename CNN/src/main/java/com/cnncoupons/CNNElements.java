package com.cnncoupons;

public class CNNElements {
    //homePageOfferImages
    public static final String SlideRightLocator = "//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]";
    public static final String SlideLeftLocator = "//body/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]";
    public static final String SlideRightLocatorActual = "//div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/span[1]";
    public static final String SlideLeftLocatorActual = "//*[@id='tns1-item8']/div/span";
    //select Top Stores
    public static final String selectTopStoresLocators = "//a[contains(text(),'Top Stores')]";
    public static final String selectTopStoresLocatorsASOS = "//header/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]";
    public static final String selectTopStoresLocatorsActual = "//body/div[2]/div[2]/div[1]/div[1]";
    //Search Functionality Locators using valid word
    public static final String clickSearchFunctionalityLocators = "//div[2]/div[1]/header/div/ul[2]/li[2]";//"//*[@id='']";
    public static final String sendSearchFunctionalityLocators = "//header/div[1]/ul[2]/li[2]/div[1]/input[1]";
    public static final String SearchFunctionalityActual = "/html/body/div[2]/div[3]/div/div[1]";
    //Search Functionality Locators using numbers
    public static final String SearchFunctionalityNumActual = "//body/div[2]/div[3]/div[1]/h1[1]";
     //deals cods
    public static final String dealsCodsLocator = "//header/div[1]/ul[1]/li[4]/a[1]";
    public static final String clickSeeDealsCodLocator = "/html/body/div[2]/main/div/div[1]/div[2]/div/div[2]/div[4]/div[4]/div[4]/div[4]/div[3]/a/div/div";
    public static final String clickSeeDealsCod3Locator = "//section[1]/div[1]/div/a/div/div[3]/span[2]";
    public static final String validateCodLocatorActual = "//span[contains(text(),'H9JDFD57MN')]";
    // navigate to Weather page
    public static final String clickOnWeatherLocator = "//*[@id='footer-nav-container']/div[2]/div/div/nav/ul/li[15]/a";
    //climate Functionality
    public static final String climateFunctionalityLocator = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[1]/a";
    //storm Tracker
    public static final String stormTrackerLocator = "//header/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]";
    //wildFire Tracker
    public static final String wildFireTrackerLocator = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[3]/a";
    //wildFire Tracker
    public static final String videosLocator = "//*[@id='header-nav-container']/div/div[1]/div/div[2]/nav/ul/li[4]/a";
    // get forecast
    public static final String sendLocationLocator = "//*[@id='weather__local-query-form']/span/input";
    public static final String clickOnGetForecastLocator = "//*[@id='weather__local-query-form']/input";
    public static final String validateForecastLocator = "//*[@id='local-forecast ']/div[6]/div[1]/h2";
    // change Degree
    public static final String clickOnFahrenheitsLocator = "//*[@id='Weather']/div[2]/div/div[2]/ul/li/article/div/div/div/button[1]";
    public static final String validateFahrenheitsLocator = "//*[@id='local-forecast ']/div[6]/div[2]/div[1]/ul/li[1]/article/div/div[1]/div[1]/div[1]/span";
    // CNN Store
    public static final String clickOnCNNStoreLocator = "//*[@id='footer-nav-container']/div[5]/div/div[2]/nav/ul/li[6]/a";
    // Search Functions
    public static final String clickOnSearchLocator = "#query";
    public static final String validateSearchLocator = "//strong[contains(text(),'\"Apple iPhone\"')]";
    public static final String validateSearchAirPodsLocator = "//strong[contains(text(),'\"Apple AirPods Pro\"')]";
    // purchase product
    public static final String clickOnIphoneLocator = "//*[@id='sale-18334']/div/picture/img";
    public static final String clickOnAirPodsLocator = "//*[@id='sale-27816']/div/picture/img";
    public static final String clickOnAddToCartLocator = "//div[1]/div[1]/add-to-cart-button[1]/ng-transclude[1]/span[1]";
    public static final String clickOnAirPodsAddToCartLocator = "//ng-form[1]/div[1]/div[1]/add-to-cart-button[1]/ng-transclude[1]/span[1]";
    public static final String addQtyLocator = "#quantity";
    public static final String validatePurchaseLocator = "//span[contains(text(),'$1,050.00')]";
    public static final String validateAirPodsPurchaseLocator = "//span[contains(text(),'$459.98')]";
    //  Remove Item
    public static final String validateRemoveItemLocator = "//*[@id='stacksocial-wrapper']/div[5]/div/div[4]/div/div/div[1]/div[2]/p";
    public static final String clickOnRemoveItemLocator = "//a[contains(text(),'Remove')]";
    // Login
    public static final String clickOnLoginLocator = "//*[@id='main-navbar']/div[1]/div[2]/div/ul/li[3]/a";
    public static final String sendEmailLocator = "user[email]";
    public static final String sendPasswordLocator = "//input[@id='user_password']";
    public static final String clickOnLoginButtonLocator = "login_button";
    public static final String validateInvalidAccountLocator = "//p[contains(text(),'Invalid email or password. Your account will be lo')]";
    // SignUp
    public static final String clickOnSignUpLocator = "//*[@id='stacksocial-wrapper']/div[2]/div/div[5]/div/div/div/p/a";
    public static final String clickOnContinueLocator = "//*[@id='new_user']/input[4]";
    public static final String selectAgreeLocator = "custom-terms-info-label";
    public static final String validateSigningUpLocator = "//*[@id='main-navbar']/div[1]/div[2]/div/ul/li[3]/a";


}
