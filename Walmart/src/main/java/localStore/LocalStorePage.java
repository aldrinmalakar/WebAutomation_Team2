package localStore;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static localStore.localStorePageElements.*;

public class LocalStorePage extends WebAPI {
    @FindBy(how = How.CSS, using = makeThisYourStore)
    public WebElement localStore;
    @FindBy(how = How.XPATH, using = findAnotherStore)
    public WebElement findStore;
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
    localStore.click();

    }
    public void validateMakeThisYourStore(){
        assertGetMakeThisYourStore.getText();

    }
}
