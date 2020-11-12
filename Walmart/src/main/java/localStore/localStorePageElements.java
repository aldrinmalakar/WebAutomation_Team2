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




}
