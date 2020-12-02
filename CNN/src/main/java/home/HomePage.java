package home;

import common.WebAPI;
import database.ConnectToSqlDB;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utilities.WriteExcelFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import static home.HomePageLocators.Cnn;
import static home.HomePageLocators.*;


public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = entertainment)
    public WebElement cnnentertainment;
    @FindBy(how = How.XPATH, using = searchButton)
    public WebElement cnnSearchButton;
    @FindBy(how = How.ID, using = searchKey)
    public WebElement cnnSearchKey;
    @FindBy(how = How.XPATH, using = clickSraechButton)
    public WebElement cnnClickSraechButton;
    @FindBy(how = How.XPATH, using = edition)
    public WebElement cnnEdition;
    @FindBy(how = How.XPATH, using = editionUs)
    public WebElement cnneditionUs;
    @FindBy(how = How.XPATH, using = signin)
    public WebElement Cnnsignin;
    @FindBy(how = How.NAME, using = EmailAddress)
    public WebElement CNnEmailAddress;
    @FindBy(how = How.NAME, using = passsword)
    public WebElement CNnpasssword;
    @FindBy(how = How.NAME, using = world)
    public WebElement cnnworld;
    @FindBy(how = How.NAME, using = australia)
    public WebElement cnnAustralia;
    @FindBy(how = How.CSS, using = dropdownBox)
    public WebElement cnndropdownBox;
    @FindBy(how = How.NAME, using = crimeJustic)
    public WebElement cnnCrimeJustic;
    @FindBy(how = How.NAME, using = politics)
    public WebElement cnnpolitics;
    @FindBy(how = How.XPATH, using = election)
    public WebElement cnnelection;
    @FindBy(how = How.NAME, using = style)
    public WebElement cnnstyle;
    @FindBy(how = How.NAME, using = health)
    public WebElement cnnHealth;
    @FindBy(how = How.LINK_TEXT, using = food)
    public WebElement cnnFood;
    @FindBy(how = How.XPATH, using = foodTitle)
    public WebElement cnnFoodTitle;
    @FindBy(how = How.NAME, using = travel)
    public WebElement cnnTravel;
    @FindBy(how = How.XPATH, using = travelSearch)
    public WebElement cnntravelSearch;
    @FindBy(how = How.XPATH, using = travelSearchKey)
    public WebElement cnnTravelSearchKey;
    @FindBy(how = How.XPATH, using = trumpInterview)
    public WebElement cnnTrumpInterview;
    @FindBy(how = How.LINK_TEXT, using = Media)
    public WebElement cnnMedia;
    @FindBy(how = How.XPATH, using = mediaTrumpAdmin)
    public WebElement cnnMediaTrumpAdmin;
    @FindBy(how = How.NAME, using = sports)
    public WebElement cnnSports;
    @FindBy(how = How.LINK_TEXT, using = worldFootBall)
    public WebElement cnnWorldFootBall;
    @FindBy(how = How.XPATH, using = worldFootBallBox)
    public WebElement cnnWorldFootBallBox;
    @FindBy(how = How.ID, using = forgoAccount)
    public WebElement cnnForgoAccount;
    @FindBy(how = How.XPATH, using = forgoAccountEmail)
    public WebElement cnnForgoAccountEmail;
    @FindBy(how = How.XPATH, using = resetPassword)
    public WebElement cnnResetPassword;
    @FindBy(how = How.LINK_TEXT, using = Opinion)
    public WebElement cnnOpinion;
    @FindBy(how = How.XPATH, using = Opinionlink)
    public WebElement cnnOpinionlink;
    @FindBy(how = How.XPATH, using = wisconsin)
    public WebElement cnnWisconsin;
    @FindBy(how = How.NAME, using = election101)
    public WebElement cnnElection101;
    @FindBy(how = How.XPATH, using = rebelWilson)
    public WebElement cnnRebelWilson;
    @FindBy(how = How.LINK_TEXT, using = culture)
    public WebElement cnnculture;
    @FindBy(how = How.XPATH, using = fullMoon)
    public WebElement cnnFullMoon;
    @FindBy(how = How.LINK_TEXT, using = unitiedKindom)
    public WebElement cnnUnitiedKindom;
    @FindBy(how = How.LINK_TEXT, using = middleEast)
    public WebElement cnnMiddleEast;
    @FindBy(how = How.XPATH, using = middleEastPresidentLink)
    public WebElement cnnMiddleEastPresidentLink;
    @FindBy(how = How.XPATH, using = cyberManday)
    public WebElement cnncyberManday;
    @FindBy(how = How.XPATH, using = cyberMandayCoupons)
    public WebElement cnncyberMandayCoupons;
    @FindBy(how = How.XPATH, using = cyberMandayMoney)
    public WebElement cnncyberMandayMoney;
    @FindBy(how = How.XPATH, using = cyberMandayMoneyLink)
    public WebElement cnnCyberMandayMoneyLink;

    public void database() throws SQLException, IOException, ClassNotFoundException {
        ConnectToSqlDB.connectToSqlDatabase();
    }

    public void cnnentErtainment() {
        cnnentertainment.click();
        //((JavascriptExecutor)driver).executeScript("Scroll(0,400)");
    }
    public void cnnSearchButtontCheck() {
        cnnSearchButton.click();
        cnnSearchKey.sendKeys("Todays news");
        cnnClickSraechButton.click();
    }
    public void Edition() {
        cnnEdition.click();
    }
    public void typeOnInputBox(String locator, String value) {
        Cnnsignin.click();
        //CNnEmailAddress.sendKeys("Hi my name is runa")
        try {
            CNnEmailAddress.sendKeys("Runa", Keys.ENTER);
        } catch (Exception ex1) {
            System.out.println("username locator didn't work");
        }
        try {
            CNnpasssword.sendKeys("234567456", Keys.ENTER);
        } catch (Exception ex2) {
            System.out.println("password locator didn't work");
        }
        try {
            CNnEmailAddress.sendKeys("Rupa", Keys.ENTER);
        } catch (Exception ex3) {
            System.out.println("user name not found");
            try {
                CNnEmailAddress.sendKeys("Rina", Keys.ENTER);
            } catch (Exception ex4) {
                System.out.println("Password not found");
            }
        }
    }
    public void world() {
        cnnworld.click();

    }
    public void dropdownMenu() {
        cnndropdownBox.click();
        cnnCrimeJustic.click();
    }
    public void cnnPolitics(String exp) {
        cnnpolitics.click();
    }
    public void style() {
        cnnstyle.click();
    }
    public void cnnHealth() {
        cnnHealth.click();


    }
    public void cnnTravel() {
        cnnTravel.click();
        cnntravelSearch.click();
        cnnTravelSearchKey.sendKeys("California");
    }
    public void cnnTrumpInterview() throws InterruptedException {
        Thread.sleep(5000);
        cnnTrumpInterview.click();
        Thread.sleep(5000);
        cnnMedia.click();
        Thread.sleep(5000);
        cnnMediaTrumpAdmin.click();
    }
    public void cnnSports() {
        cnnSports.click();
        cnnWorldFootBall.click();
        cnnWorldFootBallBox.click();
    }
    public void cnnForgoAccount() {
        Cnnsignin.click();
        cnnForgoAccount.click();
        cnnForgoAccountEmail.sendKeys("runa11427@gmail.com");
        cnnResetPassword.click();
    }
    public void cnnOpinion() throws InterruptedException {
        cnnOpinion.click();
    }
    public void cnnWisconsin() {
        cnnWisconsin.click();
        cnnElection101.click();
    }
    public void cnnRebelWilson() {
        cnnRebelWilson.click();

    }
    public void fullMoon() {
        cnnFullMoon.click();
        cnnUnitiedKindom.click();
    }
    public void fullMoon2() {
        cnnFullMoon.click();
        cnnMiddleEast.click();
        cnnMiddleEastPresidentLink.click();
    }
    public void cyberMonday() {
        cnncyberManday.click();
        cnncyberMandayCoupons.click();
    }
    public void cnncyberMandayMoney() {
        cnncyberManday.click();
        cnncyberMandayMoney.click();
        cnnCyberMandayMoneyLink.click();
    }

public void refresh(){
   try{
   Thread.sleep(5000);
   } catch (InterruptedException e) {
       e.printStackTrace();
   }
driver.navigate().refresh();

}
    public void downLoadFile() throws InterruptedException {
        // WebDriver driver=new ChromeDriver() ;
        driver.get("https://www.contextures.com/xlsampledata01.html");
        Thread.sleep(5000);
        ((JavascriptExecutor) driver).executeScript("Scroll(0,400)");
        driver.findElement(By.linkText("Excel sample data workbook")).click();

    }

}
















