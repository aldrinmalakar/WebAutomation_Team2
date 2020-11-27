package testCreditCards;

import common.WebAPI;
import creditCards.CreditCardsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreditCardsPageTest extends WebAPI {

    CreditCardsPage creditCardsPage;

    @BeforeMethod
    public void getInit() {
        creditCardsPage = PageFactory.initElements(driver, CreditCardsPage.class);
        creditCardsPage.navigateToCreditCards();
    }

    @Test//1
    public void creditCardNavigation() {
        creditCardsPage.creditCardPageValidation();
    }

    @Test//2
    public void cardsToCompareIsActive() {
        creditCardsPage.compareCards();
        creditCardsPage.elementHasClass(creditCardsPage.firstCardContainer, "active");
        creditCardsPage.elementHasClass(creditCardsPage.secondCardContainer, "active");
    }

    @Test//3
    public void compareCardsPageTitle() {
        creditCardsPage.clickOnCompare();
        creditCardsPage.comparePageValidation();
    }

    @Test//4
    public void thirdCardIsAddedToCompare() {
        creditCardsPage.addOneMoreCard();
        creditCardsPage.classIsNotEmpty(creditCardsPage.thirdContainerCard, "dyn-content");
    }

    @Test//5
    public void noAnnualFeeTest() {
        creditCardsPage.noAnnualFeeSelected();
        creditCardsPage.noAnnualFeeValidation();
    }

    @Test//6
    public void visaRadioButtonTest() {
        creditCardsPage.selectVisaRadioButton();
        creditCardsPage.visaRadioButtonSelected();
    }

    @Test//7
    public void noAnnualFeeResultsT() {
        creditCardsPage.searchFilters();
        creditCardsPage.noAnnualFeeOnPageFound();
    }

    @Test//8
    public void glassSliderClickable() {
        creditCardsPage.calculateRewards();
        creditCardsPage.checkGlassSlider();
    }

    @Test//9
    public void glassSliderToNineHundred() throws InterruptedException {
        creditCardsPage.checkGlassSlider();
        sleepFor(4);
        creditCardsPage.glassSliderNineHundred();
    }

    @Test//10
    public void dragSliderToFiveThousand() {
        creditCardsPage.dragSliderToHighest();
        creditCardsPage.glassSliderOnHighestAmount();
    }

    @Test//11
    public void scrollToFooter() {
        creditCardsPage.scrollDownPage();
        creditCardsPage.scrollDownDisplaysFooter();
    }

    @Test//12
    public void scrollDownToTwitter() {
        creditCardsPage.scrollDownToTwitter();
        creditCardsPage.scrollDownDisplaysTwitter();
    }

    @Test//13
    public void scrollDownToFB() {
        creditCardsPage.scrollDownToFaceBook();
        creditCardsPage.scrollDownDisplaysFaceBook();
    }

    @Test//14
    public void connectToTwitterOfBOA() {
        creditCardsPage.connectToTwitterPage();
        creditCardsPage.acceptTwitterPopup();
    }

    @Test//15
    public void clickAndNavigateToTwitter() {
        creditCardsPage.navigateToTwitter();
        creditCardsPage.navigateToTwitterTitle();
    }

    @Test//16
    public void continueToFBPopUp() {
        creditCardsPage.continueFacebookPopUp();
        creditCardsPage.acceptFacebookPopup();
    }

    @Test//17
    public void navigateToFacebook() {
        creditCardsPage.navigateToFacebook();
        creditCardsPage.navigateToFacebookTitle();
    }

    @Test//18
    public void airlinesPageTest() {
        creditCardsPage.airlinesInFooterClick();
        creditCardsPage.airlinesFooterPageTitle();
    }

    @Test//19
    public void rewardsPageTitleTest() {
        creditCardsPage.pointsRewardFromMenu();
        creditCardsPage.pointsRewardTitle();
    }

    @Test//20
    public void insertValueWithoutSlider() {
        creditCardsPage.typeValueInsteadSlider();
        creditCardsPage.numberBoxValue();
    }

    @Test//21
    public void applicationPageNavigation() {
        creditCardsPage.applyNowClick();
        creditCardsPage.applyNowValidation();
    }

    @Test//22
    public void goToHomePageFooter() {
        creditCardsPage.navigateToHomeFromFooter();
        creditCardsPage.homeFromFooterValidation();
    }

    @Test//23
    public void goToPrivacyPageFooter() {
        creditCardsPage.privacyPageNavigation();
        creditCardsPage.privacyPageValidation();
    }

    @Test//24
    public void goToCareersFromFooter() {
        creditCardsPage.careersPageNavigation();
        creditCardsPage.careersPageValidation();
    }

    @Test//25
    public void goToSiteMapFromFooter() {
        creditCardsPage.siteMapPageNavigation();
        creditCardsPage.sieMapPageValidation();
    }

}
