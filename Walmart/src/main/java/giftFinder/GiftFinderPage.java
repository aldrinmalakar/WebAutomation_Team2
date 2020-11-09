package giftFinder;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static giftFinder.GiftFinderElements.*;

public class GiftFinderPage extends WebAPI {

    @FindBy (how = How.CSS, using = burgerMenu)
    public WebElement burger;
    @FindBy (how = How.CSS, using = giftFinderInDep)
    public WebElement giftFinderButton;
    @FindBy (how = How.CSS, using = textCheckGiftPage)
    public WebElement getTextGiftPage;

    @FindBy (how = How.CSS, using = giftForWho)
    public WebElement forWho;
    @FindBy (how = How.CSS, using = selectHer)
    public WebElement forHer;
    @FindBy (how = How.CSS, using = selectAgeGroup)
    public WebElement ageGroupBox;
    @FindBy (how = How.CSS, using = selectBaby)
    public WebElement forBaby;
    @FindBy (how = How.CSS, using = selectPriceRange)
    public WebElement priceRangeBox;
    @FindBy (how = How.CSS, using = priceLessThan25)
    public WebElement lessThan25;

    @FindBy (how = How.CSS, using = occasionDropArrow)
    public WebElement dropArrowOccasion;
    @FindBy (how = How.CSS, using = selectBirthdayOption)
    public WebElement selectBirthday;
    @FindBy (how = How.CSS, using = birthdayImage)
    public WebElement birthdayBanner;


    public void navigateToGiftFinder(){
        burger.click();
        giftFinderButton.click();
    }
    public void validateGiftFinderPage(){
        String expected = textForGiftPage;
        String actual = getTextGiftPage.getText();
        Assert.assertEquals(actual, expected, "Failed: Did not navigate to gift finder page");
    }

    public void selectOccasion(){
        navigateToGiftFinder();
        dropArrowOccasion.click();
        selectBirthday.click();
    }
    public void validateSelectOccasion(){
        Boolean imageLoaded =
                (Boolean) ((JavascriptExecutor)driver).executeScript(
                        "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",birthdayBanner);
        Assert.assertTrue(imageLoaded,"Failed: Birthday banner did not load");

    }
}
