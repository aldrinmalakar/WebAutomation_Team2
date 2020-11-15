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
    public static final String clickScheduleAppt ="a[name='Search Module - Suggestion - schedule an appointment']";
    public static final String expectedScheduleAppt = "Schedule appointment";
    public static final String scheduleApptButton ="Schedule_appointment";
    public static final String expectedHeaderScdlAppt = "Schedule An Appointment";
    public static final String actualHeaderScdlAppt = "skip-to-h1";

    public static final String dropdownMenu = "a[class='menu-button js-menu-button']";
    public static final String expectedDDMenuText = "Auto Loan Basics";
    public static final String actualDDMenuText = "//*[@id='navigation'] //span[.='Auto Loan Basics']";

    public static final String headerContactUs = "header-contact-us";
    public static final String contactUsSearch = "contactUsSelector";
    public static final String contactUsSearchText = "Auto loans";
    public static final String searchGoButton ="selectGoButton";
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

}

