package home;


import common.WebAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import static home.HomePageLocators.*;


public class HomePage extends WebAPI {
@FindBy( how = How.XPATH,using =SearchBarElement)public WebElement SearchBox;
@FindBy(how =How.CSS,using=clickButton)public WebElement ClickSearchButton;
@FindBy(how=How.CSS,using =checkAccount )public WebElement walMartAccountClick;

@FindBy(how=How.XPATH,using =clickSignin )public WebElement clickSigninButton;

@FindBy(how=How.ID,using =sendemail )public WebElement enterEmailId;
  @FindBy(how=How.ID,using =sendPassword )public WebElement enterPassword;
  @FindBy(how=How.XPATH,using =clickSigninbutton)public WebElement SigninButtonclick;
 @FindBy(how=How.XPATH,using =getTextMassage )public WebElement getErrorMassage;
 @FindBy(how=How.XPATH,using =forgotAccount)public WebElement clickForgotAccount;
  @FindBy(how=How.CSS,using =createAccount)public WebElement clickCreateAccount;
 @FindBy(how=How.CSS,using =CheckBurger)public WebElement clickBurger;
  @FindBy(how=How.CSS,using =checkHeader )public WebElement clickWalmaartSparkHeader;
 @FindBy(how=How.CSS,using =clickrecorditeam )public WebElement clickWalmartrecoredIteam;
    @FindBy(how=How.CSS,using =clickDropDown)public WebElement clickWalmartDropDown;
    @FindBy(how=How.CSS,using =dropdownBeauti)public WebElement clickWalmartDropDownBeauti;
    @FindBy(how=How.XPATH,using =Sendemali)public WebElement WalmartSendemali;
    @FindBy(how=How.CSS,using =clickSignUp)public WebElement WalmartClickSignUp;
    @FindBy(how=How.XPATH,using =clickproduct)public WebElement Walmartclickproduct;
 @FindBy(how=How.XPATH,using =clickqty)public WebElement Walmartclickclickqty;
 @FindBy(how=How.XPATH,using =ClickAddToCart)public WebElement WalmartclicClickAddToCart;


    public void CheckSearchBar() throws InterruptedException {
    SearchBox.sendKeys("haircare");
    Thread.sleep(5000);
    ClickSearchButton.click();




  }

public void ValidedWalmartAccount() throws InterruptedException {
  Thread.sleep(5000);
  walMartAccountClick.click();
  clickSigninButton.click();
}

public void WalmartCheckSigninButton() throws InterruptedException {
  Thread.sleep(5000);
  walMartAccountClick.click();
  clickSigninButton.click();
  enterEmailId.sendKeys("runall427@gmail.com");
  enterPassword .sendKeys("Ma7402997@@@@@");
  SigninButtonclick.click();
}

  public void WalmartGetErrorText() throws InterruptedException {
    Thread.sleep(5000);
    walMartAccountClick.click();
    clickSigninButton.click();
    enterEmailId.sendKeys("runall427@gmail.com");
    enterPassword .sendKeys("Ma7402997@@@@@");
    SigninButtonclick.click();
   System.out.println(); getErrorMassage.getText();

     }
  public void WalmartClickForgotAccount() throws InterruptedException {
    Thread.sleep(5000);
    walMartAccountClick.click();
    clickSigninButton.click();
    enterEmailId.sendKeys("runall427@gmail.com");
    enterPassword .sendKeys("Ma7402997@@@@@");

    SigninButtonclick.click();
    System.out.println(); getErrorMassage.getText();
    clickForgotAccount.click();
   // clickCreateAccount.click();
  }
public void WalmartBurgerClick() throws InterruptedException {
  Thread.sleep(5000);
  clickBurger.click();
  clickWalmaartSparkHeader.click();
  clickWalmartrecoredIteam.click();
}
public void dropdown(){
    clickWalmartDropDown.click();
    clickWalmartDropDownBeauti.click();
}

    public void WalmartEmailbox(){
        WalmartSendemali.sendKeys( EmailId);

    }
    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element =walMartAccountClick;
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
           action.click().build().perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }

    }

        public void clickField1(String locator){
            try {
                ClickSearchButton.click();
            } catch (Exception ex) {
                try {
                    walMartAccountClick.click();
                } catch (Exception ex1) {
                    try {
                        clickSigninButton.click();
                    } catch (Exception ex2) {
                        try {
                            clickWalmartDropDown.click();
                        } catch (Exception ex3) {

                        }
                    }
                }
            }
        }


public void clearSearchElement(){
    SearchBox.sendKeys("haircare");
    SearchBox.sendKeys(Keys.RETURN);
    try{
        Thread.sleep(5000);
        SearchBox.clear();


    } catch (Exception e){
        System.out.println("Unable to clear Elemnet not found ");
    }
}

    public void typeByXpath1(String loc, String val){
        SearchBox.clear();
        SearchBox.sendKeys("giftBox");
    }
public void AddtoCartProdct(){
    SearchBox.sendKeys("haircare ");
    ClickSearchButton.click();
    Walmartclickproduct.click();

}
    public void AddtoCartProdct2(){
        SearchBox.sendKeys("haircare ");
        ClickSearchButton.click();
        Walmartclickproduct.click();
        Walmartclickclickqty.click();
        WalmartclicClickAddToCart.click();
    }
    public void assertEqual (String loc, String expValue){
        String act = ClickSearchButton.getText();
        // act is coming from Domain -- the one developer build and release
        String exp =" haircare";
        Assert.assertEquals(act, exp," failed");
    }
    public void assertEqual2 (String loc, String expValue){
        String act = ClickSearchButton.getText();
        // act is coming from Domain -- the one developer build and release
        String exp =" sampoo";
        Assert.assertEquals(act, exp," failed");
    }


}
