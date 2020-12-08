package bankofamericamuseum;

public class BOALocators {

    public static final String LocationsLocator = "#footer_bofa_locations";
    //search location
    public static final String newYorkLocator = "//input[@id='q']";
    public static final String clickOnnSearchButtonLocator = "search-button";
    public static final String AlbanyLocatorActual = "#aria-map-list-header";
    //open filter functions
    public static final String clickOnFilterLocator = "Filter";
    public static final String filterActual = "#filter-expand > div.map-list-header.mb-25";
    // close filter
    public static final String clickOnCloseFilterLocator = "map-filter-scroll";
    // location by state
    public static final String clickOnLocationByStateLocator = "//body/div[@id='main-container']/div[1]/div[2]/div[1]/article[1]/h2[1]/button[1]";
    public static final String clickOnLocationMassachusettsLocator = "#browse-expand > ul > li:nth-child(8) > ul > li:nth-child(3) > a";
    //validate state
    public static final String validateOnLocationMassachusettsLocator = "//h1[@id='skip-to-h1']";
    // check Near MeButton
    public static final String clickCheckNearMeButtonLocation = "search-near-me";
    // validate near me button
    public static final String validateCheckNearMeButtonLocation = "search-near-me";
    // Search Location By Filters
    public static final String SearchLocationByFiltersLocator = "//*[@id='filter-expand']/div[2]/button";
    public static final String validateSearchLocationByFiltersLocator = "//*[@id='list-expand']/div[1]/div[2]/a/span";
    // Merrill HomePage
    public static final String MerrillHomePageLocator = "//span[contains(text(),'Investing')]";
    //Play video
    public static final String PlayVideoMerrillLocator = "//*[@id='vjs_video_3']/div[1]";
    public static final String PlayVideoMerrillActual = "//*[@id='vjs_video_3']/div[4]/div[5]/div/div[1]/span/span[2]";
    // Guide Adviser
    public static final String guideAdviserLocator = "//a[@id='ancMenuItem_0']";
    public static final String validateGuideAdvisorActual = "//h1[contains(text(),'Merrill Guided Investing™')]";
    // chat box function
    public static final String chatBoxFunctionLocator = "chat--icon-bubble";
    public static final String closeChatBoxFunctionActual = "//*[@id='chatWidgetModule']/div[1]/div[2]/button[3]";
    // send message
    public static final String clickOnMessageBoxLocatorclass = "chat__message--entry spa-input-textarea";
    public static final String clickOnMessageBoxLocator = "//*[@id='chatWidgetModule']/button[1]";
    public static final String validateMessageBoxLocator = "//*[@id='chatSiteModule']/div/div[3]/div[2]/div[4]/span";
    // cost of dept
    public static final String clickOnTryItOUtLocator = "//*[@id='spnMenuItem_115']";
    public static final String clickOnCostOfDeptLocator = "//*[@id='RH_CostOfDebt']";
    // calculate cost of dept
    public static final String sendTotalAmountLocator = "//*[@id='PlanAmountOwed']";
    public static final String loanPaymentLocator = "//*[@id='PeriodsinYear']";
    public static final String mainSliderRateLocator = "//*[@id='top']/div/div[3]/div/div[2]/span[1]";
    public static final String SliderRateLocator = "//*[@id='slider-AnnRate']";
    // stock table
    public static final String clickOnResearchLocator = "ancMenuItem_98";
    public static final String SNDLActualLocator = "//*[@id='ctl00_ctl00_siteContent_MainContent_MarketDataControlDesigner3_ctl00_mmwMostActiveSecurities']/div[2]/table/tbody/tr[2]/td[4]";
    public static final String iframeHandlingLocator = "//*[@id='ctl00_ctl00_siteContent_MainContent_SimpleContentControl2_ctl00_ecmsWPRECMSContentCtrl1']/div/iframe";
    public static final String submitLocator = "//*[@id='submitDiv']/input";
    public static final String linkLocator = "a";
    //Login Data provider
    public static final String OnlineIDLocator = "#onlineId1";
    public static final String PassCodeLocator = "#passcode1";
    public static final String SignINLocator = "#signIn";
    public static final String validateLoginLocator = "/html/body/div[1]/div/div/div[1]/div[4]/div[2]/div/li";
    public static final String desktopListLocator = "//*[@id='navigationDesktop']";
}