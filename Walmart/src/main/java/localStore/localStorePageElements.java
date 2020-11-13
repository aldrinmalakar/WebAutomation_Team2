package localStore;

import static common.WebAPI.driver;

public class localStorePageElements {
    //Before Method Variables
    public static final String localStoreURL = "https://www.walmart.com/store/";
    public static final String currentLocalStoreURL = "https://www.walmart.com/store/2010-niles-mi";
    public static final String makeThisYourStore = "//button[contains(text(),'Make this your store')]";
    public static final String getMakeThisYourStore = "store-number";
    public static final String findAnotherStore = "//button[normalize-space()='Find another store']";
    public static final String getFindAnotherStore = "p[class='results-list-header']";
    public static final String findDirection = "//div[@class='directions-and-phone-parts-cell-right']//span[contains(text(),'Get directions')]";
    public static final String homeAddress = "store-address-line-1";
    public static final String getDirectionSearchBox = "h2[class='section-subheader-header GLOBAL__gm2-subtitle-alt-1']";
    public static final String callTheStore = "//div[@class='directions-and-phone-parts-cell-right']//div[@id='store-phone']";
    public static final String mainStorePhone = "//a[@class='service-expander-phone text-right']/span";
    public static final String googleMapContainer = "google-map-container";
    public static final String openHoursBody = "div[aria-label='Open until 10 pm'] span[class='open service-expander-friendly-hours']";
    public static final String openHoursHeader = "div[class='directions-and-phone-parts-cell-right'] div[class='friendly-hours open']";
    public static final String coronaFeature = "//a[@href='https://corporate.walmart.com/coronavirus']";
    public static final String coronaBannerNext = "//button[@aria-label='Next']";
    public static final String coronaBannerExpected = "OUR STEPS TO PROTECT YOU";
    public static final String coronaBannerText = "li[aria-label='Page dot 3'] span";
    public static final String pharmacyDropDown ="//div[@itemtype='http://schema.org/Pharmacy']//button[@type='button']";
    public static final String pharmacyChekText = "Refill a prescription";
    public static final String REFILL_A_PRESCRIPTION = "//span[normalize-space()='Refill a prescription']";
    public static final String publicSearch = "global-search-input";
    public static final String searchKey = "All in one desktop";
    public static final String searchStart = "//*[@id='global-search-submit']/span";
    public static final String searchExpected = "All-In-One Desktops";
    public static final String searchActual = "//*[@id='Departments'] //a[contains(text(),'All-In-One Desktops')]";

    public static final String newsEventsLink = "//*[@id='content'] //a[.='News & Events']";
    public static final String facebookTextExpected = "//*[@id='seo_h1_tag']/span";
    public static final String facebookTextActual = "//*[@id='u_0_0']/span[1]/a/span";

    public static final String footerWeeklyAd = "//a[@class='i_a hf-footer-link i_c'][normalize-space()='Weekly Ad']";
    public static final String expectedAdLinkText = "Weekly Ad";
    public static final String actualAdLinkText = "breadcrumb-tab";

    public static final String emailSignupBoxID = "hf-email-input";
    public static final String emailSignupText = "testEmail1@walmart.com";
    public static final String SIGN_UP = "//span[normalize-space()='Sign up']";
    public static final String signUpActualEmail= "//*[@id='hf-email-modal-email-id']";

    public static final String digitalMuseumLinkText = "Digital Museum";
    public static final String museumTagName = "h2";
    public static final String expectedMuseumHeader = "Take a journey through Walmart's heritage";

    public static final String clickAppStoreSS = "a[class='app-store-link'] img[class='mobile-app-badge']";
    public static final String expectedAppStoreURL = "https://apps.apple.com/app/id338137227";
    public static final String expectedAppStoreTitle = "Walmart - Shopping & Grocery on the App Store";

    public static final String clickPlayStoreSS = "//a[@class='play-store-link']//img[@class='mobile-app-badge']";
    public static final String expectedPlayStoreURL = "https://play.google.com/store/apps/details?id=com.walmart.android";
    public static final String expectedPlayStoreTitle = "Walmart Shopping & Grocery - Apps on Google Play";

    public static final String clickWalmartPlus ="Walmart+";
    public static final String expectedWPlusURL = "https://www.walmart.com/plus";

    public static final String searchAvailability = "//input[@placeholder='Enter your street address']";
    //public static final String zipcode = "49120";
    public static final String autoSuggestionXP = "//div[@id='-google-places-suggestions-container']";
    public static final String buttonCheckAddress = "//*[@id='eligibility-checker']/div/div/button";

    public static final String productRecall = "Product Recalls";

    public static final String clickAccount = "button[id='hf-account-flyout'] span[class='b_a b_r']";
    public static final String clickAccount2 = "//a[@title='Account']//div[@class='b_a o_a o_ax o_m o_c b_g']";
    public static final String verifyClkAcct = "//p[.=' Looking for your Walmart.com order? ']";

    public static final String trackOrder = "//div[.='Track Orders']";
    public static final String trackHeader = "h1";

    public static final String feedbackFloater = "hf-feedback-bubble-fixed-link";
    public static final String give5Stars = "//button[@value='5']";
    public static final String writeComment = "textarea";
    public static final String submitReviewButton = "hf-feedback-bubble-submit";

    public static final String clickTellUs = "//span[.='Tell us if something is incorrect']";
    public static final String selectIssue = "issueLocation";
    public static final String writeComplaint = "feedback-comments";
    public static final String submitComplaint = "//button[@class='button btn-submit button--primary']";
    public static final String thankyouText = "div.feedback-modal-thank-you:nth-child(1)>p";
    public static final String copyrightActual = "//span[contains(text(),'All Rights Reserved.')]";

    public static final String careersPage = "Careers";
    public static final String searchID = "search";
    public static final String yellowSearchButton = "//button[@aria-label='Search']";
    public static final String getCareerText = "li:nth-child(1) div:nth-child(1) h4:nth-child(1) a:nth-child(1)";


}
