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
    public void CheckSearchBar() throws InterruptedException {
        homePage.CheckSearchBar();

    }

    //2
    @Test(enabled = false)
    public void ValidedWalmartAccount() throws InterruptedException {
        homePage.ValidedWalmartAccount();

    }

    //3
    @Test(enabled = false)

    public void WalmartCheckSigninButton() throws InterruptedException {
        homePage.WalmartCheckSigninButton();

    }

    //4
    @Test(enabled = false)

    public void WalmartGetErrorText() throws InterruptedException {
        homePage.WalmartGetErrorText();

    }

    //5
    @Test(enabled = false)

    public void WalmartClickForgotAccount() throws InterruptedException {
        homePage.WalmartClickForgotAccount();

    }

    //6
    @Test(enabled = false)
    public void WalmartBurgerClick() throws InterruptedException {
        homePage.WalmartBurgerClick();

    }

    //7
    @Test(enabled = false)
    public void dropdown() throws InterruptedException {
        homePage.dropdown();

    }

    //8
    @Test(enabled = false)
    public void WalmartEmailbox() throws InterruptedException {
        homePage.WalmartEmailbox();

    }

    //9
    @Test(enabled = false)
    public void mouseHover() {
        homePage.mouseHoverByXpath("checkAccount");

    }

    //10
    @Test(enabled = false)
    public void clickField1() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickField1("clickSigninbutton");

    }

    //11
    @Test(enabled = false)
    public void clearSearchElement() throws InterruptedException {

        homePage.clearSearchElement();

    }

    //12
    @Test(enabled = false)
    public String getCurrentUrl() {

        String url = driver.getCurrentUrl();
        return url;
    }

    //13
    @Test(enabled = false)
    public void afterclear() {
        homePage.typeByXpath1("SearchBarElement", "giftBox ");
    }

    //14
    @Test(enabled = false)
    public void AddtoCartProdct() {
        homePage.AddtoCartProdct();
    }

    //15
    @Test(enabled = false)
    public void AddtoCartProdct2() {
        homePage.AddtoCartProdct2();
    }

    //16
    @Test(enabled = false)
    public void validedShampoo() throws InterruptedException {
        homePage.validedShampoo();
    }

    //17
    @Test(enabled = false)
    public void validedHairCare() throws InterruptedException {
        homePage.validedHairCare();

    }

    //18
    @Test(enabled = false)
    public void WalmartAllClickCheck() throws InterruptedException {
        homePage.WalmartAllClickCheck();
    }

    //19
    @Test(enabled = false)
    public void WalmartWalmartpick$delivery() throws InterruptedException {
        homePage.WalmartWalmartpick$delivery();
    }

    //20
    @Test(enabled = false)
    public void WalmartWalmarpick$deliveryadediteamscheck() throws InterruptedException {
        homePage.WalmartWalmarpick$deliveryadediteamscheck();
    }

    //21
    @Test(enabled = false)
    public void WalmartgetPick$deliverycreateAccountcheck() throws InterruptedException {
        homePage.WalmartgetPick$deliverycreateAccountcheck();
    }

    //22
    @Test(enabled = true)
    public void WalmartgetPick$deliverycreateAccountpasswordcheck() throws InterruptedException {
        homePage.WalmartgetPick$deliverycreateAccountpasswordcheck();
    }


}



