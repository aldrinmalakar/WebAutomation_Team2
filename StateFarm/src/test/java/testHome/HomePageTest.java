package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {


    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    //1
    @Test(enabled = false)
    public void stateFarminsurancecheck() throws InterruptedException {
        homePage.stateFarminsurancecheck();

    }

    //2
    @Test(enabled = false)
    public void stateFarmselectProductcheck() throws InterruptedException {
        homePage.stateFarmselectProductcheck();

    }

    //3
    @Test(enabled = false)
    public void stateFarmClickSignIncheck() throws InterruptedException {
        homePage.stateFarmClickSignIncheck();

    }

    //4
    @Test(enabled = false)
    public void stateFarmclickTroubleloggin() throws InterruptedException {
        homePage.stateFarmclickTroubleloggincheck();

    }

    //5
    @Test(enabled = false)
    public void stateFarmclickTroubleloggincheck() throws InterruptedException {
        homePage.stateFarmclickTroubleloggincheck();

    }

    //6
    @Test(enabled = false)
    public void stateFarmclaimsCheck() throws InterruptedException {
        homePage.stateFarmclaimsCheck();

    }

    //7
    @Test(enabled = false)
    public void stateFarmFindAnAgentCheck() throws InterruptedException {
        homePage.stateFarmFindAnAgentCheck();

    }

    //8
    @Test(enabled = false)
    public void stateFarmPayABillCheck() throws InterruptedException {
        homePage.stateFarmPayABillCheck();

    }

    //9
    @Test(enabled = false)
    public void stateFarmsearchButton() throws InterruptedException {
        homePage.stateFarmsearchButtonCheck();

    }

    //10
    @Test(enabled = false)
    public void stateFarmctrackaClaim() throws InterruptedException {
        homePage.stateFarmctrackaClaimCheck();

    }

    //11
    @Test(enabled = false)
    public void stateFarminvestmentCheck() throws InterruptedException {
        homePage.stateFarminvestmentCheck();

    }

    //12
    @Test(enabled = false)
    public void stateFarmstatickDropdownAccount() throws InterruptedException {
        homePage.stateFarmstatickDropdownAccountLogin();

    }

    //13
    @Test(enabled = false)
    public void stateFarmstaticDropDown() throws InterruptedException {
        homePage.stateFarmstaticDropDownSelect();

    }

    //14
    @Test(enabled = false)
    public void stateFarmstaticDropDown1() throws InterruptedException {
        homePage.stateFarmstaticDropDownSelect1();

    }

    //15
    @Test(enabled = false)
    public void stateFarmPayInsuranceBill() throws InterruptedException {
        homePage.stateFarmPayInsuranceBillCheck();

    }

    //16
    @Test(enabled = false)
    public void stateFarmGopaperless() throws InterruptedException {
        homePage.stateFarmGopaperlessCheck();

    }

    //17
    @Test(enabled = false)
    public void stateFarmHeaderClamimCheck() throws InterruptedException {
        homePage.stateFarmHeaderClamimCheck();

    }

    //18
    @Test(enabled = false)
    public void stateFarmlearnMoreAboutDrive() throws InterruptedException {
        homePage.stateFarmlearnMoreAboutDriveCheck();

    }

    //19
    @Test(enabled = false)
    public void StateFarmFinByClick() throws InterruptedException {
        homePage.StateFarmFinByClick("stateFarmclickLigin");

    }

    //20
    @Test(enabled = false)
    public void stateFarmFindAndAgent() throws InterruptedException {
        homePage.stateFarmFindAndAgentCheck();

    }

    //21
    @Test(enabled = false)
    public void stateFarmsafeDrivingyoung() throws InterruptedException {
        homePage.stateFarmsafeDrivingyoungCheck();

    }

    //22
    @Test(enabled = false)
    public void payinsurancebill() throws InterruptedException {
        homePage.payinsurancebill();

    }

    //23
    @Test(enabled = false)
    public void insuranceCardcheck() throws InterruptedException {

        homePage.insuranceCardValided();

    }

    //24
    @Test(enabled = false)
    public void steerClear() throws InterruptedException {

        homePage.steerClear();

    }

    //25
    @Test(enabled = true)
    public void statefarmautoDiscoutcheck() throws InterruptedException {

        homePage.statefarmautoDiscoutcheck();

    }


//
//    //2
//    @Test(enabled = false)
//    public void ValidedWalmartAccount() throws InterruptedException {
//        homePage.ValidedWalmartAccount();
//
//    }
//
//    //3
//    @Test(enabled = false)
//
//    public void WalmartCheckSigninButton() throws InterruptedException {
//        homePage.WalmartCheckSigninButton();
//
//    }
//
//    //4
//    @Test(enabled = false)
//
//    public void WalmartGetErrorText() throws InterruptedException {
//        homePage.WalmartGetErrorText();
//
//    }
//
//
//
//


}
