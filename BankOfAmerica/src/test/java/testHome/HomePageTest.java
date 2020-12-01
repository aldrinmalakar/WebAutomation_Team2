package testHome;

import common.WebAPI;
import home.HomePage;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.awt.*;
import java.util.List;
import static home.HomePageLocators.ByTagNmae;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    //1
    @Test(enabled =true)
    public void BOAOnlineAccount() throws InterruptedException {
        homePage.BOAOnlineAccount();
    }
    //2
    @Test(enabled =true)
    public void BoACreateNewAccount() throws InterruptedException {
        homePage.BoACreateNewAccount();
    }
    //3
    @Test(enabled =true)
    public void BoaHelpBoxVerify() throws InterruptedException {
        homePage.BoaHelpBoxVerify();
    }
    //4
    @Test(enabled =true)
    public void BoaForgotAccountCheck() throws InterruptedException {
        homePage.BoaForgotAccountCheck();
    }
    //5
    @Test(enabled =true)
    public void BoAcreditCards() throws InterruptedException {
        homePage.BoAcreditCards();
    }
    //6
    @Test(enabled =true)
    public void BoaHomeloanscheckout() throws InterruptedException {
        homePage.BoaHomeloanscheckout();
    }
    //7
    @Test(enabled =false)
    public void BoaBonusOffercheck() throws InterruptedException {
        homePage.BoaBonusOffercheck();
    }
    //8
    @Test(enabled = true)
    public void mouseHover() {
        homePage.mouseHoverByXpath("checkAccount");

    }
    //9
    @Test(enabled = true)
    public void BoafindAtmSearch() throws InterruptedException {
        Thread.sleep(5000);
        homePage.BoafindAtmSearch();
    }
    //10
    @Test(enabled =true)
    public void BoaValidatedFilter() throws InterruptedException {
        Thread.sleep(5000);
        homePage.BoaValidatedFilter();
    }
    //11
    @Test(enabled =true)
    public void BoaScheduleAnAppoinmentCheck() throws InterruptedException {
        Thread.sleep(5000);
        homePage.BoaScheduleAnAppoinmentCheck();
    }
    //12
    @Test(enabled =true)
    public void mouseHover1() throws InterruptedException {
        homePage.mouseHoverByXpath("ClicksearchOption");
    }
    //13
    @Test(enabled =false)
    public void BoaVisitBetterMoneyHabitsCheck() throws InterruptedException {
        homePage.BoaVisitBetterMoneyHabitsCheck();
    }
    //14
    @Test(enabled =true)
    public void CheckBoxes() throws InterruptedException {
        homePage.CheckBoxes();
    }
    //15
    @Test(enabled = true)
    public void BoaBusniess$instititutionCheck() throws InterruptedException {
        homePage.BoaBusniess$instititutionCheck();
    }
    //16
    @Test(enabled =true)
    public void BoaBusniess$instititutionClientLoginCheck() throws InterruptedException {
        homePage.BoaBusniess$instititutionClientLoginCheck();
    }
    //17
    @Test(enabled =false)
    public void BoaCashPro() throws InterruptedException {
        homePage.BoaCashPro();
    }
    //18
    @Test(enabled =true)
    public void BoaSerchBox() throws InterruptedException {
        homePage.BoaSerchBox();
    }
    //19
    @Test(enabled =true)
    public void BoaSerchBoxValidated() throws InterruptedException {
        homePage.BoaSerchBoxValidated();
    }
    //20
    @Test(enabled =true)
    public void clearSearchElement() throws InterruptedException {
        homePage.clearSearchElement();
    }
    //21
    @Test(enabled =true)
    public void clickField1() throws InterruptedException {
        homePage.clickField1("SearchhBox");
    }
    @Test(enabled = true)
    public void SeachBoxclenAndSendKey() throws InterruptedException {
        homePage.SeachBoxclenAndSendKey();
    }
    //22
    @Test(enabled =true)
    public void waitTimeUsingFluent() throws InterruptedException {
        homePage.waitTimeUsingFluent("Busniess$instititution");
    }
    //23
    @Test(enabled =true)
    public void BOAALLClick() throws InterruptedException {
        homePage.clickByXpath1("smallBusness");
        homePage.click1("WealthMannagement");
        homePage.click2("Busniess$instititution");
    }
    //24
    @Test(enabled = true)
    public void getLinks() throws InterruptedException {
        homePage.getLinks("ByTagNmae");
    }
    //25
    @Test(enabled = true)
    public void getListOfWebElementsByXpath() throws InterruptedException {
        Thread.sleep(5000);
        homePage.getListOfWebElementsByXpath("clickByarryList");

    }@Test(enabled =true)
    public void  handleIframe () throws InterruptedException {
        Thread.sleep(5000);
        homePage. handleIframe ();
    }@Test(enabled =true)
    public void  rooBotClass() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        homePage. rooBotClass();
    }
@Test(enabled = true)
    public void   newTab() throws InterruptedException, AWTException {
        Thread.sleep(5000);
        homePage. newTab();
    }
}
