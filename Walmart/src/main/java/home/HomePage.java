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


import java.util.List;

import static home.HomePageLocators.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = SearchBarElement)
    public WebElement SearchBox;
    @FindBy(how = How.CSS, using = clickButton)
    public WebElement ClickSearchButton;
    @FindBy(how = How.CSS, using = checkAccount)
    public WebElement walMartAccountClick;
    @FindBy(how = How.XPATH, using = clickSignin)
    public WebElement clickSigninButton;
    @FindBy(how = How.ID, using = sendemail)
    public WebElement enterEmailId;
    @FindBy(how = How.ID, using = sendPassword)
    public WebElement enterPassword;
    @FindBy(how = How.XPATH, using = clickSigninbutton)
    public WebElement SigninButtonclick;
    @FindBy(how = How.XPATH, using = getTextMassage)
    public WebElement getErrorMassage;
    @FindBy(how = How.XPATH, using = forgotAccount)
    public WebElement clickForgotAccount;
    @FindBy(how = How.CSS, using = createAccount)
    public WebElement clickCreateAccount;
    @FindBy(how = How.CSS, using = CheckBurger)
    public WebElement clickBurger;
    @FindBy(how = How.CSS, using = checkHeader)
    public WebElement clickWalmaartSparkHeader;
    @FindBy(how = How.CSS, using = clickrecorditeam)
    public WebElement clickWalmartrecoredIteam;
    @FindBy(how = How.CSS, using = clickDropDown)
    public WebElement clickWalmartDropDown;
    @FindBy(how = How.CSS, using = dropdownBeauti)
    public WebElement clickWalmartDropDownBeauti;
    @FindBy(how = How.XPATH, using = Sendemali)
    public WebElement WalmartSendemali;
    @FindBy(how = How.CSS, using = clickSignUp)
    public WebElement WalmartClickSignUp;
    @FindBy(how = How.XPATH, using = clickproduct)
    public WebElement Walmartclickproduct;
    @FindBy(how = How.XPATH, using = clickqty)
    public WebElement Walmartclickclickqty;
    @FindBy(how = How.XPATH, using = ClickAddToCart)
    public WebElement WalmartclicClickAddToCart;
    @FindBy(how = How.XPATH, using = validedhaircare)
    public WebElement Walmartvalidedhaircare;
    @FindBy(how = How.XPATH, using = validedShampoo)
    public WebElement WalmartvalidedShampoo;
    @FindBy(how = How.XPATH, using = pick$delivery)
    public WebElement Walmartpick$delivery;
    @FindBy(how = How.XPATH, using = pick$deliverySearch)
    public WebElement Walmarpick$deliverySearch;
    @FindBy(how = How.XPATH, using = pick$deliverySearchclick)
    public WebElement Walmarpick$deliverySearchclick;
    @FindBy(how = How.XPATH, using = pick$deliveryadediteams)
    public WebElement Walmarpick$deliveryadediteams;
    @FindBy(how = How.XPATH, using = pick$deliveryadediteamssign)
    public WebElement Walmarpick$deliveryadediteamssign;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccount)
    public WebElement WalmartgetPick$deliverycreateAccount;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountfirstName)
    public WebElement WalmartgetPick$deliverycreateAccountfirstName;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountLastName)
    public WebElement WalmartgetPick$deliverycreateAccountLastName;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountEmail)
    public WebElement WalmartgetPick$deliverycreateAccountEmail;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountpassword)
    public WebElement WalmartgetPick$deliverycreateAccountpassword;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountpasswordShow)
    public WebElement WalmartgetPick$deliverycreateAccountpasswordShow;
    @FindBy(how = How.XPATH, using = getPick$deliverycreateAccountSignin)
    public WebElement WalmartgetPick$deliverycreateAccountSignin;


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
        enterPassword.sendKeys("Ma7402997@@@@@");
        SigninButtonclick.click();
    }
    public void WalmartGetErrorText() throws InterruptedException {
        Thread.sleep(5000);
        walMartAccountClick.click();
        clickSigninButton.click();
        enterEmailId.sendKeys("runall427@gmail.com");
        enterPassword.sendKeys("Ma7402997@@@@@");
        SigninButtonclick.click();
        System.out.println();
        getErrorMassage.getText();
    }
    public void WalmartClickForgotAccount() throws InterruptedException {
        Thread.sleep(5000);
        walMartAccountClick.click();
        clickSigninButton.click();
        enterEmailId.sendKeys("runall427@gmail.com");
        enterPassword.sendKeys("Ma7402997@@@@@");
        SigninButtonclick.click();
        System.out.println();
        getErrorMassage.getText();
        clickForgotAccount.click();
        // clickCreateAccount.click();
    }
    public void WalmartBurgerClick() throws InterruptedException {
        Thread.sleep(5000);
        clickBurger.click();
        clickWalmaartSparkHeader.click();
        clickWalmartrecoredIteam.click();
    }
    public void dropdown() {
        clickWalmartDropDown.click();
        clickWalmartDropDownBeauti.click();
    }
    public void WalmartEmailbox() {
        WalmartSendemali.sendKeys(EmailId);
    }

    public void mouseHoverByXpath(String locator) throws InterruptedException {
        Thread.sleep(5000);
        try {
            WebElement element = walMartAccountClick;
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

    public void clickField1(String locator) {
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

    public void clearSearchElement() {
        SearchBox.sendKeys("haircare");
        SearchBox.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(5000);
            SearchBox.clear();
        } catch (Exception e) {
            System.out.println("Unable to clear Elemnet not found ");
        }
    }

    public void typeByXpath1(String loc, String val) {
        SearchBox.clear();
        SearchBox.sendKeys("giftBox");
    }
    public void AddtoCartProdct() {
        SearchBox.sendKeys("haircare ");
        ClickSearchButton.click();
        Walmartclickproduct.click();
    }
    public void AddtoCartProdct2() {
        SearchBox.sendKeys("haircare ");
        ClickSearchButton.click();
        Walmartclickproduct.click();
        Walmartclickclickqty.click();
        WalmartclicClickAddToCart.click();
    }

    public void validedShampoo() throws InterruptedException {
        SearchBox.sendKeys("Shampoo");
        Thread.sleep(5000);
        ClickSearchButton.click();
        String act = WalmartvalidedShampoo.getText();
        String exp = "Shampoo";
        Assert.assertEquals(act, exp, " failed");
    }

    public void validedHairCare() throws InterruptedException {
        SearchBox.sendKeys("haircare");
        Thread.sleep(5000);
        ClickSearchButton.click();
        String act = Walmartvalidedhaircare.getText();
        String exp = "Hair Care";
        Assert.assertEquals(act, exp, " failed");
    }
    public void WalmartAllClickCheck() {
        ClickSearchButton.click();
        clickWalmaartSparkHeader.click();
    }
    public void WalmartWalmartpick$delivery() throws InterruptedException {
        Walmartpick$delivery.click();
        Thread.sleep(60000);
        Walmarpick$deliverySearch.sendKeys(" grocery");
        Walmarpick$deliverySearchclick.click();
    }
    public void WalmartWalmarpick$deliveryadediteamscheck() throws InterruptedException {
        Walmartpick$delivery.click();
        Thread.sleep(60000);
        Walmarpick$deliverySearch.sendKeys(" grocery");
        Walmarpick$deliverySearchclick.click();
        Walmarpick$deliveryadediteams.click();
        Walmarpick$deliveryadediteamssign.click();
    }
    public void WalmartgetPick$deliverycreateAccountcheck() throws InterruptedException {
        Walmartpick$delivery.click();
        Thread.sleep(5000);
        Walmarpick$deliverySearch.sendKeys(" grocery");
        Walmarpick$deliverySearchclick.click();
        Walmarpick$deliveryadediteams.click();
        Walmarpick$deliveryadediteamssign.click();
        WalmartgetPick$deliverycreateAccount.click();
        WalmartgetPick$deliverycreateAccountfirstName.sendKeys(" runa");
        WalmartgetPick$deliverycreateAccountLastName.sendKeys(" parvin");
        WalmartgetPick$deliverycreateAccountEmail.sendKeys("runa111427@gmail.com");
    }
    public void WalmartgetPick$deliverycreateAccountpasswordcheck() throws InterruptedException {
        Walmartpick$delivery.click();
        Thread.sleep(5000);
        Walmarpick$deliverySearch.sendKeys(" grocery");
        Walmarpick$deliverySearchclick.click();
        Walmarpick$deliveryadediteams.click();
        Walmarpick$deliveryadediteamssign.click();
        WalmartgetPick$deliverycreateAccount.click();
        WalmartgetPick$deliverycreateAccountfirstName.sendKeys(" runa");
        WalmartgetPick$deliverycreateAccountLastName.sendKeys(" parvin");
        WalmartgetPick$deliverycreateAccountEmail.sendKeys("runa111427@gmail.com");
        Thread.sleep(5000);
        WalmartgetPick$deliverycreateAccountpassword.sendKeys("11427");
        Thread.sleep(5000);
        WalmartgetPick$deliverycreateAccountpasswordShow.click();
        Thread.sleep(5000);
        WalmartgetPick$deliverycreateAccountSignin.click();

    }
    public void switchWindow()  {
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"n");
        try{
            Thread.sleep(3000);
            for(String winHandle:driver.getWindowHandles()){
                driver.switchTo().window(winHandle);
            }
            driver.get("https://www.google.com/");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
  public void getAllLink(){
      List<WebElement> links=driver.findElements(By.tagName("a")) ;
      for(WebElement ele:links){
          System.out.println(ele.getAttribute("href"));
      }
  }







}
