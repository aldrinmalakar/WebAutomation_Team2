package home;

import common.WebAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static home.HomePageLocators.*;
import static home.HomePageLocators.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = OnlineId)
    public WebElement OnlineIdClick;
    @FindBy(how = How.XPATH, using = Passcode)
    public WebElement clickPasscode;
    @FindBy(how = How.XPATH, using = clickSignIn)
    public WebElement clickSignInButton;

    @FindBy(how = How.XPATH, using = OpenAnAccount)
    public WebElement clickOpenAnAccount;
    @FindBy(how = How.XPATH, using = GetStarted)
    public WebElement clickGetStarted;
    @FindBy(how = How.XPATH, using = OpenNow)
    public WebElement clickOpenNow;
    @FindBy(how = How.XPATH, using = clickHelpBox)
    public WebElement BoaclickHelpBox;
    @FindBy(how = How.XPATH, using = ClicksearchOption)
    public WebElement BoaClicksearchOption;
    @FindBy(how = How.XPATH, using = ForgotAccount)
    public WebElement BoaForgotAccount;
    @FindBy(how = How.XPATH, using = ForgotaccountId)
    public WebElement SendForgotaccountId;
    @FindBy(how = How.CSS, using = ForgotaccountSoc)
    public WebElement SendForgotaccountSoc;
    @FindBy(how = How.XPATH, using = continueclick)
    public WebElement ForGotAccountcontinueclick;
    @FindBy(how = How.XPATH, using = creditCard)
    public WebElement BoAcreditCard;
    @FindBy(how = How.XPATH, using = CashRewards)
    public WebElement BoACashRewards;
    @FindBy(how = How.XPATH, using = ScheduleabAppointment)
    public WebElement BoaScheduleabAppointment;
    @FindBy(how = How.XPATH, using = OpenNewAccount)
    public WebElement BoaOpenNewAccount;
    @FindBy(how = How.XPATH, using = Homeloans)
    public WebElement BoaHomeloans;
    @FindBy(how = How.XPATH, using = mortgage)
    public WebElement Boamortgage;
    @FindBy(how = How.XPATH, using = Purchaseprice)
    public WebElement BoaPurchaseprice;
    @FindBy(how = How.CSS, using = yearFixed)
    public WebElement BoayearFixed;
    @FindBy(how = How.LINK_TEXT, using = BonusOffer)
    public WebElement BoaBonusOffer;
    @FindBy(how = How.CSS, using = FirstName)
    public WebElement BoaFirstName;
    @FindBy(how = How.XPATH, using = MiddleName)
    public WebElement BoaMiddleName;
    @FindBy(how = How.XPATH, using = lastName)
    public WebElement BoalastName;
    @FindBy(how = How.LINK_TEXT, using = findAtm)
    public WebElement BoafindAtm;
    @FindBy(how = How.XPATH, using = enterAddress)
    public WebElement BoaenterAddress;
    @FindBy(how = How.ID, using = clickSeaarchAddress)
    public WebElement BoaclickSeaarchAddress;
    @FindBy(how = How.XPATH, using = clickFilter)
    public WebElement BoaclickFilter;
    @FindBy(how = How.XPATH, using = selectDriveThru)
    public WebElement BoaselectDriveThru;
    @FindBy(how = How.XPATH, using = applyfilters)
    public WebElement Boaapplyfilters;
    @FindBy(how = How.XPATH, using = ScheduleAnAppoinment)
    public WebElement BoaScheduleAnAppoinment;
    @FindBy(how = How.XPATH, using = CheckingAndSaving)
    public WebElement BoaCheckingAndSaving;
    @FindBy(how = How.XPATH, using = OpenanewAccount)
    public WebElement BoaOpenanewAccount;
    @FindBy(how = How.XPATH, using = OpenanewAccountNext)
    public WebElement BoaOpenanewAccountNext;
    @FindBy(how = How.XPATH, using = VisitBetterMoneyHabits)
    public WebElement BoaVisitBetterMoneyHabits;
    @FindBy(how = How.XPATH, using = VisitCredit)
    public WebElement BoaVisitCredit;
    @FindBy(how = How.XPATH, using = CreditScore)
    public WebElement BoaCreditScore;
    @FindBy(how = How.CSS, using = Checkboxes)
    public WebElement BoaCheckboxes;
    @FindBy(how = How.XPATH, using = Busniess$instititution)
    public WebElement BoaBusniess$instititution;
    @FindBy(how = How.XPATH, using = ClickshareIn)
    public WebElement BoaClickshareIn;
    @FindBy(how = How.XPATH, using = clickIn)
    public WebElement BoaclickIn;
    @FindBy(how = How.XPATH, using = clientLogin)
    public WebElement BoaclientLogin;
    @FindBy(how = How.XPATH, using = CashPro$)
    public WebElement BoaCashPro$;
    @FindBy(how = How.XPATH, using = CompaynId)
    public WebElement BoaCompaynId;
    @FindBy(how = How.XPATH, using = SearchhBox)
    public WebElement BoaSearchhBox;
    @FindBy(how = How.XPATH, using = SearchhBoxClick)
    public WebElement BoaSearchhBoxClick;
    @FindBy(how = How.XPATH, using = Cread$blances)
    public WebElement BoaCread$blances;
    @FindBy(how = How.XPATH, using = money$management)
    public WebElement Boamoney$management;
    @FindBy(how = How.XPATH, using = smallBusness)
    public WebElement BoasmallBusness;
    @FindBy(how = How.XPATH, using = WealthMannagement)
    public WebElement BoaWealthMannagement;
    @FindBy(how = How.CSS, using = Security)
    public WebElement BoaSecurity;
    @FindBy(how = How.XPATH, using = clickBusness)
    public WebElement BoaclickBusness;
    @FindBy(how = How.XPATH, using = ByTagNmae)
    public WebElement BoaByTagNmae;
    @FindBy(how = How.XPATH, using = clickByarryList)
    public WebElement BoaclickByarryList;


    public void BOAOnlineAccount() throws InterruptedException {
        OnlineIdClick.sendKeys("1245647");
        Thread.sleep(5000);
        clickPasscode.sendKeys("323456");
        clickSignInButton.click();
    }
    public void BoACreateNewAccount() {
        clickOpenAnAccount.click();
        clickGetStarted.click();
        clickOpenNow.click();
    }
    public void BoaHelpBoxVerify() throws InterruptedException {
        Thread.sleep(5000);
        BoaclickHelpBox.sendKeys("Search My Account");
        BoaClicksearchOption.click();
    }
    public void BoaForgotAccountCheck() throws InterruptedException {
        Thread.sleep(5000);
        BoaForgotAccount.click();
        Thread.sleep(5000);
        SendForgotaccountId.sendKeys("2234");
        Thread.sleep(5000);
        SendForgotaccountSoc.sendKeys("################");
        Thread.sleep(5000);
        ForGotAccountcontinueclick.click();
    }
    public void BoAcreditCards() throws InterruptedException {
        BoAcreditCard.click();
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript(" scroll(0,1200)");
        BoACashRewards.click();
        BoaScheduleabAppointment.click();
        //BoaOpenNewAccount.click();
    }
    public void BoaHomeloanscheckout() throws InterruptedException {
        BoaHomeloans.click();
        Boamortgage.click();
        Thread.sleep(5000);
        BoaPurchaseprice.sendKeys("234567");
        Thread.sleep(5000);
        BoayearFixed.click();
    }
    public void BoaBonusOffercheck() {
        BoaBonusOffer.click();
        BoaFirstName.sendKeys("RunaParvin");
        BoaMiddleName.sendKeys(" 3456789");
        BoalastName.sendKeys("345678");
    }
    public void BoafindAtmSearch() {
        BoafindAtm.click();
        BoaenterAddress.sendKeys("11427");
        BoaclickSeaarchAddress.click();
    }
    public void BoaValidatedFilter() throws InterruptedException {
        BoafindAtm.click();
        BoaenterAddress.sendKeys("11427");
        BoaclickSeaarchAddress.click();
        Thread.sleep(5000);
        BoaclickFilter.click();
        Thread.sleep(5000);
        BoaselectDriveThru.click();
        Boaapplyfilters.click();
    }
    public void BoaScheduleAnAppoinmentCheck() throws InterruptedException {
        BoaScheduleAnAppoinment.click();
        Thread.sleep(5000);
        BoaCheckingAndSaving.click();
        Thread.sleep(5000);
        BoaOpenanewAccount.click();
        Thread.sleep(5000);
        BoaOpenanewAccountNext.click();
    }
    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = BoaClicksearchOption;
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
    public void BoaVisitBetterMoneyHabitsCheck() {
        BoaVisitBetterMoneyHabits.click();
        BoaclientLogin.click();
        BoaCreditScore.click();
    }
    public void CheckBoxes() throws InterruptedException {
        BoaScheduleAnAppoinment.click();
        BoaCheckingAndSaving.click();
        System.out.println((BoaCheckboxes.isSelected()));
        driver.findElements(By.cssSelector("label[class='btnLongDescription']")).size();
        System.out.println((BoaCheckboxes.isSelected()));
    }
    public void BoaBusniess$instititutionCheck() {
        BoaBusniess$instititution.click();
        BoaClickshareIn.click();
        BoaclickIn.click();
    }
    public void BoaBusniess$instititutionClientLoginCheck() throws InterruptedException {
        BoaBusniess$instititution.click();
        BoaclientLogin.click();
        Thread.sleep(5000);
        BoaCashPro$.click();
    }
    public void BoaCashPro() throws InterruptedException {
        BoaBusniess$instititution.click();
        BoaclientLogin.click();
        Thread.sleep(5000);
        BoaCashPro$.click();
        BoaCompaynId.sendKeys("1234");
    }
    public void BoaSerchBox() throws InterruptedException {
        BoaBusniess$instititution.click();
        Thread.sleep(5000);
        BoaSearchhBox.sendKeys("credit balance");
        BoaSearchhBoxClick.click();
    }
    public void BoaSerchBoxValidated() throws InterruptedException {
        BoaBusniess$instititution.click();
        Thread.sleep(5000);
        BoaSearchhBox.sendKeys("credit balance");
        BoaSearchhBoxClick.click();
        String exp = BoaCread$blances.getText();
        String act = "credit+balance";
        Assert.assertEquals(act, exp, "Test Failed");
    }
    public void clearSearchElement() {
        BoaBusniess$instititution.click();
        BoaSearchhBox.sendKeys("credit+balance");
        BoaSearchhBox.sendKeys(Keys.RETURN);
        try {
            BoaSearchhBox.clear();
        } catch (Exception e) {
            System.out.println("Unable to clear Elemnet not found ");
        }
    }
    public void clickField1(String locator) {
        BoaBusniess$instititution.click();
        try {
            BoaSearchhBox.sendKeys("credit balances");
            BoaSearchhBox.clear();
        } catch (Exception ex) {
            try {
                BoaSearchhBox.sendKeys("credit card");
                BoaSearchhBox.clear();
            } catch (Exception ex1) {
                try {
                    BoaSearchhBox.sendKeys("money management");
                    BoaSearchhBox.clear();
                } catch (Exception ex2) {
                    try {
                        BoaSearchhBox.sendKeys("debit cards");
                        BoaSearchhBox.clear();
                    } catch (Exception ex3) {

                    }
                }
            }
        }
    }
    public void SeachBoxclenAndSendKey() throws InterruptedException {
        BoaBusniess$instititution.click();
        Thread.sleep(5000);
        BoaSearchhBox.sendKeys("credit balances");
        BoaSearchhBox.clear();
        Thread.sleep(5000);
        BoaSearchhBox.sendKeys("money management");
        BoaSearchhBox.clear();
        Thread.sleep(5000);
        BoaSearchhBox.sendKeys("Debit Card");
        BoaSearchhBoxClick.click();
    }
    public void waitTimeUsingFluent(String locator) {
        OnlineIdClick.click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Time out after 30 seconds")
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {

                WebElement XpathElement = OnlineIdClick;
                if (XpathElement.isEnabled()) {
                    System.out.println(" Element Found");
                }
                return XpathElement;
            }
        });
        element.click();
    }
    public void clickByXpath1(String loc) {
        BoasmallBusness.click();
    }

    public void click1(String loc) {
        BoaWealthMannagement.click();
    }

    public void click2(String loc) {
        try {
            BoaBusniess$instititution.click();
        } catch (Exception e) {

        }
        try {
            BoaSecurity.click();
        } catch (Exception e) {
        }
    }

    public void getLinks(String locator) {
        BoaByTagNmae.getText();
    }
    public List<WebElement> getListOfWebElementsByXpath(String locator) {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(clickByarryList));
        return list;
    }
    public void handleIframe() throws InterruptedException {
        //https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Runa");
        driver.switchTo().parentFrame();
        Thread.sleep(5000);
    }
    public void rooBotClass() throws AWTException, InterruptedException {
        BoAcreditCard.click();
        Robot r = new Robot();
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(4000);
        System.out.println("a");
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(5000);
        System.out.println("b");
        r.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(5000);
        System.out.println("c");
        r.mouseMove(30, 100);
        System.out.println("d");
    }
    public void newTab() {
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
        driver.get("https://www.bcbs.com/");
    }


}










