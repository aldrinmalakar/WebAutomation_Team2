package testCreditCards;

import common.WebAPI;
import creditCards.CreditCardsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreditCardsPageTest extends WebAPI {

    CreditCardsPage creditCardsPage;

    @BeforeMethod
    public void getInit(){
        creditCardsPage = PageFactory.initElements(driver,CreditCardsPage.class);
        creditCardsPage.navigateToCreditCards();
    }

    @Test
    public void creditCardNavigation(){
        creditCardsPage.creditCardPageValidation();
    }
    @Test
    public void cardsToCompareIsActive(){
        creditCardsPage.compareCards();
        creditCardsPage.elementHasClass(creditCardsPage.firstCardContainer,"active");
        creditCardsPage.elementHasClass(creditCardsPage.secondCardContainer,"active");
    }
    @Test
    public void compareCardsPageTitle(){
        creditCardsPage.clickOnCompare();
        creditCardsPage.comparePageValidation();
    }
    @Test
    public void thirdCardIsAddedToCompare(){
        creditCardsPage.addOneMoreCard();
        creditCardsPage.classIsNotEmpty(creditCardsPage.thirdContainerCard,"dyn-content");
    }
    @Test
    public void noAnnualFeeTest(){
        creditCardsPage.noAnnualFeeSelected();
        creditCardsPage.noAnnualFeeValidation();
    }
    @Test
    public void visaRadioButtonTest(){
        creditCardsPage.selectVisaRadioButton();
        creditCardsPage.visaRadioButtonSelected();
    }
    @Test
    public void noAnnualFeeResultsT(){
        creditCardsPage.searchFilters();
        creditCardsPage.noAnnualFeeOnPageFound();
    }

}
