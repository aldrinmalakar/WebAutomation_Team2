package walmarttesting;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import walmartmuseum.MuseumBase;


public class MuseumTest extends WebAPI {
   static MuseumBase museumBase;


    @BeforeMethod
    public void getInit() {
        museumBase = PageFactory.initElements(driver, MuseumBase.class);
    }

    @Test(enabled = true)
    public void NavigateToMuseum() throws InterruptedException {
        museumBase.museumNavigation();
        museumBase.validateMuseumNavigation();

    }

    @Test(enabled = true)
    public void navigateToShoppingPage() throws InterruptedException {
        museumBase.museumNavigation();
        museumBase.museumShopping();
        museumBase.validateMuseumShopping();
    }

    @Test(enabled = true)
    public void NavigateToDeskSupplies() throws InterruptedException {
        museumBase.museumShopping();
        museumBase.desksSupplies();
        museumBase.validateDesksSupplies();
    }

    @Test(enabled = false,priority = 4,dependsOnMethods = "NavigateToMuseum")
    public void verifySmileProduct() throws InterruptedException {
        museumBase.smileProduct();
        museumBase.validateSmileProduct();
    }

    @Test(enabled = false,priority = 5,dependsOnMethods = "NavigateToMuseum")
    public void MasksFromAccessory() throws InterruptedException {
        museumBase.selectMasksFromAccessory();
        museumBase.ValidateSelectMasksFromAccessory();
    }

    @Test(enabled = false,priority = 6,dependsOnMethods = "NavigateToMuseum")
    public void selectSecureFitMask() throws InterruptedException {
        museumBase.selectSecurefitMasks();
        museumBase.validateSelectSecurefitMasks();
    }

    @Test(enabled = false,priority = 7,dependsOnMethods = "NavigateToMuseum")
    public void VerifyMasksInCart() throws InterruptedException {
        museumBase.verifyMasksInCart();
        museumBase.validateVerifyMasksInCart();
    }

    @Test(enabled = false,priority = 8,dependsOnMethods = "NavigateToMuseum")
    public void removeItemsFromCart() throws InterruptedException {
        museumBase.removeItems();
        museumBase.validateRemoveItems();

    }
}
