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

}
