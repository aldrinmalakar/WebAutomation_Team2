package testHome;

import common.WebAPI;
import localStore.localStorePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class localStorePageTest extends WebAPI {
    localStorePage localStorePage;

    @BeforeMethod
    public void getInit() {
        localStorePage = PageFactory.initElements(driver, localStorePage.class);
    }

    @Test
    public void navigateToLocalStorePage() {
        localStorePage.navigateToLocalStorePage();
        localStorePage.validateNavigateToLocalStorePage();
    }
}
