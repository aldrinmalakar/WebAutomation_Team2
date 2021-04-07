package testBusiness;


import business.businessPage;
import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static business.businessPage.*;
public class testBusinessPage extends WebAPI {
    businessPage business ;
    @BeforeMethod
    public void getInit(){
        business= PageFactory.initElements(driver, businessPage.class);
    }
    @Test(enabled = false)
    public void testValidateBusinessTitle() throws InterruptedException {
        business.validateBusinessTitle();
    }
    @Test
    public void testLoginWithInvalidPassword(){
        business.LoginWithInvalidPassword();
        business.validateLoginWithInvalidPassword();
    }
    @Test
    public void testValidateCheckBox() throws InterruptedException {
        business.validateCheckBox();
    }
    @Test
    public void testNeedHelp(){
        business.needHelp();
        business.validateNeedHelp();
    }
    @Test
    public void testDropdown() throws InterruptedException {
        business.Dropdown();
                    }
    @Test
    public void testRegister(){
        business.register();
        business.validateRegister();

    }
    @Test
    public void testRadioButton() throws InterruptedException {
        business.radioButton();
    }
    @Test
    public void testOpenNewTab() throws InterruptedException {
        business.openNewTab();
        business.ValidateOpenNewTab();
    }
    @Test
    public void TestBrokenLinks(){
        business.BrokenLinks();
    }
    @Test
    public void testContactUs(){
        business.ContactUs();
        business.validateContactUs();
    }
    @Test
    public void validateB2BIDButton(){
        business.B2BIDButton();
        business.validateB2BIDButton();
    }
    @Test
    public void TestBackForward() throws InterruptedException {
        business.BackForward();
        business.ValidateBackForward();
    }
    @Test
    public void TestAdmin(){
        business.Admin();
        business.ValidateAdmin();
    }
    @Test
    public void testRequestSupplement(){
        business.RequestSupplement();
        business.ValidateRequestSupplement();
    }
    @Test//switch to ch
    public void TestIRSNewTab() throws InterruptedException {
        business.IRSNewTab();
        business.validateIRSNewTab();
    }
    @Test
    public void testEFTLink(){
        business.EFTLink();
        business.ValidateEFT();
    }
    @Test
    public void TestLoginIsEnabled(){
        business.LoginIsEnabled();
    }
    @Test
    public void testContact(){
        business.Contact();
        business.ValidateContact();
    }
    @Test
    public void testTermsOfUse(){
        business.TermsOfUse();
       business.validateTermsOfUse();
    }
    @Test
    public void testAutoRepair(){
        business.AutoRepair();
        business.ValidateAutoRepair();
    }
    @Test
    public void testBusinessOwner() throws InterruptedException {

        business.BusinessOwner();
        business.ValidateChildWindow();

    }
    @Test
    public void testMedicalElectronic(){
        business.MedicalElectronic();
        business.ValidateMedicalElectronic();
    }
    @Test
    public void testMedicalEBillingLink(){
        business.MedicalEBillingLink();
        business.validateMedicalEBillingLink();

    }
    @Test
    public void TestGoBackToHome() throws InterruptedException {
        business.GoBackToHome();
    }
    }


































