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



}
