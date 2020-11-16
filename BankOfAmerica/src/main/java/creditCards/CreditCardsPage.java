package creditCards;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static creditCards.CreditCardsPageElements.*;

public class CreditCardsPage extends WebAPI {

    @FindBy(how = How.CSS, using = creditCardsTab)
    public WebElement creditCards;
    @FindBy(how = How.CSS, using = shopAllCreditCardsOnTable)
    public WebElement shopAllCreditCards;
    //
    @FindBy(how = How.XPATH, using = addCompareCashRewardCard)
    public WebElement addCompareCashReward;
    @FindBy(how = How.XPATH, using = addCompareTravelRewardsCard)
    public WebElement addCompareTravelReward;
    @FindBy(how = How.XPATH, using = firstCardContainerForComparison)
    public WebElement firstCardContainer;
    @FindBy(how = How.XPATH, using = secondCardContainerForComparison)
    public WebElement secondCardContainer;
    @FindBy(how = How.XPATH, using = clickCompareButton)
    public WebElement compareButton;

    @FindBy(how = How.CSS, using = addThirdCard)
    public WebElement addThird;
    @FindBy(how = How.CSS, using = cardCategoryDropDown)
    public WebElement cardCategory;
    @FindBy(how = How.CSS, using = allCardsOption)
    public WebElement allCards;
    @FindBy(how = How.CSS, using = chooseCardFunnel)
    public WebElement chooseCard;
    @FindBy(how = How.XPATH, using = usPrideCardOption)
    public WebElement usPrideCard;
    @FindBy(how = How.XPATH, using = compareCardAfterThirdAdded)
    public WebElement compareCardAfterThird;
    @FindBy(how = How.CSS, using = thirdContainerCardPresent)
    public WebElement thirdContainerCard;

    @FindBy(how = How.CSS, using = viewAllCardsTab)
    public WebElement viewAllCards;
    @FindBy(how = How.CSS, using = filterCardsDropDown)
    public WebElement filterCards;
    @FindBy(how = How.XPATH, using = noAnnualFeeCheckBox)
    public WebElement noAnnualFee;

    @FindBy(how = How.XPATH, using = visaRadioButton)
    public WebElement visaRadio;

    @FindBy(how = How.CSS, using = searchCardsAfterFilterOptions)
    public WebElement searchCardsAfterFilter;

    @FindBy(how = How.XPATH, using = checkNoAnnualText)
    public WebElement checkNoAnnualTextOnPage;




//    @FindBy(how = How.CSS, using = thirdContainerCardPresent)
//    public WebElement thirdContainerCard;

    public void searchFilters(){
        noAnnualFeeSelected();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        searchCardsAfterFilter.click();
    }
    public void noAnnualFeeOnPageFound(){
        String actual= checkNoAnnualTextOnPage.getText();
        String expected = noAnnualExpected;
        Assert.assertEquals(actual,expected,"Failed: Text does not say no annual fee");
    }



    public void navigateToCreditCards() {
        creditCards.click();
        shopAllCreditCards.click();
    }

    public void creditCardPageValidation() {
        String actualTitleText = driver.getTitle();
        Assert.assertEquals(actualTitleText, expectedTitleText, "Failed: Title does not match");
    }

    public void compareCards() {
        addCompareCashReward.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(addCompareTravelReward).click().build().perform();
    }

    public boolean elementHasClass(WebElement element, String active) {
        return element.getAttribute("class").contains(active);
    }

    public void clickOnCompare() {
        compareCards();
        Actions actions = new Actions(driver);
        actions.moveToElement(compareButton).click().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void comparePageValidation() {
        String actual = driver.getTitle();
        String expected = comparePageTitle;
        Assert.assertEquals(actual, expected, "Failed: Title does not match");
    }

    public void addOneMoreCard() {
        clickOnCompare();
        addThird.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        Select objSelect = new Select(cardCategory);
        objSelect.selectByValue("allCards");
        allCards.click();
        chooseCard.click();
        usPrideCard.click();
        compareCardAfterThird.click();
    }

    public boolean classIsNotEmpty(WebElement element, String full) {
        return element.getAttribute("class").contains(full);
    }

    public void selectVisaRadioButton(){
        viewAllCards.click();
        filterCards.click();
        Actions act = new Actions(driver);
        act.moveToElement(visaRadio).click().build().perform();
    }
    public void visaRadioButtonSelected(){
        boolean visaIsSelected = visaRadio.isSelected();
        Assert.assertTrue(visaIsSelected,"Failed: Visa radio button not selected");
    }

    public void noAnnualFeeSelected(){
        viewAllCards.click();
        filterCards.click();
        noAnnualFee.click();
    }
    public void noAnnualFeeValidation(){
        boolean noAnnualSelected= noAnnualFee.isSelected();
        Assert.assertTrue(noAnnualSelected,"Failed:No annual fee not selected");
    }





}
