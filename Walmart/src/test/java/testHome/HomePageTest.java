package testHome;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static home.HomePageLocators.checkAccount;

public class HomePageTest extends WebAPI {
    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = true)
    public void CheckSearchBar() throws InterruptedException {
        homePage.CheckSearchBar();

    }

    @Test(enabled = false)
    public void ValidedWalmartAccount() throws InterruptedException {
        homePage.ValidedWalmartAccount();

    }

    @Test(enabled = false)

    public void WalmartCheckSigninButton() throws InterruptedException {
        homePage.WalmartCheckSigninButton();

    }

    @Test(enabled = false)

    public void WalmartGetErrorText() throws InterruptedException {
        homePage.WalmartGetErrorText();

    }

    @Test(enabled = false)

    public void WalmartClickForgotAccount() throws InterruptedException {
        homePage.WalmartClickForgotAccount();

    }

    @Test(enabled = false)
    public void WalmartBurgerClick() throws InterruptedException {
        homePage.WalmartBurgerClick();

    }

    @Test(enabled =false)
    public void dropdown() throws InterruptedException {
        homePage.dropdown();

    }

    @Test(enabled = false)
    public void WalmartEmailbox() throws InterruptedException {
        homePage.WalmartEmailbox();

    }
    @Test(enabled = false)
    public void mouseHover() {
        homePage.mouseHoverByXpath("checkAccount") ;

    }

    @Test(enabled = false)
    public void  clickField1() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickField1("clickSigninbutton");

    }

    @Test(enabled = false)
    public void  clearSearchElement() throws InterruptedException {

        homePage.clearSearchElement() ;

    }

    @Test( enabled = false)
    public String getCurrentUrl(){

        String url= driver.getCurrentUrl();
        return url;
    }
    @Test( enabled = false)
  public void  afterclear(){
   homePage.typeByXpath1("SearchBarElement","giftBox ");
  }

    @Test( enabled = false)
    public void AddtoCartProdct(){
        homePage.AddtoCartProdct();
    }

    @Test( enabled = false)
    public void AddtoCartProdct2(){
        homePage.AddtoCartProdct2();
    }


    @Test( enabled = false)
    public void assertEqual(){
        homePage.assertEqual("clickButton","haircare");
    }



    @Test( enabled = false)
    public void assertEqual2(){
        homePage.assertEqual("clickButton","sampoo");
    }



}

