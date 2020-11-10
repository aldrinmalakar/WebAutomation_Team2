package giftFinder;

public class GiftFinderElements {

    //navigate to page locators
    public static final String burgerMenu ="#header-Header-sparkButton";//css
    public static final String giftFinderInDep ="//div[contains(text(),'Gift Finder')]";//xpath
    public static final String textCheckGiftPage = "//div[contains(text(),'Find the perfect')]";//xpath
    //expected text
    public static final String textForGiftPage = "Find the perfect gifts for";

    //select for her/baby/price25 locators
    public static final String giftForWho ="//body/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]";//xpath
    public static final String selectHer ="option[value='For Her']";//css
    public static final String selectAgeGroup ="//select[@aria-label='What is their age group?']";//xpath
    public static final String selectBaby = "option[value='Baby']";//css
    public static final String selectPriceRange ="select[aria-label='What is your price range?']";//css
    public final static String priceLessThan25 ="option[value='0 - $25']"; //css

    //select birthday for occasion
    public final static String occasionDropArrow = "div[class='FacetBanner-titleWrapper']";//css
    public final static String selectBirthdayOption = "option[value='Birthday']";//xpath
    public final static String birthdayImage = "div[aria-label='Birthday-img']";


    public final static String showAllRadioButton = "label[aria-label='Shipping & Pickup: Show all'] input[type='radio']";//css
    //public final static String

}
