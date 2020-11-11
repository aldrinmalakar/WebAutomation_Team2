package localStore;

import common.WebAPI;
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
        Assert.assertEquals(actual,expected,"Failed: Did not navigate to the correct page.");
    }

    public void makeThisYourStore(){
        navigateToLocalStorePage();
    localStore.click();

    }
    public void validateMakeThisYourStore(){
        String expected = " #2010";
        String actual = assertGetMakeThisYourStore.getText();
        Assert.assertEquals(actual,expected,"Test Failed: Page did not switch to local Store.");

    }

    public void findAnotherStore(){
        findStore.click();
    }
    public void validateFindAnotherStore(){
        String expected = "Nearby Stores";
        String actual = getAnotherStore.getText();
        Assert.assertEquals(actual,expected,"Test Failed: Could not find nearby stores.");

    }

    public void getDirection(){

    }
    public void validateGetDirection(){

    }

    public void callTheStore(){}
    public void validateCallTheStore(){}

    public void headerLocationMap(){}
    public void validateHeaderLocationMap(){}

    public void openHours(){}
    public void validateOpenHours(){}

    public void featureCorona() {
    }
    public void validateFeatureCorona() {
    }

    public void pharmacyDropDown() {
    }
    public void validatePharmacyDropDown() {
    }

    public void searchStore() {
    }
    public void validateSearchStore() {
    }


}
