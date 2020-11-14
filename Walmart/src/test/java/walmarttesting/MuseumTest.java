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

    @Test(priority = 1)
    public void NavigateToMuseum() throws InterruptedException {
        museumBase.museumNavigation();
        Thread.sleep(10000);
        museumBase.validateMuseumNavigation();

    }

    @Test(priority = 2)
    public void navigateToShoppingPage() throws InterruptedException {
        museumBase.museumShopping();
        museumBase.validateMuseumShopping();
    }

    @Test(priority = 3)
    public void NavigateToDeskSupplies() throws InterruptedException {

        museumBase.desksSupplies();
        Thread.sleep(10000);
        museumBase.validateDesksSupplies();
    }

    @Test(priority = 4)
    public void verifySmileProduct() throws InterruptedException {

        museumBase.smileProduct();
        Thread.sleep(10000);
        museumBase.validateSmileProduct();
    }

    @Test(priority = 5)
    public void MasksFromAccessory() throws InterruptedException {

        museumBase.selectMasksFromAccessory();
        Thread.sleep(10000);
        museumBase.ValidateSelectMasksFromAccessory();
    }

    @Test(priority = 6)
    public void selectSecureFitMask() throws InterruptedException {

        museumBase.selectSecurefitMasks();
        Thread.sleep(10000);
        museumBase.validateSelectSecurefitMasks();
    }

    //
    @Test(priority = 7)
    public void VerifyMasksInCart() throws InterruptedException {

        museumBase.verifyMasksInCart();
        Thread.sleep(10000);
        museumBase.validateVerifyMasksInCart();
    }

    @Test(priority = 8)
    public void removeItemsFromCart() throws InterruptedException {

        museumBase.removeItems();
        Thread.sleep(10000);
        museumBase.validateRemoveItems();
    }
}
