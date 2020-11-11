package giftFinder;

public class GiftFinderElements {

    //navigate to page locators
    public static final String burgerMenu ="#header-Header-sparkButton";//css
    public static final String giftFinderInDep ="//a[@title='Gift Finder']";//xpath
    public static final String textCheckGiftPage = "//div[contains(text(),'Find the perfect')]";//xpath
    //expected text
    public static final String textForGiftPage = "Find the perfect gifts for";

    //select for her/baby/price25 locators
    public static final String giftForWho ="//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]";//xpath
    public static final String selectHer ="option[value='For Her']";//css
    public static final String selectAgeGroup ="//select[@aria-label='What is their age group?']";//xpath
    public static final String selectBaby = "option[value='Baby']";//css
    public static final String selectPriceRange ="select[aria-label='What is your price range?']";//css
    public static final String priceLessThan25 ="option[value='0 - $25']"; //css

    //select birthday for occasion
    public static final String occasionDropArrow = "div[class='FacetBanner-titleWrapper']";//css
    public static final String selectBirthdayOption = "option[value='Birthday']";//xpath
    public static final String birthdayImage = "//img[@alt='Birthday-img']";


    public static final String showAllRadioButton = "label[aria-label='Shipping & Pickup: Show all'] input[type='radio']";//css

    public static final String copyRightDisplay ="span[data-tl-id='footer-GlobalFooterCopyright-text']";//css

    public static final String topArrowButton = "span[class='top']";//css
    public static final String giftFinderAtTop = "//h1[contains(text(),'Gift Finder')]";//xpath
    public static final String feedBackButton ="#hf-feedback-tab-text"; //css
    public static final String stars = "button[value='5']"; //css

    public static final String brandBoxScroll = "div[aria-labelledby='Brand']"; //css
    public static final String theMandalorian = "label[for='The-Mandalorian-499-brand'] span[class='option-label']"; //css


//    public static final String searchBoxDropDown = "search-category-bg"; //id
//    public final static String jewelryCell ="//span[contains(text(),'Jewelry')]"; //xpath
//    public static final String typeAheadJewelery = "typeahead-row-rings-Jewelry";//id
}
