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

    @Test
    public void NavigateToMuseum() throws InterruptedException {
        museumBase.validateMuseumNavigation();
    }

    @Test
    public void navigateToShoppingPage() throws InterruptedException {
        museumBase.EspañolLanguageFunction();
        museumBase.validateEspañolLanguageFunction();
    }

    @Test
    public void EnglishLanguageFunction() throws InterruptedException {
        museumBase.backToEnglishLanguageFunction();
        museumBase.validateBackToEnglishLanguageFunction();
    }

    @Test(enabled = false)
    public void timeLineFunction() throws InterruptedException {
        museumBase.timeLineFunctionElements();
        museumBase.validateTimeLineFunction();
    }

    @Test
    public void shopPageFunction() throws InterruptedException {
        museumBase.shopPageFunctionElements();
        museumBase.validateShopPageFunction();
    }

    @Test
    public void visitFunctionPage() throws InterruptedException {
        museumBase.visitFunctionPageElements();
        museumBase.validateVisitFunctionPage();
    }

    @Test
    public void eventsFunctionPage() throws InterruptedException {
        museumBase.eventsFunctionPageElements();
        museumBase.validateEventsFunctionPage();
    }

    @Test
    public void NorthMainFunctionPage() throws InterruptedException {
        museumBase.NorthMainFunctionPageElements();
        museumBase.validateNorthMainFunctionPage();
    }

    @Test
    public void searchFunctionalities() throws InterruptedException {
        museumBase.searchFunctionalitiesElements();
        museumBase.validateSearchFunctionalities();
    }

    @Test
    public void invalidSearchFunctionalities() throws InterruptedException {
        museumBase.searchInvalidElements();
        museumBase.validateSearchInvalidElements();
    }

    @Test
    public void ScrollToExploreFunctions() throws InterruptedException {
        museumBase.ScrollToExploreFunction();
        museumBase.validateSearchInvalidElements();
    }

    @Test
    public void reserveATourVisit() throws InterruptedException {
        museumBase.reserveATourVisitElements();
        museumBase.validateReserveATourVisitElements();
    }

    @Test
    public void subscribeMuseum() throws InterruptedException {
        museumBase.subscribeMuseumElements();
        museumBase.validateSubscribeMuseumElements();
    }

    @Test
    public void scheduleAdmission() throws InterruptedException {
        museumBase.scheduleAdmissionElements();
        museumBase.validateScheduleAdmissionElements();
    }

    @Test
    public void DesksSupplies() throws InterruptedException {
        museumBase.DesksSuppliesElements();
        museumBase.validateDesksSuppliesElements();
    }

    @Test
    public void selectSmileItem() throws InterruptedException {
        museumBase.smileItemElements();
        museumBase.validateSmileItemElements();
    }

    @Test
    public void MasksFromAccessory() throws InterruptedException {
        museumBase.selectMasksFromAccessory();
        museumBase.validateMasksFromAccessory();
    }

    @Test
    public void MasksItem() throws InterruptedException {
        museumBase.SelectMasksItemsElements();
        museumBase.validateSelectMasksItems();
    }

    @Test
    public void removeItemsFromCart() throws InterruptedException {
        museumBase.removeItemsElements();
        museumBase.validateRemoveItems();
    }

    @Test
    public void sparkShopScrollingFunction() throws InterruptedException {
        museumBase.sparkShopElements();
        museumBase.validateSparkShopElements();
    }

    @Test
    public void scrollingUpAndDown() throws InterruptedException {
        museumBase.scrollingUpAndDownElements();
        museumBase.validateScrollingUpAndDown();
    }

    @Test
    public void sparkShop() throws InterruptedException {
        museumBase.sparkShopElements();
        museumBase.validateSparkShopElements();
    }
}
