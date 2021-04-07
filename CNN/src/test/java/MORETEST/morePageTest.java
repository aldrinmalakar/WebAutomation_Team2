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

     @Test
    public void testCnnTitleValidation(){
        morepage.cnnTitleValidation();
        }

    @Test
    public void TestOpenMenuButton(){
        morepage.openMenuButton();
        morepage.validationOpenMenuButton();
        }

    @Test
    public void testAccountUser()  {
        morepage.accountUser();
        morepage.validateAccountUser();
        }

     @Test
    public void testLogInWithInvalidPassword(){
        morepage.logInWithInvalidPassword();
        morepage.validateLogInWithInvalidPassword();
    }

    @Test
    public void testisSelectedCheckBox() throws InterruptedException {
        morepage.isSelectedCheckBox();
    }

    @Test
    public void testSearchBox(){
        morepage.SearchBox();
        morepage.ValidateSearchBox();
    }

    @Test
    public void testEditionButton() {
        morepage.EditionButton();
        morepage.validateEditionButton();
    }

    @Test
    public void testCnnLogo(){
        morepage.CnnLogo();
        morepage.validateCnnLogo();
    }

    @Test
    public void testLiveTV(){
        morepage.liveTV();
        morepage.validateLiveTV();
    }

//    @Test(enabled = true)
//    public void testPlayLiveTV() throws InterruptedException {
//        morepage.playLiveTV();
//        morepage.ValidatePlayLiveTV();
//    }



    @Test
    public void testCnnProfiles(){
        morepage.CnnProfiles();
        morepage.validateCnnProfiles();
    }

    @Test
    public void testBackForward() throws InterruptedException {
        morepage.BackForward();
        morepage.validateBackForward();
    }


    @Test
    public void testPhotos(){
        morepage.Photos();
        morepage.validatePhotos();
    }

    @Test
    public void testInvestigations(){
        morepage.Investigations();
        morepage.validateInvestigations();
    }

    @Test
    public void testFindAllLinkText(){
        morepage.findAllLinkText();
    }

    @Test
    public void testFindAllInput(){
        morepage.FindAllInput ();
    }

    @Test
    public void testEspanol() throws InterruptedException {
        morepage.Espanol();
        morepage.validateEspanol();
    }

    @Test
    public void testForgetPassword(){
        morepage.ForgetPassword ();
        morepage.validateForgetPassword();
    }

    @Test
    public void testWorkForCNN() throws InterruptedException {
        morepage.WorkForCNN();
        morepage.validateWorkForCNN();
    }

    @Test//DD
    public void testDropdown() throws InterruptedException {
        morepage.dropdown();
    }

    @Test//DD
    public void testSelectPositionType() throws InterruptedException {
        morepage.SelectPositionType();
    }

    @Test //DD
    public void testStudentsDropdown() throws InterruptedException {
        morepage.CategoryDropdown();
    }

    @Test
    public void testAreaOfInterestDropDown() throws InterruptedException {
        morepage.AreaOfInterestDropDown();
    }






































}
