package localStore;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static localStore.localStorePageElements.*;

public class LocalStorePage extends WebAPI {
    @FindBy(how = How.XPATH, using = makeThisYourStore)
    public WebElement localStore;
    @FindBy(how = How.XPATH, using = findAnotherStore)
    public WebElement findStore;
    @FindBy(how = How.CSS, using = getFindAnotherStore)
    public WebElement getAnotherStore;
    @FindBy(how = How.CLASS_NAME, using = getMakeThisYourStore)
    public WebElement assertGetMakeThisYourStore;
    @FindBy(how = How.XPATH, using = findDirection)
    public WebElement direction;
    @FindBy(how = How.CSS, using = getDirectionSearchBox)
    public WebElement googleMaps2;
    @FindBy(how = How.CLASS_NAME, using = homeAddress)
    public WebElement homeStreetAddress;
    @FindBy(how = How.XPATH, using = callTheStore)
    public WebElement storePhone;
    @FindBy(how = How.CSS, using = openHoursBody)
    public WebElement hoursOpen;
    @FindBy(how = How.CSS, using = openHoursHeader)
    public WebElement headerHours;
    @FindBy(how = How.XPATH, using = coronaFeature)
    public WebElement corona;
    @FindBy(how = How.XPATH, using = coronaBannerNext)
    public WebElement clickNext;
    @FindBy(how = How.CSS, using = coronaBannerText)
    public WebElement clickText;
    @FindBy(how = How.XPATH, using = pharmacyDropDown)
    public WebElement dropdownPharmacy;
    @FindBy(how = How.ID, using = publicSearch)
    public WebElement search;
    @FindBy(how = How.XPATH, using = searchStart)
    public WebElement startSearch;
    @FindBy(how = How.XPATH, using = searchActual)
    public WebElement actualResult;
    @FindBy(how = How.XPATH, using = newsEventsLink)
    public WebElement newsElement;
    @FindBy(how = How.XPATH, using = facebookTextExpected)
    public WebElement fbExpected;
    @FindBy(how = How.XPATH, using = facebookTextActual)
    public WebElement fbActual;
    @FindBy(how = How.XPATH, using = REFILL_A_PRESCRIPTION)
    public WebElement actualPharmacyText;
    @FindBy(how = How.XPATH, using = footerWeeklyAd)
    public WebElement weeklyAd;
    @FindBy(how = How.CLASS_NAME, using = actualAdLinkText)
    public WebElement actualAdText;
    @FindBy(how = How.ID, using = emailSignupBoxID)
    public WebElement emailBox;
    @FindBy(how = How.XPATH, using = SIGN_UP)
    public WebElement signUp;
    @FindBy(how = How.XPATH, using = signUpActualEmail)
    public WebElement actualEmail;
    @FindBy (how = How.LINK_TEXT, using = digitalMuseumLinkText)
    public WebElement museumLink;
    @FindBy (how = How.TAG_NAME, using = museumTagName)
    public WebElement museumHeader;

    public void navigateToLocalStorePage() {
        driver.get(localStoreURL);
    }

    public void validateNavigateToLocalStorePage() {
        String expected = currentLocalStoreURL;
        int attempts = 0;
        String actual = "";
        while (attempts < 2) {
            try {
                actual = driver.getCurrentUrl();
                break;
            } catch (Exception e) {
            }
            attempts++;
        }
        Assert.assertEquals(actual, expected, "Failed: Did not navigate to the correct page.");
    }

    public void makeThisYourStore() {
        navigateToLocalStorePage();
        localStore.click();

    }

    public void validateMakeThisYourStore() {
        String expected = " #2010";
        String actual = assertGetMakeThisYourStore.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Page did not switch to local Store.");

    }

    public void findAnotherStore() {
        findStore.click();
    }

    public void validateFindAnotherStore() {
        String expected = "Nearby Stores";
        String actual = getAnotherStore.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Could not find nearby stores.");

    }

    public void getDirection() {
        direction.click();
    }

    public void validateGetDirection() {
        String expected = "Explore " + homeStreetAddress.getText();
        //Switching webDriver to new tab
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String actual = googleMaps2.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Google Maps was unavailable.");
        driver.close();
    }


    public void callTheStore() {
        storePhone.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

    }

    public void validateCallTheStore() {
        String expected = mainStorePhone;
        String actual = storePhone.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Element did not match.");
    }

    public void validateOpenHours() {
        String expected = hoursOpen.getText();
        String actual = headerHours.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Hours open did not Match.");
    }

    public void featureCorona() {
        corona.click();
    }

    public void validateFeatureCorona() {
        String expected = "https://corporate.walmart.com/here-for-you";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected, "Test Failed: Corona feature is not available.");
    }

    public void bannerNext() {

        int attempts = 0;
        while (attempts < 3) {
            try {
                clickNext.click();

            } catch (Exception e) {
            }
            attempts++;
        }

    }

    public void validateBannerText() {
        String expected = coronaBannerExpected;
        String actual = clickText.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Banner not functional.");
    }

    public void pharmacyDropDown() {
        dropdownPharmacy.click();
    }

    public void validatePharmacyDropDown() {
        String expected = pharmacyChekText;
        String actual = actualPharmacyText.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Pharmacy text not identical.");

    }

    public void searchStore() {
        search.sendKeys(searchKey);
        startSearch.click();
    }

    public void validateSearchStore() {
        String expected = searchExpected;
        String actual = actualResult.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Could not locate results.");


    }


    public void newsEvents() {
        newsElement.click();
    }

    public void validateNewsEvents() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String expected = fbExpected.getText();
        String actual = fbActual.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Texts does not match. Bug Found.");

    }


    public void weeklyAdsCheck() {
        weeklyAd.click();
    }

    public void validateWeeklyAdsCheck() {
        String expected = expectedAdLinkText;
        String actual = actualAdText.getText();
        Assert.assertEquals(actual, expected, "Test Failed, Ad not loaded.");
    }

    public void signUpMethod() {
        emailBox.sendKeys(emailSignupText);
        try{signUp.click();}
        catch(Exception e){}

    }

    public void validateSignupMethod() {
        String expected = emailSignupText;
        String actual = actualEmail.getText();
        Assert.assertEquals(actual, expected, "Test Failed: Email does not match as provided.");
    }


    public void digitalMuseumCheck() {
        museumLink.click();

    }
    public void validateDigitalMuseumCheck() {
        String expected = expectedMuseumHeader;
        String actual = museumHeader.getText();
        Assert.assertEquals(actual,expected,"Test Failed: Page does not show expected header.");
    }
}
