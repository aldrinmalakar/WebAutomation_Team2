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
    @Test(enabled =true)
    public void CheckSearchBar() throws InterruptedException {
        homePage.CheckSearchBar();
    }
    //2
    @Test(enabled =true)
    public void ValidedWalmartAccount() throws InterruptedException {
        homePage.ValidedWalmartAccount();
    }
    //3
    @Test(enabled =true)
    public void WalmartCheckSigninButton() throws InterruptedException {
        homePage.WalmartCheckSigninButton();
    }
    //4
    @Test(enabled = true)
    public void WalmartGetErrorText() throws InterruptedException {
        homePage.WalmartGetErrorText();
    }
    //5
    @Test(enabled =true)
    public void WalmartClickForgotAccount() throws InterruptedException {
        homePage.WalmartClickForgotAccount();
    }
    //6
    @Test(enabled = true)
    public void WalmartBurgerClick() throws InterruptedException {
        homePage.WalmartBurgerClick();
    }
    //7
    @Test(enabled =true)
    public void dropdown() throws InterruptedException {
        homePage.dropdown();
    }
    //8
    @Test(enabled = true)
    public void WalmartEmailbox() throws InterruptedException {
        homePage.WalmartEmailbox();
    }
    //9
    @Test(enabled = true)
    public void mouseHover() throws InterruptedException {
        homePage.mouseHoverByXpath("checkAccount");
    }
    //10
    @Test(enabled = true)
    public void clickField1() throws InterruptedException {
        Thread.sleep(90000);
        homePage.clickField1("clickSigninbutton");
    }
    //11
    @Test(enabled =true)
    public void clearSearchElement() throws InterruptedException {
        homePage.clearSearchElement();
    }
    //12
    @Test(enabled =true)
    public String getCurrentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }
    //13
    @Test(enabled =true)

    public void afterclear() throws InterruptedException {
        Thread.sleep(9000);
        homePage.typeByXpath1("SearchBarElement", "giftBox ");
    }
    //14
    @Test(enabled =true)
    public void AddtoCartProdct() {
        homePage.AddtoCartProdct();
    }
    //15
    @Test(enabled =true)
    public void AddtoCartProdct2() throws InterruptedException {
        Thread.sleep(9000);
        homePage.AddtoCartProdct2();
    }
    //16
    @Test(enabled = true)
    public void validedShampoo() throws InterruptedException {
        Thread.sleep(50000);
        homePage.validedShampoo();
    }
    //17
    @Test(enabled =true)
    public void validedHairCare() throws InterruptedException {
        homePage.validedHairCare();
    }
    //18
    @Test(enabled =true)
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
    @Test(enabled = false)
    public void WalmartgetPick$deliverycreateAccountpasswordcheck() throws InterruptedException {
        homePage.WalmartgetPick$deliverycreateAccountpasswordcheck();
    }
    @Test(enabled = false)
    public void switchWindow() {
        homePage.switchWindow();
    }
    @Test(enabled = true)
    public void getAllLink() {
        homePage.getAllLink();
    }


}



