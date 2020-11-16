package creditCards;

public class CreditCardsPageElements {

    public static final String creditCardsTab ="a[id='navCreditCards'] span[class='title']";
    public static final String shopAllCreditCardsOnTable ="#btnCompareCreditCards";
    public static final String expectedTitleText = "Credit Cards: Find & Apply for a Credit Card Online at Bank of America";

    public static final String addCompareCashRewardCard = "//input[@id='compare-4047600~5B~en_US']";
    public static final String addCompareTravelRewardsCard= "//label[@for='compare-4043345~37~en_US']";
    public static final String firstCardContainerForComparison ="//li[@data-id='4047603~JS~en_US']";
    public static final String secondCardContainerForComparison="//li[@data-id='4043345~37~en_US']";

    public static final String clickCompareButton ="//a[@id='compare_cards']";
//    public static final String actualCompareText= "//h1[normalize-space()='Compare Credit Cards']";
    public static final String comparePageTitle ="Compare Credit Cards with the Credit Card Comparison Tool";

    public static final String addThirdCard ="#add_card_3";
    public static final String cardCategoryDropDown ="#card-category";
    public static final String allCardsOption ="option[value='allCards']";
    public static final String chooseCardFunnel ="#card-funnel";
    public static final String usPrideCardOption="//option[@value='U.S. Pride<sup>®</sup>']";
    public static final String compareCardAfterThirdAdded="//a[@id='compare-card-large']";
    public static final String thirdContainerCardPresent="th:nth-child(4)";

    public static final String viewAllCardsTab="#all-cards-tab";
    public static final String filterCardsDropDown="#filter-cards";
    public static final String noAnnualFeeCheckBox="//input[@type='checkbox'][@aria-label='No Annual Fee']";
    //public static final String noAnnualFeeCheckBox="//input[@type='checkbox'][@aria-label='No Annual Fee']";

    public static final String visaRadioButton="//input[@type='radio'][@value='visa']";
    public static final String searchCardsAfterFilterOptions="/#searchCards";

    public static final String checkNoAnnualText="div[class='row card-info compare visible'] div[class='small-12 medium-3 columns card-info-left']";
    public static final String noAnnualExpected="\n" + "      No annual fee";

}
