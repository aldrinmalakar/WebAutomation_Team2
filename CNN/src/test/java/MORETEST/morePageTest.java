package MORETEST;

import MOREPAGE.morePage;
import common.WebAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class morePageTest extends WebAPI {
    morePage morepage ;
    @BeforeMethod
    public void getInit(){
        morepage= PageFactory.initElements(driver, morePage.class);
    }

//
//@BeforeMethod
//public void goToMorePage(){
//        driver.get(cnnURL);
//        clickByXpath();
//
//}

     @Test(enabled = false)
    public void testCnnTitleValidation(){
        morepage.cnnTitleValidation();
        }

    @Test(enabled = false)
    public void TestOpenMenuButton(){
        morepage.openMenuButton();
        morepage.validationOpenMenuButton();
        }

    @Test(enabled = false)
    public void testAccountUser()  {
        morepage.accountUser();
        morepage.validateAccountUser();
        }

     @Test(enabled = false )
    public void testLogInWithInvalidPassword(){
        morepage.logInWithInvalidPassword();
        morepage.validateLogInWithInvalidPassword();
    }

    @Test(enabled = false)
    public void testisSelectedCheckBox() throws InterruptedException {
        morepage.isSelectedCheckBox();
    }

    @Test(enabled = false)
    public void testSearchBox(){
        morepage.SearchBox();
        morepage.ValidateSearchBox();
    }

    @Test(enabled = false)
    public void testEditionButton() {
        morepage.EditionButton();
        morepage.validateEditionButton();
    }

    @Test(enabled = false)
    public void testCnnLogo(){
        morepage.CnnLogo();
        morepage.validateCnnLogo();
    }

    @Test(enabled = false)
    public void testLiveTV(){
        morepage.liveTV();
        morepage.validateLiveTV();
    }

//    @Test(enabled = true)
//    public void testPlayLiveTV() throws InterruptedException {
//        morepage.playLiveTV();
//        morepage.ValidatePlayLiveTV();
//    }



    @Test(enabled = false)
    public void testCnnProfiles(){
        morepage.CnnProfiles();
        morepage.validateCnnProfiles();
    }

    @Test(enabled = false)
    public void testBackForward() throws InterruptedException {
        morepage.BackForward();
        morepage.validateBackForward();
    }


    @Test(enabled = false)
    public void testPhotos(){
        morepage.Photos();
        morepage.validatePhotos();
    }

    @Test(enabled = false)
    public void testInvestigations(){
        morepage.Investigations();
        morepage.validateInvestigations();
    }

    @Test(enabled = false)
    public void testFindAllLinkText(){
        morepage.findAllLinkText();
    }

    @Test(enabled = false)
    public void testFindAllInput(){
        morepage.FindAllInput ();
    }

    @Test(enabled = false)
    public void testEspanol() throws InterruptedException {
        morepage.Espanol();
        morepage.validateEspanol();
    }

    @Test(enabled = false)
    public void testForgetPassword(){
        morepage.ForgetPassword ();
        morepage.validateForgetPassword();
    }

    @Test(enabled = false)
    public void testWorkForCNN() throws InterruptedException {
        morepage.WorkForCNN();
        morepage.validateWorkForCNN();
    }

    @Test(enabled = false)//DD
    public void testDropdown() throws InterruptedException {
        morepage.dropdown();
    }

    @Test(enabled = false)//DD
    public void testSelectPositionType() throws InterruptedException {
        morepage.SelectPositionType();
    }

    @Test(enabled = false) //DD
    public void testStudentsDropdown() throws InterruptedException {
        morepage.CategoryDropdown();
    }

    @Test(enabled = false)
    public void testAreaOfInterestDropDown() throws InterruptedException {
        morepage.AreaOfInterestDropDown();
    }






































}
