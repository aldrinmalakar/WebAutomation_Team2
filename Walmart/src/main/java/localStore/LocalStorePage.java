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
        Assert.assertEquals(actual,expected,"Test Failed: Banner not functional.");
    }

    public void pharmacyDropDown() {
        dropdownPharmacy.click();
    }
    @FindBy(how = How.XPATH, using = REFILL_A_PRESCRIPTION)
    public WebElement actualPharmacyText;
    public void validatePharmacyDropDown() {
        String expected = pharmacyChekText;
        String actual = actualPharmacyText.getText();
        Assert.assertEquals(actual,expected,"Test Failed: Pharmacy text not identical.");

    }

    public void searchStore() {
    }

    public void validateSearchStore() {
    }


}
