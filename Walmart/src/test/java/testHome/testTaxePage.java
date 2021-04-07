package testHome;

import common.WebAPI;
import home.HomePage;
import home.taxPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class testTaxePage extends WebAPI {


    // hi there

    taxPage taxpage ;
    @BeforeMethod
    public void getInit(){
        taxpage= PageFactory.initElements(driver, taxPage.class);
    }



    @Test(enabled = false)
    public void validateTaxPageTitle(){
        taxpage.titleValidation();
    }

    @Test(enabled = false)
    public void checkLogoButton(){
    taxpage.logoButton();
    taxpage.validateLogoButton();
    }

    @Test(enabled = false)
    public void testMyLocalStoreButton() throws IOException {
        taxpage.myLocalStoreButton();
        taxpage.validatMyLocalStoreButton();
    }

    @Test(enabled = false)
    public void checkIfCartDisplayed(){
        taxpage.cartButton();
    }

    @Test(enabled = false)
    public void testHelpButton(){
        taxpage.helpButton();
        taxpage.validateHelpButton();
    }

    @Test(enabled = false)//mouse over
    public void checkSignMouseOver() throws InterruptedException {
        taxpage.signMouseOver();
    }

    @Test(enabled = false)
    public void testPickItUpToday(){
        taxpage.helpButton();
        taxpage.validateHelpButton();
    }

    @Test(enabled = false)
    public void testHelpLink() throws InterruptedException {
        taxpage.helpLink();
        Thread.sleep(5000);
        taxpage.validateHelpLink();
    }

    @Test(enabled = false)
    public void TestTaxExemptApplication(){
        taxpage.TaxExemptApplication();
        taxpage.validateTaxExemptApplication();
    }

   @Test(enabled = false)
    public void TestSignWithInvalidPassword() throws InterruptedException {
       taxpage.signWithInvalidPassword();
       taxpage.validateSignWithInvalidPassword();

   }

   @Test(enabled = false)
    public void testTaxExemptHelPage(){
        taxpage.taxExemptHelPage();
        taxpage.validatetaxExemptHelPage();
   }

   @Test(enabled = false)
    public void testTaxExemptDocumentList(){
       taxpage.TaxExemptDocumentList();
       taxpage.validateTaxExemptDocumentList();
   }

   @Test(enabled = false)//frame
    public void testCreditCard(){
       taxpage.creditCard();
       taxpage.validateCreditCard();

   }

   @Test(enabled = false)//getAttribute()
   public void testPickItUpTodayButton() throws InterruptedException {
       taxpage.pickItUpTodayButton();
       taxpage.validatePickItUpTodayButton();

   }

    @Test(enabled = false)// DW
    public void testMouseOverStoreFinder(){
        taxpage.mouseOverStoreFinder();
        taxpage.validateMouseOverStoreFinder();
    }

    @Test(enabled = false)
    public void testTrackOrdersButton() throws InterruptedException {
        taxpage.trackOrdersButton();
        taxpage.validateTrackOrdersButton();

    }

    @Test(enabled = true)
    public void testSearchBox() throws Exception {
        taxpage.SearchBox();
       // taxpage.validateSearchBox();
    }

    @Test(enabled = false)
    public void testReorderItems(){
        taxpage.reorderItems();
        taxpage.validateReorderItems();
    }

    @Test(enabled = false)
    public void testLearnMore(){
        taxpage.LearnMore();
        taxpage.ValidateLearnMore();

    }

    @Test(enabled = false)//dropD
    public void TestAddToCart() throws InterruptedException {
        taxpage.AddToCart();
    }

    @Test(enabled = false)
    public void testWalmartPay(){
        taxpage.WalmartPay();
        taxpage.validateWalmartPay();

    }

    @Test(enabled = false)
    public void testSignUp() throws InterruptedException {
        taxpage.SignUp();
    }

    @Test(enabled = false)
    public void testClothingButton(){
        taxpage.ClothingButton();
        taxpage.ValidateClothingButton();
    }


    @Test(enabled = false)
    public void testSignUpFromClothingPage(){

        taxpage.SignUpFromClothingPage();
    }

    @Test(enabled = false)
    public void testCorporateButton(){
        taxpage.CorporateButton();
        taxpage.ValidateCorporateButton();
    }





}
