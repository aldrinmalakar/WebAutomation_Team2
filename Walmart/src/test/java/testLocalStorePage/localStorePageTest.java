package testLocalStorePage;

import common.WebAPI;
import localStore.LocalStorePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class localStorePageTest extends WebAPI {
    LocalStorePage localStorePage;

    @BeforeMethod
    public void getInit() {
        localStorePage = PageFactory.initElements(driver, LocalStorePage.class);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test (enabled = false)
    public void navigateToLocalStorePage() {
        localStorePage.navigateToLocalStorePage();
        localStorePage.validateNavigateToLocalStorePage();
    }

    @Test
    public void makeThisMyStorePage(){
        localStorePage.makeThisYourStore();
        localStorePage.validateMakeThisYourStore();

    }
}
