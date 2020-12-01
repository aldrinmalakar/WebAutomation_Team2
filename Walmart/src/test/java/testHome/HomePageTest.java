package testHome;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.*;
import walmartHome.HomePage;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit(){homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test (enabled = false)
    public void testSearchBox() throws InterruptedException {
        homePage.searchBox();
        homePage.validateSearchBox();
    }
    @Test(enabled = true)
    public void testCreateAccount() throws InterruptedException {
        homePage.createAccountWithValidCredential();
        homePage.validateAccountWithValidCredential();


    }
    @Test(enabled = false)
    public void testSingIn() throws InterruptedException {
        homePage.singInWithValidCredential();
        homePage.validateSingInCredential();
    }

    @Test(enabled = false)
    public void testForgetPassword() throws InterruptedException {
        homePage.forgetPasswordWithValidCredential();
        homePage.validateForgetPasswordCredential();
    }
    @Test(enabled = false)
    public void testShopBySelectPrice() throws InterruptedException {
        homePage.shopByPriceWithValidCredential();
        homePage.ValidateShopByPriceCredential();
    }

    @Test(enabled = false)
    public void testReturnItem() throws InterruptedException {
        homePage.returnItemWithValidCredential();
        homePage.validateReturnItemCredential();
    }

    @Test(enabled = false)
    public void testSearchCo_Manager() throws InterruptedException {
        homePage.searchCoManagerWithValidCredential();
        homePage.validateSearchCoManagerCredential();
    }

    @Test(enabled = false)
    public void testAccounting() throws InterruptedException {
        homePage.accountingWithValidCredential();
        homePage.validateAccountingCredential();
    }

    @Test(enabled = false)
    public void testOptical() throws InterruptedException {
        homePage.opticalWithValidCredential();
        homePage.validateOpticalCredential();
    }

    @Test(enabled = false)
    public void testInformationTechnology() throws InterruptedException {
        homePage.technology1WithValidCredential();
        homePage.validateTechnology1Credential();
    }

    @Test(enabled = false)
    public void testSoftwareDevelopmentAndEngineering() throws InterruptedException {
        homePage.technology2WithValidCredential();
        homePage.validateTechnology2Credential();
    }
    @Test(enabled = false)
    public void testSoftwareDevelopmentAndEngineering1() throws InterruptedException {
        homePage.technology3WithValidCredential();
        homePage.validateTechnology3Credential();
    }
    @Test(enabled = false)
    public void testSearchXobConsoles() throws InterruptedException {
        homePage.searchXobConsolesWithCredential();
        homePage.validateSearchXobConsolesCredential();
    }

    @Test(enabled=false)
    public void testPrintPhoto() throws InterruptedException {
        homePage.walmartPhotoWithCredential();
        homePage.validateWalmartPhotoCredential();
    }

    @Test(enabled = false)
    public void testFindLocalStore() throws InterruptedException {
        homePage.findLocalStoreWithCredential();
        homePage.validateFindLocalStoreCredential();
    }
    @Test(enabled = false)
    public void testBlackFridayDeals() throws InterruptedException {
        homePage.blackFridayDealsWithCredential();
        homePage.validateBlackFridayCredential();
    }

    @Test(enabled = false)
    public void testBeauty() throws InterruptedException {
        homePage.beautyWithCredential();
        homePage.validateBeautyCredential();
    }
    @Test(enabled = false)
    public void testHomeImprovement() throws InterruptedException {
        homePage.homeImprovementWithCredential();
        homePage.validateHomeImprovementCredential();
    }
    @Test(enabled = false)
    public void testBay(){
        homePage.babyWithCredential();
        homePage.validateBabyCredential();
    }
    @Test(enabled = false)
    public void testGifts(){
        homePage.giftsWithCredential();
        homePage.validateGiftsCredential();
    }


}
