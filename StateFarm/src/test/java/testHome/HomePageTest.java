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
    @Test(enabled = true)
    public void stateFarminsurancecheck() throws InterruptedException {
        homePage.stateFarminsurancecheck();
    }
    //2
    @Test(enabled =true)
    public void stateFarmselectProductcheck() throws InterruptedException {
        homePage.stateFarmselectProductcheck();
    }
    //3
    @Test(enabled = true)
    public void stateFarmClickSignIncheck() throws InterruptedException {
        homePage.stateFarmClickSignIncheck();
    }
    //4
    @Test(enabled =true)
    public void stateFarmclickTroubleloggin() throws InterruptedException {
        homePage.stateFarmclickTroubleloggincheck();
    }
    //5
    @Test(enabled =true)
    public void stateFarmclickTroubleloggincheck() throws InterruptedException {
        homePage.stateFarmclickTroubleloggincheck();
    }
    //6
    @Test(enabled =true)
    public void stateFarmclaimsCheck() throws InterruptedException {
        homePage.stateFarmclaimsCheck();
    }
    //7
    @Test(enabled =true)
    public void stateFarmFindAnAgentCheck() throws InterruptedException {
        homePage.stateFarmFindAnAgentCheck();
    }
    //8
    @Test(enabled =true)
    public void stateFarmPayABillCheck() throws InterruptedException {
        homePage.stateFarmPayABillCheck();
    }
    //9
    @Test(enabled =true)
    public void stateFarmsearchButton() throws InterruptedException {
        homePage.stateFarmsearchButtonCheck();
    }
    //10
    @Test(enabled =true)
    public void stateFarmctrackaClaim() throws InterruptedException {
        homePage.stateFarmctrackaClaimCheck();
    }
    //11
    @Test(enabled =true)
    public void stateFarminvestmentCheck() throws InterruptedException {
        homePage.stateFarminvestmentCheck();
    }

    //12
    @Test(enabled =true)
    public void stateFarmstatickDropdownAccount() throws InterruptedException {
        homePage.stateFarmstatickDropdownAccountLogin();
    }
    //13
    @Test(enabled = true)
    public void stateFarmstaticDropDown() throws InterruptedException {
        homePage.stateFarmstaticDropDownSelect();
    }
    //14
    @Test(enabled =true)
    public void stateFarmstaticDropDown1() throws InterruptedException {
        homePage.stateFarmstaticDropDownSelect1();
    }
    //15
    @Test(enabled =true)
    public void stateFarmPayInsuranceBill() throws InterruptedException {
        homePage.stateFarmPayInsuranceBillCheck();
    }
    //17
    @Test(enabled =true)
    public void stateFarmHeaderClamimCheck() throws InterruptedException {
        homePage.stateFarmHeaderClamimCheck();
    }
    //18
    @Test(enabled =true)
    public void stateFarmlearnMoreAboutDrive() throws InterruptedException {
        homePage.stateFarmlearnMoreAboutDriveCheck();
    }
    //19
    @Test(enabled =true)
    public void StateFarmFinByClick() throws InterruptedException {
        homePage.StateFarmFinByClick("stateFarmclickLigin");
    }
    //20
    @Test(enabled =true)
    public void stateFarmFindAndAgent() throws InterruptedException {
        homePage.stateFarmFindAndAgentCheck();
    }
    //21
    @Test(enabled =true)
    public void stateFarmsafeDrivingyoung() throws InterruptedException {
        homePage.stateFarmsafeDrivingyoungCheck();
    }
    //22
    @Test(enabled =true)
    public void payinsurancebill() throws InterruptedException {
        homePage.payinsurancebill();
    }
    //23
    @Test(enabled = true)
    public void insuranceCardcheck() throws InterruptedException {
        homePage.insuranceCardValided();
    }
    //24
    @Test(enabled = true)
    public void steerClear() throws InterruptedException {
        homePage.steerClear();
    }
    //25
    @Test(enabled = true)
    public void statefarmautoDiscoutcheck() throws InterruptedException {
        homePage.statefarmautoDiscoutcheck();
    }
    @Test(enabled = true)
    public void getAllImges(){
        homePage.getAllImges();
    }



}
