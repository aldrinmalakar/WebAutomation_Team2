package backOfAmericaAutoLoan;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static common.WebAPI.driver;

public class autoLoanPageElements {

    public static final String testHomeURL = "https://www.bankofamerica.com/auto-loans/";
    //Select Your State
    public static final String selectStateID = "stateSelectModal";
    public static final String goSelectedState = "stateSelectorSubmit";

    public static final String searchID = "nav-search-query";
    public static final String suggestionMobileBanking = "Search Module - Suggestion - mobile banking";
    public static final String headerMobileBankingSearch = "mobile banking";
    public static final String searchAnswerMobileBanking = "h3[class='answer-heading'] span[class='query']";

    //Search for Schedule an appointment
    public static final String clickScheduleAppt = "a[name='Search Module - Suggestion - schedule an appointment']";
    public static final String expectedScheduleAppt = "Schedule appointment";
    public static final String scheduleApptButton = "Schedule_appointment";
    public static final String expectedHeaderScdlAppt = "Schedule An Appointment";
    public static final String actualHeaderScdlAppt = "skip-to-h1";

    public static final String dropdownMenu = "a[class='menu-button js-menu-button']";
    public static final String expectedDDMenuText = "Auto Loan Basics";
    public static final String actualDDMenuText = "//*[@id='navigation'] //span[.='Auto Loan Basics']";

    public static final String headerContactUs = "header-contact-us";
    public static final String contactUsSearch = "contactUsSelector";
    public static final String contactUsSearchText = "Auto loans";
    public static final String searchGoButton = "selectGoButton";
    public static final String exptectedContactUs = "Auto loans";
    public static final String actualContactUs = "//option[@value='customer-service/contact-us/auto-loans']";

    public static final String applyNowloc = "refi-button";
    public static final String applyNowSelect = "autoLoanTypeSelect";
    public static final String noCarInfo = "vehicle-loan-idonthavecarinformation";
    public static final String expectedURLapplyNow = "https://secure.bankofamerica.com/apply-auto-loans/public/vl/#getstarted";
    public static final String expectedApplyNowText = "Return to overview";
    public static final String actualApplyNowText = "returnButtonLarge";

    public static final String carShopButton = "shop-now-button";
    public static final String zipCodeBox = "zipCodeField";
    public static final String shopCarbutton = "dtShopforCar";
    public static final String shopNowButton = "shopNowButton";
    public static final String expectedCarBuyHeader = "Your car buying journey starts here ";
    public static final String actualCarBuyHeader = "h3[class='display-3 m-0 widget-heading']";

    public static final String expectedNewCarRate = "2.59";
    public static final String actualNewCarRate = "//div[@class='inner-content']//span[@class='rate-txt'][.='2.59']";
    public static final String expectedUsedCarRate = "2.89";
    public static final String actualUsedCarRate = "//div[@class='inner-content']//span[@class='rate-txt'][.='2.89']";
    public static final String expectedRefinancedCarRate = "3.49";
    public static final String actualRefinancedCarRate = "//div[@class='inner-content']//span[@class='rate-txt'][.='3.49']";

    public static final String expectedSelectYourState = "stateSelectModal";
    public static final String actualSelectYourState = "stateSelectModal";

    public static final String clickSignIn = "header-signin";
    public static final String expectedURLSignIn = "https://www.bankofamerica.com/online-banking/sign-in/";

    public static final String enterOnlineID = "oid";
    public static final String enterPassword = "pass";
    public static final String invalidOnlineID = "crazyCuckoo";
    public static final String invalidPassword = "SorryNoLuckThisTime2020";
    public static final String buttonSignIn = "secure-signin-submit";

    public static final String transferMoney = "a[id='signInTransferMoney'] div[class='headline']";
    public static final String expectedTransferMoneyURL = "https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go?reason=TransferFunds";

    public static final String stickyGetAppButton = "getTheAppSticky";
    public static final String selectAppDevice = "getAppDeviceSelect";
    public static final String stickyGoButton = "appChoiceSubmit";
    public static final String stickyPhoneInput = "phoneNumberFieldAndroid";
    public static final String stickyPhoneNumber = "574-698-5598";
    public static final String stickySendToDevice = "sendToDeviceBtnAndroid";
    public static final String expectedDestinationPhone = stickyPhoneNumber;
    public static final String actualStickyDestinationPhone = "//*[@id='sendToDeviceSuccess']/div[1]/p[2]/span";

    public static final String scrollDownApply = "apply_now_sticky";
    public static final String expectedLoanApplication = "Auto Loan Application";
    public static final String actualLoanApplication = "//h1[@class='getstarted modifyDOM formerly-hide']";

    public static final String scrollDownContactUs = "//li[@class='cta-content-item cta-content-item--contact-us']//ul[@class='spa-accordion']";
    public static final String scrollDownScheduleAnAppt = "//div[@class='show-for-medium-up']//div[2]//li[1]//p[1]";
    public static final String expectedScrollScheduleTitle = "Schedule an Appointment";

    public static final String zipcodeInput = "//div[@class='zipinput-container show-for-medium-up']//input[@id='zipCodeField']";
    public static final String expectedDealerHeader = "Dealers";
    public static final String actualDealerHeader = "div[class='product']";

    public static final String filterInput = "rioFilterInput";
    public static final String filterInputKeyword = "GMC";
    public static final String expectedHeader = "Locations near you";
    public static final String actualHeaderDealer = "maplistTitle";

    public static final String linkToAccessible = "a[id='disability_access_loans'] p[class='p']";
    public static final String expectedAccessibleLink = "https://www.bankofamerica.com/auto-loans/disability-access-loans/";

    public static final String expectedFooterText = "HomePrivacySecurityCareersFeedbackSitemapAdvertising Practices";
    public static final String actualFooterText = "footer__bottom-links";

    public static final String carBuyingTips = "footer_al_carBuyingProcess";
    public static final String expectedCarBuyingURL = "https://www.bankofamerica.com/auto-loans/car-buying-process/";

    public static final String checkStatus = "footer_al_checkStatus";
    public static final String expectedCheckStatus = "https://secure.bankofamerica.com/applynow/welcome.go";

    public static final String checkStatusDOBEntry = "zz_tb_dob_v_1";
    public static final String dobEntry = "12/26/1988";
    public static final String checkStatusMothersMaidenName = "zz_tb_pwd_v_1";
    public static final String maidenNameEntry = "Fosters";
    public static final String checkSSNEntry = "zz_tb_ssn_v_1";
    public static final String ssnEntry = "125-56-9865";
    public static final String continueButtonStatus = "#mSMB90";
    public static final String expectedCheckStatusText = "The information you entered does not match our records. Please try again.";
    public static final String actualCheckStatusText = "//label[contains(text(),'The information you entered does not match our rec')]";

    public static final String youtubeFollow = "social_follow_youtube_link";
    public static final String popupYoutubeFollow = "a[id='boaSocialModal_link_Continue'] span";
    public static final String expectedYTLink = "https://www.youtube.com/user/bankofamerica";

    public static final String applyOnlineHP = "applyOnlineEA";
    public static final String getExpectedURLapplyNow = "https://secure.bankofamerica.com/apply-auto-loans/public/vl/#getstarted";












}

