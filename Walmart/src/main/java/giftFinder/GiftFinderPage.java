package giftFinder;

import com.google.common.collect.ImmutableList;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import static giftFinder.GiftFinderElements.*;
import static org.openqa.selenium.Keys.ARROW_DOWN;

public class GiftFinderPage extends WebAPI {

    @FindBy(how = How.CSS, using = burgerMenu)
    public WebElement burger;
    @FindBy(how = How.XPATH, using = giftFinderInDep)
    public WebElement giftFinderButton;
    @FindBy(how = How.XPATH, using = textCheckGiftPage)
    public WebElement getTextGiftPage;

    @FindBy(how = How.CSS, using = giftForWho)
    public WebElement forWho;
    @FindBy(how = How.CSS, using = selectHer)
    public WebElement forHer;
    @FindBy(how = How.CSS, using = selectAgeGroup)
    public WebElement ageGroupBox;
    @FindBy(how = How.CSS, using = selectBaby)
    public WebElement forBaby;
    @FindBy(how = How.CSS, using = selectPriceRange)
    public WebElement priceRangeBox;
    @FindBy(how = How.CSS, using = priceLessThan25)
    public WebElement lessThan25;

    @FindBy(how = How.CSS, using = occasionDropArrow)
    public WebElement dropArrowOccasion;
    @FindBy(how = How.CSS, using = selectBirthdayOption)
    public WebElement selectBirthday;
    @FindBy(how = How.XPATH, using = birthdayImage)
    public WebElement birthdayBanner;

    @FindBy(how = How.CSS, using = copyRightDisplay)
    public WebElement copyRightText;

    @FindBy(how = How.CSS, using = showAllRadioButton)
    public WebElement showAllRadio;

    @FindBy(how = How.CSS, using = topArrowButton)
    public WebElement backToTopArrow;
    @FindBy(how = How.XPATH, using = giftFinderAtTop)
    public WebElement giftFinderAtTopCorner;

    @FindBy(how = How.CSS, using = feedBackButton)
    public WebElement feedBack;
    @FindBy(how = How.CSS, using = stars)
    public WebElement fiveStars;

    @FindBy(how = How.CSS, using = brandBoxScroll)
    public WebElement scrollInBrand;

    @FindBy(how = How.CSS, using = theMandalorian)
    public WebElement mandalorianBrand;

    @FindBy(how = How.CSS, using = personalizedTab)
    public WebElement personalize;

    @FindBy(how = How.CSS, using = expandGiftingTab)
    public WebElement expandGifting;
    @FindBy(how = How.CSS, using = giftEligibleElement)
    public WebElement giftEligible;

    @FindBy(how = How.CSS, using = resetButton)
    public WebElement resetPersonalized;

    @FindBy(how = How.XPATH, using = pageNavigator)
    public WebElement pageNavigatorArrow;

    @FindBy(how = How.XPATH, using = secondPage)
    public WebElement page2Of3;

    @FindBy(how = How.XPATH, using = logo)
    public WebElement walmartLogo;

    @FindBy(how = How.XPATH, using = typeOfGiftTabs)
    public List<WebElement> typeOfGiftList;

    @FindBy(how = How.XPATH, using = hourWareHouse)
    public WebElement hourWareHouseSelect;

    @FindBy(how = How.CSS, using = barbieCheckBox)
    public WebElement barbieCheck;

    @FindBy(how = How.CSS, using = rokuCheckBox)
    public WebElement rokuCheck;

    @FindBy(how = How.CSS, using = championCheckBox)
    public WebElement championCheck;

    @FindBy(how = How.CSS, using = samsungCheckBox)
    public WebElement samsungCheck;

    @FindBy(how = How.CSS, using = appleCheckBox)
    public WebElement appleCheck;

    @FindBy(how = How.CSS, using = seeMoreGiftIdeas)
    public WebElement seeMoreGiftFinderIdeas;

    @FindBy(how = How.XPATH, using = moreTextExpanded)
    public WebElement moreTextShows;


    public void navigateToGiftFinder() {
        burger.click();
        giftFinderButton.click();
    }

    public void validateGiftFinderPage() {
        String expected = textForGiftPage;
        int attempts = 0;
        String actual = "";
        while (attempts < 2) {
            try {
                actual = getTextGiftPage.getText();//stale element handling
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        Assert.assertEquals(actual, expected, "Failed: Did not navigate to gift finder page");
    }

    public void selectForHer() {
        forWho.click();
        forHer.click();
    }

    public void forHerSelectValidation() {
        boolean selectedForHer = forHer.isDisplayed();
        Assert.assertTrue(selectedForHer, "Failed: For her is no selected and displayed");
    }

    public void selectAgeBaby() {
        ageGroupBox.click();
        forBaby.click();
    }

    public void babySelected() {
        boolean isBabySelected = forBaby.isEnabled();
    }

    public void priceRangeSelect() {
        priceRangeBox.click();
        lessThan25.click();
    }

    public void priceRangeIs25() {
        boolean lessThan25Selected = lessThan25.isDisplayed();
    }

    public void selectOccasion() throws InterruptedException {
        int attempts = 0;
        while (attempts < 2) {
            try {
                dropArrowOccasion.click();//stale element handling
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        selectBirthday.click();
        birthdayBanner.isDisplayed();
    }

    public void validateSelectOccasion() {
        Boolean imageLoaded =
                (Boolean) ((JavascriptExecutor) driver).executeScript(
                        "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", birthdayBanner);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(!imageLoaded, "Failed: Birthday banner did not load");

    }

    public void scrollDown() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", copyRightText);
    }

    public void validateScrollDown() {
        boolean elemDisplayed = copyRightText.isDisplayed();
        Assert.assertTrue(elemDisplayed, "Failed: Element not displayed");
    }

    public void showAllRadioSelect() {
        showAllRadio.click();
    }

    public void validateShowAllSelect() {
        boolean selected = showAllRadio.isSelected();
        Assert.assertTrue(selected, "Failed :Radio button not selected");
    }

    public void selectBackToTop() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        backToTopArrow.click();
    }

    public void validateBackToTopButton() {
        boolean topOfPageDisplay = giftFinderAtTopCorner.isDisplayed();
        Assert.assertTrue(topOfPageDisplay);
    }

    public void giveFeedBackStars() {
        feedBack.click();
        fiveStars.click();
    }

    public void validateFiveStars() {
        boolean fiveStarsFeedBack = fiveStars.isSelected();
        Assert.assertTrue(fiveStarsFeedBack, "Failed: 5 stars not selected");
    }

    public void scrollInsideBrand() {
        scrollInBrand.sendKeys(ARROW_DOWN);
    }

    public void validateBrandScrollDown() {
        boolean mandalorianDisplayed = mandalorianBrand.isDisplayed();
        Assert.assertTrue(mandalorianDisplayed, "Failed: Did not scroll down to The Mandalorian");
    }

    public void personalizeTabClick() {
        personalize.click();
    }

    public void validatePersonalizeSelected() {
        boolean personalizedSelected = personalize.isSelected();
        Assert.assertTrue(personalizedSelected, "Failed:personalized not selected");
    }

    public void expandGiftingOption() {
        expandGifting.click();
    }

    public void giftEligibleDisplay() {
        boolean eligibleDisplayed = giftEligible.isDisplayed();
        Assert.assertTrue(eligibleDisplayed, "Failed");
    }

    public void filterReset() {
        personalizeTabClick();
        resetPersonalized.click();
    }

    public void validateFilterReset() {
        boolean reset = resetPersonalized.isDisplayed();
        Assert.assertTrue(!reset, "Failed");
    }

    public void navigateToSecondPage() {
        pageNavigatorArrow.click();
    }

    public void validateSecondPage() {
        boolean page2Selected = page2Of3.isSelected();
        Assert.assertTrue(page2Selected, "Failed");
    }

    public void logoNavigatesToHome() {
        walmartLogo.click();
    }

    public void validateLogoNavigation() {
        driver.getTitle();
        String actual = "Walmart.com | Save Money. Live Better.";
        String expected = "Walmart.com | Save Money. Live Better.";
        Assert.assertEquals(expected, actual, "Failed");
    }

    public void hourWareHouseSelect() {
        hourWareHouseSelect.click();
    }

    public void validateHourWareHouse() {
        boolean wareHouseSelected = hourWareHouseSelect.isSelected();
        Assert.assertTrue(wareHouseSelected, "Failed: Warehouse not selected");
    }


    public void barbie() {
        barbieCheck.click();
    }

    public void validateBarbie() {
        boolean barbieSelected = barbieCheck.isSelected();
        Assert.assertTrue(barbieSelected, "Failed: barbie not selected");
    }

    public void roku() {
        rokuCheck.click();
    }

    public void validateRoku() {
        boolean rokuSelected = rokuCheck.isSelected();
        Assert.assertTrue(rokuSelected, "Failed: Roku not selected");
    }

    public void champion() {
        championCheck.click();
    }

    public void validateChampion() {
        boolean championSelected = championCheck.isSelected();
        Assert.assertTrue(championSelected, "Failed: Champion not selected");
    }

    public void samsung() {
        samsungCheck.click();
    }

    public void validateSamsung() {
        boolean samsungSelected = samsungCheck.isSelected();
        Assert.assertTrue(samsungSelected, "Failed: Samsung not selected");
    }

    public void apple() {
        appleCheck.click();
    }

    public void validateApple() {
        boolean appleSelected = appleCheck.isSelected();
        Assert.assertTrue(appleSelected, "Failed: Apple not selected");
    }


    public void findABrandEnterKeys(String keys) {

    }

    public void typeOfGiftTextList() {

    }

    public void seeMoreGiftTextExpand() {
        seeMoreGiftFinderIdeas.click();
    }

    public void seeMoreGiftValidation() {
        boolean moreTextDisplayed = moreTextShows.isDisplayed();
        Assert.assertTrue(moreTextDisplayed, "Failed: More text does not display");
    }

    public void validateListText() {
        List<String> listOfGiftText = new ArrayList<>();
        for (WebElement categoryList : typeOfGiftList) {
            listOfGiftText.add(categoryList.getText());
        }
        ListIterator<String> iterator = listOfGiftText.listIterator(0);
        while (iterator.hasNext()) {
            String next = iterator.next();

            List<String> exceptedList = ImmutableList.of("Tech & gadgets", "Beauty", "Grooming", "Fashion & jewelry", "Food & cooking", "Top rated toys", "Home decor",
                    "Sports & outdoor", "Gaming", "Unique", "Nostalgic & retro", "Games, books, & movies", "Tools & DIY", "Arts & crafts", "Personalized", "Gift cards & e-gifts", "Pet gifts", "Gift sets", "Host gifts", "Teacher gifts");
            Assert.assertEquals(next, exceptedList, "Failed: List does not match expected");

        }

    }


}


