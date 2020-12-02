package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static home.HomePageLocators.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = insurance)
    public WebElement stateFarminsurance;
    @FindBy(how = How.XPATH, using = health)
    public WebElement stateFarmhealth;
    @FindBy(how = How.XPATH, using = zipcode)
    public WebElement stateFarmzipcode;
    @FindBy(how = How.XPATH, using = selectProduct)
    public WebElement stateFarmselectProduct;
    @FindBy(how = How.ID, using = selectLife)
    public WebElement stateFarmselectLife;
    @FindBy(how = How.XPATH, using = selectstate)
    public WebElement stateFarmselectstate;
    @FindBy(how = How.XPATH, using = ClickSignIn)
    public WebElement stateFarmClickSignIn;
    @FindBy(how = How.XPATH, using = SendUserId)
    public WebElement stateFarmSendUserId;
    @FindBy(how = How.XPATH, using = SendPassWord)
    public WebElement stateFarmSendPassWord;
    @FindBy(how = How.XPATH, using = clickrememberme)
    public WebElement stateFarmclickrememberme;
    @FindBy(how = How.XPATH, using = clickLigin)
    public WebElement stateFarmclickLigin;
    @FindBy(how = How.XPATH, using = clickTroubleloggin)
    public WebElement stateFarmclickTroubleloggin;
    @FindBy(how = How.XPATH, using = clickCreateYourAccount)
    public WebElement stateFarmclickCreateYourAccount;
    @FindBy(how = How.XPATH, using = sendPhoneNumber)
    public WebElement stateFarmsendPhoneNumber;
    @FindBy(how = How.XPATH, using = enterbirthDay)
    public WebElement stateFarmenterbirthDay;
    @FindBy(how = How.XPATH, using = enterEmail)
    public WebElement stateFarmenterEmail;
    @FindBy(how = How.XPATH, using = clickText)
    public WebElement stateFarmclickText;
    @FindBy(how = How.XPATH, using = submit)
    public WebElement stateFarmsubmit;
    @FindBy(how = How.XPATH, using = claims)
    public WebElement stateFarmclaims;
    @FindBy(how = How.XPATH, using = fileClaims)
    public WebElement stateFarmfileClaims;
    @FindBy(how = How.XPATH, using = fileClaimsLife)
    public WebElement stateFarmfileClaimsLife;
    @FindBy(how = How.XPATH, using = FindAnAgent)
    public WebElement stateFarmFindAnAgent;
    @FindBy(how = How.XPATH, using = FindAnAgentZipCode)
    public WebElement stateFarmFindAnAgentZipCode;
    @FindBy(how = How.XPATH, using = FindAnAgentclick)
    public WebElement stateFarmFindAnAgentclick;
    @FindBy(how = How.XPATH, using = FindAnAgentZipCodeSearch)
    public WebElement stateFarmFindAnAgentZipCodeSearch;
    @FindBy(how = How.XPATH, using = FindAnAgentShowall)
    public WebElement stateFarmFindAnAgentShowall;
    @FindBy(how = How.XPATH, using = PayaBill)
    public WebElement stateFarmPayaBill;
    @FindBy(how = How.XPATH, using = PayaBillPhone)
    public WebElement stateFarmPayaBillPhone;
    @FindBy(how = How.XPATH, using = PayaBillPhone2)
    public WebElement stateFarmPayaBillPhone2;
    @FindBy(how = How.XPATH, using = DateOfBirth)
    public WebElement stateFarmDateOfBirth;
    @FindBy(how = How.XPATH, using = PayNow)
    public WebElement stateFarmPayNow;
    @FindBy(how = How.CSS, using = searchButton)
    public WebElement stateFarmsearchButton;
    @FindBy(how = How.XPATH, using = searchButtonclick)
    public WebElement stateFarmsearchButtonclick;
    @FindBy(how = How.XPATH, using = searchButtonshowall)
    public WebElement stateFarmsearchButtonshowall;
    @FindBy(how = How.LINK_TEXT, using = trackaClaim)
    public WebElement stateFarmctrackaClaim;
    @FindBy(how = How.LINK_TEXT, using = trackaClaimcreateAnAccount)
    public WebElement stateFarmtrackaClaimcreateAnAccount;
    @FindBy(how = How.CSS, using = trackaClaimFirstNmae)
    public WebElement stateFarmtrackaClaimFirstNmae;
    @FindBy(how = How.XPATH, using = trackaClaimLasttNmae)
    public WebElement stateFarmtrackaClaimLasttNmae;
    @FindBy(how = How.LINK_TEXT, using = trackaClaimForgotAnAccount)
    public WebElement stateFarmtrackaClaimForgotAnAccount;
    @FindBy(how = How.XPATH, using = investment)
    public WebElement stateFarminvestment;
    @FindBy(how = How.ID, using = investmentmutualFunds)
    public WebElement stateFarminvestmentmutualFunds;
    @FindBy(how = How.ID, using = statcidropDown)
    public WebElement stateFarmstatcidropDown;
    @FindBy(how = How.ID, using = staticDropDown)
    public WebElement stateFarmstaticDropDown;
    @FindBy(how = How.ID, using = staticDropDown1)
    public WebElement stateFarmstaticDropDown1;
    @FindBy(how = How.ID, using = staticDropDownZipCode)
    public WebElement stateFarmstaticDropDownZipCode;
    @FindBy(how = How.LINK_TEXT, using = PayInsuranceBill)
    public WebElement stateFarmPayInsuranceBill;
    @FindBy(how = How.ID, using = PayInsuranceBillPhoneNum)
    public WebElement stateFarmPayInsuranceBillPhoneNum;
    @FindBy(how = How.ID, using = PayInsuranceBillPhoneNum1)
    public WebElement stateFarmPayInsuranceBillPhoneNum1;
    @FindBy(how = How.ID, using = DateOfBirth1)
    public WebElement stateFarmDateOfBirth1;
    @FindBy(how = How.ID, using = clickContinue)
    public WebElement stateFarmclickContinue;
    @FindBy(how = How.LINK_TEXT, using = Gopaperless)
    public WebElement stateFarmGopaperless;
    @FindBy(how = How.ID, using = Gopaperlesspnonenum)
    public WebElement stateFarmGopaperlesspnonenum;
    @FindBy(how = How.ID, using = GopaperlessDateofbirth)
    public WebElement stateFarmGopaperlessDateofbirth;
    @FindBy(how = How.LINK_TEXT, using = GopaperlessCancle)
    public WebElement stateFarmGopaperlessCancle;
    @FindBy(how = How.XPATH, using = headerClaims)
    public WebElement stateFarmheaderClaims;
    @FindBy(how = How.LINK_TEXT, using = stateFfarmClaims)
    public WebElement stateFarmstateFfarmClaims;
    @FindBy(how = How.XPATH, using = stateFfarmClaimsCarAccident)
    public WebElement stateFarmstateFfarmClaimsCarAccident;
    @FindBy(how = How.LINK_TEXT, using = learnMoreAboutDrive)
    public WebElement stateFarmlearnMoreAboutDrive;
    @FindBy(how = How.XPATH, using = learnMoreAboutDriveGooglePlay)
    public WebElement stateFarmlearnMoreAboutDriveGooglePlay;
    @FindBy(how = How.XPATH, using = findAndagent)
    public WebElement stateFarmfindAndagent;
    @FindBy(how = How.ID, using = findAndagentZipCode)
    public WebElement stateFarmfindAndagentZipCode;
    @FindBy(how = How.ID, using = findAndagentZipCodeClick)
    public WebElement stateFarmfindAndagentZipCodeClick;
    @FindBy(how = How.ID, using = AdvanceSearchOption)
    public WebElement stateFarmAdvanceSearchOption;
    @FindBy(how = How.LINK_TEXT, using = safeDrivingyong)
    public WebElement stateFarmsafeDrivingyong;
    @FindBy(how = How.XPATH, using = discount)
    public WebElement stateFarmdiscount;
    @FindBy(how = How.ID, using = State)
    public WebElement stateFarmState;
    @FindBy(how = How.XPATH, using = clickGo)
    public WebElement statefarmclickGo;
    @FindBy(how = How.XPATH, using = payInsuranceBill)
    public WebElement statefarmpayInsuranceBill;
    @FindBy(how = How.ID, using = payInsuranceBillPhone)
    public WebElement statefarmpayInsuranceBillPhone;
    @FindBy(how = How.ID, using = payInsuranceBillPhone1)
    public WebElement statefarmpayInsuranceBillPhone1;
    @FindBy(how = How.ID, using = dateOfBirth)
    public WebElement statefarmdateOfBirth;
    @FindBy(how = How.LINK_TEXT, using = insuranceCard)
    public WebElement statefarminsuranceCard;
    @FindBy(how = How.LINK_TEXT, using = steerClear)
    public WebElement statefarmsteerClear;
    @FindBy(how = How.XPATH, using = steerClearvalided)
    public WebElement statefarmsteerClearvalided;
    @FindBy(how = How.LINK_TEXT, using = autoDiscout)
    public WebElement statefarmautoDiscout;


    public void stateFarminsurancecheck() throws InterruptedException {
        stateFarminsurance.click();
        stateFarmhealth.click();
        stateFarmzipcode.sendKeys("11427");
    }

    public void stateFarmselectProductcheck() throws InterruptedException {
        stateFarmzipcode.sendKeys("11427");
        //stateFarmselectProduct.click();
        Thread.sleep(5000);
//        stateFarmselectLife.click();
//        stateFarmselectstate.click();
//        //stateFarmclickslectedstate.click();
    }

    public void stateFarmClickSignIncheck() throws InterruptedException {
        stateFarmClickSignIn.click();
        stateFarmSendUserId.sendKeys("124354367");
        stateFarmSendPassWord.sendKeys("ma7402997");
        stateFarmclickrememberme.click();
        stateFarmclickLigin.click();
    }

    public void stateFarmclickTroubleloggin() throws InterruptedException {
        stateFarmClickSignIn.click();
        stateFarmSendUserId.sendKeys("124354367");
        stateFarmSendPassWord.sendKeys("ma7402997");
        stateFarmclickrememberme.click();
    }

    public void stateFarmclickTroubleloggincheck() throws InterruptedException {
        stateFarmClickSignIn.click();
        stateFarmclickTroubleloggin.click();
        stateFarmsendPhoneNumber.sendKeys("32433564758");
        Thread.sleep(5000);
        stateFarmenterbirthDay.sendKeys("10-21-1996");
        stateFarmenterEmail.sendKeys(" runa45787");
    }

    public void stateFarmclaimsCheck() throws InterruptedException {
        stateFarmclaims.click();
        stateFarmfileClaims.click();
        stateFarmfileClaimsLife.click();
    }

    public void stateFarmFindAnAgentCheck() throws InterruptedException {
        stateFarmFindAnAgent.click();
        stateFarmFindAnAgentZipCode.sendKeys("11427");
        stateFarmFindAnAgentclick.click();
        stateFarmFindAnAgentZipCodeSearch.click();
    }

    public void stateFarmPayABillCheck() throws InterruptedException {
        stateFarmPayaBill.click();
        Thread.sleep(5000);
        stateFarmPayaBillPhone.sendKeys("1142734567");
        Thread.sleep(5000);
        stateFarmPayaBillPhone2.sendKeys(" 3456475869");
        Thread.sleep(5000);
        stateFarmDateOfBirth.sendKeys(" 10-21-1996");
        Thread.sleep(5000);
        stateFarmPayNow.click();
    }

    public void stateFarmsearchButtonCheck() throws InterruptedException {
        Thread.sleep(5000);
        stateFarmsearchButton.sendKeys("lifeInsurance");
        Thread.sleep(5000);
        stateFarmsearchButtonclick.click();
        Thread.sleep(5000);
        stateFarmsearchButtonshowall.click();
    }

    public void stateFarmctrackaClaimCheck() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        stateFarmctrackaClaim.click();
    }
    public void stateFarminvestmentCheck() throws InterruptedException {
        stateFarminvestment.click();
        Thread.sleep(5000);
        stateFarminvestmentmutualFunds.click();
    }

    public void stateFarmstatickDropdownAccountLogin() throws InterruptedException {
        stateFarminvestment.click();
        Thread.sleep(5000);
        stateFarminvestmentmutualFunds.click();
        Select se = new Select(stateFarmstatcidropDown);
        se.selectByValue("State Farm 529 Savings Plan");
    }

    public void stateFarmstaticDropDownSelect() {
        Select a = new Select(stateFarmstaticDropDown);
        a.selectByIndex(7);
        a.selectByVisibleText("Life");
        a.selectByIndex(2);
        a.selectByIndex(3);
        a.selectByIndex(4);
    }

    public void stateFarmstaticDropDownSelect1() throws InterruptedException {
        Select a = new Select(stateFarmstaticDropDown);
        a.selectByVisibleText("Life");
        Thread.sleep(5000);
        Select r = new Select(stateFarmstaticDropDown1);
        Thread.sleep(5000);
        r.selectByIndex(1);
        r.selectByIndex(4);
        r.selectByVisibleText("GA");
    }

    public void stateFarmPayInsuranceBillCheck() throws InterruptedException {
        stateFarmPayInsuranceBill.click();
        Thread.sleep(5000);
        Select se = new Select(stateFarmPayInsuranceBillPhoneNum);
        se.selectByIndex(0);
        Thread.sleep(7000);
        stateFarmPayInsuranceBillPhoneNum1.sendKeys("5e67890-");
        Thread.sleep(6000);
        stateFarmDateOfBirth1.sendKeys(" 10-21-1996");
        stateFarmclickContinue.click();
    }

    public void stateFarmGopaperlessCheck() throws InterruptedException {
        stateFarmGopaperless.click();
//        stateFarmGopaperlesspnonenum.sendKeys("345678");
//        Thread.sleep(6000);
//        stateFarmGopaperlessDateofbirth.sendKeys("10-21-1996");
//        stateFarmGopaperlessCancle.click();
    }

    public void stateFarmHeaderClamimCheck() throws InterruptedException {
        Thread.sleep(5000);
        stateFarmheaderClaims.click();
        Thread.sleep(5000);
        stateFarmstateFfarmClaims.click();
    }

    public void stateFarmlearnMoreAboutDriveCheck() throws InterruptedException {
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    }

    public void StateFarmFinByClick(String locator) {
        try {
            stateFarmclickLigin.click();
        } catch (Exception ex) {
            try {
                stateFarmsearchButtonclick.sendKeys("hlep");
            } catch (Exception ex1) {
                try {
                    stateFarminvestmentmutualFunds.click();
                } catch (Exception ex2) {
                    try {
                        stateFarmfileClaims.click();
                    } catch (Exception ex3) {
                        try {
                            stateFarmheaderClaims.click();
                        } catch (Exception ex4) {

                        }
                    }
                }
            }
        }
    }

    public void stateFarmFindAndAgentCheck() throws InterruptedException {
        stateFarmfindAndagent.click();
          }
    public void stateFarmsafeDrivingyoungCheck() throws InterruptedException {
        stateFarmsafeDrivingyong.click();
    }
    public void payinsurancebill() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        statefarmpayInsuranceBill.click();
        Thread.sleep(5000);
        statefarmpayInsuranceBillPhone.sendKeys("3456789");
        Thread.sleep(5000);
        statefarmpayInsuranceBillPhone1.sendKeys("34567890");
        statefarmdateOfBirth.sendKeys("21-10-1996");
    }

    public void insuranceCardValided() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        statefarminsuranceCard.click();
        Thread.sleep(5000);
        String expectedResult = "Get insurance ID card | Auto | State Farm Insurance®";
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, expectedResult, "Failed not match");
    }

    public void steerClear() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        statefarmsteerClear.click();
        String expectedResult = "Steer Clear®\n" +
                "Safe Driver Discount";
        String actualResult = statefarmsteerClearvalided.getText();
        Assert.assertEquals(expectedResult, actualResult, "Falied not match");
    }

    public void statefarmautoDiscoutcheck() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        statefarmautoDiscout.click();
        String expectedResult = "Auto Insurance Discounts - State Farm®";
        String actualResult = driver.getTitle();
        Assert.assertEquals(expectedResult, actualResult, "Falied not match");
    }

    public void getAllImges() {
        List<WebElement> listimages = driver.findElements(By.tagName("img"));
        System.out.println("number of images" + listimages.size());
        for (int m = 0; m < listimages.size(); m++) {
            if (!(listimages.get(m).getAttribute("src").equals(" ")) && !(listimages.get(m).getAttribute("src") == null)) {
                System.out.println(listimages.get(m).getAttribute("src"));
            }
        }
    }
}
