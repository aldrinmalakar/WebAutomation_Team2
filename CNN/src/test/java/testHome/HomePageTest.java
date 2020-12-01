package testHome;

import common.WebAPI;
import database.ConnectToSqlDB;
import home.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class HomePageTest extends WebAPI {
    HomePage homepage;
    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled =true)
    public void databaseConnectionTest() throws SQLException, IOException, ClassNotFoundException {
        homepage.database();
    }

    @Test(enabled =true)
    public void cnnentErtainment() throws InterruptedException {
        homepage.cnnentErtainment();
        sleepFor(5);
    }

    @Test(enabled =true)
    public void cnnSearchButtontCheck() throws InterruptedException {
        homepage.cnnSearchButtontCheck();
        sleepFor(5);
    }

    @Test(enabled =true)
    public void Edition() throws InterruptedException {
        sleepFor(5);
        homepage.Edition();
    }

    @Test(enabled =true)
    public void sendAllKeysValidation() throws InterruptedException {
        sleepFor(5);
        homepage.typeOnInputBox("CNnEmailAddress", "sendKeys");
    }

    @Test(enabled =true)
    public void worldaValidation() {
        homepage.world();
    }

    @Test(enabled =true)
    public void dropdownMenu() {
        homepage.dropdownMenu();
    }

    @Test(enabled =true)
    public void cnnPolitics() {
        homepage.cnnPolitics("2020 Election");
    }

    @Test(enabled =true)
    public void style() {
        homepage.style();
    }

    @Test(enabled =true)
    public void cnnHealth() throws InterruptedException {
        sleepFor(1);
        homepage.cnnHealth();
    }

    @Test(enabled = true)
    public void cnnTravel() throws InterruptedException {
        sleepFor(1);
        homepage.cnnTravel();
    }

    @Test(enabled =true)
    public void cnnTrumpInterview() throws InterruptedException {
        sleepFor(5);
        homepage.cnnTrumpInterview();
    }

    @Test(enabled =true)
    public void cnnSports() throws InterruptedException {
        sleepFor(5);
        homepage.cnnSports();
    }

    @Test(enabled =true)
    public void cnnForgoAccount() throws InterruptedException {
        sleepFor(5);
        homepage.cnnForgoAccount();
    }

    @Test(enabled =true)
    public void cnnOpinion() throws InterruptedException {
        sleepFor(5);
        homepage.cnnOpinion();
    }

    @Test(enabled =true)
    public void cnnWisconsin() throws InterruptedException {
        sleepFor(5);
        homepage.cnnWisconsin();
    }

    @Test(enabled =true)
    public void cnnRebelWilson() throws InterruptedException {
        sleepFor(5);
        homepage.cnnRebelWilson();
    }

    @Test(enabled =true)
    public void fullMoon() throws InterruptedException {
        sleepFor(5);
        homepage.fullMoon();
    }

    @Test(enabled =true)
    public void fullMoon2() throws InterruptedException {
        sleepFor(5);
        homepage.fullMoon2();
    }

    @Test(enabled =true)
    public void cyberMonday() throws InterruptedException {
        sleepFor(5);
        homepage.cyberMonday();
    }

    @Test(enabled =true)
    public void cnncyberMandayMoney() throws InterruptedException {
        sleepFor(5);
        homepage.cnncyberMandayMoney();
    }
@Test(enabled =true)
    public void refresh(){
    homepage. refresh();
}
@Test(enabled =false)
    public void downLoadFile() throws InterruptedException {
        sleepFor(8);
    homepage.downLoadFile();
}




}














